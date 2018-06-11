
public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("The gorilla has thrown something!");
		this.adjustEnergy(-5);
	}
	public void eatBanana() {
		System.out.println("The gorilla ate a delicious banana.");
		this.adjustEnergy(10);
	}
	public void climb() {
		System.out.println("The gorilla climbed up a tree~");
		this.adjustEnergy(-10);
	}
}
