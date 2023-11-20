package n1exercici1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AnyTest {
    @Test
    public void testPositions() throws Throwable{
        Any any = new Any();

        any.populateMonths();
        assertEquals(12, any.mesos.size(), 0);
    }

    @Test
    public void testNulidad() throws Throwable{
        Any any = new Any();

        any.populateMonths();
        assertFalse(any.mesos.isEmpty());
    }

    @Test
    public void testAgust() throws Throwable{
        Any any = new Any();

        any.populateMonths();
        assertEquals("Agosto", any.mesos.get(7), "");
    }
}
