package es.curso.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		  
		IMensaje mensaje = context.getBean("miBean", Mensaje.class);
		
		mensaje.printHelloWorld("prueba Spring");
		
		((AnnotationConfigApplicationContext) context).close();
	}

}
