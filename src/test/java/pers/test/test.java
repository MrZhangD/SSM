package pers.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pers.zhangdi.ssm.service.impl.UserServiceImpl;
import pers.zhangdi.ssm.vo.User;

public class test {
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		
		//Spring 提供staffmapper
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		UserServiceImpl usl = context.getBean("userServiceImpl",UserServiceImpl.class);
		User user = new User("admin","admin");

		System.out.println(usl.doUserLogin(user));
	}
}
