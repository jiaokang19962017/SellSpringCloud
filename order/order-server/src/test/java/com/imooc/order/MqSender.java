package com.imooc.order;

import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 17:32 2019/1/13
 * @ Description：发送mq消息
 */
@Component
public class MqSender extends OrderAppliactionTest {


    @Autowired
    private AmqpTemplate amqpTemplate;


    @Test
    public void send(){
        amqpTemplate.convertAndSend("myQueue"," now:"+new Date());
    }

    @Test
    public void sendOrder(){
        amqpTemplate.convertAndSend("myOrder","computer"," now:"+new Date());
    }



}
