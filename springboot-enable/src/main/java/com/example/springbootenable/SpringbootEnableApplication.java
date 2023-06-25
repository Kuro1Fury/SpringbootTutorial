package com.example.springbootenable;

import com.example.config.EnableUser;
import com.example.config.MyImportBeanDefinitionRegistrar;
import com.example.config.MyImportSelector;
import com.example.config.UserConfig;
import com.example.domain.Role;
import com.example.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.util.Map;

/**
 * @ComponentScan range: current package and sub-packages
 *
 * // Method 1: user @ComponentScan to scan the package
 * // Method 2: use @Import to import the configuration class. All classes in
 * //           the configuration class will be registered as beans and added into ioc container
 * // Method 3: use @ImportResource to import xml configuration file
 */


/**
 * Import
 * 1. Import bean
 * 2. Import config class
 * 3. Import implementation class of ImportSelector
 * 4. Import implementation class of ImportBeanDefinitionRegistrar
 */
@SpringBootApplication
//@ComponentScan("com.example.config")
//@Import(UserConfig.class)
//@EnableUser

//@Import(User.class)
//@Import(UserConfig.class)
//@Import(MyImportSelector.class)
@Import(MyImportBeanDefinitionRegistrar.class)
public class SpringbootEnableApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootEnableApplication.class, args);

//		Object user = context.getBean("user");
//		System.out.println(user);

//		User user = context.getBean(User.class);
//		System.out.println(user);
//
//		Role role = context.getBean(Role.class);
//		System.out.println(role);

		Object user = context.getBean("user");

//		Map<String, User> map = context.getBeansOfType(User.class);
//		System.out.println(map);
	}

}
