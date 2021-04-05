package com.xworkz.jail;

public class WardenComponent {

	private String wardenName;
	
	public WardenComponent() {
		System.out.println("invoked WardenComponent " + this.getClass().getName());
	}

	public String getWardenName() {
		System.out.println("invoked getWardenName");
		return wardenName;
	}

	public void setWardenName(String wardenName) {
		System.out.println("invoked setWardenName");
		this.wardenName = wardenName;
	}

	public void foodServing() {
		System.out.println("invoked foodServing");
	}

}
