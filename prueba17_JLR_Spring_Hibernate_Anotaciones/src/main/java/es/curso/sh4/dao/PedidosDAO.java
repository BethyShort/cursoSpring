package es.curso.sh4.dao;


import java.util.Set;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import es.curso.sh4.pojo.Pedidos;


@Repository("pedidosDao")
public class PedidosDAO extends HibernateDaoSupport implements IPedidosDAO{


	public PedidosDAO (SessionFactory sf){
		setSessionFactory(sf);
	}

	@Override
	@Transactional
	public void insert(Pedidos pedido) {
		getHibernateTemplate().save(pedido);

	}

	@Override
	@Transactional
	public void update(int id, Pedidos pedido) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public void delete(int id) {
		Pedidos p = getHibernateTemplate().get(Pedidos.class, id);
		getHibernateTemplate().delete(p);
	}

	@Override
	public Pedidos read(int id) {	
		return getHibernateTemplate().get(Pedidos.class, id);
	}

	@Override
	public Set<Pedidos> readAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
