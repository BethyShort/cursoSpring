package modelo.beans;

import java.util.List;

public class Categoria {

	private int id;
	private String nombre;
	private List<Producto> productos;
	
	public Categoria(){}
	
	public Categoria(int id, String nombre, List<Producto> productos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.productos = productos;
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
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		String txtProductos = "\n";
		
		for (Producto p : productos)
			txtProductos += p.toString() + "\n";
		
		return "Categoria [id=" + id + ", nombre=" + nombre + ", productos="
				+ txtProductos + "]";
	}	
}
