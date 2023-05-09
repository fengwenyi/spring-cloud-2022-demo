package com.fengwenyi.demo.springcloud.openfeign.consumer.controller;

import com.fengwenyi.api.result.ResultTemplate;
import com.fengwenyi.demo.springcloud.openfeign.common.pojo.dto.GoodsDto;
import com.fengwenyi.demo.springcloud.openfeign.common.pojo.vo.GoodsVo;
import com.fengwenyi.demo.springcloud.openfeign.consumer.client.IGoodsFeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author <a href="https://fengwenyi.com">Erwin Feng</a>
 * @since 2023-05-09
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    private final IGoodsFeignClient goodsFeignClient;

    public GoodsController(IGoodsFeignClient goodsFeignClient) {
        this.goodsFeignClient = goodsFeignClient;
    }

    @PostMapping("/add")
    public ResultTemplate<Void> add(@RequestBody GoodsDto goodsDto) {
        System.out.println("==>" + goodsDto);
        return goodsFeignClient.add(goodsDto);
    }

    @GetMapping("/getList")
    ResultTemplate<List<GoodsVo>> getList() {
        return goodsFeignClient.getList();
    }

}
