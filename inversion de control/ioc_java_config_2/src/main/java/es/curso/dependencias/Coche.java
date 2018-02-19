package es.curso.dependencias;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("miCoche")
public class Coche {
	
	// Depende de Radio y Motor

	@Resource
	private Motor motor;
	
	@Resource
	private Radio radio;
	
	
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
	
	@PostConstruct
	public void inicializar2(){
		System.out.println("El coche se inicializa2 ...");
	}
	
	@PostConstruct
	public void inicializar(){
		System.out.println("El coche se inicializa ...");
	}
	
	@PreDestroy
	public void destruir(){
		System.out.println("Se destruye el coche ...");
	}

	@Override
	public String toString() {
		return "Coche [motor=" + motor + ", radio=" + radio + "]";
	}

}
