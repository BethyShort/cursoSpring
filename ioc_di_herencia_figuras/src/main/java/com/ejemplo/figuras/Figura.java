package com.ejemplo.figuras;

public abstract class Figura {

	private String etiqueta;

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}
	
	public abstract void draw();	
}
