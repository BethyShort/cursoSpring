package es.curso.sh4.dao;

import java.util.List;

import es.curso.sh4.pojo.Clientes;

public interface IClienteDAO {
	
	public Clientes get(String idcliente);
	public void save(Clientes cliente);
	public List<Clientes> getAll();
	public void delete(Clientes cliente);
	public void update(Clientes cliente);

}
