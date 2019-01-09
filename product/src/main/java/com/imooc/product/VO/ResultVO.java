package com.imooc.product.VO;

import lombok.Data;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 22:16 2019/1/7
 * @ Description：http请求返回结果
 */
@Data
public class ResultVO<T> {

    // 错误码
    private Integer code;
    // 提示信息
    private String msg;
    // 具体内容
    private T date;
}
