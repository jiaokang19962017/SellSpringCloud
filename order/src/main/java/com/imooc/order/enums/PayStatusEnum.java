package com.imooc.order.enums;

import lombok.Getter;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 21:09 2019/1/8
 * @ Description：支付状态
 */
@Getter
public enum PayStatusEnum {

    WAIT(0,"等待支付"),
    FINISHED(1,"支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
