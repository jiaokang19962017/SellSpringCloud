package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 21:00 2019/1/8
 * @ Description：
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {

}
