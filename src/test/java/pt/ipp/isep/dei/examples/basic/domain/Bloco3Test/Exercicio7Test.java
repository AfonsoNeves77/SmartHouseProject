package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio7;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio7Test {

    @Test
    void positionOfCumulativeProductInAnArray_Test01IncreasingNumberArray() {
        int[] array = {2,4,5,6,7,10};
        int numberGiven = 50;
        int expectedPosition = 3;
        int result = Exercicio7.positionOfCumulativeProductInAnArray(array,numberGiven);
        assertEquals(expectedPosition,result);
    }

    @Test
    void positionOfCumulativeProductInAnArray_Test02RandomNumberArray() {
        int[] array = {10,4,5,8,7,20,5,90};
        int numberGiven = 1200;
        int expectedPosition = 3;
        int result = Exercicio7.positionOfCumulativeProductInAnArray(array,numberGiven);
        assertEquals(expectedPosition,result);
    }

    @Test
    void positionOfCumulativeProductInAnArray_Test03ArrayWithNumberZero() {
        int[] array = {10,4,5,70,7,0,5,90};
        int numberGiven = 1200;
        int expectedPosition = -1;
        int result = Exercicio7.positionOfCumulativeProductInAnArray(array,numberGiven);
        assertEquals(expectedPosition,result);
    }

    @Test
    void positionOfCumulativeProductInAnArray_Test04ArrayWithNegativeNumbers() {
        int[] array = {10,-4,5,0,7,20,-5,90};
        int numberGiven = 1200;
        int expectedPosition = -1;
        int result = Exercicio7.positionOfCumulativeProductInAnArray(array,numberGiven);
        assertEquals(expectedPosition,result);
    }

    @Test
    void positionOfCumulativeProductInAnArray_Test05ArrayDimensionZero() {
        int[] array = {};
        int numberGiven = 1200;
        int expectedPosition = -1;
        int result = Exercicio7.positionOfCumulativeProductInAnArray(array,numberGiven);
        assertEquals(expectedPosition,result);
    }

    @Test
    void positionOfCumulativeProductInAnArray_Test06NegativeNumber() {
        int[] array = {2,6,10,11};
        int numberGiven = -5;
        int expectedPosition = 0;
        int result = Exercicio7.positionOfCumulativeProductInAnArray(array,numberGiven);
        assertEquals(expectedPosition,result);
    }

    @Test
    void positionOfCumulativeProductInAnArray_Test07NumberEqualsZero() {
        int[] array = {2,4,5,7};
        int numberGiven = 0;
        int expectedPosition = 0;
        int result = Exercicio7.positionOfCumulativeProductInAnArray(array,numberGiven);
        assertEquals(expectedPosition,result);
    }

    @Test
    void positionOfCumulativeProductInAnArray_Test08NegativeNumberAndArrayContainsZero() {
        int[] array = {2,4,9,0,7};
        int numberGiven = -8;
        int expectedPosition = -1;
        int result = Exercicio7.positionOfCumulativeProductInAnArray(array,numberGiven);
        assertEquals(expectedPosition,result);
    }

}