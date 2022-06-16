package com.jht.pcconsumer.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class PcOrderVo implements Serializable {

    private static final long serialVersionUID = -4952489488295741976L;
    private Integer id;

    private BigDecimal price;

}
