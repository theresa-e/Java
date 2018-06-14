package com.theresa.theCode;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@Controller
public class Code {
	
	@RequestMapping("/")
	public String loadHome() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/submit", method=RequestMethod.POST)
	public String processInput(@RequestParam(value="code") String input) {
		if (input.equals("sushi")) {
			System.out.println("\n\nCORRECT PASSWORD ----> ");
			return "code.jsp";
		} else {
			System.out.println("\n\nINCORRECT PASSWORD ----> REDIRECTING TO HOME");
			return "redirect:/createError";
		}
	}
	
	@RequestMapping("/createError")
	public String flashMessages(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("error", "Whoops, that's the incorrect code! Try again.");
		return "redirect:/";
	}
}
