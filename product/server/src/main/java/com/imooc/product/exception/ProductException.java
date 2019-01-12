package com.imooc.product.exception;

import com.imooc.product.enums.ResultEnum;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 22:20 2019/1/9
 * @ Description：
 */
public class ProductException extends RuntimeException{
    private Integer code;

    public ProductException(Integer code, String meassage){
        super(meassage);
        this.code=code;
    }

    public ProductException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code=resultEnum.getCode();
    }
}
