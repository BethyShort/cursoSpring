package es.curso.bean;
// Generated 06-nov-2017 19:58:31 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Clientes generated by hbm2java
 */
public class Clientes implements java.io.Serializable {

	private String idcliente;
	private String nombre;
	private String pais;
	private Boolean carnet;
	private Boolean musica;
	private Boolean deporte;
	private Boolean cine;
	private Boolean montanya;
	private Set pedidoses = new HashSet(0);

	public Clientes() {
	}

	public Clientes(String idcliente) {
		this.idcliente = idcliente;
	}

	public Clientes(String idcliente, String nombre, String pais, Boolean carnet, Boolean musica, Boolean deporte,
			Boolean cine, Boolean montanya, Set pedidoses) {
		this.idcliente = idcliente;
		this.nombre = nombre;
		this.pais = pais;
		this.carnet = carnet;
		this.musica = musica;
		this.deporte = deporte;
		this.cine = cine;
		this.montanya = montanya;
		this.pedidoses = pedidoses;
	}

	public String getIdcliente() {
		return this.idcliente;
	}

	public void setIdcliente(String idcliente) {
		this.idcliente = idcliente;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Boolean getCarnet() {
		return this.carnet;
	}

	public void setCarnet(Boolean carnet) {
		this.carnet = carnet;
	}

	public Boolean getMusica() {
		return this.musica;
	}

	public void setMusica(Boolean musica) {
		this.musica = musica;
	}

	public Boolean getDeporte() {
		return this.deporte;
	}

	public void setDeporte(Boolean deporte) {
		this.deporte = deporte;
	}

	public Boolean getCine() {
		return this.cine;
	}

	public void setCine(Boolean cine) {
		this.cine = cine;
	}

	public Boolean getMontanya() {
		return this.montanya;
	}

	public void setMontanya(Boolean montanya) {
		this.montanya = montanya;
	}

	public Set getPedidoses() {
		return this.pedidoses;
	}

	public void setPedidoses(Set pedidoses) {
		this.pedidoses = pedidoses;
	}

}
