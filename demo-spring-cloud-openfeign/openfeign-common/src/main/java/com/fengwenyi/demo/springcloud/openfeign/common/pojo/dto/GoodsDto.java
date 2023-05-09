package com.fengwenyi.demo.springcloud.openfeign.common.pojo.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author <a href="https://fengwenyi.com">Erwin Feng</a>
 * @since 2023-05-08
 */
@Data
public class GoodsDto {

    private String id;

    private String name;

    private String brand;

    private BigDecimal price;

}
