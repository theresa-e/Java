import java.util.ArrayList;

public class BasicThirteenTest {
    public static void main(String[] args) {
        BasicThirteen id = new BasicThirteen();

        // Print all values, 1-255
        System.out.println("\n\nPrint all values, 1-255:");
        ArrayList<Object> results = id.print1through255();
        System.out.println(results);

        // Print odd values only, 1-255
        System.out.println("\n\nPrint odd values only, 1-255:");
        ArrayList<Object> oddVals = id.printOdds1Thru255();
        System.out.println(oddVals);

        // Print sum of vals from 0-255
        System.out.println("\n\nPrint sum of all vals, 0-255:");        
        int sumValues = id.printSum();
        System.out.println(sumValues);

        // Iterate through array
        System.out.println("\n\nIterate through an array:");
        int[] testArray = {2, 4, 6, 8};
        int[] iteratedArray = id.iterateArray(testArray);
        System.out.println(iteratedArray);

        // Find max of an array
        System.out.println("\n\nFind max of array:");
        int[] testArray1 = {3, 2, 1, 5, 10, 4};
        int maximumOfArray = id.findMax(testArray1);
        System.out.println(maximumOfArray);

        // Find average of an array
        System.out.println("\n\nFind average of an array:");
        int[] findAvgOfArray = {3, 5, 2, 1, 5};
        double averageOfArray = id.findAvg(findAvgOfArray);
        System.out.println(averageOfArray);

        // Array with odd numbers
        System.out.println("\n\nCreate array with odd numbers:");
        int[] oddsArray = {1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer> x = id.getOddNumbers(oddsArray);
        System.out.println(x);

        // Return number of values in array that are greater than y
        System.out.println("\n\nReturn values that are greater than y:");
        int[] compareVals = {3, 2, 3, 4, 8, 9, 1};
        int y = 1;
        int resultsGreaterThanY = id.getNumbersGreaterThanY(compareVals, y);
        System.out.println(resultsGreaterThanY);

        // Square all values in an array
        System.out.println("\n\nSquare all values in an array:");
        int[] arrayToSquare = {3, 4, 5};
        int[] squaredArray = id.squareAllValues(arrayToSquare);
        for (int i=0; i<squaredArray.length; i++){
            System.out.println(squaredArray[i]);
        }

        // Remove all negative values
        System.out.println("\n\nRemove all negative values:");
        int[] testArray2 = {3, -1, 5, 4, -9, 5};
        int[] removedNegatives = id.removeNegatives(testArray2);
        for (int i=0; i<removedNegatives.length; i++){
            System.out.println(removedNegatives[i]);
        }

        // Max, min, and average
        System.out.println("\n\nReturn the max, min, and average of an array.");
        double[] testArray3 = {1, 2, 3, 4, 2};
        double[] minMaxAvgResults = id.minMaxAvg(testArray3);
        System.out.println("Max: " + minMaxAvgResults[0]);
        System.out.println("Min: " + minMaxAvgResults[1]);
        System.out.println("Average: " + minMaxAvgResults[2]);

        // Shift the values in the array
        System.out.println("\n\nShift all values in the array to the left. Last value should equal 0:");
        int [] testArray4 = {1, 5, 10, 7, -2};
        int [] shiftedArray = id.shiftValuesLeft(testArray4);
        for (int i=0; i<shiftedArray.length; i++){
            System.out.println(shiftedArray[i]);
        }
    }

}