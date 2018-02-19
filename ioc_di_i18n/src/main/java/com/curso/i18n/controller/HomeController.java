package com.curso.i18n.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.RequestContext;

import com.curso.i18n.modelo.Contacto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = {"/", "/{lang}"}, method = RequestMethod.GET)
	public String home() {
	
		
		return "index";
	}
	
	/*
	public String home(Locale locale, HttpServletRequest req) {
		System.out.println("locale: " + locale);
		System.out.println("lang: " + req.getParameter("lang"));
		
		return "index";
	}*/
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String grabar(){
		return "index"; // Aquí iríamos a otra vista para registrar el contacto.
	}
	
	@ModelAttribute("contacto")
	public Contacto initBean(){
		return new Contacto();
	}
}
