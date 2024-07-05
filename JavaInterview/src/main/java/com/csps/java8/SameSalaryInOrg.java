package com.org.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SameSalaryInOrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// We need to group data based on salary and need to display the list of employee
		
		List<Employee> empList = Java8EmployeeData.getEmployeeData();
		
		Map<Double, List<Employee>> sameSalaryGrp = empList.stream().
				collect(Collectors.groupingBy(Employee::getSalary,Collectors.toList()));
		
		System.out.println(sameSalaryGrp);
		
		for(Map.Entry<Double, List<Employee>> entry :sameSalaryGrp.entrySet()) {
			
			if(entry.getValue().size()>1) {
				System.out.println(entry.getKey()+""+entry.getValue());
			}
		}
 
	}

}
