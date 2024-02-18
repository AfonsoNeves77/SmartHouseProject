package pt.ipp.isep.dei.examples.basic.domain.Bloco4Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio11;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio13;

import static org.junit.jupiter.api.Assertions.*;

public class Exercicio13Test {
    // 13a
    @Test
    void lowestNumberInArray_ArrayWithPositiveAndNegativeNumbers() {
        new Exercicio13();
        //Arrange
        int[] array = {4,-3,-5,-7,8,0,-5};
        int expected = -7;
        //Act
        int result = Exercicio13.lowestNumberInArray(array);
        //Assert
        assertEquals(expected,result);
    }
    // 13b
    @Test
    void highestNumberInArray_PositiveAndNegativeNumbers(){
        //Arrange
        int[] array = {4,-3,-50,-7,80,0,-5};
        int expected = 80;
        //Act
        int result = Exercicio13.highestNumberInArray(array);
        //Assert
        assertEquals(expected,result);
    }
    // 13c
    @Test
    void averageOfArrayNumbers_PositiveAndNegativeNumbers() {
        //Arrange
        int[] array = {4,-3,-50,-7,80,0,-5};
        double expected = 2.71;
        //Act
        double result = Exercicio13.averageOfArrayNumbers(array);
        //Assert
        assertEquals(expected,result,0.01);
    }

    @Test
    void averageOfArrayNumbers_DimensionZero() {
        //Arrange
        int[] array = {};
        double expected = Double.NaN;
        //Act
        double result = Exercicio13.averageOfArrayNumbers(array);
        //Assert
        assertEquals(expected,result,0.01);
    }

    // 13d
    @Test
    void productOfArrayNumbers_Success(){
        int[] array = {1,2,3,4,5};
        int expected = 120;
        int result = Exercicio13.productOfArrayNumbers(array);
        assertEquals(expected,result);
    }
    @Test
    void productOfArrayNumbers_WithZero(){
        int[] array = {1,2,0,4,5};
        int expected = 0;
        int result = Exercicio13.productOfArrayNumbers(array);
        assertEquals(expected,result);
    }
    @Test
    void productOfArrayNumbers_Negatives(){
        int[] array = {-1,-2,-3,-4,-5};
        int expected = -120;
        int result = Exercicio13.productOfArrayNumbers(array);
        assertEquals(expected,result);
    }
    @Test
    void productOfArrayNumbers_EmptyArray(){
        int[] array = {};
        int expected = 0;
        int result = Exercicio13.productOfArrayNumbers(array);
        assertEquals(expected,result);
    }
    // 13e
    @Test
    void nonRepeatedNumbersInArray_Success(){
        int[] array = {1,2,3,2,1};
        int[] expected = {1,2,3};
        int[] result = Exercicio13.nonRepeatedNumbersInArray(array);
        assertArrayEquals(expected,result);
    }
    @Test
    void nonRepeatedNumbersInArray_SuccessNonRepeats(){
        int[] array = {1,2,3,5,4};
        int[] expected = {1,2,3,5,4};
        int[] result = Exercicio13.nonRepeatedNumbersInArray(array);
        assertArrayEquals(expected,result);
    }
    @Test
    void nonRepeatedNumbersInArray_zeroes(){
        int[] array = {0,0,0,0,0};
        int[] expected = {0};
        int[] result = Exercicio13.nonRepeatedNumbersInArray(array);
        assertArrayEquals(expected,result);
    }
    @Test
    void nonRepeatedNumbersInArray_EmptyArray(){
        int[] array = {};
        int[] result = Exercicio13.nonRepeatedNumbersInArray(array);
        assertNull(result);
    }
    //Alternative solution:
    @Test
    void nonRepeatedNumbersInArrayV2_Success(){
        int[] array = {1,2,3,2,1};
        int[] expected = {1,2,3};
        int[] result = Exercicio13.nonRepeteadNumbersInArrayV2(array);
        assertArrayEquals(expected,result);
    }
    @Test
    void nonRepeatedNumbersInArrayV2_SuccessNonRepeats(){
        int[] array = {1,2,3,5,4};
        int[] expected = {1,2,3,5,4};
        int[] result = Exercicio13.nonRepeteadNumbersInArrayV2(array);
        assertArrayEquals(expected,result);
    }
    @Test
    void nonRepeatedNumbersInArrayV2_zeroes(){
        int[] array = {0,0,0,0,0};
        int[] expected = {0};
        int[] result = Exercicio13.nonRepeteadNumbersInArrayV2(array);
        assertArrayEquals(expected,result);
    }
    // 13f
    @Test
    void invertedArray_success(){
        int[] array = {1,2,3,4,5};
        int[] expected = {5,4,3,2,1};
        int[] result = Exercicio13.invertedArray(array);
        assertArrayEquals(expected,result);
    }
    @Test
    void invertedArray_zeroes(){
        int[] array = {0,2,0,4,0};
        int[] expected = {0,4,0,2,0};
        int[] result = Exercicio13.invertedArray(array);
        assertArrayEquals(expected,result);
    }
    @Test
    void invertedArray_empty(){
        int[] array = {};
        int[] expected = {};
        int[] result = Exercicio13.invertedArray(array);
        assertArrayEquals(expected,result);
    }
    // 13g

    @Test
    void primeNumbers() {
        //Arrange
        int[] arrayPrimeNumbers = {1,-2,0,2,3,5,6,8,11,55,100,1,67};
        int[] expected = {2,3,5,11,67};
        //Act
        int[] result = Exercicio13.primeNumbers(arrayPrimeNumbers);
        //Assert
        assertArrayEquals(expected,result);
    }


    @Test
    void noPrimeNumbers() {
        //Arrange
        int[] arrayPrimeNumbers = {1,6,4,8};
        int[] expected = {};
        //Act
        int[] result = Exercicio13.primeNumbers(arrayPrimeNumbers);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void primeNumbers_EmptyArray() {
        //Arrange
        int[] arrayPrimeNumbers = {};
        //Act
        int[] result = Exercicio13.primeNumbers(arrayPrimeNumbers);
        //Assert
        assertNull(result);
    }
}
