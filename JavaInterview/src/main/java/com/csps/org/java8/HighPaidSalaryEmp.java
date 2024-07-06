package com.csps.org.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighPaidSalaryEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList= Java8EmployeeData.getEmployeeData();
		
		Optional<Employee> highPaidEmp = empList.stream().collect(
				Collectors.maxBy(Comparator.comparingDouble(Employee:: getSalary)));
		
		System.out.println(highPaidEmp);
	}

}
