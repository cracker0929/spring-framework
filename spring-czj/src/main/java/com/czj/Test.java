package com.czj;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext
				ac
				= new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("当前时间:"+System.currentTimeMillis()+"||||||"+ac.getBean(User.class));
	}
}
