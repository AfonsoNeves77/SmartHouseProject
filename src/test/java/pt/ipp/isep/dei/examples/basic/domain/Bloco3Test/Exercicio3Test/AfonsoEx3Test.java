package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test.Exercicio3Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio3.AfonsoEx3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AfonsoEx3Test {

    //A)

    @Test
    void sumAllEvenNumbers() {
        int expected = AfonsoEx3.sumAllEvenNumbers(4, 2);
        assertEquals(expected,6);
    }

    @Test
    void sumAllEvenNumbersNegNumbers() {
        int expected = AfonsoEx3.sumAllEvenNumbers(0,-4);
        assertEquals(expected,-6);
    }

    @Test
    void sumAllEvenNumbersZero() {
        int expected = AfonsoEx3.sumAllEvenNumbers(0,0);
        assertEquals(expected,0);
    }


    //B)

    @Test
    void quantityEvenNumbers(){
        int actual = AfonsoEx3.quantityEvenNumbers(18,10);
        assertEquals(5,actual);
    }

    @Test
    void quantityEvenNumbersZeroAsMinimumValue(){
        int actual = AfonsoEx3.quantityEvenNumbers(6,0);
        assertEquals(4,actual);
    }

    //C)

    @Test
    void sumAllOddNegNumbers() {
        int expected = AfonsoEx3.sumAllOddNumbers(7,0);
        assertEquals(expected,16);
    }

    @Test
    void sumAllOddNumbersZeroAsInterval() {
        int expected = AfonsoEx3.sumAllOddNumbers(0,0);
        assertEquals(expected,0);
    }

    //D)

    @Test
    void quantityOddNumbers(){
        int actual = AfonsoEx3.quantityOddNumbers(15,10);
        assertEquals(3,actual);
    }

    @Test
    void quantityOddNumbersZero(){
        int actual = AfonsoEx3.quantityOddNumbers(5,0);
        assertEquals(3,actual);
    }

    //E)

    @Test
    void sumAllMultiplesInAGivenInterval() {
        int expected = AfonsoEx3.sumAllMultiplesInAGivenInterval(5,20,15);
        assertEquals(expected,35);
    }

    @Test
    void sumAllMultiplesInAGivenIntervalNegNumbers() {
        int expected = AfonsoEx3.sumAllMultiplesInAGivenInterval(2,0,-4);
        assertEquals(expected,-6);
    }

    @Test
    void sumAllMultiplesInAGivenIntervalZeroAsN() {
        int expected = AfonsoEx3.sumAllMultiplesInAGivenInterval(0,0,-4);
        assertEquals(expected,0);
    }

    //F)
    @Test
    void productMultiplesOnaGivenInterval() {
        int expected = AfonsoEx3.productMultiplesOnaGivenInterval(2,6,4);
        assertEquals(24,expected);
    }

    @Test
    void productMultiplesOnaGivenIntervalZeroAsMin() {
        int expected = AfonsoEx3.productMultiplesOnaGivenInterval(2,6,0);
        assertEquals(48,expected);
    }

    @Test
    void productZeroMultiplesFound() {
        int expected = AfonsoEx3.productMultiplesOnaGivenInterval(6,2,0);
        assertEquals(0,expected);
    }

    @Test
    void productMultiplesOnaGivenIntervalZeroError() {
        int expected = AfonsoEx3.productMultiplesOnaGivenInterval(0,6,4);
        assertEquals(-1,expected);
    }

    //E)

    @Test
    void mediaMultiplesGivenInterval() {
        double expected = AfonsoEx3.mediaMultiplesGivenInterval(2,6,4);
        assertEquals(5,expected);
    }

    @Test
    void mediaMultiplesGivenIntervalDecimal() {
        double expected = AfonsoEx3.mediaMultiplesGivenInterval(5,20,15);
        assertEquals(17.5,expected);
    }

    @Test
    void mediaMultiplesGivenIntervalZeroError() {
        double expected = AfonsoEx3.mediaMultiplesGivenInterval(0,6,4);
        assertEquals(-1,expected);
    }

    //F)

    @Test
    void mediaofTwoMultiplesGivenInterval() {
        double expected = AfonsoEx3.mediaofTwoMultiplesGivenInterval(2,3,15,10);
        assertEquals(12.6, expected);
    }

    @Test
    void mediaofTwoMultiplesGivenIntervalNisZero() {
        double expected = AfonsoEx3.mediaofTwoMultiplesGivenInterval(0,2,6,4);
        assertEquals(-1, expected);
    }

    @Test
    void mediaofTwoMultiplesGivenIntervalZeroError() {
        double expected = AfonsoEx3.mediaofTwoMultiplesGivenInterval(0,2,6,4);
        assertEquals(-1, expected);
    }

    //Extra Exercises Tests ----------------------------------

    @Test
    void EvenNumbersArray() {
        int[] expected = AfonsoEx3.arrayAllEvenNumbers(20,15);
        int[] a = {16,18,20};
        assertArrayEquals(expected,a);
    }

    @Test
    void EvenNumbersArrayNegNumbers() {
        int[] expected = AfonsoEx3.arrayAllEvenNumbers(0,-4);
        int[] a = {-4,-2,0};
        assertArrayEquals(expected,a);
    }

    @Test
    void EvenNumbersArrayZeroAsInterval() {
        int[] expected = AfonsoEx3.arrayAllEvenNumbers(0,0);
        int[] a = {0};
        assertArrayEquals(expected,a);
    }


}
