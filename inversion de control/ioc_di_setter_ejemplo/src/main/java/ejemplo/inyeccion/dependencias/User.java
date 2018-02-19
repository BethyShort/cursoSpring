package ejemplo.inyeccion.dependencias;

public class User {

	private String nombre;
	private int edad;
	private String pais;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "User [nombre=" + nombre + ", edad=" + edad + ", pais=" + pais
				+ "]";
	}
	
	
}
