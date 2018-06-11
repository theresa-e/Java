package playertypes;
import human.Human;


public class Ninja extends Human {
	public Ninja() {
		this.setStealth(10);
	}
	public void steal(Human human) {
		int ninjaStealth = this.getStealth();
		human.adjustHealth(-(ninjaStealth));
		this.adjustStealth(ninjaStealth);
	}
	public void run() {
		this.adjustHealth(-10);
	}
}
