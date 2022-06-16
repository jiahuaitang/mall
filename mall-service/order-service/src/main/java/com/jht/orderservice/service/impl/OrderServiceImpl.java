package com.jht.orderservice.service.impl;

import com.jht.orderservice.dao.OrderMapper;
import com.jht.orderservice.po.OrderPo;
import com.jht.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    @Transactional
    @Cacheable(value = "good",key = "#id")
    public OrderPo getOrder(Integer id) {
        return orderMapper.selectById(id);
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    @CachePut(value = "order",key = "#goodPo.id")
    public OrderPo addOrder(OrderPo orderPo) {
        orderMapper.insert(orderPo);
        return orderMapper.selectById(orderPo.getId());
    }

    @Override
    @Transactional
    @CacheEvict(value = "order", key = "#id", beforeInvocation = false)
    public Integer deleteOrder(Integer id) {
        return orderMapper.deleteById(id);
    }

    @Override
    @Transactional
    @CachePut(value= "order",condition = "#goodPo.id != 'null' ", key = "#goodPo.id")
    public OrderPo updateOrder(OrderPo orderPo) {
        orderMapper.updateById(orderPo);
        return orderMapper.selectById(orderPo.getId());
    }


}
