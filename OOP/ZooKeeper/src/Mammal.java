
public class Mammal {
	private int energyLevel = 100;
	public void setEnergy(int value) {
		this.energyLevel = value;
	}
	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
	public void adjustEnergy(int value) {
		System.out.println("energyLevel before change: " + energyLevel);
		this.energyLevel = energyLevel + (value);
		System.out.println("energyLevel after change: " + energyLevel);
	}
}