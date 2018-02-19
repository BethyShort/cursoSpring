package es.curso.dependencias;

public class Radio {
	
	private String marca;
	private String modelo;
	
	// 2 constructores, getter / setter, toString
	
	public Radio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Radio(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Radio [marca=" + marca + ", modelo=" + modelo + "]";
	}
}
