package pt.ipp.isep.dei.examples.basic.domain.Bloco4Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio10;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio11;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Exercicio11Test {
    @Test
    public void arrayWithMultiplesOfNumsInSetRange_Success(){
        new Exercicio11();
        int[] arrayOfNums = {3,5};
        int inf = 1;
        int sup = 15;
        int[] expected = {15};
        int[] result = Exercicio11.arrayWithMultiplesOfNumsInSetRange(arrayOfNums,inf,sup);
        assertArrayEquals(expected,result);
    }
    @Test
    public void arrayWithMultiplesOfNumsInSetRange_zeros(){
        int[] arrayOfNums = {3,0,15};
        int inf = 1;
        int sup = 15;
        int[] expected = {};
        int[] result = Exercicio11.arrayWithMultiplesOfNumsInSetRange(arrayOfNums,inf,sup);
        assertArrayEquals(expected,result);
    }
    @Test
    public void arrayWithMultiplesOfNumsInSetRange_empty(){
        int[] arrayOfNums = {};
        int inf = 1;
        int sup = 15;
        int[] expected = {};
        int[] result = Exercicio11.arrayWithMultiplesOfNumsInSetRange(arrayOfNums,inf,sup);
        assertArrayEquals(expected,result);
    }
}
