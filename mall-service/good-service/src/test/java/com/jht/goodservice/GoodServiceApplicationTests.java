package com.jht.goodservice;

import com.jht.goodservice.po.GoodPo;
import com.jht.goodservice.service.GoodService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GoodServiceApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private GoodService goodService;

    @Test
    public void test1(){
        Long start = System.currentTimeMillis();
        GoodPo goodPo = goodService.getGood(1);
        System.out.println(System.currentTimeMillis()-start); //1793 //407 //1081
    }

    @Test
    public void test2(){
        GoodPo goodPo = new GoodPo();
        goodPo.setGoodName("眼睛");
        goodPo.setGoodNum(100);
        goodPo.setId(2);
        GoodPo goodPo1 = goodService.addGood(goodPo);
        System.out.println(goodPo1);
    }

    @Test
    public void test3(){
        GoodPo goodPo = new GoodPo();
        goodPo.setGoodNum(10);
        goodPo.setId(1);
        GoodPo goodPo2 = goodService.updateGood(goodPo);
        System.out.println(goodPo2);
    }

    @Test
    public void test4(){
        Integer row = goodService.deleteGood(1);
        System.out.println(row);
    }

    @Test
    public void test5(){
        Long start = System.currentTimeMillis();
        GoodPo goodPo = goodService.getGood2(1);
        System.out.println(System.currentTimeMillis()-start);
    }

}
