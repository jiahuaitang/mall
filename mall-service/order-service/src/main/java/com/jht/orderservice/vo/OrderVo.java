package com.jht.orderservice.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderVo {

    private Integer id;

    private BigDecimal price;

}
