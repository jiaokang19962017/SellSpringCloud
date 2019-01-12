package com.imooc.order.exception;

import com.imooc.order.enums.ResultEnum;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 23:06 2019/1/8
 * @ Description：
 */
public class OrderException extends RuntimeException{
    private Integer code;

    public OrderException(Integer code,String message){
        super(message);
        this.code=code;
    }


    public OrderException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code=resultEnum.getCode();
    }
}
