package es.curso.ejemplo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String... args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		context.getBean("userService");
		context.getBean("loginService");
	
		((ClassPathXmlApplicationContext) context).close();
	}
}
