package com.curso.coche.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.curso.coche.modelo.DatosCoche;
import com.curso.coche.validator.ValidadorDatosCoche;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/")
public class CocheController {

	@RequestMapping(method = RequestMethod.GET)
	public String mostrarForm() {
		return "cocheForm";
	}

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		
		binder.setValidator(new ValidadorDatosCoche()); // registramos el validador
	
	}

	@RequestMapping(value = "/manejar", method = RequestMethod.POST)
	public String manejarFormularioYaValidado(@Validated DatosCoche datosCoche,
			BindingResult result) {

		// si hay errores volvemos a la vista del formulario
		if (result.hasErrors()) {
			return "cocheForm";
		}

		// si no hay errores, manejamos los datos validados...

		return "datosCocheOk";

	}

	@ModelAttribute("datosCoche")
	public DatosCoche populateForm() {
		return new DatosCoche(); // creamos el bean para que se pueda popular
	}

}
