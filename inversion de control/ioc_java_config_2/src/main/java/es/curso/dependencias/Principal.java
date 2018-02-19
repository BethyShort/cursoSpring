package es.curso.dependencias;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext contexto;
		Coche c;
				
		contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		
		c = (Coche) contexto.getBean("miCoche");	
		System.out.println(c);
		
		
		((AnnotationConfigApplicationContext)contexto).close();
	}

}
