package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s = context.getBean("student", Student.class);
		System.out.println(s.getCountry());
	}
}
