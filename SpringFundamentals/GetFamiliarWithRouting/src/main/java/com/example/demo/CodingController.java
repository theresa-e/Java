package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/coding")
public class CodingController {
	@RequestMapping("")
	public String index() {
		return "Hello Coding Dojo!";
	}
	
	@RequestMapping("/python")
	public String python() {
		return "Python and Django was awesome possum!";
	}
	
	@RequestMapping("/java")
	public String java() {
		return "Java is cool too.";
	}
}
