package com.imooc.product.service;

import com.imooc.product.dataobject.ProductCategory;

import java.util.List;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 22:08 2019/1/7
 * @ Description：类目接口
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
