package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Human {
	
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false) String name) {
		if (name == null) {
			return "Hi Human! Welcome.";
		} else {
			return "Hello " + name + "! Welcome.";			
		}
	}
}
