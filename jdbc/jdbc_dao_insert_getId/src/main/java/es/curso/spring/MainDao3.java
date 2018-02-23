package es.curso.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.curso.modelo.beans.Trabajador;
import es.curso.modelo.dao3.ITrabajadorDAO3;

public class MainDao3 {

    public static void main(String[] args) {
        ApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext3.xml");

        ITrabajadorDAO3 trabajadorDao = (ITrabajadorDAO3) contexto.getBean("dao");
        Trabajador trabajador = new Trabajador("128", "Gema", "informatica", 0);

        int resultado=trabajadorDao.insert(trabajador);
        
        System.out.println(resultado);

        ((ClassPathXmlApplicationContext) contexto).close();

    }

}
