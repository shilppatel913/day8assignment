package com.masai.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.masai.app.component.Bike;
import com.masai.app.component.Car;
import com.masai.app.component.Travel;

@Configuration
@ComponentScan(basePackages = {"com.masai.app.component"})
public class AppConfig {
	
	@Bean(name = "travel")
	//@Scope("prototype")
	public Travel getTravel() {
		Travel travel=new Travel();
		travel.setBike(getBike());
		travel.setCar(getCar());
		return travel;
	}
	
	@Bean(name = "bike")
	public Bike getBike() {
		Bike bike=new Bike();
		bike.setBike_no(12);
		bike.setModel("Royal Enfield");
		return bike;
	}
	
	@Bean(name = "car")
	public Car getCar() {
		Car car=new Car();
		car.setCar_no(40);
		car.setModel("Mercedes");
		return car;
	}

}
