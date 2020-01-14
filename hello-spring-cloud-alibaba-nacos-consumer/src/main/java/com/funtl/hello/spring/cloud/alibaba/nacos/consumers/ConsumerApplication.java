package com.funtl.hello.spring.cloud.alibaba.nacos.consumers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName ConsumerApplication
 * @Author 刘正
 * @Date 2020/1/12 20:24
 * @Version 1.0
 * @Description:
 */

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
