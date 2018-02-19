package pruebas.spring.clases;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");	
		SaludoService saludo = (SaludoService) factory.getBean("saludoService");
		saludo.saludar();
		((ClassPathXmlApplicationContext) factory).close();
	}

}
