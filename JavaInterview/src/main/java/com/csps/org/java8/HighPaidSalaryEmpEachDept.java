package com.csps.org.java8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HighPaidSalaryEmpEachDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> empList = Java8EmployeeData.getEmployeeData();
		
		List<Employee> highPayEmpByDept = empList.stream().
				collect(Collectors.groupingBy(Employee::getDepartment))
				.values().stream().map(depEmp -> depEmp.stream().
				max(Comparator.comparing(Employee::getSalary)).orElse(null)).collect(Collectors.toList());

		System.out.println(highPayEmpByDept);
	}

}
