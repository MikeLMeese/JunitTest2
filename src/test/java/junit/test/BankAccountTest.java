package junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class BankAccountTest {

    BankAccount moneyLaunderingAccount = new BankAccount("Embezzlement funds", 1000);
    
    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all test methods");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before each test method");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each test method");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all test methods");
    }

    @Test
    @DisplayName("Testing the deposit() method")
    void deposit500ToEqual1500() {
        assertEquals(1500, moneyLaunderingAccount.deposit(500));
    }

    @Test
    @DisplayName("Testing the withdrawal() method")
    void withdraw500ToEqual500() {
        assertEquals(500, moneyLaunderingAccount.withdrawal(500));
    }

    @Test
    @DisplayName("Testing the getAccountInfo() method")
    void printAccountInfo() {
        assertEquals("Embezzlement funds's account balance: $1000.0", 
        moneyLaunderingAccount.getAccountInfo());
    }
}
