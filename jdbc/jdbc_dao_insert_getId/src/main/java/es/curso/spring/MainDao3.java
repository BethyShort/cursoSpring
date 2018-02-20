package es.curso.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.curso.modelo.beans.Trabajador;
import es.curso.modelo.dao3.ITrabajadorDAO3;

public class MainDao3 {

	public static void main(String[] args) {
	ApplicationContext contexto;
		
		contexto = new ClassPathXmlApplicationContext("contexto_dao3.xml");
		
		ITrabajadorDAO3 trabajadorDao = (ITrabajadorDAO3) contexto.getBean("dao");
		Trabajador t = new Trabajador("128","Gema","informatica",0);
		
		System.out.println(trabajadorDao.insert(t));
					
		((ClassPathXmlApplicationContext)contexto).close();	

	}

}
