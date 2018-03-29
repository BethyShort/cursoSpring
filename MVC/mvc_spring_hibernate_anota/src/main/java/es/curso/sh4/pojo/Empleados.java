package es.curso.sh4.pojo;
// Generated 03-mar-2017 9:31:35 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Empleados generated by hbm2java
 */
@Entity
@Table(name = "empleados", catalog = "empresa3")
public class Empleados implements java.io.Serializable {

	private int id;
	private String nombre;
	private String cargo;
	private Set<Pedidos> pedidoses = new HashSet<Pedidos>(0);

	public Empleados() {
	}

	public Empleados(int id) {
		this.id = id;
	}

	public Empleados(int id, String nombre, String cargo, Set<Pedidos> pedidoses) {
		this.id = id;
		this.nombre = nombre;
		this.cargo = cargo;
		this.pedidoses = pedidoses;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "nombre", length = 30)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "cargo", length = 80)
	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "empleados")
	public Set<Pedidos> getPedidoses() {
		return this.pedidoses;
	}

	public void setPedidoses(Set<Pedidos> pedidoses) {
		this.pedidoses = pedidoses;
	}

}