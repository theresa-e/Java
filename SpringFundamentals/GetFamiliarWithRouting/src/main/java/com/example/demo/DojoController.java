package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{place}")
	public String dojo(@PathVariable("place") String place) {
		if (place.equals("dojo")){
			return "The " + place + " is heaven on earth.";
		} else if (place.equals("burbank-dojo")) {
			return "The Burbank Dojo is in Southern California.";
		} else if (place.equals("sanjose-dojo")) {
			return "The San Jose Dojo is the headquarters.";
		} else {
			return "Nooooooooo.";
		}
	}
}