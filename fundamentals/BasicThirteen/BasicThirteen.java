import java.util.ArrayList;
public class BasicThirteen {

    // Print 1-255
    public ArrayList<Object> print1through255(){
        ArrayList<Object> arr = new ArrayList<Object>();
        for (int i = 1; i<=255; i++){
            arr.add(i);
        }
        return arr;
    }

    // Print odd numbers between 1-255
    public ArrayList<Object> printOdds1Thru255(){
        ArrayList<Object> arr = new ArrayList<Object>();
        for (int i = 1; i<=255; i++){
            if (i % 2 != 0){
                arr.add(i);
            }
        }
        return arr;
    }

    // Print sum
    public int printSum(){
        int sum = 0;
        for (int i=0; i<=255; i++){
            sum += i;
            System.out.println("New number: " + i + ", Sum: " + sum);
        }
        return sum;
    }

    // Iterate through array
    public int[] iterateArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        return array;
    }

    // Find max value
    public int findMax (int[] array){
        int max = array[0];
        for (int i=1; i<array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    // Get average of an array
    public double findAvg (int[] array){
        double sum = array[0];
        double avg;
        for (int i=1; i<array.length; i++){
            sum += array[i];
        }
        avg = sum / array.length;
        return avg;
    }

    // Array with odd numbers
    public ArrayList<Integer> getOddNumbers (int[] arrayY){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 0; i < arrayY.length; i++){
            if (arrayY[i] % 2 != 0){
                y.add(arrayY[i]);
            }
        }
        return y;
    }

    // Greater than Y
    public int getNumbersGreaterThanY (int[] array, int y){
        int count = 0;
        for (int i=0; i<array.length; i++){
            if (array[i] > y){
                count++;
            }
        }
        return count;
    }

    // Square the values
    public int[] squareAllValues (int[] array){
        for (int i = 0; i<array.length; i++){
            array[i] = array[i] * array[i];
        }
        return array;
    }

    // Eliminate Negative numbers
    public int[] removeNegatives (int[] array){
        for (int i = 0; i<array.length; i++){
            if (array[i] < 0){
                array[i] = 0;
            }
        }
        return array;
    }

    // Max, min, average
    public double[] minMaxAvg (double[] array){
        double[] results = new double[3];
        double max = array[0];
        double min = array[0];
        double sum = array[0];
        double avg;
        for (int i=1; i<array.length; i++){
            sum += array[i];
            if (max < array[i]){
                max = array[i];
            } if (min > array[i]){
                min = array[i];
            }
        }
        avg = sum / array.length;
        results[0] = max;
        results[1] = min;
        results[2] = avg; 
        return results;
    }

    // Shift values in an array
    // Last value will become 0.
    public int[] shiftValuesLeft(int[] array){
        for (int i=0; i<array.length-1; i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = 0;
        return array;
    }
}