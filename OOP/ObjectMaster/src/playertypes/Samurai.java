package playertypes;
import human.Human;

public class Samurai extends Human{
	
	public Samurai () {
		this.setHealth(200);
		this.counter++;
	}
	public void deathBlow(Human human) {
		human.adjustHealth(0);
		int halvedHealth = this.getHealth() / 2;
		this.adjustHealth(halvedHealth);
	}
	public void meditate() {
		this.setHealth(200);
	}
	public int howMany() {
		return this.counter;
	}
}
