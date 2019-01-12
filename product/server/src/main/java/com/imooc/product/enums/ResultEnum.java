package com.imooc.product.enums;

import lombok.Getter;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 22:22 2019/1/9
 * @ Description：
 */
@Getter
public enum  ResultEnum {
    PRODUCT_NOT_EXIST(1,"商品不存在"),
    PRODUCT_STOCK_ERROR(2,"库存有误");
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }}
