package com.ejemplo.principal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ejemplo.figuras.Cilindro;
import com.ejemplo.figuras.Cubo;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");		
		Cubo cubo = (Cubo) factory.getBean("cubo");
		//cubo.setEtiqueta("Cubo");
		cubo.draw();
		
		Cilindro cilindro = (Cilindro) factory.getBean("cilindro");
		//cilindro.setEtiqueta("Cilindro");
		cilindro.draw();
		
		((ClassPathXmlApplicationContext) factory).close();
	}

}
