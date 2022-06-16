package com.jht.pcconsumer.service;

import com.jht.mallcommon.api.CommonResult;
import com.jht.pcconsumer.vo.PcGoodVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "good-service")
@Component
public interface PcGoodService {

    @GetMapping(value = "/good-service/good/getGood")
    public CommonResult<PcGoodVo> getGood(@RequestParam Integer id);

    @PostMapping(value = "/good-service/good/updateGood")
    public CommonResult<PcGoodVo> updateGood(@RequestBody PcGoodVo goodVo);

}
