package com.curso.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.curso.mvc.modelo.ClasePadre;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
    @Autowired
    ClasePadre clasePadre;	
    
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(HttpServletRequest req){

		ModelAndView model=new ModelAndView();
	    double valor=Math.random()*100;
	    clasePadre.getClaseHija().setValor(valor);
	    clasePadre.setIdSesion(req.getSession().getId());
	    clasePadre.toString();

        model.setViewName("index");
        model.addObject("vistaBean", clasePadre);
        return model;
	    
	}
	
	@RequestMapping(value = "/cambiarEstado", method = RequestMethod.POST)
	public String calcular(HttpServletRequest req, Model model) {

	    double valor=Math.random()*100;
	    clasePadre.getClaseHija().setValor(valor);
	    clasePadre.setIdSesion(req.getSession().getId());
	    clasePadre.toString();
			
        model.addAttribute("vistaBean", clasePadre);
        return "index";
	    
	}
	
}
