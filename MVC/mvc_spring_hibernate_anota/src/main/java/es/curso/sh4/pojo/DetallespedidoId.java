package es.curso.sh4.pojo;
// Generated 03-mar-2017 9:31:35 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DetallespedidoId generated by hbm2java
 */
@Embeddable
public class DetallespedidoId implements java.io.Serializable {

	private int idpedido;
	private int idproducto;

	public DetallespedidoId() {
	}

	public DetallespedidoId(int idpedido, int idproducto) {
		this.idpedido = idpedido;
		this.idproducto = idproducto;
	}

	@Column(name = "idpedido", nullable = false)
	public int getIdpedido() {
		return this.idpedido;
	}

	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
	}

	@Column(name = "idproducto", nullable = false)
	public int getIdproducto() {
		return this.idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DetallespedidoId))
			return false;
		DetallespedidoId castOther = (DetallespedidoId) other;

		return (this.getIdpedido() == castOther.getIdpedido()) && (this.getIdproducto() == castOther.getIdproducto());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdpedido();
		result = 37 * result + this.getIdproducto();
		return result;
	}

}
