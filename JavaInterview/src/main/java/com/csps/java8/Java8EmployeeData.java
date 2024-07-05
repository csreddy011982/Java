package com.org.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8EmployeeData {

	
	public static List<Employee> getEmployeeData(){
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee(101, "Brein", 32, "Female", "houman Reosurce", 2015,20500.0));
		employeeList.add(new Employee(102, "Paul", 28, "Male", "houman Reosurce", 2015,103500.0));
		employeeList.add(new Employee(103, "Martin", 32, "Female", "houman Reosurce", 2015,20500.0));
		employeeList.add(new Employee(104, "Roy", 40, "Male", "houman Reosurce", 2015,20500.0));
		employeeList.add(new Employee(105, "chandra", 40, "Male", "IT", 2004,20500.0));
		employeeList.add(new Employee(106, "sunitha", 32, "Female", "houman Reosurce", 2015,20500.0));
		employeeList.add(new Employee(107, "puneeth", 12, "Male", "Engineer", 2023,2500.0));
		
		return employeeList;
	}
}
