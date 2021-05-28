package com.estranger.www.service;

import com.estranger.www.config.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Created by michangtao
 * @Date 2021/5/28 11:46
 * @Description
 */
public class HelloService {

    @Autowired
    HelloProperties helloProperties;

    public String sayHello(String name){
        return helloProperties.getPrefix() + name + helloProperties.getDesc();
    }
}
