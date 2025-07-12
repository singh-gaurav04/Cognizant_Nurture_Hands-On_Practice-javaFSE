package org.gaurav;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(OrderAnnotation.class)
public class OrderedTests {

    Calculator calc = new Calculator();

    @Test
    @Order(1)
    void testAddPositive() {
        assertEquals(9, calc.add(4, 5));
    }

    @Test
    @Order(2)
    void testAddNegative() {
        assertEquals(-7, calc.add(-3, -4));
    }

    @Test
    @Order(3)
    void testAddWithZero() {
        assertEquals(5, calc.add(0, 5));
    }

    @Test
    @Order(4)
    void testAddMixed() {
        assertEquals(1, calc.add(3, -2));
    }
}
