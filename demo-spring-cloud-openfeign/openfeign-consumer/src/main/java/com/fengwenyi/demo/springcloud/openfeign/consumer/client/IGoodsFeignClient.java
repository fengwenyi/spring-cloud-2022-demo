package com.fengwenyi.demo.springcloud.openfeign.consumer.client;

import com.fengwenyi.api.result.ResultTemplate;
import com.fengwenyi.demo.springcloud.openfeign.common.pojo.dto.GoodsConditionDto;
import com.fengwenyi.demo.springcloud.openfeign.common.pojo.dto.GoodsDto;
import com.fengwenyi.demo.springcloud.openfeign.common.pojo.vo.GoodsVo;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author <a href="https://fengwenyi.com">Erwin Feng</a>
 * @since 2023-05-08
 */
public interface IGoodsFeignClient {

    /* get start */

    // 根据ID查询
    ResultTemplate<GoodsVo> get(@RequestParam("id") String id);

    // 根据dto对象条件查询
    ResultTemplate<List<GoodsVo>> getByConditionDto(@SpringQueryMap GoodsConditionDto goodsConditionDto);

    // 根据多参数条件查询
    ResultTemplate<List<GoodsVo>> getByConditionMultiParam(@RequestParam("brand") String brand,
                                                           @RequestParam("minPrice") BigDecimal minPrice,
                                                           @RequestParam("maxPrice") BigDecimal maxPrice);

    /* get end */

    // post
    ResultTemplate<Void> add(@RequestBody GoodsDto goodsDto);

    // put

    // patch

    // delete

}
