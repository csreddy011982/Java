package com.csps.org.java8;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeJoinedBefore2014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList= Java8EmployeeData.getEmployeeData();
		empList.stream().filter(emp -> emp.getYearOfJoining()<2014).
					map(emp -> emp.getName()).forEach(System.out::print);
		
		List<Employee> empResult = empList.stream().filter(emp -> 
		emp.getYearOfJoining()<2014).collect(Collectors.toList());
		
		System.out.println(empResult);
	}

}
