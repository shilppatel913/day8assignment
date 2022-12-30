package com.masai.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.masai.app.component.Bike;
import com.masai.app.component.Car;
import com.masai.app.component.Travel;

public class App {
	public static void main(String args[]) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Travel travel=context.getBean(Travel.class,"travel");
		
		System.out.println("Bike Model:"+travel.getBike().getModel());
		System.out.println("Car  Model:"+travel.getCar().getModel());
		
		System.out.println(travel);
		((AbstractApplicationContext) context).close();
	}
}
