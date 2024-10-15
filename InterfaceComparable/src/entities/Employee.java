package entities;

public class Employee implements Comparable<Employee>{
	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	// Para comparar objetos 
	@Override
	public int compareTo(Employee other) {
		// Retorna um inteiro para cada casa. Caso maior > positivo, caso menor > negativo, caso igual > 0.
		return name.compareTo(other.getName());
		
		// Para ordem inversa, coloque um '-'.
		// Para alterar o que ordenar, altere os dados 'name' e '.getName()' para o dado respectivo que deseja ordenar.
	}
	
}
