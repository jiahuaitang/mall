package com.jht.goodservice.service;

import com.jht.goodservice.po.GoodPo;

public interface GoodService {

    GoodPo getGood(Integer id);

    GoodPo addGood(GoodPo goodPo);

    Integer deleteGood(Integer id);

    GoodPo updateGood(GoodPo goodPo);

    GoodPo getGood2(Integer id);

}
