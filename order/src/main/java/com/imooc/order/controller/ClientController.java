package com.imooc.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 14:21 2019/1/9
 * @ Description：客户端调用server
 */
@RestController
@Slf4j
public class ClientController {

//    @Autowired
//    private LoadBalancerClient loadBalancerClient;

      @Autowired
      private RestTemplate restTemplate;


    @GetMapping("/getProductMsg")
    public String getProductMsg(){
        // 1.第一种方式(直接使用grestTmeplate,url写死)
//        RestTemplate restTemplate = new RestTemplate();
//        String result = restTemplate.getForObject("http://localhost:8080/msg",String.class);

       // 2.第二种方式(LoadBalancerClient配合restTemplate,使用应用名)
//        ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
//        serviceInstance.getHost();
//        String url = String.format("http://%s:%s",serviceInstance.getHost(),serviceInstance.getPort())+"/msg";
//        RestTemplate restTemplate = new RestTemplate();
//        String result = restTemplate.getForObject(url,String.class);

        // 3.第三种方式(利用@LoadBalanced注解,结合restTemplate请求)
        String result = restTemplate.getForObject("http://PRODUCT/msg",String.class);
        log.info("[restTemplate] response={}",result);
        return result;
    }

}
