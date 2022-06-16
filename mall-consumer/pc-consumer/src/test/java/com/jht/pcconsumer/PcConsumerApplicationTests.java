package com.jht.pcconsumer;

import com.jht.mallcommon.api.CommonResult;
import com.jht.pcconsumer.service.PcGoodService;
import com.jht.pcconsumer.vo.PcGoodVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PcConsumerApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private PcGoodService pcGoodService;

    @Test
    public void test1(){
        CommonResult<PcGoodVo> commonResult = pcGoodService.getGood(1);
        System.out.println(commonResult.getData());
    }

}
