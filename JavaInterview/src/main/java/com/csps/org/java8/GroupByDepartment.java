package com.csps.org.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class GroupByDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		List<Employee1> empDate = Arrays.asList(new Employee1("Krishna", "IT", 60000, "Grade A", "Bangalore", "1245225"),
				new Employee1("Ramu", "Sales", 23000, "Grade B", "Delhi", "643165"),
				new Employee1("Chandra", "IT", 48000, "Grade A", "Mubbai", "6465322"),
				new Employee1("Siri", "Finance", 27000, "Grade B", "Hyderabad", "656465"),
				new Employee1("Sunitha", "HR", 37000, "Grade B", "Kolkatha", "123456"),
				new Employee1("saanvi", "Medical", 45000, "Grade A", "Hyderabad", "1245225"),
				new Employee1("tte", "Engineer", 60000, "Grade A", "L B NAGAR", "1245225"));

		// group the employees based on department wise

		Map<String, List<Employee1>> groupEMPDataDep = (Map<String, List<Employee1>>) empDate.stream()
				.collect(Collectors.groupingBy(emp -> emp.getDepartment()));
		//System.out.println(groupEMPDataDep);
		
		// find the data salary >25k and grade A
		
		Map<String, List<Employee1>> finalResult = groupEMPDataDep.entrySet().stream().
				filter(entry -> entry.getValue().stream().anyMatch(
				employee -> employee.getSalary()>25000 && employee.getGrade().equals("Grade A")))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
				
				//System.out.println(finalResult);
				
				finalResult.forEach((department,employees) -> {
					System.out.println("Department: "+department);
					employees.forEach(System.out::println);
					
				});
			
		
		
	}

}

 class Employee1 {
	
	private String name;
	private String department;
	private int salary;
	private String grade;
	private String address;
	private String mobileNumber;
	public Employee1(String name, String department, int salary, String grade, String address, String mobileNumber) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.grade = grade;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + ", grade=" + grade
				+ ", address=" + address + ", mobileNumber=" + mobileNumber + "]";
	}
	

}
