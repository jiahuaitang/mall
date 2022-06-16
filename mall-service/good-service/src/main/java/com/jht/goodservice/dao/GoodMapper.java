package com.jht.goodservice.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jht.goodservice.po.GoodPo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodMapper extends BaseMapper<GoodPo> {
}
