package com.curso.aop;

public class Voluntario implements IVoluntario {
	
	private String pensamientos;
	private String observaciones;

	@Override
	public void pensar(String pensamientos, String observaciones) {
		// TODO Auto-generated method stub
		this.pensamientos = pensamientos;
		this.observaciones = observaciones;
	}

	@Override
	public String getPensamientos() {
		// TODO Auto-generated method stub
		return pensamientos;
	}

	@Override
	public String getObservaciones() {
		// TODO Auto-generated method stub
		return observaciones;
	}

}
