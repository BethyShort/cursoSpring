package ejemplo.inyeccion.dependencias;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
		User usuario = (User)contexto.getBean("user");
		
		System.out.println(usuario); 
		((ClassPathXmlApplicationContext) contexto).close();
	}

}
