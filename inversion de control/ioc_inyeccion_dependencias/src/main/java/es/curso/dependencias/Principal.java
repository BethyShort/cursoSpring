package es.curso.dependencias;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext contexto;
		Coche c, c2;
		
		// byName: si no encuentra el bean no da error, lo deja a null.
		// byName: si hay varios candidatos, sigue selecciona el coincide el nombre
		
		// byType: si tiene mas de un candidato da exception por ambiguedad
		// pero da igual el nombre de los candidatos
		// autowire-candidate="true" se puede usar en los candidatos para evitar
		// ambiguedad.
		
		// constructor: busca un constructor en la clase que reciba los n beans
		// que necesite. Si tiene varios candidatos del mismo tipo, NO lanza
		// el contructor y deja las propiedades a null.
		// Lo mismo ocurre si todos los candidatos están con:
		// autowire-candidate="true"
		
		// default <==> no
		// No conecta las propiedades.
		
				
		contexto = new ClassPathXmlApplicationContext("applicationContext_prop.xml");
		
		c = (Coche) contexto.getBean("coche");	
		System.out.println(c);
		
		
//		c2 = (Coche) contexto.getBean("coche");	
//		System.out.println(c2);
//		c2.getRadio().setMarca("R2");
//		
//		System.out.println(c);
//		System.out.println(c2);
//		
//		if (c == c2)
//			System.out.println("misma ref");
//		else
//			System.out.println("<> ref");
//		
		
		((ClassPathXmlApplicationContext)contexto).close();
	}

}
