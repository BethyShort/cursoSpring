package com.ejemplo.trabajador.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ejemplo.trabajador.modelo.beans.Trabajador;
import com.ejemplo.trabajador.modelo.dao.TrabajadorDAO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private TrabajadorDAO tDAO;
	
	
	public TrabajadorDAO getTrabajadorDao() {
		return tDAO;
	}

	public void setTrabajadorDao(TrabajadorDAO trabajadorDao) {
		this.tDAO = trabajadorDao;
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
	public String home() {		
		return "home";
	}
	
	@RequestMapping(value = "/nuevo", method = RequestMethod.GET)
	public String nuevo() {		
		return "nuevo";
	}
	
	@RequestMapping(value = "/grabar", method = RequestMethod.POST)
	public String grabar(@RequestParam("id") String id,
						@RequestParam("nombre") String nombre,
						@RequestParam("departamento") String departamento){
		
		Trabajador t = new Trabajador(id, nombre, departamento);
		tDAO.ingresarEmpleado(t);
		return "home";
	}
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar(Model modelo){
		
		List<Trabajador> trabajadores = tDAO.listarEmpleados();
		modelo.addAttribute("trabajadores", trabajadores);
		return "listar";
	}
}
