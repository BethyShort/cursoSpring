package es.curso.app.principal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 
 * @author sorel
 *
 */
public class Principal {

    public static void main(String[] args) {
        
        ApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) contexto.getBean("jdbcTemplate");
        
        String sql = "select count(*) from trabajadores";
        Integer numeroTrabajadores = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println("El número de trabajadores es:"+numeroTrabajadores);

        ((ClassPathXmlApplicationContext) contexto).close();

    }

}
