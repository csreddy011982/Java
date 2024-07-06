package com.csps.org.java8;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CountEachDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList= Java8EmployeeData.getEmployeeData();
		
		Map<String, Long> departEmpCount = empList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		
		System.out.println(departEmpCount);
		
		for(Entry<String, Long> entry :departEmpCount.entrySet() ) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
