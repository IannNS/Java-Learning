package entities;

public class Person {

	private String name;
	private double firstGrade;
	private double seccondGrade;
	
	public Person(String name, double firstGrade, double seccondGrade) {
		this.name = name;
		this.firstGrade = firstGrade;
		this.seccondGrade = seccondGrade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFirstGrade() {
		return firstGrade;
	}

	public void setFirstGrade(double firstGrade) {
		this.firstGrade = firstGrade;
	}

	public double getSeccondGrade() {
		return seccondGrade;
	}

	public void setSeccondGrade(double seccondGrade) {
		this.seccondGrade = seccondGrade;
	}

}
