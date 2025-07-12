package org.gaurav;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestTeardownCalculator {
    private TeardownCalculator calc;

    //setup method
    @BeforeEach
    void setUp() {
        calc = new TeardownCalculator();
        System.out.println("Setup: Before Test");
    }

    // Teardown method (called after each test)
    @AfterEach
    void tearDown() {
        calc = null;
        System.out.println("Teardown: After Test");
    }

    @Test
    void testAddition() {
        int result = calc.add(10, 5);

        assertEquals(15, result, "10 + 5 should equal 15");
    }

    @Test
    void testSubtraction() {
        int result = calc.subtract(10, 4);
        assertEquals(6, result, "10 - 4 should equal 6");
    }

    @Test
    void testMultiplication() {
        int result = calc.multiply(3, 4);
        assertEquals(12, result, "3 * 4 should equal 12");
    }

    @Test
    void testDivision() {
        int result = calc.divide(20, 4);
        assertEquals(5, result, "20 / 4 should equal 5");
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(10, 0);
        });

        assertEquals("Division by zero", exception.getMessage());
    }

}
