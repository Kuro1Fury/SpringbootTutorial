package com.example.springbootcondition.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ClassCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 1. Demand: Create bean after get Jedis
        // Check redis.clients.jedis.Jedis.class exists or not
        boolean flag = true;
        try {
            Class<?> clazz = Class.forName("redis.clients.jedis.Jedis");
            System.out.println("jedis class exists");
        } catch (ClassNotFoundException e) {
            flag = false;
            System.out.println("jedis class not exists");
        }
        return flag;
    }
}
