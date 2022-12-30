package com.masai.app.component;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

public class Student {
	
	
	private String name;
	
	@Value("#{'${cities.names}'.split(',')}")
	private List<String> cities;
	 
	
	@PostConstruct
	public void init() {
		System.out.println("the student class has been initialized");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("the student class has been destroyed");
	}
	
	
	
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}


	

	@Override
	public String toString() {
		return "Student [name=" + name + ", cities=" + cities + "]";
	}

	public Student(String name, List<String> cities) {
		super();
		this.name = name;
		this.cities = cities;
	}

	public Student() {
		
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}
