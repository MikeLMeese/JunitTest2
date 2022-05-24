package junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class DivideMethodTest {
    
    @Test
    @DisplayName("Testing the divide() method")
    void divisionOf9And3ShouldEqual3() {
        assertEquals(3, DivideMethod.divide(9, 3));
    }
}
