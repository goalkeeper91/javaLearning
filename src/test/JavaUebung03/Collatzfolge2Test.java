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
}
