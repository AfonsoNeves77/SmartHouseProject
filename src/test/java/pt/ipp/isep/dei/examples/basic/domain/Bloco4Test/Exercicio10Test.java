package pt.ipp.isep.dei.examples.basic.domain.Bloco4Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio1;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio10;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Exercicio10Test {
    @Test
    public void arrayWithMultiplesOfNumInRange_Success(){
        new Exercicio10();
        int num = 3;
        int inf = 0;
        int sup = 9;
        int[] expected = {0, 3, 6, 9};
        int[] result = Exercicio10.arrayWithMultiplesOfNumInRange(num, inf, sup);
        assertArrayEquals(expected, result);
    }
    @Test
    public void arrayWithMultiplesOfNumInRange_numZeroInRange() {
        int num = 0;
        int inf = 0;
        int sup = 9;
        int[] expected = {0};
        int[] result = Exercicio10.arrayWithMultiplesOfNumInRange(num, inf, sup);
        assertArrayEquals(expected, result);
    }
    @Test
    public void arrayWithMultiplesOfNumInRange_numZeroOutOfRange() {
        int num = 0;
        int inf = 1;
        int sup = 9;
        int[] expected = {};
        int[] result = Exercicio10.arrayWithMultiplesOfNumInRange(num, inf, sup);
        assertArrayEquals(expected, result);
    }
    @Test
    public void arrayWithMultiplesOfNumInRange_negatives() {
        int num = -3;
        int inf = -6;
        int sup = 0;
        int[] result = Exercicio10.arrayWithMultiplesOfNumInRange(num, inf, sup);
        assertNull(result);
    }
    @Test
    public void arrayWithMultiplesOfNumInRange_negativesInNegToPosRange() {
        int num = -3;
        int inf = -6;
        int sup = 6;
        int[] result = Exercicio10.arrayWithMultiplesOfNumInRange(num, inf, sup);
        assertNull(result);
    }
}
