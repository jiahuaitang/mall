package com.jht.pcconsumer.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PcGoodVo implements Serializable{

    private static final long serialVersionUID = -1482812616274615555L;
    private Integer id;

    private String goodName;

    private Integer goodNum;

    private BigDecimal goodPrice;

}
