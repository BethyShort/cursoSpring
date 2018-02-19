package es.curso.spring;

import java.util.Collection;

public class Coleccion {

	private Collection<?> datos;

	public Collection<?> getDatos() {
		return datos;
	}

	public void setDatos(Collection<?> datos) {
		this.datos = datos;
	}

	@Override
	public String toString() {
		return "Coleccion [datos=" + datos + "]";
	}
	
	
}
