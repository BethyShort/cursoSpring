package modelo.beans;

public class Producto {

	private int id;
	private String nombre;
	private double precio;
	private int existencias;
	
	public Producto(){}
	
	public Producto(int id, String nombre, double precio, int existencias) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.existencias = existencias;
	}

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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getExistencias() {
		return existencias;
	}

	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio="
				+ precio + ", existencias=" + existencias + "]";
	}
	
	
}
