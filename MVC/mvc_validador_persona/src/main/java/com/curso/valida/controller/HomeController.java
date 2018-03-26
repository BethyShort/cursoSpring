package com.curso.valida.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.curso.valida.modelo.Persona;
import com.curso.valida.validadores.PersonaValidator;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		
		return new ModelAndView("home", "persona", new Persona());
	}
	
	@RequestMapping(value="/procesar", method=RequestMethod.POST)
	public String procesar(@Validated Persona persona, BindingResult result){
		
		if (result.hasErrors())
			return "home"; // Al mismo formulario.
		else
			return "resul";
		
	}
	
	@InitBinder
	public void registrarValidador(WebDataBinder binder){
		binder.setValidator(new PersonaValidator());
	}
	
	
}
