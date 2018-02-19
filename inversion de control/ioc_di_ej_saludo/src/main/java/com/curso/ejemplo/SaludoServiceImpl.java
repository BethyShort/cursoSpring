package com.curso.ejemplo;

public class SaludoServiceImpl implements SaludoService {
	
	private String nombre;
	
	public SaludoServiceImpl() {
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String saludar() {
		// TODO Auto-generated method stub
		return "Bienvenido " + nombre;
	}
}
