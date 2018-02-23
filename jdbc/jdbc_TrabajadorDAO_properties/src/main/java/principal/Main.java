package principal;

import java.util.List;
import java.util.Scanner;

import modelo.beans.Trabajador;
import modelo.dao.TrabajadorDAO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author sorel
 *
 */
public class Main {
	
	public static void insertar(TrabajadorDAO trabajadorDAO){
		Scanner scanner = new Scanner(System.in);
		
		Trabajador trabajador = new Trabajador();
        System.out.println("Datos del trabajador:");
        
        System.out.print("ID:");
        String id = scanner.nextLine();
        trabajador.setId(id);

        System.out.print("Departamento:");
        String departamento = scanner.nextLine();
        trabajador.setDepartamento(departamento);
        
        System.out.print("Nombre:");
        String nombre = scanner.nextLine();
        trabajador.setNombre(nombre);
        
        trabajadorDAO.ingresarEmpleado(trabajador);       
        System.out.println("Ha grabado a " + trabajador);
        scanner.close();
	}
	
	public static void actualizar(TrabajadorDAO trabajadorDAO){
		Scanner scanner = new Scanner(System.in);
		
		Trabajador trabajador = new Trabajador();
        System.out.println("Datos del trabajador:");
        
        System.out.print("Actualizar ID:");
        String id = scanner.nextLine();
        trabajador.setId(id);

        System.out.print("Departamento:");
        String departamento = scanner.nextLine();
        trabajador.setDepartamento(departamento);
        
        System.out.print("Nombre:");
        String nombre = scanner.nextLine();
        trabajador.setNombre(nombre);
        
        trabajadorDAO.actualizarEmpleado(trabajador);       
        System.out.println("Ha actualizado a " + trabajador);
        scanner.close();
	}
	
	public static void borrar(TrabajadorDAO trabajadorDAO){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Listado:");
		System.out.print("Introduce id a borrar: ");
		String id = scanner.nextLine();
		
		trabajadorDAO.eliminarEmpleado(id);
		System.out.println("Se ha eliminado el id: " + id);
		scanner.close();
	}
	
	public static void listar(TrabajadorDAO trabajadorDAO){
		
		System.out.println("Listado:");
        List<Trabajador> lista = trabajadorDAO.listarEmpleados();
        
        for (Trabajador t2 : lista)
        	System.out.println(t2);
	}

	public static void main(String[] args) {
		
    	try {    		
    		// Capturar el bean de la Factoría:
	        //XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));  
	        ApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
	        
	        TrabajadorDAO trabajadorDAO = (TrabajadorDAO) contexto.getBean("trabajadorDAO");
	        
//	        insertar(trabajadorDAO);
//	        actualizar(trabajadorDAO);
	        listar(trabajadorDAO);
	        
	        System.out.println("Número de filas: " + trabajadorDAO.numeroTrabajadores());
	        System.out.println("Número de filas dpo Ventas: " + trabajadorDAO.numeroTrabajadoresPorDpo("Ventas"));
	        System.out.println("Recuperar el bean 990 -> " + trabajadorDAO.getTrabajador("990"));
	        ((ClassPathXmlApplicationContext)contexto).close();
    	}
    	catch (Exception excepcion) {
    		System.out.println(excepcion.getMessage());
    	}
  }

}
