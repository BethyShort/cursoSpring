package com.ejemplo.principal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ejemplo.spring.Familia;

public class Prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext contexto;
		Familia f;
		
		contexto = new ClassPathXmlApplicationContext("contexto.xml");
		f = (Familia) contexto.getBean("familia");
		
		for (Integer clave : f.getMapa().keySet()){
			System.out.println(f.getMapa().get(clave));
		}
		
		((ClassPathXmlApplicationContext) contexto).close();
	}

}
