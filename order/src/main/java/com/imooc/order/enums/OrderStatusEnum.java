package com.imooc.order.enums;

import lombok.Getter;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 21:06 2019/1/8
 * @ Description：订单状态枚举
 */
@Getter
public enum OrderStatusEnum {
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"取消"),
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }}
