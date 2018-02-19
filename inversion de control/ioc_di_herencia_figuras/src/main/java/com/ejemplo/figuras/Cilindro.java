package com.ejemplo.figuras;

public class Cilindro extends Figura {

	private double radio;
	private double altura;
	private static final double PI = 3.141516;
	
	@Override
	public void draw() {
		System.out.println(getEtiqueta() + " con volumen " + volumen());
	}

	public double volumen() {
		double valor = 2 * PI * radio * radio * altura; 
		return valor;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	
}
