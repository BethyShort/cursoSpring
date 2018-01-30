package es.curso.ejemplo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("per1")
public class Persona {
	
	@Value("Jose")
	private String nombre;
	
	@Value("Sanchez")
	private String apellidos;
	
	@Value("66")
	private int edad;
	
	@Resource
	private Direccion dir;
	
	public Persona() {
		super();
		System.out.println("crea Persona");
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, String apellidos, int edad, Direccion dir) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dir = dir;
	}
	
	@PostConstruct
	public void init1() {
		System.out.println("Constructor init 1 - configuración por clase");
	}
	
	@PostConstruct
	public void init2() {
		System.out.println("Constructor init 2 - congiguracion por clase");		
	}

	
	@PreDestroy
	public void destructor() {
		System.out.println("entramos en destructor - configuración por clase");		
	}

	public void inicializacion() {
		System.out.println("Salta init");
	}
	
	public void destruccion() {
		System.out.println("Salta destroy");
	}

	public Direccion getDir() {
		return dir;
	}

	public void setDir(Direccion dir) {
		this.dir = dir;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", dir=" + dir + "]";
	}



}
