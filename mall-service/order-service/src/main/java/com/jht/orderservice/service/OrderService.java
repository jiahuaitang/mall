package com.jht.orderservice.service;


import com.jht.orderservice.po.OrderPo;

public interface OrderService {

    OrderPo getOrder(Integer id);

    OrderPo addOrder(OrderPo orderPo);

    Integer deleteOrder(Integer id);

    OrderPo updateOrder(OrderPo orderPo);


}
