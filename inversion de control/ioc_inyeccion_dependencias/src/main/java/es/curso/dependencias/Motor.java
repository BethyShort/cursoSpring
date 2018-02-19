package es.curso.dependencias;

public class Motor {
	
	private int potencia;
	private String marca;
	
	public Motor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motor(int potencia, String marca) {
		super();
		this.potencia = potencia;
		this.marca = marca;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Motor [potencia=" + potencia + ", marca=" + marca + "]";
	}

}
