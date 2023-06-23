package com.kurofury.springbootinit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${name}")
    private String name;

    @Value("${person.name}")
    private String name2;

    @Value("${person.age}")
    private int age;

    @Value("${address[0]}")
    private String address1;

    @Value("${msg1}")
    private String msg1;

    @Value("${msg2}")
    private String msg2;



    @Autowired
    private Environment env;



    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot demo2!";
    }

    @RequestMapping("/hello2")
    public String hello2() {
        System.out.println("name: " + name);
        System.out.println("name2: " + name2 + ", age: " + age);
        System.out.println("address1: " + address1);
        System.out.println("msg1: " + msg1);
        System.out.println("msg2: " + msg2);

        System.out.println("------------------------------");

        System.out.println(env.getProperty("person.name"));
        System.out.println(env.getProperty("address[0]"));

        return "Hello Spring Boot demo2!";
    }
}
