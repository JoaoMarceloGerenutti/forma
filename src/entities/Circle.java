package entities;

import entities.enums.Color;

public class Circle extends Shape {
	
	private Double raio;
	
	public Circle () {
		super();
	}

	public Circle(Color cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * raio * raio;
	}
	
}
