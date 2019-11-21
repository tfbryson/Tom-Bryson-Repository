package com.techelevator;

public class Employee {

	//(Inst. Variables)
	private int employeeId;
	private String firstName;
	private String lastName; 
	private String department;
	private double annualSalary;
	
	//(Constructor)
	public Employee(int employeeId, String firstName, String lastName, double annualSalary) {
		
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.annualSalary = annualSalary;
		
		
	}
	//(Getters and Setters)
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getFullName() {
		return lastName + ", " + firstName;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	
	
	public void raiseSalary(double percent) {
		double percentage = annualSalary * (percent / 100);
		annualSalary = annualSalary + percentage;
		
	}
	
}
