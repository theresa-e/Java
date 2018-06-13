package com.petsAssignment.web.models;

public class Dog extends Animal implements Pet {
	private String greeting;
	public Dog (String name, String breed, double weight) {
		super();
	}
	public void setGreeting() {
		if (this.weight > 15) {
			this.greeting = "hopped onto the floor. What a big dog!";
		} else if (this.weight > 10) {
			this.greeting = "cuddled into your lap. What perfect-sized dog.";
		} else {
			this.greeting = "hopped into the palm of your hand. What a tiny dog.";
		}
	}
	
	public String showAffection(){
		return name + " " + greeting;
	}
}
