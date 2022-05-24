package junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class SameOrNahTest {
    
    @Test
    @DisplayName("Test if the words are the same")
    void wordsAreTheSame() {
        assertEquals("The words are the same", 
        SameOrNah.butAreTheyTheSameTho("poop", "poop"));
    }

    @Test
    @DisplayName("Test if the words are different")
    void wordsAreDifferent() {
        assertEquals("The words are different", 
        SameOrNah.butAreTheyTheSameTho("Her", "throne"));
    }
}
