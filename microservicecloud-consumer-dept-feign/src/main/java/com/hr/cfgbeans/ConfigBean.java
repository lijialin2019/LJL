package com.hr.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 李佳林
 * @date 2019-09-08 10:10
 * @desc
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced //开启ribbon的支持
    public RestTemplate RestTemplate(){
        return new RestTemplate();
    }
}
