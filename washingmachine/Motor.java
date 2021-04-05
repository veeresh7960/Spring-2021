package com.xworkz.jail.washingmachine;

public class Motor {

	private int warrantyPeriod;

	public Motor() {
		System.out.println("invoked Motor " + this.getClass().getName());
	}

	public int getWarrantyPeriod() {
		System.out.println("invoked getWarrantyPeriod");
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
		System.out.println("invoked setWarrantyPeriod");
	}

	public void rotate() {
		System.out.println("invoked rotate");
		System.out.println("motor is rotating");
	}

}
