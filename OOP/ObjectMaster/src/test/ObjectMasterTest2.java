package test;
import human.Human;
import playertypes.*;

public class ObjectMasterTest2 {
	public static void main(String[] args) {
		Ninja n = new Ninja();
		Wizard w = new Wizard();
		Samurai s = new Samurai();
		Samurai s1 = new Samurai();
		Samurai s2 = new Samurai();
		Samurai s3 = new Samurai();
		System.out.println(n.getHealth());
		System.out.println(w.getHealth());
		System.out.println(s.counter);

	}
}
