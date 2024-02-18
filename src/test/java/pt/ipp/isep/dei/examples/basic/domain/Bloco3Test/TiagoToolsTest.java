package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.TiagoTools;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TiagoToolsTest {
    //Exercicio2------------------------------------------------------------------------------------------------------------
//Teste da ferramnta geral----------------------------------------------------------------------------------------------
    @Test
    void arraySizeIncreaseSuccess() {
        int [] arrayToIncrease = {1,2,3};
        int [] expected = {1,2,3,0};
        int [] result = TiagoTools.arraySizeIncrease(arrayToIncrease);
        assertArrayEquals (expected, result);
    }
    //Teste da ferramenta para 2A e 2B--------------------------------------------------------------------------------------
    @Test
    void multiplesOfNumInRange() {
        int num = 3;
        int inf = 5;
        int sup = 15;
        int  expected = 4;
        int  result = TiagoTools.multiplosDeN(num, inf, sup);
        assertEquals(expected, result, 0.01);
    }
    //Teste da ferramenta 2C e 2D-------------------------------------------------------------------------------------------
    @Test
    void  multiplesOf2NumbersInRange() {
        int num1 = 3;
        int num2 = 5;
        int inf = 10;
        int sup = 15;
        int expected = 1;
        int result = TiagoTools.multiplesOf2NumbersInRange(num1, num2, inf, sup);
        assertEquals(expected, result, 0.01);
    }
//Teste da ferramenta 2E------------------------------------------------------------------------------------------------

    @Test
    void  sumOf2NumbersInRange() {
        int num1 = 1;
        int num2 = 2;
        int inf = 2;
        int sup = 4;
        int expected = 6;
        int result = TiagoTools.sumOf2NumbersInRange(num1, num2, inf, sup);
        assertEquals(expected, result, 0.01);
    }

//Fim da classe---------------------------------------------------------------------------------------------------------
}


