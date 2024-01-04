package n1exercici2;

import n1exercici1.Any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculoDniTest {
    /*@Test
    public void testPositions() throws Throwable{
        CalculoDni dni = new CalculoDni(60178303);

        dni.calcularLletra();
        assertEquals('E', dni.getLletra(), (String) null);
        dni.setNumber(60145937);
        dni.calcularLletra();
        assertEquals('V', dni.getLletra(), (String) null);
        dni.setNumber(36442120);
        dni.calcularLletra();
        assertEquals('T', dni.getLletra(), (String) null);
        dni.setNumber(18648966);
        dni.calcularLletra();
        assertEquals('Z', dni.getLletra(), (String) null);
        dni.setNumber(16759345);
        dni.calcularLletra();
        assertEquals('G', dni.getLletra(), (String) null);
        dni.setNumber(13798264);
        dni.calcularLletra();
        assertEquals('N', dni.getLletra(), (String) null);
        dni.setNumber(12587469);
        dni.calcularLletra();
        assertEquals('Y', dni.getLletra(), (String) null);
        dni.setNumber(14789632);
        dni.calcularLletra();
        assertEquals('B', dni.getLletra(), (String) null);
        dni.setNumber(12369874);
        dni.calcularLletra();
        assertEquals('Z', dni.getLletra(), (String) null);
        dni.setNumber(15926483);
        dni.calcularLletra();
        assertEquals('H', dni.getLletra(), (String) null);
    }*/

    @ParameterizedTest
    @ValueSource(strings = {"60178303E", "60145937V", "36442120T", "18648966Z", "16759345G", "13798264N", "12587469Y",
            "14789632B", "12369874Z", "15926483H"})
    public void testCalcularLetra(String documento) {
        CalculoDni calculodni = new CalculoDni(Integer.parseInt(documento.substring(0, 8)));
        Character letraEsperada = documento.charAt(8);
        calculodni.calcularLletra();
        assertEquals(letraEsperada, calculodni.getLletra());
    }
}
