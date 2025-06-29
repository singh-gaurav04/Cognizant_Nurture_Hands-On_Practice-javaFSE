package org.gaurav;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestAssertions {

        @Test
        void testAddition() {
            int result = 2 + 3;
            assertEquals(5, result, "Addition should be 5");
        }

        @Test
        void testBoolean() {
            boolean isActive = true;
            assertTrue(isActive, "Should be true");

            boolean isDeleted = false;
            assertFalse(isDeleted, "Should be false");
        }

        @Test
        void testNullValues() {
            String str = null;
            assertNull(str, "String should be null");

            str = "JUnit";
            assertNotNull(str, "String should not be null");
        }

        @Test
        void testSameReference() {
            String a = "Hello";
            String b = a;
            assertSame(a, b, "References should be same");

            String c = new String("Hello");
            assertNotSame(a, c, "References should not be same");
        }

        @Test
        void testArrayEquals() {
            int[] expected = {1, 2, 3};
            int[] actual = {1, 2, 3};
            assertArrayEquals(expected, actual, "Arrays should be equal");
        }
    }


