package es.curso.bean;
// Generated 06-nov-2017 19:58:31 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Empresasenvios generated by hbm2java
 */
public class Empresasenvios implements java.io.Serializable {

	private int id;
	private String nombre;
	private Set pedidoses = new HashSet(0);

	public Empresasenvios() {
	}

	public Empresasenvios(int id) {
		this.id = id;
	}

	public Empresasenvios(int id, String nombre, Set pedidoses) {
		this.id = id;
		this.nombre = nombre;
		this.pedidoses = pedidoses;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set getPedidoses() {
		return this.pedidoses;
	}

	public void setPedidoses(Set pedidoses) {
		this.pedidoses = pedidoses;
	}

}
