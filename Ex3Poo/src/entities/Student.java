package entities;

public class Student {
	public String name;
	public double grade;
	
	public void addGrade(double grade) {
		this.grade += grade;
	}
	
	public String state() {
		if(grade >= 60) {
			return "Aprovado!";
		}
		else {
			grade -= 60;
			return "Reprovado! Lhe faltam "+ -grade +" pontos para ser aprovado!";
		}
	}
}
