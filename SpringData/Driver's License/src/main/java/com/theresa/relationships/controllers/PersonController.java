package com.theresa.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.theresa.relationships.models.License;
import com.theresa.relationships.models.Person;
import com.theresa.relationships.services.LicenseService;
import com.theresa.relationships.services.PersonService;

@Controller
public class PersonController {
	private final PersonService personService;
	private final LicenseService licenseService;

	public PersonController(PersonService personService, LicenseService licenseService) {
		this.personService = personService;
		this.licenseService = licenseService; 
	}
	
	// Home page
	@RequestMapping("/")
	public String index(Model model) {
		List<Person> persons = personService.allPersons();
		List<License> licenses = licenseService.allLicenses();
		model.addAttribute("persons", persons);
		model.addAttribute("licenses", licenses);
		return "relationships/index.jsp";
	}
	
	// Route to JSP with new-person form. 
	@RequestMapping("/person/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "relationships/newPerson.jsp";
	}
	
	// Submit new-person form.
	@RequestMapping(value="/person/new", method=RequestMethod.POST)
	public String createPerson(@Valid @ModelAttribute("person") Person person, BindingResult result ) {
		if (result.hasErrors()) {
			return "/relationships/newPerson.jsp";
		} else {
			personService.createPerson(person);
			return "redirect:/";
		}
	}
}
