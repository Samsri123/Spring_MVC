package com.sri.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sri.api.Student;
import com.sri.dao.StudentDAOImpl;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("ApplicationContext is loaded");
		StudentDAOImpl studentDaoImpl = applicationContext.getBean("studentDAO", StudentDAOImpl.class);
		Student s1 = new Student();
		s1.setName("Hemanth");
		s1.setAddress("Bangalore");
		s1.setRollNo(006);
		studentDaoImpl.insert(s1);
		// StudentDAO studentDAO = new StudentDaoImpl();
		// studentDAO.insert(s1);

	}
}
