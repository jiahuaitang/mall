package com.jht.goodservice.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.jht.goodservice.po.GoodPo;
import com.jht.goodservice.service.GoodService;
import com.jht.goodservice.vo.GoodVo;
import com.jht.mallcommon.api.CommonResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/good")
public class GoodController {

    @Autowired
    private GoodService goodService;

    @GetMapping("getGood")
    public CommonResult<GoodVo> getGood(@RequestParam Integer id) {
        try {
            GoodPo goodPo = goodService.getGood(id);
            GoodVo goodVo = new GoodVo();
            BeanUtils.copyProperties(goodPo,goodVo);
            return CommonResult.success(goodVo);
        }catch (RuntimeException e){
            e.printStackTrace();
            return CommonResult.failed();
        }catch (Exception e){
            e.printStackTrace();
            return CommonResult.failed();
        }
    }

    @PostMapping("updateGood")
    public CommonResult<GoodVo> updateGood(@RequestBody GoodVo goodVo){
        try {
            GoodPo goodPo = new GoodPo();
            BeanUtils.copyProperties(goodVo,goodPo);
            int id = goodPo.getId();
            if(goodService.getGood(id) == null){
                return CommonResult.failed("数据不存在!");
            }
            GoodPo goodPo1 = goodService.updateGood(goodPo);
            GoodVo goodVo1 = new GoodVo();
            BeanUtils.copyProperties(goodPo1,goodVo1);
            return CommonResult.success(goodVo);
        }catch (RuntimeException e){
            e.printStackTrace();
            return CommonResult.failed();
        }catch (Exception e){
            e.printStackTrace();
            return CommonResult.failed();
        }
    }
}
