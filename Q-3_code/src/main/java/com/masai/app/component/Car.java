package com.masai.app.component;

public class Car {
	private int car_no;
	private String model;
	public int getCar_no() {
		return car_no;
	}
	public void setCar_no(int car_no) {
		this.car_no = car_no;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Car [car_no=" + car_no + ", model=" + model + "]";
	}
	public Car(int car_no, String model) {
		super();
		this.car_no = car_no;
		this.model = model;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
