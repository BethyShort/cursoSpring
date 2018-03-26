package com.curso.tiles.controller;



import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.curso.tiles.form.Contact;

@Controller
@SessionAttributes
public class ContactController {

	@RequestMapping(value = "/addContact.html", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("contact")
							Contact contact, BindingResult result) {
		
		System.out.println("First Name:" + contact.getFirstname() + 
					"Last Name:" + contact.getLastname());
		
		
		return "redirect:contacts.html";
	}
	
	@RequestMapping(value= {"/","/contacts.html"})
	public ModelAndView showContacts() {
		System.out.println("Entra");
		return new ModelAndView("contact", "command", new Contact());
	}
}
