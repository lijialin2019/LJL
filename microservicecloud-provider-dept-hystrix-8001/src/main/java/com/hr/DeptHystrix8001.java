package com.hr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 李佳林
 * @date 2019-09-05 10:12
 * @desc
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableCircuitBreaker//对hystrixR熔断机制的支持
@MapperScan(value = "com.hr.mapper")
public class DeptHystrix8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptHystrix8001.class,args);
    }
}
