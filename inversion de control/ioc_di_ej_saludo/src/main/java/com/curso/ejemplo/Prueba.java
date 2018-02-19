package com.curso.ejemplo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext contexto;
		SaludoService saludo;
		
		contexto = new ClassPathXmlApplicationContext("contexto.xml");
		saludo = (SaludoService) contexto.getBean("bean");
		System.out.println(saludo.saludar());
		((ClassPathXmlApplicationContext) contexto).close();
	}

}
