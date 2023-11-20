package n1exercici3;

import org.junit.Test;

public class LanzaExcepcionesTest {
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testException() throws Throwable{
        LanzaExcepciones exep = new LanzaExcepciones();

        exep.throwsArrayIndexException();
    }
}
