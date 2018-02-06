package com.ejemplo.principal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ejemplo.figuras.Figura;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");		
		Figura figura =  factory.getBean("cubo",Figura.class);
		System.out.println("la figura que vamos a dibujar es: "+figura.getEtiqueta());
		figura.draw();
		
		figura =  factory.getBean("cilindro",Figura.class);
		System.out.println("la figura que vamos a dibujar es: "+figura.getEtiqueta());
		figura.getEtiqueta();
		figura.draw();
		
		((ClassPathXmlApplicationContext) factory).close();
	}

}
