package com.spring.jdbctemplates;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudDetails {

	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("studentbeans.xml");

	      StudentJDBCTemplate studentJDBCTemplate = 
	         (StudentJDBCTemplate)context.getBean("student");
	      
	      //REcord Creation
	      studentJDBCTemplate.create("ABC", 10);
	      studentJDBCTemplate.create("DEF", 11);
	      studentJDBCTemplate.create("GHI", 12);

	      //Show All Details
	      List<Student> students = studentJDBCTemplate.listStudents();
	      
	      for (Student record : students) {
	         System.out.print("ID : " + record.getId() );
	         System.out.print(", Name : " + record.getName() );
	         System.out.println(", Age : " + record.getAge());
	      }

	      //Update Record
	      studentJDBCTemplate.update(2, 20);

	      //Show Details By Id
	      Student student = studentJDBCTemplate.getStudent(2);
	      System.out.print("ID : " + student.getId() );
	      System.out.print(", Name : " + student.getName() );
	      System.out.println(", Age : " + student.getAge());
	   }
}
