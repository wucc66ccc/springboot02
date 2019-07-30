package com.wucc.springboot02.config;

import com.wucc.springboot02.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author WuDingJia
 * @create 2019-07-30 15:27
 */
@Configuration
public class MyAppConfig {
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
