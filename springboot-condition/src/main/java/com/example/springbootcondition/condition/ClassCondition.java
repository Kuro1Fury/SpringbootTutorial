package com.example.springbootcondition.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class ClassCondition implements Condition {
    /**
     * @param context Springboot context. Get bean factory, environment, bean definition registry
     * @param metadata Annotation metadata. Get annotation attributes. Get class name from annotation attributes
     * @return
     */
//    @Override
//    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
//        // Demand 1: Create bean after get Jedis
//        // Check redis.clients.jedis.Jedis.class exists or not
//        boolean flag = true;
//        try {
//            Class<?> clazz = Class.forName("redis.clients.jedis.Jedis");
//            System.out.println("jedis class exists");
//        } catch (ClassNotFoundException e) {
//            flag = false;
//            System.out.println("jedis class not exists");
//        }
//        return flag;
//    }

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // Demand 2: Create bean after get annotation value

        // Get annotation attributes
        Map<String, Object> map = metadata.getAnnotationAttributes(ConditionOnClass.class.getName());
//        System.out.println(map);
        String[] value = (String[]) map.get("value");
        boolean flag = true;
        try {
            for (String className : value) {
                Class<?> clazz = Class.forName(className);
                System.out.println(className + " exists");
            }
        } catch (ClassNotFoundException e) {
            flag = false;
        }
        return flag;
    }
}
