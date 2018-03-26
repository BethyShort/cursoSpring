package com.curso.valida.validadores;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.curso.valida.modelo.Persona;

public class PersonaValidator implements Validator {

	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return Persona.class.equals(arg0);
	}

	public void validate(Object target, Errors errors) {
		// Controlamos que el nombre no este vacio y la edad dentro de un rango.
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "field.nombre.required", "El nombre es obligatorio");
		
		Persona p = (Persona) target;
		
		if (! (p.getEdad() >= 0 && p.getEdad() < 100))
			errors.rejectValue("edad", "field.edad.required", "La edad debe estar en el rango 0 y 100");
	}

}
