package com.bxz;

import com.bxz.config.HomeProperties;
import com.bxz.config.UserProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigApplicationTests {

	@Autowired
	private UserProperties userProperties;
	@Autowired
	private HomeProperties homeProperties;

	@Test
	public void contextLoads() {
		System.out.println(userProperties.toString());
		System.out.println(homeProperties.toString());
		System.out.println("ddddddddd");
	}



}
