package es.curso.sh4.service;

import java.util.List;

import es.curso.sh4.pojo.Clientes;

public interface IClienteService {
	
	public Clientes get(String idcliente);
	public void save(Clientes cliente);
	public List<Clientes> getAll();
	public void delete(Clientes cliente);
	public void update(Clientes cliente); 

}
