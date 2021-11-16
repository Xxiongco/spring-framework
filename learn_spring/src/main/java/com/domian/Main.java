package com.domian;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
		User user = context.getBean(User.class);
		System.out.println("user = " + user);
	}
}