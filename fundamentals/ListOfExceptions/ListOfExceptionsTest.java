import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
class CannotCastAsIntegers extends Exception{}

public class ListOfExceptionsTest{
    public static void main(String[] args){
        ListOfExceptions id = new ListOfExceptions();
        id.castAsInteger();
    }
}