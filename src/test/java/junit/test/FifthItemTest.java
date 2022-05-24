package junit.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class FifthItemTest {

    @Test
    @DisplayName("Test if getFifthItem() method retrieves fifth item in array")
    void stringsAreAddedToArray() {

        ArrayList<String> list = new ArrayList<String>();
        String word1 = "Go";
        String word2 = "the";
        String word3 = "[REDACTED]";
        String word4 = "to";
        String word5 = "sleep";

        list.add(word1);
        list.add(word2);
        list.add(word3);
        list.add(word4);
        list.add(word5);

        assertEquals("The fifth item in this list is: sleep", 
        FifthItem.getFifthItem(list));
    }
}
