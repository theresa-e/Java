package com.theresa.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.theresa.relationships.models.License;
import com.theresa.relationships.models.Person;
import com.theresa.relationships.services.LicenseService;
import com.theresa.relationships.services.PersonService;

@Controller
public class LicenseController {
	private final LicenseService licenseService;
	private final PersonService personService;
	private static Integer counter = 0;
	
	public LicenseController(LicenseService licenseService, PersonService personService) {
		this.licenseService = licenseService;
		this.personService = personService;
	}
	
	// Route to JSP with new-license form.
	@RequestMapping("/license/new")
	public String newPerson(@ModelAttribute("license") License license, Model model) {
		List<Person> persons = personService.allPersons();
		System.out.println(persons);
		model.addAttribute("persons", persons);
		return "relationships/newLicense.jsp";
	}
	
	// Submit new-license form.
	@PostMapping("/license/new")
	public String createLicense(@Valid @ModelAttribute("license") License license, BindingResult result) {
		if (result.hasErrors()) {
			return "relationships/newLicense.jsp";
		} else {
			counter++;
			license.setNumber(String.format("%06d", counter));
			licenseService.createLicense(license);
			return "redirect:/";
		}
	}

}
