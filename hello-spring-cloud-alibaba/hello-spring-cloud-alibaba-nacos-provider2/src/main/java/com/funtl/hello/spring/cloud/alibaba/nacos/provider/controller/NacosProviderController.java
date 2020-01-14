package com.funtl.hello.spring.cloud.alibaba.nacos.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName NacosProviderController
 * @Author 刘正
 * @Date 2020/1/12 18:58
 * @Version 1.0
 * @Description:
 */

@RestController
public class NacosProviderController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/echo/{message}")
    public String echo(@PathVariable("message") String message){
        return port+":  Hello "+message;
    }

}
