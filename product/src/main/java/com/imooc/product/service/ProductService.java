package com.imooc.product.service;

import com.imooc.product.dataobject.ProductInfo;

import java.util.List;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 21:57 2019/1/7
 * @ Description：
 */
public interface ProductService {

    // 查询所有在架商品列表
    List<ProductInfo> findUpAll();
}
