package com.imooc.order.message;

import com.imooc.order.utils.JsonUtil;
import com.imooc.product.common.ProductInfoOutput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 8:51 2019/1/15
 * @ Description：
 */
@Component
@Slf4j
public class ProductReceiver {


    @RabbitListener(queuesToDeclare = @Queue("productInfo"))
    public void process(String message){
        ProductInfoOutput productInfoOutput = (ProductInfoOutput)JsonUtil.fromJson(message,ProductInfoOutput.class);
        log.info("打印{}",productInfoOutput);
    }

}
