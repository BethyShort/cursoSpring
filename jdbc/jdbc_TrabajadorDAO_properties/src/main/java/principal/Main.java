package principal;

import java.util.List;
import java.util.Scanner;

import modelo.beans.Trabajador;
import modelo.dao.TrabajadorDAO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void insertar(TrabajadorDAO trabajadorDAO){
		Scanner scanner = new Scanner(System.in);
		
		Trabajador t = new Trabajador();
        System.out.println("Datos del trabajador:");
        
        System.out.print("ID:");
        String id = scanner.nextLine();
        t.setId(id);

        System.out.print("Departamento:");
        String departamento = scanner.nextLine();
        t.setDepartamento(departamento);
        
        System.out.print("Nombre:");
        String nombre = scanner.nextLine();
        t.setNombre(nombre);
        
        trabajadorDAO.ingresarEmpleado(t);       
        System.out.println("Ha grabado a " + t);
        scanner.close();
	}
	
	public static void actualizar(TrabajadorDAO trabajadorDAO){
		Scanner scanner = new Scanner(System.in);
		
		Trabajador t = new Trabajador();
        System.out.println("Datos del trabajador:");
        
        System.out.print("Actualizar ID:");
        String id = scanner.nextLine();
        t.setId(id);

        System.out.print("Departamento:");
        String departamento = scanner.nextLine();
        t.setDepartamento(departamento);
        
        System.out.print("Nombre:");
        String nombre = scanner.nextLine();
        t.setNombre(nombre);
        
        trabajadorDAO.actualizarEmpleado(t);       
        System.out.println("Ha actualizado a " + t);
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
    		// Capturar el bean de la Factor�a:
	        //XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));  
	        ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
	        
	        TrabajadorDAO trabajadorDAO = (TrabajadorDAO) factory.getBean("trabajadorDAO");
	        
//	        insertar(trabajadorDAO);
//	        listar(trabajadorDAO);
//	        actualizar(trabajadorDAO);
	        listar(trabajadorDAO);
	        
	        System.out.println("N�mero de filas: " + trabajadorDAO.numeroTrabajadores());
	        System.out.println("N�mero de filas dpo Ventas: " + trabajadorDAO.numeroTrabajadoresPorDpo("Ventas"));
	        System.out.println("Recuperar el bean 455 -> " + trabajadorDAO.getTrabajador("455"));
    	}
    	catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
  }

}
