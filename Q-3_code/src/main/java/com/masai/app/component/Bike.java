package com.masai.app.component;

public class Bike {
	
	private int bike_no;
	private String model;
	public int getBike_no() {
		return bike_no;
	}
	public void setBike_no(int bike_no) {
		this.bike_no = bike_no;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Bike [bike_no=" + bike_no + ", model=" + model + "]";
	}
	public Bike(int bike_no, String model) {
		super();
		this.bike_no = bike_no;
		this.model = model;
	}
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
