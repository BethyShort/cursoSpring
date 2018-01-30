package es.curso.ejemplo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public static void main(String[] args) {
		ApplicationContext contexto;
		
		contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		
		Persona per = (Persona) contexto.getBean("per1");
		System.out.println(per);

		((AnnotationConfigApplicationContext)contexto).close();
	}

}
