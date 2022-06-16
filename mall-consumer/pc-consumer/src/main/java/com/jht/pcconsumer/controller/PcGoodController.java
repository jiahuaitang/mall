package com.jht.pcconsumer.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.jht.mallcommon.api.CommonResult;
import com.jht.pcconsumer.service.PcGoodService;
import com.jht.pcconsumer.vo.PcGoodVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pcGood")
public class PcGoodController {

    @Autowired
    private PcGoodService pcGoodService;

    @GetMapping("getGoodPc")
   // @SentinelResource(value = "/pcGood/getGoodPc")
    public CommonResult<PcGoodVo> getGoodPc(@RequestParam Integer id) {
        return pcGoodService.getGood(id);
    }

    @PostMapping(value = "updateGoodPc")
    public CommonResult<PcGoodVo> updateGoodPc(@RequestBody PcGoodVo pcGoodVo){
        return pcGoodService.updateGood(pcGoodVo);
    }

}
