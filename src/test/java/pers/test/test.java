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
		User user1 = usl.doSelectByUsername("zhangdi");
		User user2 = usl.doSelectByUsername("admin");
		//转账之前
		System.out.println("转账之前+++++++++++++++++++++++++++++++++++");
		System.out.println(user1.getUsername() + "--" + user1.getMoney());
		System.out.println(user2.getUsername() + "--" + user2.getMoney());
		//转账
		usl.transferMoney(user1,user2,500);
	}
}
