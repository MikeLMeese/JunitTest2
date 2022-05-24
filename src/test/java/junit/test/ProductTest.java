package junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class ProductTest {
    
    Product produce = new Product(3.00, 10, "Kiwis");

    @Test
    @DisplayName("Testing the printProduct() method")
    void printProductInfo() {
        assertEquals("Kiwis costs $3.0 and 10 units were purchased.", 
        produce.printProduct());
    }

    @Test
    @DisplayName("Testing the totalCost() method")
    void printTotalCost() {
        assertEquals("Total cost is $30.0", produce.totalCost());
    }
}
