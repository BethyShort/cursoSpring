package org.ejemplo.modelo;

import org.aspectj.lang.ProceedingJoinPoint;

public class Publico {

	public void verActuacion(ProceedingJoinPoint joinPoint) {
		
		try {
			
			// Antes de ejecutar el m�todo:
			System.out.println("El publico se sienta");
			System.out.println("El publico apaga el telefono");
			
			long inicio = System.currentTimeMillis();

			joinPoint.proceed();
			
			long fin = System.currentTimeMillis();
			
			System.out.println("La actuación ha durado: " + (fin-inicio));

			// Despu�s del m�todo:
			System.out.println("El publico aplaude");
			
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("El publico protesta");
		}
	}

}
