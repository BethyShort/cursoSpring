package es.curso.sh4.dao;


import java.util.Set;

import es.curso.sh4.pojo.Pedidos;


public interface IPedidosDAO {
	
	public void insert (Pedidos pedido);
	public void update (int id, Pedidos pedido);
	public void delete (int id);
	public Pedidos read (int id);
	public Set<Pedidos> readAll ();

}
