package com.jht.orderservice.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jht.orderservice.po.OrderPo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<OrderPo> {

}
