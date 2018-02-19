package es.curso.spring;

public class Mensaje implements IMensaje {

	@Override
	public void printHelloWorld(String s) {
		System.out.println("Mensaje: " + s);		
	}

}
