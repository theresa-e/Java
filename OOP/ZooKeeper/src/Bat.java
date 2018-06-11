
public class Bat extends Mammal {
	public void setBatEnergy() {
		this.setEnergy(300);
	}
	public void fly() {
		System.out.println("The bat flew.");
		this.adjustEnergy(-50);
	}
	public void eatHumans() {
		System.out.println("The bat just ate a human!");
		this.adjustEnergy(25);
	}
	public void attackTown() {
		System.out.println("The bat attacked the town.");
		this.adjustEnergy(-100);
	}
}
