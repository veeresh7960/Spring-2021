package com.xworkz.jail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.jail.washingmachine.WashingMachine;

public class WashingMachineTester {

	
	public static void main(String[] args) {
		
		ApplicationContext spring=new ClassPathXmlApplicationContext("injection2.xml");
		WashingMachine machine = spring.getBean(WashingMachine.class);
		machine.wash();
		System.out.println(machine.getCapacity() + " " + machine.getCompanyName() );
	}
}
