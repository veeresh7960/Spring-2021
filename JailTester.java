package com.xworkz.jail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JailTester {

	public static void main(String[] args) {

		String xmlFile = "spring.xml";
		String xmlFile1 = "second step in spring.xml";
		ApplicationContext spring = new ClassPathXmlApplicationContext(xmlFile, xmlFile1);

		// JailComponent component = spring.getBean(JailComponent.class);
		// component.policyName("to viresh");
		System.out.println(spring.getBeanDefinitionCount());
	}
}
