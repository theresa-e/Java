package playertypes;
import human.Human;

public class Wizard extends Human {
	public Wizard() {
		this.setHealth(50);
		this.setIntelligence(8);
	}
	public void heal(Human human) {
		human.adjustHealth(this.getIntelligence());
	}
	public void fireball(Human human) {
		int damage = this.getIntelligence() * 3;
		human.adjustHealth(-damage);
	}
}
