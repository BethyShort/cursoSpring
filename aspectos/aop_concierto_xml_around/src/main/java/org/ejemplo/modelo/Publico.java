package org.ejemplo.modelo;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 
 * @author sorel
 *
 */
public class Publico {

    public void verActuacion(ProceedingJoinPoint joinPoint) {

        try {

            // Antes de ejecutar el método:
            System.out.println("El publico se sienta");
            System.out.println("El publico apaga el telefono");

            long inicio = System.currentTimeMillis();

            joinPoint.proceed();

            long fin = System.currentTimeMillis();

            System.out.println("La actuación ha durado: " + (fin - inicio));

            // Después del método:
            System.out.println("El publico aplaude");

        } catch (Throwable e) {
            System.out.println("El publico protesta");
        }
    }

}
