package com.jht.pcconsumer.service;

import com.jht.mallcommon.api.CommonResult;
import com.jht.pcconsumer.vo.PcOrderVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("order-service")
public interface PcOrderService {

    @PostMapping("/order-service/order/getOrder")
    public CommonResult<PcOrderVo> getOrder(@RequestParam Integer id);

}
