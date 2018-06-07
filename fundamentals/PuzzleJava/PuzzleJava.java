import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class PuzzleJava{

    // Given an array print the sum of all vals
    // Return vals greater than 10.
    public ArrayList<Integer> sumArrayValues(int[] array){
        int sum = 0;
        ArrayList<Integer> greaterThan10 = new ArrayList<Integer>();
        for (int i=0; i<array.length; i++){
            sum += array[i];
            if (array[i] > 10){
                greaterThan10.add(array[i]);
            }
        }
        System.out.println(sum);
        return greaterThan10;
    }

    // Given an array of names, shuffle and print each value. 
    // Return names longer than 5 characters.
    public ArrayList<Object> shuffleNames(ArrayList<String> array){
        Collections.shuffle(array);
        ArrayList<Object> longerThan5 = new ArrayList<Object>();
        for (String s : array){
            if (s.length() > 5){
                longerThan5.add(s);
            } 
        }
        return longerThan5;
    }

    public ArrayList<Character> shuffledAlphabet(){
        // Create an array with 26 characters of the alphabet
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        System.out.println(alphabet);

        // Create an ArrayList and add characters
        ArrayList<Character> alphabetList = new ArrayList<Character>();
        for (int i=0; i<alphabet.length; i++){
            alphabetList.add(alphabet[i]);
        }

        // Shuffle the ArrayList, create new array with vowels
        Collections.shuffle(alphabetList);
        char[] vowels = "AaEeIiOoUu".toCharArray();

        // Check if the first value of our ArrayList is a vowel
        for (int i=0; i<vowels.length; i++){
            if (alphabetList.get(0) == vowels[i]){
                System.out.println("The first letter is a vowel: " + alphabetList.get(0));
            }
        }
        return alphabetList;
    }

    // Generate and return  an array with 10 random numbers between 55-100.
    public int[] getRandomNumbers(){
        int[] randomNumbers = new int[10];
        Random r = new Random();

        // Get random numbers and save in array
        for (int i=0; i<randomNumbers.length; i++){
            int randomNum = r.nextInt(100-55) + 55;
            randomNumbers[i] = randomNum;
        }
        return randomNumbers;
    }

    // Generate a random string that is 5 characters long.
    public String getRandomString(){
        String randomString = "";
        int[] indexes = new int[5];

        // Create an array with 26 characters of the alphabet
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        
        // Get 5 random numbers and place in indexes array.
        for (int i = 0; i<indexes.length; i++){
            Random r = new Random();
            int randomNum = r.nextInt(26-1) + 1;
            indexes[i] = randomNum;
        }

        // Based on indexes array, concat values to randomString.
        for (int i = 0; i < indexes.length; i++) {
            char c = alphabet[indexes[i]];
            randomString += String.valueOf(c);
        }
        return randomString;
    }

    // Generate an array with 10 random strings, each 5 chars long.
    public String[] getRandomStrArray(){
        String[] randomStrings = new String[10];
        for (int i=0; i< randomStrings.length; i++){
            randomStrings[i] = getRandomString();
        }
        return randomStrings;
    }

}