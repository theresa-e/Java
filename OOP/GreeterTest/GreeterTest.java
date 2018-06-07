public class GreeterTest{
    public static void main(String[] args){
        Greeter g = new Greeter();

        String greeting = g.greet();
        String greetingWithName = g.greet("Theresa");
        System.out.println(greetingWithName);

        // if (greeting.equals("Hello World") || greetingWithName.equals)
    }
}