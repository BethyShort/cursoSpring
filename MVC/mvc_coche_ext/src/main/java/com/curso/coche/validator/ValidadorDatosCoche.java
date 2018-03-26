package com.curso.coche.validator;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.curso.coche.modelo.DatosCoche;

public class ValidadorDatosCoche implements Validator {

	 private static final int ANIO_ACTUAL = 
		        Integer.valueOf(new SimpleDateFormat("yyyy").format(new Date()));   
	 
	public boolean supports(Class<?> clazz) {
		return DatosCoche.class.equals(clazz); // clase del bean al que da soporte este validador
	}

	public void validate(Object target, Errors errors) {
		DatosCoche datosCoche = (DatosCoche) target;
        
        // la matr�cula es obligatoria
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "matricula", "matricula.vacia");
         
        // debe tener un formato correcto del tipo: 1111-BBB o B-2222-MM
        validarFormatoMatricula(datosCoche.getMatricula(), errors); // valida la matricula por expresi�n regular
         
        // la matr�cula es obligatoria
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "modelo", "modelo.vacio","otro por defecto");          
        
        
        // el a�o debe ser v�lido no puede ser mayor que el actual
        if ( datosCoche.getAnho() < 1900 || datosCoche.getAnho() > ANIO_ACTUAL ) {
            errors.rejectValue("anho", "anyo.valores","otro por defecto");
        }   
         
        // si no hay errores relacionados con el campo a�o
        if ( ! errors.hasFieldErrors("anho")) {
         
            // para los coches de a�o distinto al actual, validamos que no tengan m�s de 100.000 km
            if ( datosCoche.getAnho() < ANIO_ACTUAL ) {
                 
                if ( datosCoche.getKilometros() < 0 ) {
                    errors.rejectValue("kilometros", "kilometros.valores","otro por defecto");
                }
                 
                if ( datosCoche.getKilometros() > 100000 ) {
                    errors.rejectValue("kilometros", "kilometros.valores","otro por defecto");
                }
             
            }       
        }       
         
    }
	
	 private void validarFormatoMatricula (String matricula, Errors errors) {
	        // valida la matr�cula por expresi�n regular, si hay error lo a�ade a errors
	    }

}
