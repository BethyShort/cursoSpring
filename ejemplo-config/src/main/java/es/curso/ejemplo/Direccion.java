package es.curso.ejemplo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component ("dir")
public class Direccion {
	
	@Value("mayor")
	private String calle;
	@Value("77")
	private int numero;
	
	// constructor defecto, campos, set / get, toString:
	public Direccion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Direccion(String calle, int numero) {
		super();
		this.calle = calle;
		this.numero = numero;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", numero=" + numero + "]";
	}
}
