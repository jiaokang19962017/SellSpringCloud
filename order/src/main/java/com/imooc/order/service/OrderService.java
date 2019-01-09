package com.imooc.order.service;

import com.imooc.order.dataobject.OrderDetail;
import com.imooc.order.dto.OrderDTO;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 22:25 2019/1/8
 * @ Description：订单service
 */
public interface OrderService {

    // 创建订单
    OrderDTO create(OrderDTO orderDTO);

}
