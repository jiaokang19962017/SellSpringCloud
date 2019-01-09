package com.imooc.order.enums;

import lombok.Getter;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 23:08 2019/1/8
 * @ Description：
 */
@Getter
public enum ResultEnum {
    PARAM_ERROR(1,"参数错误"),
    CART_EMPTY(2," 购物车为空"),
    ;

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
