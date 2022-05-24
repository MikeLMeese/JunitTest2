package junit.test;

import java.util.ArrayList;

public class FifthItem {

    public static void main(String[] args) throws Exception {
        ArrayList<String> listOfStrings = new ArrayList<String>();
        String word1 = "Go";
        String word2 = "the";
        String word3 = "[REDACTED]";
        String word4 = "to";
        String word5 = "sleep";

        listOfStrings.add(word1);
        listOfStrings.add(word2);
        listOfStrings.add(word3);
        listOfStrings.add(word4);
        listOfStrings.add(word5);
        
        getFifthItem(listOfStrings);
    }

    public static String getFifthItem(ArrayList<String> listOfStrings) {
        return "The fifth item in this list is: " + listOfStrings.get(4);
    }
}