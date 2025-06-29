package org.gaurav;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionThrowerTest {

    @Test
    public void testRiskyMethodThrowsException() {
        ExceptionThrower thrower = new ExceptionThrower();

        assertThrows(IllegalArgumentException.class, () -> {
            thrower.riskyMethod(-5);
        });
    }

    @Test
    public void testRiskyMethodDoesNotThrow() {
        ExceptionThrower thrower = new ExceptionThrower();

        // This should not throw any exception
        thrower.riskyMethod(10);
    }
}
