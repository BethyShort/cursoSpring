package es.curso.sh4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.curso.sh4.dao.IClienteDAO;
import es.curso.sh4.pojo.Clientes;

@Service("clienteServicio")
public class ClienteService implements IClienteService {
	
	@Autowired
	private IClienteDAO dao;
		
	
	public IClienteDAO getDao() {
		return dao;
	}

	public void setDao(IClienteDAO dao) {
		this.dao = dao;
	}

	@Override
	public Clientes get(String idcliente) {		
		return dao.get(idcliente);
	}

	@Override
	public void save(Clientes cliente) {
		dao.save(cliente);
	}

	@Override
	public List<Clientes> getAll() {
		return dao.getAll();
	}

	@Override
	public void delete(Clientes cliente) {
		dao.delete(cliente);		
	}

	@Override
	public void update(Clientes cliente) {
		dao.update(cliente);
	}
}
