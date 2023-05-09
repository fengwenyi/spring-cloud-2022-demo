package com.fengwenyi.demo.springcloud.openfeign.common.pojo.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * @author <a href="https://fengwenyi.com">Erwin Feng</a>
 * @since 2023-05-08
 */
@Data
@Accessors(chain = true)
public class GoodsVo {

    private String id;

    private String name;

    private String brand;

    private BigDecimal price;

}
