package com.example.config;

import com.example.domain.User;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(org.springframework.core.type.AnnotationMetadata importingClassMetadata, org.springframework.beans.factory.support.BeanDefinitionRegistry registry) {
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(User.class).getBeanDefinition();
        registry.registerBeanDefinition("user", beanDefinition);

    }

}
