package entities;

public class Employee {
	public String name;
	public double grossSalary, tax;
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	
	public void IncreaseSalary(double percentage) {
		grossSalary += grossSalary / percentage;
	}
}
