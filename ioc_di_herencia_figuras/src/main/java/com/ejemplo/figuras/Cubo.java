package com.ejemplo.figuras;

public  class Cubo extends Figura {

	private double lado;
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public void draw() {
		System.out.println(getEtiqueta() + " con area " + volumen());
	}

	public double volumen(){
		return lado * lado * lado;
	}
}
