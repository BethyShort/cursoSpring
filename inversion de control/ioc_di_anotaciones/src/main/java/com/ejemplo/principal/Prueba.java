package com.ejemplo.principal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ejemplo.spring.Configuracion;

public class Prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext contexto = new ClassPathXmlApplicationContext("contexto.xml");
		Configuracion config;
		
		config = (Configuracion) contexto.getBean("java");
		System.out.println(config.getJavaHome());
		System.out.println(config.getVersion());
		((ClassPathXmlApplicationContext)contexto).close();
	}

}
