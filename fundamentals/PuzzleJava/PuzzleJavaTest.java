import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PuzzleJavaTest {
    public static void main(String[] args){
        PuzzleJava id = new PuzzleJava();

        // Print sum of all values in the array
        // Return values that are greater than 10
        System.out.println("\n\nPrint sum of all values in array, return values greater than 10:");
        int[] array1 = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> sumArrayValuesResults = id.sumArrayValues(array1);
        System.out.println(sumArrayValuesResults);

        // Given an array of names, shuffle and print each value.
        // Return names longer than 5 characters.
        System.out.println("\n\nShuffle an array of names, print each value, return values greater than 5 characters:");
        ArrayList<String> names = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        System.out.println("ArrayList before shuffling: " + names);
        ArrayList<Object> shuffledNames = id.shuffleNames(names);
        System.out.println("ArrayList shuffled and names longer than 5 chars:  " + shuffledNames);

        // Shuffle an alphabet array and display the last letter of the array. 
        System.out.println("\n\nShuffle an alphabet array and display the last letter:");
        ArrayList<Character> alphabetResults = id.shuffledAlphabet();
        System.out.println(alphabetResults);

        // Generate and return an array with 10 random numbers between 55-100.
        System.out.println("\n\nGenerate and return an array with 10 random nums, 55-100:");
        int[] generatedRandomNumbers = id.getRandomNumbers();
        System.out.println(Arrays.toString(generatedRandomNumbers));
        
        // Generate a random string that is 5 chars long./**
        System.out.println("\n\nGenerate a random string that is 5 chars long:");
        String random = id.getRandomString();
        System.out.println(random);

        // Generate a random array with 10 random strings, each 5 characters long.
        System.out.println("\n\nGenerate a random array with 10 random strings, each 5 chars long:");
        String[] x = id.getRandomStrArray();
        System.out.println(Arrays.toString(x));
    }
}