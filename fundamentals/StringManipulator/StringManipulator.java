public class StringManipulator{

    // trim both input strings and concat them
    public String trimAndConcat(String stringA, String stringB) {
        String strA = stringA.trim();
        String strB = stringB.trim();
        return strA.concat(strB);
    }

    // Get index of character, return index or null
    public Integer getIndexOrNull(String string, char givenChar) {
        if (string.indexOf(givenChar) == -1){
            Integer index = null;
            return index;
        } else {
            return string.indexOf(givenChar);
        }
    }

    // Trim first string and concat with a second string. 
    public String concatSubstring(String firstString, int beginIndex, int endIndex, String secondString) {
        String firstStringSub = firstString.substring(beginIndex, endIndex);
        return firstStringSub.concat(secondString);
    }

}