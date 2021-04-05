package com.xworkz.jail.itcproduct;

public class Itcproduct {

	private String name;
	private String type;
	private String exprDate;

	public Itcproduct() {

		System.out.println("invoked Itcproduct");
	}

	public Itcproduct(String name) {
		super();
		System.out.println("created Itcproduct " + this.getClass().getName());
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getExprDate() {
		return exprDate;
	}

	public void setExprDate(String exprDate) {
		this.exprDate = exprDate;
	}

	public void displayDeatils() {
		System.out.println("created " + this.getClass().getSimpleName());
		System.out.println(this.exprDate);
		System.out.println(this.name);
		System.out.println(this.type);

	}

}
