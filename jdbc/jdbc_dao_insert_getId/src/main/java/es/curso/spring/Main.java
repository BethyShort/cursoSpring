package es.curso.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.curso.modelo.beans.Trabajador;
import es.curso.modelo.dao.ITrabajadorDAO;

/**
 * 
 * @author sorel
 *
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext.xml");

        ITrabajadorDAO trabajadorDao = (ITrabajadorDAO) contexto.getBean("dao");
        Trabajador trabajador = new Trabajador("124", "Gema", "informatica", 0);

        trabajadorDao.insert(trabajador);

        List<Trabajador> lstTrabajadores = trabajadorDao.getAll();
        for (Trabajador iteracionTrabajador : lstTrabajadores)
            System.out.println(iteracionTrabajador);

        ((ClassPathXmlApplicationContext) contexto).close();
    }

}
