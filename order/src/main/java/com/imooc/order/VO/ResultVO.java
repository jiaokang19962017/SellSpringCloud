package com.imooc.order.VO;

import lombok.Data;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 23:29 2019/1/8
 * @ Description：
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;
}
