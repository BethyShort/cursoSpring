package es.curso.sh4.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import es.curso.sh4.pojo.Clientes;

@Repository("clienteDao")
public class ClienteDAO extends HibernateDaoSupport implements IClienteDAO {
	
	public ClienteDAO(SessionFactory sf){
		setSessionFactory(sf);
	}

	@Override
	public Clientes get(String idcliente) {
		return getHibernateTemplate().get(Clientes.class, idcliente);
	}

	@Transactional
	@Override
	public void save(Clientes cliente) {
		getHibernateTemplate().save(cliente);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Clientes> getAll() {		
		return (List<Clientes>) getHibernateTemplate().find("from Clientes");
	}

	@Transactional
	@Override
	public void delete(Clientes cliente) {
		getHibernateTemplate().delete(cliente);
		
	}

	@Transactional
	@Override
	public void update(Clientes cliente) {
		getHibernateTemplate().update(cliente);		
	}

}
