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
		
		System.out.println(config.getBd());
		System.out.println(config.getUrl());
		
		((ClassPathXmlApplicationContext) contexto).close();
	}

}
