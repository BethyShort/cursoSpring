package org.ejemplo.modelo;

public class Musico implements Actuacion {

	private Instrumento instrumento;
	private String nombre;

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Instrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}

	@Override
	public void actuar() {
		// TODO Auto-generated method stub
		instrumento.play();
	}
	
	
}
