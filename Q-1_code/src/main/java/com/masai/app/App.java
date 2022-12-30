package com.masai.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.masai.app.component.Student;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		List<Student> students=new ArrayList<Student>();
		
		Student student1=context.getBean(Student.class,"student");
		student1.setName("Shilp");
		students.add(student1);
		
		for(Student s:students) {
			System.out.println(s.getName()+" "+s.getCities().toString());
		}
		
		((AbstractApplicationContext) context).close();
	}

}
