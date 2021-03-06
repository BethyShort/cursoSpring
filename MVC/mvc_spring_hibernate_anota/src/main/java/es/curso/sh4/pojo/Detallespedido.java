package es.curso.sh4.pojo;
// Generated 03-mar-2017 9:31:35 by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Detallespedido generated by hbm2java
 */
@Entity
@Table(name = "detallespedido", catalog = "empresa3")
public class Detallespedido implements java.io.Serializable {

	private DetallespedidoId id;
	private Pedidos pedidos;
	private Productos productos;
	private Float precio;
	private Integer unidades;
	private Float descuento;

	public Detallespedido() {
	}

	public Detallespedido(DetallespedidoId id, Pedidos pedidos, Productos productos) {
		this.id = id;
		this.pedidos = pedidos;
		this.productos = productos;
	}

	public Detallespedido(DetallespedidoId id, Pedidos pedidos, Productos productos, Float precio, Integer unidades,
			Float descuento) {
		this.id = id;
		this.pedidos = pedidos;
		this.productos = productos;
		this.precio = precio;
		this.unidades = unidades;
		this.descuento = descuento;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "idpedido", column = @Column(name = "idpedido", nullable = false)),
			@AttributeOverride(name = "idproducto", column = @Column(name = "idproducto", nullable = false)) })
	public DetallespedidoId getId() {
		return this.id;
	}

	public void setId(DetallespedidoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idpedido", nullable = false, insertable = false, updatable = false)
	public Pedidos getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(Pedidos pedidos) {
		this.pedidos = pedidos;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idproducto", nullable = false, insertable = false, updatable = false)
	public Productos getProductos() {
		return this.productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	}

	@Column(name = "precio", precision = 12, scale = 0)
	public Float getPrecio() {
		return this.precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	@Column(name = "unidades")
	public Integer getUnidades() {
		return this.unidades;
	}

	public void setUnidades(Integer unidades) {
		this.unidades = unidades;
	}

	@Column(name = "descuento", precision = 12, scale = 0)
	public Float getDescuento() {
		return this.descuento;
	}

	public void setDescuento(Float descuento) {
		this.descuento = descuento;
	}

}
