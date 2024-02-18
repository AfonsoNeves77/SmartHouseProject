package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio8;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercicio8Test {

    @Test
    void numberOfCombinationsTest(){
        int result = Exercicio8.numberOfOperations(5);
        assertEquals(3, result);
    }

    @Test
    void numberOfCombinationsTestEleven(){
        int result = Exercicio8.numberOfOperations(11);
        assertEquals(5, result);
    }

    @Test
    void numberOfCombinationsZero(){
        int result = Exercicio8.numberOfOperations(0);
        assertEquals(-1, result);
    }

    @Test
    void numberOfCombinationsOneCombinationMaxValue(){
        int result = Exercicio8.numberOfOperations(20);
        assertEquals(1, result);
    }

    @Test
    void numberOfCombinationsOneMinValue(){
        int result = Exercicio8.numberOfOperations(1);
        assertEquals(1, result);
    }
}
