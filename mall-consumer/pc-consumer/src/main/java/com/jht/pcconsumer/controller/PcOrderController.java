package com.jht.pcconsumer.controller;

import com.jht.mallcommon.api.CommonResult;
import com.jht.pcconsumer.service.PcOrderService;
import com.jht.pcconsumer.vo.PcOrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pcOrder")
public class PcOrderController {

    @Autowired
    private PcOrderService pcOrderService;

    @RequestMapping("getOrderPc")
    @ResponseBody
    public CommonResult<PcOrderVo> getOrderPc(@RequestParam Integer id) {
        return pcOrderService.getOrder(id);
    }

}
