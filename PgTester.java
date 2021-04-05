package com.xworkz.jail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PgTester {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("injection.xml");

		PgComponent bean = applicationContext.getBean(PgComponent.class);

		System.out.println(bean);
		bean.stay();
	}
}
