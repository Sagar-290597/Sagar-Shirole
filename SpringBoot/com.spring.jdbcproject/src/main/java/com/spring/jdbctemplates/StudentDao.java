package com.spring.jdbctemplates;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDao {

	// initialize database ie connection.
	public void setDataSource(DataSource ds);

	// create a record
	public void create(String name, Integer age);

	// get all the details
	public Student getStudent(Integer id);

	// list all the records
	public List<Student> listStudents();

	// delete records from table
	public void delete(Integer id);

	// update the records
	public void update(Integer id, Integer age);

}
