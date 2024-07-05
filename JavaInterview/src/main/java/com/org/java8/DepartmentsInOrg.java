package com.org.java8;

import java.util.List;

public class DepartmentsInOrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList= Java8EmployeeData.getEmployeeData();
		
		empList.stream().map(emp ->emp.getDepartment()).distinct().forEach(System.out::println);
	}

}
