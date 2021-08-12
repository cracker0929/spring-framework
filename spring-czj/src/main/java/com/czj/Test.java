package com.czj;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext
				ac
				= new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("当前时间:" + System.currentTimeMillis() + "||||||" + ac.getBean(User.class));

		System.out.println("propertyValues:" + ac.getBeanDefinition("user").getPropertyValues());
		System.out.println("属性");
		System.out.println(System.getProperty("file.encoding"));

	}
}
