package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test.Exercicio2Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio2.HugoEx2;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.HugoTools;

import static org.junit.jupiter.api.Assertions.*;

public class HugoEx2Test {
    @Test
    void resolucaoExercicio2a(){
        int inf = 1;
        int sup = 6;
        int expected = 2;
        int result = HugoEx2.resolucaoExercicio2a(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void resolucaoExercicio2aZeros(){
        int inf = 0;
        int sup = 6;
        int expected = 3;
        int result = HugoEx2.resolucaoExercicio2a(inf,sup);
        assertEquals(expected,result);
    }
    @Test
    void resolucaoExercicio2aInversedRanges(){
        int inf = 5;
        int sup = 1;
        int expected = -1;
        int result = HugoEx2.resolucaoExercicio2a(inf,sup);
        assertEquals(expected,result);
    }
    @Test
    void altResolucaoExercicio2aSuccess() {
        // arrange
        int limiteInferior = 3;
        int limiteSuperior = 12;
        int[] expected = {3,6,9,12};
        // assert
        int[] result = HugoEx2.altResolucaoExercicio2a(limiteInferior, limiteSuperior);
        // act
        assertArrayEquals(expected,result);
    }
    @Test
    void resolucaoExercicio2b(){
        int inf = 1;
        int sup = 6;
        int num = 3;
        int expected = 2;
        int result = HugoEx2.resolucaoexercicio2b(num,inf,sup);
        assertEquals(expected,result);
    }
    @Test
    void resolucaoExercicio2bZero(){
        int inf = 0;
        int sup = 6;
        int num = 3;
        int expected = 3;
        int result = HugoEx2.resolucaoexercicio2b(num,inf,sup);
        assertEquals(expected,result);
    }
    @Test
    void resolucaoExercicio2bInversedRanges(){
        int inf = 6;
        int sup = 1;
        int num = 3;
        int expected = -1;
        int result = HugoEx2.resolucaoexercicio2b(num,inf,sup);
        assertEquals(expected,result);
    }
    @Test
    void altResolucaoExercicio2bSucesso(){
        int num = 3;
        int limiteMin = 1;
        int limiteMax = 9;
        int [] expected = {3,6,9};
        int [] result = HugoEx2.altResolucaoExercicio2b(num,limiteMin,limiteMax);
        assertArrayEquals(expected,result);
    }
    @Test
    void resolucaoExercicio2c(){
        int inf = 10;
        int sup = 20;
        int expected = 1;
        int result = HugoEx2.resolucaoExercicio2c(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void resolucaoExercicio2cZero(){
        int inf = 0;
        int sup = 0;
        int expected = 1;
        int result = HugoEx2.resolucaoExercicio2c(inf,sup);
        assertEquals(expected,result);
    }
    @Test
    void altResolucaoExercicio2cSucesso(){ //dominios testados nos testes da ferramenta usada
        int limiteMin = 10;
        int limiteMax = 30;
        int[] expected = {15,30};
        int[] result = HugoEx2.altResolucaoExercicio2c(limiteMin,limiteMax);
        assertArrayEquals(expected,result);
    }
    @Test
    void resolucaoExercicio2d(){
        int num1 = 3;
        int num2 = 5;
        int inf = 10;
        int sup = 20;
        int expected = 1;
        int result = HugoEx2.resolucaoExercicio2d(num1,num2,inf,sup);
        assertEquals(expected,result);
    }
    @Test
    void resolucaoExercicio2dZero(){
        int num1 = 0;
        int num2 = 2;
        int inf = 0;
        int sup = 10;
        int expected = 6;
        int result = HugoEx2.resolucaoExercicio2d(num1,num2,inf,sup);
        assertEquals(expected,result);
    }
    @Test
    void resolucaoExercicio2dInversedRange(){
        int num1 = 3;
        int num2 = 5;
        int inf = 20;
        int sup = 5;
        int expected = -1;
        int result = HugoEx2.resolucaoExercicio2d(num1,num2,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void altResolucaoExercicio2dSucesso(){
        int num1 = 5;
        int num2 = 7;
        int limiteMin = 10;
        int limiteMax = 30;
        int[] expected = {};
        int[] result = HugoEx2.altResolucaoExercicio2d(num1,num2,limiteMin,limiteMax);
        assertArrayEquals(expected,result);
    }

    @Test
    void resolucaoExercicio2e(){
        int num1 = 3;
        int num2 = 5;
        int inf = 10;
        int sup = 20;
        int expected = 1;
        int result = HugoEx2.resolucaoExercicio2e(num1,num2,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void resolucaoExercicio2eInversedRanges(){
        int num1 = 3;
        int num2 = 5;
        int inf = 20;
        int sup = 10;
        int expected = -1;
        int result = HugoEx2.resolucaoExercicio2e(num1,num2,inf,sup);
        assertEquals(expected,result);
    }
    @Test
    void altResolucaoExercicio2eSucesso(){
        int num1 = 3;
        int num2 = 5;
        int limiteMin = 1;
        int limiteMax = 20;
        int[] expected = {63,50};
        int[] result = HugoEx2.altResolucaoExercicio2e(num1,num2,limiteMin,limiteMax);
        assertArrayEquals(expected,result);
    }
    @Test
    void countOfCommonMultiplesOfNum1Num2InRange(){
        int num1 = 3;
        int num2 = 5;
        int inf = 10;
        int sup = 20;
        int expected = 1;
        int result = HugoTools.countOfCommonMultiplesOfNum1Num2InRange(num1,num2,inf,sup);
        assertEquals(expected,result);
    }
    @Test
    void countOfCommonMultiplesOfNum1Num2InRange_Zeros(){
        int num1 = 0;
        int num2 = 5;
        int inf = 10;
        int sup = 20;
        int expected = 3;
        int result = HugoTools.countOfCommonMultiplesOfNum1Num2InRange(num1,num2,inf,sup);
        assertEquals(expected,result);
    }
}
