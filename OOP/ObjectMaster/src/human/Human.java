package human;

public class Human {
	private int strength = 3;
	private int stealth = 3;
	private int intelligence = 3;
	private int health = 100;
	public static int counter;
    // Setters
	public void setStrength(int value) {
		this.strength = value;
	}
	
	public void setStealth(int value) {
		this.strength = value;
	}
	
	public void setIntelligence(int value) {
		this.intelligence = value;
	}
	
	public void setHealth(int value) {
		this.health = value;
	}
	
	// Getters
	
	public int getStrength() {
		return this.strength;
	}
	public int getStealth() {
		return this.stealth;
	}
	public int getIntelligence() {
		return this.intelligence;
	}
	public int getHealth() {
		return this.health;
	}
	
	// Adjust member variables
	public void adjustStrength(int value) {
		this.strength = strength + (value);
	}
	
	public void adjustStealth(int value) {
		this.stealth = stealth + (value);
	}
	
	public void adjustIntelligence(int value) {
		this.intelligence = intelligence + (value);
	}
	
	public void adjustHealth(int value) {
		this.health = health + (value);
	}
	

	public void attack(Human name) {
		System.out.println("Human just attacked. Health before: " + name.health);
		name.health = name.health - this.strength;
		System.out.println("Human just attacked. Health after: " + name.health);
	}
}
