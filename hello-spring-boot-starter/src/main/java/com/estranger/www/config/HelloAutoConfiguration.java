package com.estranger.www.config;

import com.estranger.www.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Created by michangtao
 * @Date 2021/5/28 11:26
 * @Description
 */
@Configuration
@EnableConfigurationProperties({HelloProperties.class})
public class HelloAutoConfiguration {

    @Autowired
    HelloProperties helloProperties;

    @Bean
    public HelloService helloService() {
        return new HelloService();
    }

}
