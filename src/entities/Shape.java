package entities;

import entities.enums.Color;

public abstract class Shape {

	private Color cor;
	
	public Shape() {	
	}

	public Shape(Color cor) {
		this.cor = cor;
	}

	public Color getCor() {
		return cor;
	}

	public void setCor(Color cor) {
		this.cor = cor;
	}
	
	public abstract double area();
	
}
