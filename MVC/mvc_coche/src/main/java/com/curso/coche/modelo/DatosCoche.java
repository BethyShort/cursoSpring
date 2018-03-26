package com.curso.coche.modelo;

public class DatosCoche {
	
	 private String matricula;     
	 private String modelo;
	 private int anho;	         
	 private int kilometros;
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnho() {
		return anho;
	}
	public void setAnho(int anho) {
		this.anho = anho;
	}
	public int getKilometros() {
		return kilometros;
	}
	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", modelo=" + modelo
				+ ", anho=" + anho + ", kilometros=" + kilometros + "]";
	}
	 
	

}
