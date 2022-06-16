package com.jht.goodservice.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("goods")
public class GoodPo implements Serializable{

    private static final long serialVersionUID = 158732105178071006L;
    @TableId("id")
    private Integer id;
    @TableField("good_name")
    private String goodName;
    @TableField("good_num")
    private Integer goodNum;
    @TableField("good_price")
    private BigDecimal goodPrice;

}
