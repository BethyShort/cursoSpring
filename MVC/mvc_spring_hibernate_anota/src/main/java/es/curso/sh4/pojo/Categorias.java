package es.curso.sh4.pojo;
// Generated 03-mar-2017 9:31:35 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Categorias generated by hbm2java
 */
@Entity
@Table(name = "categorias", catalog = "empresa3")
public class Categorias implements java.io.Serializable {

	private Integer id;
	private String nombre;
	private Set<Productos> productoses = new HashSet<Productos>(0);

	public Categorias() {
	}

	public Categorias(String nombre) {
		this.nombre = nombre;
	}

	public Categorias(String nombre, Set<Productos> productoses) {
		this.nombre = nombre;
		this.productoses = productoses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "nombre", nullable = false, length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categorias")
	public Set<Productos> getProductoses() {
		return this.productoses;
	}

	public void setProductoses(Set<Productos> productoses) {
		this.productoses = productoses;
	}

}
