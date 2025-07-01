package test.JavaUebung03;

import JavaUebung03.Collatzfolge2;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Collatzfolge2Test {

    @Test
    public void testBerechneFolge() {
        assertEquals(
                Arrays.asList(6, 3, 10, 5, 16, 8, 4, 2),
                Collatzfolge2.berechneFolge(6)
        );
    }

    @Test
    public void testFolgeMit1() {
        assertTrue(Collatzfolge2.berechneFolge(1).isEmpty());
    }

    @Test
    public void testIstGueltigeStartzahl() {
        assertTrue(Collatzfolge2.istGueltigeStartzahl("10"));
        assertFalse(Collatzfolge2.istGueltigeStartzahl("-5"));
        assertFalse(Collatzfolge2.istGueltigeStartzahl("0"));
        assertFalse(Collatzfolge2.istGueltigeStartzahl("abc"));
        assertFalse(Collatzfolge2.istGueltigeStartzahl(""));
        assertFalse(Collatzfolge2.istGueltigeStartzahl(null));
    }

}
