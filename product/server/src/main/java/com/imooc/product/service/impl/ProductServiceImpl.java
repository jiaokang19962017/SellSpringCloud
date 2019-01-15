package com.imooc.product.service.impl;

import com.imooc.product.common.DecreaseStockInput;
import com.imooc.product.common.ProductInfoOutput;
import com.imooc.product.dataobject.ProductInfo;
import com.imooc.product.dto.CartDTO;
import com.imooc.product.enums.ProductStatusEnum;
import com.imooc.product.enums.ResultEnum;
import com.imooc.product.exception.ProductException;
import com.imooc.product.repository.ProductInfoRepository;
import com.imooc.product.service.ProductService;
import com.imooc.product.utils.JsonUtil;
import com.rabbitmq.tools.json.JSONUtil;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 21:59 2019/1/7
 * @ Description：
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;
    @Autowired
    private AmqpTemplate amqpTemplate;

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public List<ProductInfo> findList(List<String> productIdList) {

        return productInfoRepository.findByProductIdIn(productIdList);
    }

    @Override
    @Transactional
    public void decreaseStock(List<DecreaseStockInput> decreaseStockInputList) {
       for (DecreaseStockInput decreaseStockInput:decreaseStockInputList){
         Optional<ProductInfo> productInfoOptional = productInfoRepository.findById(decreaseStockInput.getProductId());
         // 判断商品是否存在
         if(!productInfoOptional.isPresent()){
             throw new ProductException(ResultEnum.PRODUCT_NOT_EXIST);
         }
         ProductInfo productInfo = productInfoOptional.get();
         // 判断库存是否足够
         Integer result = productInfo.getProductStock()-decreaseStockInput.getProductQuantity();
         if (result<0){
             throw new ProductException(ResultEnum.PRODUCT_STOCK_ERROR);
         }
         productInfo.setProductStock(result);
         productInfoRepository.save(productInfo);

         // 发送mq消息
           ProductInfoOutput output = new ProductInfoOutput();
           BeanUtils.copyProperties(productInfo,output);
           amqpTemplate.convertAndSend("productInfo", JsonUtil.toJson(output));

       }
    }
}
