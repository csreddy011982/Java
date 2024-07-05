package com.org.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MostExperienceEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> empList = Java8EmployeeData.getEmployeeData();
		//first We need to compare the Empoyee year of joining
		
		Optional<Employee> mostExpEmp = empList.stream().sorted(Comparator.comparingInt
				(emp -> emp.getYearOfJoining()))
				.findFirst();
		
		Optional<Employee> mostSkipOneEmp = empList.stream().sorted(Comparator.comparingInt
				(emp -> emp.getYearOfJoining())).skip(1)
				.findFirst();
		
		System.out.println(mostExpEmp);
		System.out.println(mostSkipOneEmp);
	}

}
