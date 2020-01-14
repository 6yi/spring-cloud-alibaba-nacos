package com.funtl.hello.spring.cloud.alibaba.nacos.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName NacosProviderApplication
 * @Author 刘正
 * @Date 2020/1/12 18:54
 * @Version 1.0
 * @Description:
 */

@SpringBootApplication
@EnableDiscoveryClient//Spring-cloud-服务提供
public class NacosProviderApplication {

    

    public static void main(String[] args) {
        SpringApplication.run(NacosProviderApplication.class,args);
    }
}
