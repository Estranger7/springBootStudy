package com.estranger.www.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Created by michangtao
 * @Date 2021/5/28 11:17
 * @Description
 */
@ConfigurationProperties(
        prefix = "estranger.hello"
)
public class HelloProperties {

    private String prefix;

    private String desc;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
