package com.xworkz.jail.washingmachine;

public class WashingMachine {

	private String companyName;
	private float capacity;
	private Motor motor;
	private Power pow;

	public WashingMachine() {
		System.out.println("invoked WashingMachine " + this.getClass().getName());
	}

	public String getCompanyName() {
		System.out.println("invoked getCompanyName");
		return companyName;
	}

	public void setCompanyName(String companyName) {
		System.out.println("invoked setCompanyName");
		this.companyName = companyName;
	}

	public float getCapacity() {
		System.out.println("invoked getCapacity");
		return capacity;
	}

	public void setCapacity(float capacity) {
		this.capacity = capacity;
		System.out.println("invoked setCapacity");
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Power getPow() {
		return pow;
	}

	public void setPow(Power pow) {
		this.pow = pow;
	}

	public void wash() {
		System.out.println("invoked wash ");
		if (pow.isOn()) {
			this.motor.rotate();
		}

	}
}
