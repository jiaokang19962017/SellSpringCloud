package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 21:02 2019/1/8
 * @ Description：
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
}
