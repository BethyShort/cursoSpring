package es.curso.componentResource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prueba {

    public static void main(String[] args) {
        prueba1();
    }

    private static void prueba1() {
        ApplicationContext contexto;
        contexto = new ClassPathXmlApplicationContext("applicationContextComponentResource.xml");

        Correo correo1 = (Correo) contexto.getBean("correo");

        System.out.println(correo1);
        ((ClassPathXmlApplicationContext) contexto).close();
    }
}
