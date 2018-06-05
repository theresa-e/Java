public class StringManipulatorTest {
    public static void main(String[] args){
        StringManipulator iD = new StringManipulator();

        // Test concatString (String, String)
        String stringA = "       Hello      ";
        String stringB = "    world       ";
        String concatString = iD.trimAndConcat(stringA, stringB);
        System.out.println(concatString);

        // Test getIndexOrNull(String, char)
        String testString = "Coding Dojo";
        char testIndex = 'D';
        Integer a = iD.getIndexOrNull(testString, testIndex);
        System.out.println(a);

        // Test concatSubstring(String, int, int, String)
        String firstString = "Hello";
        String secondString = "World";
        int beginNum = 1;
        int endNum = 2;
        String b = iD.concatSubstring(firstString, beginNum, endNum, secondString);
        System.out.println(b);
    }
}