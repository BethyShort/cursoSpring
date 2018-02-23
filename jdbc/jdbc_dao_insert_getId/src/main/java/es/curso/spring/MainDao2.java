package es.curso.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.curso.modelo.beans.Trabajador;
import es.curso.modelo.dao2.ITrabajadorDAO2;

/**
 * 
 * @author sorel
 *
 */
public class MainDao2 {

    public static void main(String[] args) {
        
        ApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext2.xml");

        ITrabajadorDAO2 trabajadorDao = (ITrabajadorDAO2) contexto.getBean("dao");
        Trabajador trabajador = new Trabajador("126", "Gema", "informatica", 0);

        System.out.println(trabajadorDao.insert(trabajador));

        ((ClassPathXmlApplicationContext) contexto).close();

    }

}
