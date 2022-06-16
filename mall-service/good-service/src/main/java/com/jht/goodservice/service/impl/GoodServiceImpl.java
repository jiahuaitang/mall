package com.jht.goodservice.service.impl;

import com.jht.goodservice.dao.GoodMapper;
import com.jht.goodservice.po.GoodPo;
import com.jht.goodservice.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GoodServiceImpl implements GoodService {

    @Autowired
    private GoodMapper goodMapper;

    @Override
    @Transactional
    @Cacheable(value = "good",key = "#id")
    public GoodPo getGood(Integer id) {
        return goodMapper.selectById(id);
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    @CachePut(value = "good",key = "#goodPo.id")
    public GoodPo addGood(GoodPo goodPo) {
        goodMapper.insert(goodPo);
        return goodMapper.selectById(goodPo.getId());
    }

    @Override
    @Transactional
    @CacheEvict(value = "good", key = "#id", beforeInvocation = false)
    public Integer deleteGood(Integer id) {
        return goodMapper.deleteById(id);
    }

    @Override
    @Transactional
    @CachePut(value= "good",condition = "#goodPo.id != 'null' ", key = "#goodPo.id")
    public GoodPo updateGood(GoodPo goodPo) {
        goodMapper.updateById(goodPo);
        return goodMapper.selectById(goodPo.getId());
    }

    @Override
    public GoodPo getGood2(Integer id) {
        return goodMapper.selectById(id);
    }


}
