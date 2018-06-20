package com.theresa.dojoninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.theresa.dojoninjas.models.Ninja;
import com.theresa.dojoninjas.services.DojoService;
import com.theresa.dojoninjas.services.NinjaService;

@Controller
public class NinjaController {
	private final DojoService dojoService;
	private final NinjaService ninjaService;
	
	public NinjaController (DojoService dojoService, NinjaService ninjaService){
		this.dojoService = dojoService;
		this.ninjaService = ninjaService;
	}
	
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("allDojos", dojoService.findAllDojos());
		return "/ninjas/new.jsp";
	}
	
	@PostMapping("/ninjas")
	public String create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "/dojos/new.jsp";
		} else {
			Ninja createdNinja = ninjaService.createNinja(ninja);
			List<Ninja> allNinjas = ninjaService.allNinjas();
			model.addAttribute("allNinjas", allNinjas);
			return "redirect:/dojos/" + createdNinja.getDojo().getId();
		}
	}
}
