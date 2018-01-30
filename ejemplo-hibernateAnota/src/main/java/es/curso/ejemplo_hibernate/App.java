package es.curso.ejemplo_hibernate;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import es.curso.bean.Clientes;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	actualizarCliente();
//    	borrarCliente();
//        grabarCliente();
//        listarCliente();
    }
    
    private static void grabarCliente() {
        Session session =HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        
        try {
            Clientes cliente=new Clientes();
            cliente.setIdcliente("110817");
            cliente.setNombre("Nombre Hiber");
            cliente.setPais("España");
            cliente.setCarnet(true);
        	
            session.save(cliente);
            transaction.commit();
        }catch(HibernateException ex) {
        	transaction.rollback();
        	System.out.println(ex.getMessage());
        }finally {
        	if (session!=null)
        		session.close();
        }
    }

    private static void listarCliente() {
        SessionFactory sf;
        Session session;
        String hql;
        Query query;
        
        sf =HibernateUtil.getSessionFactory();
        session=sf.openSession();
        
        hql="from Clientes";
        query =session.createQuery(hql);
        List<Clientes> clientes=query.list();
        
        for (Clientes c: clientes) 
        	System.out.println(c.getNombre());
        	
       	session.close();
    }

    
    private static void borrarCliente() {
        Session session =HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        
        try {
            Clientes cliente=(Clientes)session.get(Clientes.class, "110817");
        	if (cliente!=null)
        		session.delete(cliente);
            transaction.commit();
        }catch(HibernateException ex) {
        	transaction.rollback();
        	System.out.println(ex.getMessage());
        }finally {
        	if (session!=null)
        		session.close();
        }
    }
    
    private static void actualizarCliente() {
        Session session =HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        
        try {
            Clientes cliente=(Clientes)session.get(Clientes.class, "110817");
        	if (cliente!=null) {
        		cliente.setNombre("Mamarrachez");
        		session.update(cliente);
        	}
            transaction.commit();
        }catch(HibernateException ex) {
        	transaction.rollback();
        	System.out.println(ex.getMessage());
        }finally {
        	if (session!=null)
        		session.close();
        }
    }


}
