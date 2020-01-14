package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.service;

import com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.controller.fallback.FallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName NacosProverService
 * @Author 刘正
 * @Date 2020/1/13 13:38
 * @Version 1.0
 * @Description:
 */

@FeignClient(value = "nacos-provider",fallback = FallBack.class)
public interface NacosProviderService {

    @GetMapping("/echo/{message}")
    public String echo(@PathVariable("message") String message);

}
