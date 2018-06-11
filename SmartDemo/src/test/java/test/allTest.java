package test;


import org.springframework.context.ApplicationContext;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import smart.demo.bean.User;
import smart.demo.mapper.UserMapper;
import smart.demo.service.UserService;

public class allTest {

	/*@Test
	public void reg() {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-dao.xml","spring-service.xml");
		UserMapper um = ac.getBean("userMapper",
				UserMapper.class);
		User user = new User();
		
		user.setUserName("admin1");
		user.setPassWord("12345");
		user.setPhone("119");
		//um.insert(user);
		
		UserService us = ac.getBean("userService",UserService.class);
		try {
			us.register(user);
		} catch (Exception e) {
			System.out.println("注册失败");
		}
		
	}*/
	/*@Test
	public void login() {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-dao.xml","spring-service.xml" );
		UserService us = ac.getBean("userService",UserService.class);
		User user =  us.login("110", "123456");
		System.out.println(user.toString());
	}*/
	
}
