package ejemplo.inyeccion.dependencias;

public class User {
	private String nombre;
	private int edad;
	private String pais;	

	public User(String nombre, int edad, String pais) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "User [nombre=" + nombre + ", edad=" + edad + ", pais=" + pais
				+ "]";
	}	
}
