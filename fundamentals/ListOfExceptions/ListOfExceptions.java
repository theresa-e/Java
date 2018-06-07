import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

// Make an ArrayList with strings and numbers
public class ListOfExceptions{

    public ArrayList<Object> castAsInteger (){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        for (int i=0; i<myList.size(); i++){
            try{
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("\n\nSuccessfully casted value:");
                System.out.println("Index: " + i);
                System.out.println("Value: " + myList.get(i));
            } catch(ClassCastException e){
                System.out.println("\n\nFailed to cast value:");
                System.out.println("Index where error occured: " + i);
                System.out.println("Value that triggered the error: " + myList.get(i));
            }
        }
        return myList;
    }
}