package com.org.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageAgeOfMaleAndFemale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList= Java8EmployeeData.getEmployeeData();
		
		
		Map<Object, Double> avgMaleAndFemale = empList.stream().collect(
				Collectors.groupingBy(emp -> emp.getGender(),
						Collectors.averagingInt(emp -> emp.getAge())));
		
		Map<Object, Double> avgMaleAndFemaleSalary = empList.stream().collect(
				Collectors.groupingBy(emp -> emp.getGender(),
						Collectors.averagingDouble(emp -> emp.getSalary())));
		
		System.out.println(avgMaleAndFemale);
		
	}

}
