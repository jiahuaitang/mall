package com.jht.orderservice.vo;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class OrderGoodVo {

    private Integer id;

    private String goodName;

    private Integer goodNum;

    private Integer orderId;

    private BigDecimal discountPrice;

}
