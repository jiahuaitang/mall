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
@TableName("order")
public class OrderPo implements Serializable {

    private static final long serialVersionUID = 4111770586189512395L;
    @TableId("id")
    private Integer id;
    @TableField("price")
    private BigDecimal price;
}
