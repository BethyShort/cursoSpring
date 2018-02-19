package org.ejemplo.modelo;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Publico {
	
	// Podemos definir un metodo ficticio y se le asigna un punto de corte:
	@Pointcut ("execution(* org.ejemplo.modelo.Instrumento.play(..))")
	public void actuacion(){}
	
	@Before ("actuacion()") 	
	public void tomarAsiento(){
		System.out.println("El publico se sienta");
	}
	
	@Before ("actuacion()") 	
	public void apagarTelefonos(){
		System.out.println("El publico apaga el telefono");
	}
	
	 @AfterReturning("actuacion()")
	public void aplaudir(){
		System.out.println("El publico aplaude");
	}
	
	@AfterThrowing("actuacion()")
	public void protestar(){
		System.out.println("El public protesta");
	}

}
