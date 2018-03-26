package com.curso.mvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.mvc.modelo.EcuacionGrado2;
import com.curso.mvc.modelo.RaizException;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(){
		return "index";
	}
	
	@RequestMapping(value = "/calcular", method = RequestMethod.POST)
	public String calcular(Model model, @RequestParam("a") double a, @RequestParam("b") double b, @RequestParam("c") double c) {
		EcuacionGrado2 ecu;
		String mensaje;
			
		try {
			ecu = new EcuacionGrado2(a, b, c);
			mensaje = "Soluciones de la Ecuacion: " + ecu.getSol1() + " : " + ecu.getSol2();
			
			model.addAttribute("mensaje", mensaje );			
			return "resul";
		
		} catch (RaizException e){
			
			model.addAttribute("mensaje", e.getMessage());
			return "error";
		}
	}
	
}
