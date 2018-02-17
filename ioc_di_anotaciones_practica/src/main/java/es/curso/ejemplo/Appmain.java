package es.curso.ejemplo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author serrulata
 *
 */
public class Appmain {

    public static void main(String[] args) {
        ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
        Coche coche = (Coche) contexto.getBean("coche");

        System.out.println(coche);
        ((ClassPathXmlApplicationContext) contexto).close();
    }

}
