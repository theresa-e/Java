public class Pythagorean {
    public double calculateHypotenuse(double legA, double legB) {
        double sumOfRoots = Math.pow(legA, 2) + Math.pow(legB, 2);
        double squareRoot = Math.sqrt(sumOfRoots);
        return squareRoot;
    }
}
