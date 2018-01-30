package es.curso.sh4.service;

import java.util.Set;

import es.curso.sh4.pojo.Pedidos;

public interface IPedidosService {
		
		public void insertPedidos (Pedidos pedidos);
		public void updatePedidos  (int id, Pedidos pedidos);
		public void deletePedidos  (int id);
		public Pedidos readPedidos  (int id);
		public Set <Pedidos> readAllPedido ();
	}

