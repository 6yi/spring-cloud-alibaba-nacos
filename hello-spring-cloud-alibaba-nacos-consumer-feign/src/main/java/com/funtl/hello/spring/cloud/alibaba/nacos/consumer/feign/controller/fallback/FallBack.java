package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.controller.fallback;


import com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.service.NacosProviderService;
import org.springframework.stereotype.Component;

/**
 * @ClassName FallBack
 * @Author 刘正
 * @Date 2020/1/13 15:24
 * @Version 1.0
 * @Description:
 */

@Component
public class FallBack implements NacosProviderService {

    @Override
    public String echo(String message) {
        return "连接错误,请检查网络!";
    }
}
