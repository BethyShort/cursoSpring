package org.ejemplo.principal;

import org.ejemplo.modelo.Musico;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext contexto = new ClassPathXmlApplicationContext("beans2.xml");
		Musico musico1 = (Musico) contexto.getBean("anne");
		Musico musico2 =(Musico) contexto.getBean("roger");
		
		musico1.actuar();
		System.out.println();
		musico2.actuar();

		((ClassPathXmlApplicationContext) contexto).close();
	}

}