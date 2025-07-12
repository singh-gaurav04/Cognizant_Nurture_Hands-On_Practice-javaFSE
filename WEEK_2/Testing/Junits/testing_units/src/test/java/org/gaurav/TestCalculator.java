package org.gaurav;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCalculator {
    Calculator calc = new Calculator();
    @Test
    public void testAdd() {

        int result = calc.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testAddPositiveNumbers() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-5, calc.add(-2, -3));
    }

    @Test
    public void testAddPositiveAndNegative() {
        assertEquals(1, calc.add(4, -3));
    }

    @Test
    public void testAddWithZero() {
        assertEquals(7, calc.add(7, 0));
        assertEquals(-3, calc.add(0, -3));
    }

    @Test
    public void testAddLargeNumbers() {
        assertEquals(2_000_000_000, calc.add(1_000_000_000, 1_000_000_000));
    }

    @Test
    public void testMultiple(){
        assertEquals(0,calc.multiple(1,0));
    }

    public static class OrderedTests {
    }
}
