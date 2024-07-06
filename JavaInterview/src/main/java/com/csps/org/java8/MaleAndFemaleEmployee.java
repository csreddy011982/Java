package com.csps.org.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaleAndFemaleEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList= Java8EmployeeData.getEmployeeData();
		
		Map<String, Long> maleAndFemalEmp = empList.stream().collect(
				Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		
		
		System.out.println(maleAndFemalEmp);
		MaleAndFemaleEmployee obj = new MaleAndFemaleEmployee();
		obj.testMethod();
	}

	void  testMethod() {
		throw new RuntimeException(new Exception ("it's a new exception")); 
		
		 
	}

}
