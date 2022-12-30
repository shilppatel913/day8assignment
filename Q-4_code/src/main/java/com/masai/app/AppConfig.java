package com.masai.app;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.masai.app.component.PropertyComponent;
import com.masai.app.component.Student;

@Configuration
@ComponentScan(basePackages= {"com.masai.app.component"})
@PropertySource("db.properties")
public class AppConfig {

	@Bean(name = {"propertyComponent"})
	public PropertyComponent getPropertyComponent() {
		return new PropertyComponent();
	}
	
	@Bean(name = {"student"})
	public Student getStudent() {
		return new Student();
	}
}
