package com.theresa.dojoSurvey;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DojoSurvey {
	
	// Take user to home page
	@RequestMapping("/")
	public String home() {
		System.out.println("\nRouting to homepage.\n");
		return "index.jsp";
	}
	
	// Process survey results
	@RequestMapping("/result")
	public String process(@RequestParam(value="name") String name, @RequestParam(value="location") String location, @RequestParam(value="drink") String drink, @RequestParam(value="comments") String comments, HttpSession session) {
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("drink", drink);
		session.setAttribute("comments", comments);
		
		if (drink.equals("Earl Grey")) {
			return "earlGrey.jsp";
		} else {
			return "redirect:/surveyResults";
		}
	}
	
	// Return surveyResults view
	@RequestMapping("/surveyResults")
	public String results() {
		return "surveyResults.jsp";
	}
}

