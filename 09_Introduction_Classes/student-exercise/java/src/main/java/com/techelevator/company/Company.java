package com.techelevator.company;

public class Company {

	private String Name;
	private int numberOfEmployees;
	private double Revenue;
	private double Expenses;

	{ 

		this.setName(Name);
		this.setNumberOfEmployees(numberOfEmployees);
		this.setRevenue(Revenue);
		this.setExpenses(Expenses);

	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public double getRevenue() {
		return Revenue;
	}

	public void setRevenue(double Revenue) {
		this.Revenue = Revenue;
	}

	public double getExpenses() {
		return Expenses;
	}

	public void setExpenses(double Expenses) {
		this.Expenses = Expenses;
	}

	public String getCompanySize() {

		if (this.numberOfEmployees <= 50) { 
			return "small";
		}

		if (this.numberOfEmployees >= 50 && this.numberOfEmployees <= 250) {
			return "medium";
		} else
			return "large";
	}

	public double getProfit() {
		return this.Revenue - this.Expenses;
	}
}
