package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.controller;

import com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.service.NacosProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName NacosProviderController
 * @Author 刘正
 * @Date 2020/1/13 13:56
 * @Version 1.0
 * @Description:
 */

@Controller
public class NacosProviderController {


    @Autowired
    private NacosProviderService nacosProviderService;

    @GetMapping("/echo")
    @ResponseBody
    public String echo(){
        return nacosProviderService.echo("Hello Feign");
    }
}
