package com.org.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class AverageSalaryOfEachDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> empList= Java8EmployeeData.getEmployeeData();
		
		Map<String, Double> averageSalary = empList.stream().
				collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.averagingDouble(Employee::getSalary)));
				
		for(Map.Entry<String, Double> entry: averageSalary.entrySet()) {
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}

	}

}
