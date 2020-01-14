package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName NacosConsumerFeignApplication
 * @Author 刘正
 * @Date 2020/1/13 13:33
 * @Version 1.0
 * @Description:
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NacosConsumerFeignApplication {


    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerFeignApplication.class,args);
    }

}
