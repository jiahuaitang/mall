package com.jht.orderservice.controller;

import com.jht.mallcommon.api.CommonResult;
import com.jht.orderservice.po.OrderPo;
import com.jht.orderservice.service.OrderService;
import com.jht.orderservice.vo.OrderVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("getOrder")
    public CommonResult<OrderVo> getOrder(Integer id) {
        try {
            OrderPo orderPo = orderService.getOrder(id);
            OrderVo orderVo = new OrderVo();
            BeanUtils.copyProperties(orderPo,orderVo);
            return CommonResult.success(orderVo);
        }catch (RuntimeException e){
            e.printStackTrace();
            return CommonResult.failed();
        }catch (Exception e){
            e.printStackTrace();
            return CommonResult.failed();
        }
    }
}
