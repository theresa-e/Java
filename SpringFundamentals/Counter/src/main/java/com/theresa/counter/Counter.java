package com.theresa.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Counter {
	public int counter = 0;

	@RequestMapping("")
	public String welcome(HttpSession session) {
		counter++;
		session.setAttribute("count", counter);
		return "home.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		session.getAttribute("count");
		return "counter.jsp";
	}
}
