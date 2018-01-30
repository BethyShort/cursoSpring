package es.curso;

public class Empleado {

	private int id;
	private String nombre;
	private String cargo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		return "\n[id="+ id +"]\n" +"[Nombre="+ nombre +"]\n"+"[cargo="+ cargo +"]\n";
	}
	
}
