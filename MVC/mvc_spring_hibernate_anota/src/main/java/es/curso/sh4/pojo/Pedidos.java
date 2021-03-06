package es.curso.sh4.pojo;
// Generated 03-mar-2017 9:31:35 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Pedidos generated by hbm2java
 */
@Entity
@Table(name = "pedidos", catalog = "empresa3")
public class Pedidos implements java.io.Serializable {

	private int idpedido;
	private Clientes clientes;
	private Empleados empleados;
	private Empresasenvios empresasenvios;
	private Float importe;
	private String pais;
	private Set<Detallespedido> detallespedidos = new HashSet<Detallespedido>(0);

	public Pedidos() {
	}

	public Pedidos(int idpedido, Clientes clientes, Empleados empleados, Empresasenvios empresasenvios) {
		this.idpedido = idpedido;
		this.clientes = clientes;
		this.empleados = empleados;
		this.empresasenvios = empresasenvios;
	}

	public Pedidos(int idpedido, Clientes clientes, Empleados empleados, Empresasenvios empresasenvios, Float importe,
			String pais, Set<Detallespedido> detallespedidos) {
		this.idpedido = idpedido;
		this.clientes = clientes;
		this.empleados = empleados;
		this.empresasenvios = empresasenvios;
		this.importe = importe;
		this.pais = pais;
		this.detallespedidos = detallespedidos;
	}

	@Id

	@Column(name = "idpedido", unique = true, nullable = false)
	public int getIdpedido() {
		return this.idpedido;
	}

	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name = "idcliente", nullable = false)
	public Clientes getClientes() {
		return this.clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name = "idempleado", nullable = false)
	public Empleados getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(Empleados empleados) {
		this.empleados = empleados;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name = "idempresaenvio", nullable = false)
	public Empresasenvios getEmpresasenvios() {
		return this.empresasenvios;
	}

	public void setEmpresasenvios(Empresasenvios empresasenvios) {
		this.empresasenvios = empresasenvios;
	}

	@Column(name = "importe", precision = 12, scale = 0)
	public Float getImporte() {
		return this.importe;
	}

	public void setImporte(Float importe) {
		this.importe = importe;
	}

	@Column(name = "pais", length = 50)
	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pedidos")
	public Set<Detallespedido> getDetallespedidos() {
		return this.detallespedidos;
	}

	public void setDetallespedidos(Set<Detallespedido> detallespedidos) {
		this.detallespedidos = detallespedidos;
	}

}
