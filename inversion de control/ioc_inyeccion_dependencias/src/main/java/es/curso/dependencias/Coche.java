package es.curso.dependencias;

public class Coche {
	
	// Depende de Radio y Motor
	private Motor motor;
	private Radio radio;
	
	/*
	 * ESTA MAL, LA CLASE NO ES RESPONSABLE DE CREAR SUS DEPENDENCIAS!!!
	 * public Coche(){
	 * 	motor = new Motor();
	 *  radio = new Radio();
	 * }
	 *  
	 */
		
	
	public Coche() {
		super();
		System.out.println("Salta constructor ...");
	}

	public Coche(Motor motor, Radio radio) {
		super();
		this.motor = motor;
		this.radio = radio;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Radio getRadio() {
		return radio;
	}

	public void setRadio(Radio radio) {
		this.radio = radio;
	}
	
	public void inicializar(){
		System.out.println("El coche se inicializa ...");
	}
	
	public void destruir(){
		System.out.println("Se destruye el coche ...");
	}

	@Override
	public String toString() {
		return "Coche [motor=" + motor + ", radio=" + radio + "]";
	}
	
	
	
	

}
