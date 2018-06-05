public class FizzBuzz {
    public String fizzBuzz(int number){
        String results;
        if (number % 15 == 0){
            results = "FizzBuzz";
        } else if (number % 3 == 0){
            results = "Fizz";
        } else if (number % 5 == 0){
            results = "Buzz";
        } else {
            results = Integer.toString(number);
        }
    return results;
    }
}