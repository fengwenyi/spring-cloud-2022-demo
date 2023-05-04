package com.fengwenyi.demo.springcloud.openfeign.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author <a href="https://fengwenyi.com">Erwin Feng</a>
 * @since 2023-05-04
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OpenFeignProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignProviderApplication.class, args);
    }

}
