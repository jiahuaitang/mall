package com.jht.goodservice.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class GoodVo implements Serializable {

    private static final long serialVersionUID = -7962830728334139850L;
    private Integer id;
    private String goodName;
    private Integer goodNum;
    private BigDecimal goodPrice;

}
