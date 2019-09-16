package com.my_rule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 李佳林
 * @date 2019-09-11 18:09
 * @desc
 */
@Configuration
public class SelfRule {
    @Bean
    public IRule getRule(){
        return new RandomRule_LJL();
    }
}
