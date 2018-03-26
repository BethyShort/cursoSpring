package es.curso.sh4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.curso.sh4.pojo.Clientes;
import es.curso.sh4.service.IClienteService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private IClienteService servicio;
	
	public IClienteService getServicio() {
		return servicio;
	}

	public void setServicio(IClienteService servicio) {
		this.servicio = servicio;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {				
		return "home";
	}
	
	@RequestMapping(value = "/listado", method = RequestMethod.GET)
	public String listar(Model model){
		
		List<Clientes> clientes = servicio.getAll();
		model.addAttribute("clientes", clientes);
		return "listar";
	}
	
}
