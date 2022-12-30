package com.masai.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.app.component.PropertyComponent;
import com.masai.app.component.Student;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		PropertyComponent propertyComponent=(PropertyComponent)context.getBean("propertyComponent");
		Student student=(Student)context.getBean(Student.class,"student");
		student.setId(1);
		student.setName("Shilp");
		student.setCity("Gujarat");
		System.out.println(propertyComponent.getUrl());
		String url=propertyComponent.getUrl();
		String username=propertyComponent.getUsername();
		String password=propertyComponent.getPassword();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connected");
			Connection connection=DriverManager.getConnection(url,username,password);
			String sql=" insert into student (id, name, city)"
		    + " values (?, ?, ?)";
			if(connection!=null) {
				PreparedStatement pstmt=connection.prepareStatement(sql);
				pstmt.setInt(1, student.getId());
				pstmt.setString(2, student.getName());
				pstmt.setString(3, student.getCity());
				int rows=pstmt.executeUpdate();
				System.out.println("The number of rows affected are"+rows);
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Could not insert into the database");
		}

	}

}
