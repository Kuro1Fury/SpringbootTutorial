package com.example.springbootredis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class SpringbootRedisApplicationTests {

	@Autowired
	private RedisTemplate redisTemplate;

	@Test
	public void testSet() {
		redisTemplate.boundValueOps("name").set("Allan");
	}

	@Test
	public void testGet() {
		Object name = redisTemplate.boundValueOps("name").get();
		System.out.println(name);
	}

}
