package com.example.springbootcondition.config;

import com.example.springbootcondition.condition.ClassCondition;
import com.example.springbootcondition.condition.ConditionOnClass;
import com.example.springbootcondition.domain.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    // @Conditional(ClassCondition.class)
//    @ConditionOnClass("redis.clients.jedis.Jedis")
    public User user() {
        return new User();
    }

    @Bean
    @ConditionalOnProperty(name = "kuro", havingValue = "kurofury")
    public User user2() {
        return new User();
    }
}
