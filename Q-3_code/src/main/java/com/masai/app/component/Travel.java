package com.masai.app.component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Travel {
	private Bike bike;
	private Car car;
	
	@PostConstruct
	public void init() {
		System.out.println("The travel has been intialized");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("The travel has been destroyed");
	}
	public Bike getBike() {
		return bike;
	}
	public void setBike(Bike bike) {
		this.bike = bike;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Travel(Bike bike, Car car) {
		super();
		this.bike = bike;
		this.car = car;
	}
	public Travel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Travel [bike=" + bike + ", car=" + car + "]";
	}
	
	
}
