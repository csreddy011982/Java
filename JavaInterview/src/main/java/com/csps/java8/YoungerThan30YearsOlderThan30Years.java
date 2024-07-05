package com.org.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class YoungerThan30YearsOlderThan30Years {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we need to divide the partition the employee based on age
		
		List<Employee> empList= Java8EmployeeData.getEmployeeData();
		
		Map<Boolean, List<Employee>> map = empList.stream().collect(
				Collectors.partitioningBy(emp -> emp.getAge()<=30));
		
		//System.out.println(map);
		
		for(Map.Entry<Boolean, List<Employee>> entry:map.entrySet()) {
			
			if(entry.getKey()) {
				
				System.out.println("** Empoyess Younger or equal to 30 years");
			}
					
			List<Employee>	list = entry.getValue();
			for(Employee emp:list) {
				
				System.out.println("Age " + emp.getAge() +" -"+emp.getName());
			}
					
			
		}
	}

}
