package com.ejemplo.principal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ejemplo.spring.Configuracion;

public class Prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext contexto = new ClassPathXmlApplicationContext("contexto.xml");
		Configuracion config;
		
		config = (Configuracion) contexto.getBean("config");		
		System.out.println("Con la clase: PropertyPlaceholderConfigurer");
		System.out.println(config);		
		((ClassPathXmlApplicationContext) contexto).close();
		
		contexto = new ClassPathXmlApplicationContext("contexto2.xml");		
		config = (Configuracion) contexto.getBean("config");	
		System.out.println("Con el context");
		System.out.println(config);		
		((ClassPathXmlApplicationContext) contexto).close();		
	}
}