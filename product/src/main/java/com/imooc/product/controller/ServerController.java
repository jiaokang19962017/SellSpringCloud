package com.imooc.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 14:17 2019/1/9
 * @ Description：服务接口
 */
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg(){
        return "this is productMessage";
    }

}
