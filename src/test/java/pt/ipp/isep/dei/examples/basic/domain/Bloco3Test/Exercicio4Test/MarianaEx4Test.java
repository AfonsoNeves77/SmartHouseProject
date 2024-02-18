package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test.Exercicio4Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio4.MarianaEx4;

import static org.junit.jupiter.api.Assertions.*;

class MarianaEx4Test {
    @Test
    void digitsOfALongNumber_Test01PossibleCase() {
        long number = 123789123789L;
        int expected = 12;
        int result = MarianaEx4.numberOfDigitsOfALongNumber(number);
        assertEquals(expected, result);
    }

    @Test
    void digitsOfALongNumber_Test02PossibleCase() {
        long number = -123789123789L;
        int expected = 12;
        int result = MarianaEx4.numberOfDigitsOfALongNumber(number);
        assertEquals(expected, result);
    }

    @Test
    void digitsOfALongNumber_Test03NumberZero() {
        long number = 0;
        int expected = 1;
        int result = MarianaEx4.numberOfDigitsOfALongNumber(number);
        assertEquals(expected, result);
    }

    @Test
    void evenDigitsOfALongNumber_Test01NoEvenNumbers() {
        long number = 1111111111L;
        int expected = 0;
        int result = MarianaEx4.numberOfEvenDigitsOfALongNumber(number);
        assertEquals(expected, result);
    }

    @Test
    void evenDigitsOfALongNumber_Test02EvenNumbers() {
        long number = 334455667788L;
        int expected = 6;
        int result = MarianaEx4.numberOfEvenDigitsOfALongNumber(number);
        assertEquals(expected, result);
    }

    @Test
    void oddDigitsOfALongNumber_Test01NoOddNumbers() {
        long number = 2222222222L;
        int expected = 0;
        int result = MarianaEx4.numberOfOddDigitsOfALongNumber(number);
        assertEquals(expected, result);
    }

    @Test
    void oddDigitsOfALongNumber_Test02OddNumbers() {
        long number = 334455667788L;
        int expected = 6;
        int result = MarianaEx4.numberOfOddDigitsOfALongNumber(number);
        assertEquals(expected, result);
    }

    @Test
    void sumDigitsOfALongNumber_Test01PossibleCase() {
        long number = 334455667788L;
        long expected = 66;
        long result = MarianaEx4.sumDigitsOfALongNumber(number);
        assertEquals(expected,result);
    }

    @Test
    void sumEvenDigitsOfALongNumber_Test01PossibleCase() {
        long number = 334455667788L;
        long expected = 36;
        long result = MarianaEx4.sumEvenDigitsOfALongNumber(number);
        assertEquals(expected,result);
    }

    @Test
    void sumOddDigitsOfALongNumber_Test01PossibleCase() {
        long number = 334455667788L;
        long expected = 30;
        long result = MarianaEx4.sumOddDigitsOfALongNumber(number);
        assertEquals(expected,result);
    }

    @Test
    void averageOfTheDigitsOfALongNumber_Test01PossibleCase() {
        long number = 334455667788L;
        double expected = 5.5;
        double result = MarianaEx4.averageOfTheDigitsOfALongNumber(number);
        assertEquals(expected,result,0.01);
    }

    @Test
    void averageOfTheEvenDigitsOfALongNumber_Test01PossibleCase() {
        long number = 334455667788L;
        double expected = 6;
        double result = MarianaEx4.averageOfTheEvenDigitsOfALongNumber(number);
        assertEquals(expected,result,0.01);
    }

    @Test
    void averageOfTheOddDigitsOfALongNumber_Test01PossibleCase() {
        long number = 334455667788L;
        double expected = 5;
        double result = MarianaEx4.averageOfTheOddDigitsOfALongNumber(number);
        assertEquals(expected,result,0.01);
    }

    @Test
    void numberInReverse_Test01PossibleCase() {
        long number = 334455667788L;
        long expected = 887766554433L;
        long result = MarianaEx4.numberInReverse(number);
        assertEquals(expected,result);
    }

    @Test
    void digitsOfANumber_Test01PossibleCase() {
        long number = 123789123789L;
        int[] expected = {1, 2, 3, 7, 8, 9, 1, 2, 3, 7, 8, 9};
        int[] result = MarianaEx4.digitsOfANumber(number);
        assertArrayEquals(expected, result);
    }

    @Test
    void digitsOfANumber_Test02PossibleCase() {
        long number = -123789123789L;
        int[] expected = {1, 2, 3, 7, 8, 9, 1, 2, 3, 7, 8, 9};
        int[] result = MarianaEx4.digitsOfANumber(number);
        assertArrayEquals(expected, result);
    }

    @Test
    void digitsOfANumber_Test03NumberZero() {
        long number = 0;
        int[] expected = {0};
        int[] result = MarianaEx4.digitsOfANumber(number);
        assertArrayEquals(expected, result);
    }

    @Test
    void evenDigitsOfANumber_Test01NoEvenNumbers() {
        long number = 1111111111L;
        int[] expected = {};
        int[] result = MarianaEx4.evenDigitsOfANumber(number);
        assertArrayEquals(expected, result);
    }

    @Test
    void evenDigitsOfANumber_Test02EvenNumbers() {
        long number = 334455667788L;
        int[] expected = {4, 4, 6, 6, 8, 8};
        int[] result = MarianaEx4.evenDigitsOfANumber(number);
        assertArrayEquals(expected, result);
    }

    @Test
    void oddDigitsOfANumber_Test01NoOddNumbers() {
        long number = 2222222222L;
        int[] expected = {};
        int[] result = MarianaEx4.oddDigitsOfANumber(number);
        assertArrayEquals(expected, result);
    }

    @Test
    void oddDigitsOfANumber_Test02OddNumbers() {
        long number = 334455667788L;
        int[] expected = {3, 3, 5, 5, 7, 7};
        int[] result = MarianaEx4.oddDigitsOfANumber(number);
        assertArrayEquals(expected, result);
    }
}