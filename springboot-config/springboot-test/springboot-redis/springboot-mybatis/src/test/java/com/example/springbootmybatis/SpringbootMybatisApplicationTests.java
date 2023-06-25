package com.example.springbootmybatis;

import com.example.springbootmybatis.domain.User;
import com.example.springbootmybatis.mapper.UserMapper;
import com.example.springbootmybatis.mapper.UserXmlMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private UserXmlMapper userXmlMapper;

	@Test
	void testFindAll() {
		List<User> list = userMapper.findAll();
		System.out.println(list);
	}

	@Test
	void testFindAll2() {
		List<User> list = userXmlMapper.findAll();
		System.out.println(list);
	}

}
