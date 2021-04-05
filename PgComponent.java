package com.xworkz.jail;

public class PgComponent {

	private int pgRent;
	private WardenComponent warden;
	

	public PgComponent() {
		System.out.println(" iinvoked PgComponent " + this.getClass().getSimpleName());
	}

	public int getPgRent() {
		return pgRent;
	}

	public void setPgRent(int pgRent) {
		System.out.println("invoked setPgRent");
		this.pgRent = pgRent;
	}

	public WardenComponent getWarden() {
		return warden;
	}

	public void setWarden(WardenComponent warden) {
		this.warden = warden;
	}

	public void stay() {
		System.out.println("created Stay from pgComponent");
		this.warden.foodServing();
	}
}
