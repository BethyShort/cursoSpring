package es.curso.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Principal {

	public static void main(String[] args) {
		ApplicationContext contexto;
		Coleccion col1, col2;
		
		contexto = new ClassPathXmlApplicationContext("contexto.xml");
		col1 = (Coleccion) contexto.getBean("col1");
		col2 = (Coleccion) contexto.getBean("col2");
		
		System.out.println(col1);
		System.out.println(col2);
		((ClassPathXmlApplicationContext)contexto).close();
		

	}

}
