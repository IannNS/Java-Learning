package entities;

import entities.enums.Color;

public abstract class Shape {
	
	private Color color;
	
	public Shape() {
	}
	
	public Shape(Color color) {
		this.color = color;
	}
	
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	//Métodos abstratos não possuem um corpo. São criados da forma abaixo: 
	public abstract Double area();
	
}
