package com.xworkz.jail.itcproduct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AkshayTester {

	public static void main(String[] args) {
		ApplicationContext itc = new ClassPathXmlApplicationContext("itcproduct.xml");

		Itcproduct bean = itc.getBean(Itcproduct.class);
		bean.displayDeatils();

	}
}
