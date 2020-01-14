package com.funtl.hello.spring.cloud.alibaba.nacos.consumers.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName NacosConsumerConfiguration
 * @Author 刘正
 * @Date 2020/1/12 19:33
 * @Version 1.0
 * @Description:
 */

@Configuration
public class NacosConsumerConfiguration {


    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
