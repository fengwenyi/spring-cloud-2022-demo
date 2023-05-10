package com.fengwenyi.demo.springcloud.openfeign.provider.controller;

import com.fengwenyi.api.result.ResultTemplate;
import com.fengwenyi.demo.springcloud.openfeign.common.pojo.dto.GoodsDto;
import com.fengwenyi.demo.springcloud.openfeign.common.pojo.vo.GoodsVo;
import com.fengwenyi.demo.springcloud.openfeign.provider.MemoryDatabase;
import com.fengwenyi.javalib.convert.JsonUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author <a href="https://fengwenyi.com">Erwin Feng</a>
 * @since 2023-05-08
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    private static final String DB_KEY = "t_goods";

    @PostMapping("/add")
    public ResultTemplate<Void> add(@RequestBody GoodsDto goodsDto) {
        MemoryDatabase.add(DB_KEY, goodsDto);
        return ResultTemplate.success();
    }

    @GetMapping("/getList")
    public ResultTemplate<List<GoodsVo>> getList() {
        List<Object> list = MemoryDatabase.get(DB_KEY);
        List<GoodsVo> goodsVoList = new ArrayList<>();
        for (Object obj : list) {
            GoodsDto goodsDto = (GoodsDto) obj;
            GoodsVo goodsVo = new GoodsVo();
            goodsVo.setId(goodsDto.getId());
            goodsVo.setName(goodsDto.getName());
            goodsVo.setBrand(goodsDto.getBrand());
            goodsVo.setPrice(goodsDto.getPrice());
            goodsVoList.add(goodsVo);
        }
        return ResultTemplate.success(goodsVoList);
    }

}
