package n1exercici1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AnyTest {
    @Test
    public void testPositions() {
        Any any = new Any();

        any.populateMonths();
        assertEquals(12, any.getMesos().size(), 0);
    }

    @Test
    public void testNulidad() {
        Any any = new Any();

        any.populateMonths();
        assertFalse(any.getMesos().isEmpty());
    }

    @Test
    public void testAgust() {
        Any any = new Any();

        any.populateMonths();
        assertEquals("Agosto", any.getMesos().get(7), "");
    }
}
