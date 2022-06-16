package com.jht.orderservice.po;

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
@TableName("order_goods")
public class OrderGoodPo implements Serializable {

    private static final long serialVersionUID = -6500651106432080057L;
    @TableId("id")
    private Integer id;
    @TableField("good_id")
    private String goodName;
    @TableField("good_num")
    private Integer goodNum;
    @TableField("order_id")
    private Integer orderId;
    @TableField("discount_price")
    private BigDecimal discountPrice;

}
