package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Employee;

public class EmployeeService {
	
// Verifica se o critério passa, caso sim, soma.
	public double filteredSum(List<Employee> list, Predicate<Employee> criteria) {
		double sum = 0.0;
		for (Employee e : list) {
			if(criteria.test(e)) {
				sum += e.getSalary();
			}
		}
		
		return sum;
	}
}
