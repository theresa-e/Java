package com.theresa.dojoninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.theresa.dojoninjas.models.Dojo;
import com.theresa.dojoninjas.services.DojoService;
import com.theresa.dojoninjas.services.NinjaService;

@Controller
public class DojosController {
	private final DojoService dojoService;
	private final NinjaService ninjaService;
	
	public DojosController(DojoService dojoService, NinjaService ninjaService) {
		this.dojoService = dojoService;
		this.ninjaService = ninjaService;
	}
	
	@RequestMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "/dojos/addDojo.jsp";
	}
	
	@PostMapping("/dojos")
	public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "/dojos/new.jsp";
		} else {
			// Save new dojo in a variable to access the ID. 
			Dojo createdDojo = dojoService.createDojo(dojo);
			return "redirect:/dojos/" + createdDojo.getId();
		}
	}
	
	@GetMapping("/dojos/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Dojo dojo = dojoService.findDojo(id);
		model.addAttribute("dojo", dojo);
		return "/dojos/show.jsp";
	}
	
	
}
