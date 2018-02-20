package principal;

import java.util.List;

import modelo.beans.Categoria;
import modelo.dao.CategoriaDAO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext factory = null;
		
    	try {    		
    		// Capturar el bean de la Factor�a:  
	        factory = new ClassPathXmlApplicationContext("applicationContext.xml");
	        
	        CategoriaDAO categoriaDAO = (CategoriaDAO) factory.getBean("categoriaDAO");
	        
	        // Recuperar una Categoria:
	        Categoria categoria = categoriaDAO.get(1);
	        System.out.println("CAT: \n" + categoria);
	        
	        // Recuperar TODAS las Categorias:
	        List<Categoria> categorias = categoriaDAO.getAll();
	        for (Categoria c : categorias)
	        	System.out.println(c);	        
	      
    	}
    	catch (Exception e) {
    		System.out.println(e.getMessage());
    		
    	} finally {
    		if (factory != null)
    			((ClassPathXmlApplicationContext) factory).close();
		}
  }

}
