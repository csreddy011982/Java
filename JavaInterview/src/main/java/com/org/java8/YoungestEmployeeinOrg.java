package com.org.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class YoungestEmployeeinOrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> empList = Java8EmployeeData.getEmployeeData();
		
		// Youngest Employee in org
		
		Optional<Employee> youngestEmp = empList.stream().min(Comparator.comparingInt(Employee::getAge));
	
		System.out.println(youngestEmp);
		
		// Youngest employee in human resource
		
		Optional<Employee> youngetHR = empList.stream().
				filter(e -> e.getDepartment().equalsIgnoreCase("houman Reosurce"))
				.min(Comparator.comparingInt(Employee::getAge));
				
		System.out.println(youngetHR);
		
		// Older Employee in org
		
		Optional<Employee> olderEmp = empList.stream().max(Comparator.comparingInt(Employee::getAge));
	
		System.out.println(olderEmp);
		
	// Youngest employee in human resource by gender
		
		Optional<Employee> youngetByGenderHR = empList.stream().
				filter(e -> e.getDepartment().equalsIgnoreCase("houman Reosurce") && e.getGender().equalsIgnoreCase("Male"))
				.min(Comparator.comparingInt(Employee::getAge));
				
		System.out.println(youngetByGenderHR);
		
	}

}
