package com.xworkz.jail.washingmachine;

public class Power {

	private boolean on;

	public Power() {
		System.out.println("invoked Power " + this.getClass().getName());
	}

	public boolean isOn() {
		System.out.println("invoked isOn");
		return on;
	}

	public void setOn(boolean on) {
		System.out.println("invoked setOn");
		this.on = on;
	}

}
