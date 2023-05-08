package com.fengwenyi.demo.springcloud.openfeign.provider.controller;

import com.fengwenyi.api.result.ResultTemplate;
import com.fengwenyi.demo.springcloud.openfeign.common.pojo.dto.GoodsDto;
import com.fengwenyi.demo.springcloud.openfeign.provider.MemoryDatabase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="https://fengwenyi.com">Erwin Feng</a>
 * @since 2023-05-08
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    private static final String DB_KEY = "t_goods";

    @PostMapping
    public ResultTemplate<Void> add(@RequestBody GoodsDto goodsDto) {
        MemoryDatabase.add(DB_KEY, goodsDto);
        return ResultTemplate.success();
    }

}
