package com.masai.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import com.masai.app.component.Student;

@Configuration
@ComponentScan(basePackages = {"com.masai.app.component"})
@PropertySource("cities.properties")
public class AppConfig {

	
//	@Scope(value = "prototype")
	@Bean(name ="student")
	public Student getStudent() {
		Student student=new Student();
		return student;
	}
	
	
	
	
	
}
