package es.curso.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.curso.modelo.beans.Trabajador;
import es.curso.modelo.dao.ITrabajadorDAO;

public class Main {

	public static void main(String[] args) {
		ApplicationContext contexto;
		
		contexto = new ClassPathXmlApplicationContext("contexto2.xml");
		
		ITrabajadorDAO trabajadorDao = (ITrabajadorDAO) contexto.getBean("dao");
		Trabajador t = new Trabajador("124","Gema","informatica",0);
		
		trabajadorDao.insert(t);
				
		List<Trabajador> trs = trabajadorDao.getAll();
		for (Trabajador tr : trs)
			System.out.println(tr);
		
		
		((ClassPathXmlApplicationContext)contexto).close();
	}

}
