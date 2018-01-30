package es.curso.sh4.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es.curso.sh4.dao.IPedidosDAO;
import es.curso.sh4.pojo.Pedidos;

@Service("pedidosServicio")
public class PedidosService implements IPedidosService{

	@Autowired
	private IPedidosDAO dao;
	
	
	public IPedidosDAO getDao() {
		return dao;
	}

	public void setDao(IPedidosDAO dao) {
		this.dao = dao;
	}

	@Override
	public void insertPedidos(Pedidos pedidos) {
		dao.insert(pedidos);

	}

	@Override
	public void updatePedidos(int id, Pedidos pedidos) {
		dao.update(id, pedidos);

	}

	@Override
	public void deletePedidos(int id) {
		dao.delete(id);

	}

	@Override
	public Pedidos readPedidos(int id) {
		return dao.read(id);	
	}

	@Override
	public Set<Pedidos> readAllPedido() {		
		return dao.readAll();
	}

}
