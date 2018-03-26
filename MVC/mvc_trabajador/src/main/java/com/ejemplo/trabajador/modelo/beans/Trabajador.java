package com.ejemplo.trabajador.modelo.beans;

public class Trabajador {
	private String id;
	private String nombre;
	private String departamento;

	
	public Trabajador() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Trabajador(String id, String nombre, String departamento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.departamento = departamento;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nombre=" + nombre
				+ ", departamento=" + departamento + "]";
	}
}
