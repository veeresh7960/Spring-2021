package com.xworkz.jail;

public class JailComponent {

	private JailComponent() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	public void policyName(String name) {
		System.out.println("invoked policyName " + name);
	}
}
