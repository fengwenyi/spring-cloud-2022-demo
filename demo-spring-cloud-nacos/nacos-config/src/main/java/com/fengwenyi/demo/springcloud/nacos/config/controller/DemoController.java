package com.fengwenyi.demo.springcloud.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="https://fengwenyi.com">Erwin Feng</a>
 * @since 2023-05-05
 */
@RestController
@RequestMapping("/")
@RefreshScope
public class DemoController {

    @Value("${data: from local}")
    private String data;

    @RequestMapping("/data")
    public String data() {
        return data;
    }

}
