package com.imooc.product.enums;

import lombok.Getter;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 22:00 2019/1/7
 * @ Description：商品状态枚举
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架"),
    ;
    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }}
