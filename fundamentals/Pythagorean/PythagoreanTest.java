public class PythagoreanTest {
    public static void main(String[] args) {
        Pythagorean iD = new Pythagorean();
        double legA = 5;
        double legB = 5;
        double hypotenuse = iD.calculateHypotenuse(legA, legB);
        System.out.println(hypotenuse);
    }
}