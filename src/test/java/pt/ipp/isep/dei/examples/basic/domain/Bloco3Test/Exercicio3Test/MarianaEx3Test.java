package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test.Exercicio3Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio3.MarianaEx3;

import static org.junit.jupiter.api.Assertions.*;

class MarianaEx3Test {

    @Test
    void sumOfAllEvenNumbersInAnInterval_Test01ImpossibleCaseSupLowerThanInf() {
        int inf = 10;
        int sup = 5;
        int expected = -1;
        int result = MarianaEx3.sumOfAllEvenNumbersInAnInterval(inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void sumOfAllEvenNumbersInAnInterval_Test02PossibleCase1EvenNumberInterval() {
        int inf = 4;
        int sup = 4;
        int expected = -1;
        int result = MarianaEx3.sumOfAllEvenNumbersInAnInterval(inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void sumOfAllEvenNumbersInAnInterval_Test03PossibleCase1OddNumberInterval() {
        int inf = 5;
        int sup = 5;
        int expected = -1;
        int result = MarianaEx3.sumOfAllEvenNumbersInAnInterval(inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void sumOfAllEvenNumbersInAnInterval_Test04PossibleCaseGeneralOppositeInterval() {
        int inf = -5;
        int sup = 5;
        int expected = 0;
        int result = MarianaEx3.sumOfAllEvenNumbersInAnInterval(inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void sumOfAllEvenNumbersInAnInterval_Test05PossibleCaseGeneralInterval() {
        int inf = -5;
        int sup = 10;
        int expected = 24;
        int result = MarianaEx3.sumOfAllEvenNumbersInAnInterval(inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void quantityOfEvenNumbersInAnInterval_Test01PossibleCaseGeneralInterval() {
        int inf = -5;
        int sup = 10;
        int expected = 8;
        int result = MarianaEx3.quantityOfEvenNumbersInAInterval(inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void quantityOfEvenNumbersInAnInterval_Test02PossibleCaseGeneralInterval() {
        int inf = 2;
        int sup = 10;
        int expected = 5;
        int result = MarianaEx3.quantityOfEvenNumbersInAInterval(inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void quantityOfEvenNumbersInAnInterval_Test03ImpossibleCase() {
        int inf = 10;
        int sup = 2;
        int expected = -1;
        int result = MarianaEx3.quantityOfEvenNumbersInAInterval(inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void sumOfAllOddNumbersInAnInterval_Test01ImpossibleCaseSupLowerThanInf() {
        int inf = 10;
        int sup = 5;
        int expected = -1;
        int result = MarianaEx3.sumOfAllOddNumbersInAnInterval(inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void sumOfAllOddNumbersInAnInterval_Test02PossibleCase1OddNumberInterval() {
        int inf = 5;
        int sup = 5;
        int expected = -1;
        int result = MarianaEx3.sumOfAllOddNumbersInAnInterval(inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void sumOfAllOddNumbersInAnInterval_Test03PossibleCase1EvenNumberInterval() {
        int inf = 6;
        int sup = 6;
        int expected = -1;
        int result = MarianaEx3.sumOfAllOddNumbersInAnInterval(inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void sumOfAllOddNumbersInAnInterval_Test04PossibleCaseGeneralOppositeInterval() {
        int inf = -5;
        int sup = 5;
        int expected = 0;
        int result = MarianaEx3.sumOfAllEvenNumbersInAnInterval(inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void sumOfAllOddNumbersInAnInterval_Test05PossibleCaseGeneralInterval() {
        int inf = -5;
        int sup = 10;
        int expected = 16;
        int result = MarianaEx3.sumOfAllOddNumbersInAnInterval(inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void quantityOfOddNumbersInAnInterval_Test01PossibleCaseGeneralInterval() {
        int inf = -5;
        int sup = 10;
        int expected = 8;
        int result = MarianaEx3.quantityOfOddNumbersInAInterval(inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void quantityOfOddNumbersInAnInterval_Test02PossibleCaseGeneralInterval() {
        int inf = 2;
        int sup = 10;
        int expected = 4;
        int result = MarianaEx3.quantityOfOddNumbersInAInterval(inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void quantityOfOddNumbersInAnInterval_Test03ImpossibleCase() {
        int inf = 10;
        int sup = 2;
        int expected = -1;
        int result = MarianaEx3.quantityOfOddNumbersInAInterval(inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void sumOfNumberNMultiplesInAnInterval_Test01PossibleCase() {
        int numberN = 5;
        int inf = -10;
        int sup = 20;
        int expected = 50;
        int result = MarianaEx3.sumOfNumberNMultiplesInAnInterval(numberN, inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void sumOfNumberNMultiplesInAnInterval_Test02ImpossibleCase() {
        int numberN = 0;
        int inf = 0;
        int sup = 20;
        int expected = 0;
        int result = MarianaEx3.sumOfNumberNMultiplesInAnInterval(numberN, inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void sumOfNumberNMultiplesInAnInterval_Test03PossibleCase() {
        int numberN = 5;
        int inf = 20;
        int sup = 0;
        int expected = 50;
        int result = MarianaEx3.sumOfNumberNMultiplesInAnInterval(numberN, inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void sumOfNumberNMultiplesInAnInterval_Test04ImpossibleCase() {
        int numberN = 5;
        int inf = 20;
        int sup = 20;
        int expected = 0;
        int result = MarianaEx3.sumOfNumberNMultiplesInAnInterval(numberN, inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void sumOfNumberNMultiplesInAnInterval_Test05ImpossibleCase() {
        int numberN = 0;
        int inf = 10;
        int sup = 20;
        int expected = 0;
        int result = MarianaEx3.sumOfNumberNMultiplesInAnInterval(numberN, inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void sumOfNumberNMultiplesInAnInterval_Test06ResultZero() {
        int numberN = 2;
        int inf = -10;
        int sup = -20;
        int expected = 0;
        int result = MarianaEx3.sumOfNumberNMultiplesInAnInterval(numberN, inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void productOfNumberNMultiplesInAnInterval_Test01ResultZero() {
        int numberN = 2;
        int inf = 0;
        int sup = 10;
        int expected = 0;
        int result = MarianaEx3.productOfNumberNMultiplesInAnInterval(numberN, inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void productOfNumberNMultiplesInAnInterval_Test02NegativeExtremesNumberZero() {
        int numberN = 0;
        int inf = -10;
        int sup = -4;
        int expected = 0;
        int result = MarianaEx3.productOfNumberNMultiplesInAnInterval(numberN, inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void productOfNumberNMultiplesInAnInterval_Test03NegativeExtremesForAPositiveNumber() {
        int numberN = 4;
        int inf = -6;
        int sup = -4;
        int expected = 0;
        int result = MarianaEx3.productOfNumberNMultiplesInAnInterval(numberN, inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void productOfNumberNMultiplesInAnInterval_Test04NegativeExtremesForANegativeNumber() {
        int numberN = -4;
        int inf = -12;
        int sup = -4;
        int expected = -384;
        int result = MarianaEx3.productOfNumberNMultiplesInAnInterval(numberN, inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void productOfNumberNMultiplesInAnInterval_Test05NegativeAndPositiveExtremesNumberZero() {
        int numberN = 0;
        int inf = -12;
        int sup = 5;
        int expected = 0;
        int result = MarianaEx3.productOfNumberNMultiplesInAnInterval(numberN, inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void averageOfNumberNMultiplesInAnInterval_Test01PossibleCase() {
        int numberN = 2;
        int inf = 2;
        int sup = 8;
        double expected = 5.0;
        double result = MarianaEx3.averageOfNumberNMultiplesInAnInterval(numberN, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    void averageOfNumberNMultiplesInAnInterval_Test02NumberZeroPositiveExtremes() {
        int numberN = 0;
        int inf = 2;
        int sup = 8;
        double expected = Double.NaN;
        double result = MarianaEx3.averageOfNumberNMultiplesInAnInterval(numberN, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    void averageOfNumberNMultiplesInAnInterval_Test03NumberZeroNegativeAndPositiveInterval() {
        int numberN = 0;
        int inf = -2;
        int sup = 8;
        double expected = 0;
        double result = MarianaEx3.averageOfNumberNMultiplesInAnInterval(numberN, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    void averageOfNumberNMultiplesInAnInterval_Test04NumberZeroNegativeAndPositiveInterval() {
        int numberN = 0;
        int inf = -2;
        int sup = 8;
        double expected = 0;
        double result = MarianaEx3.averageOfNumberNMultiplesInAnInterval(numberN, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    void averageOfNumberNMultiplesInAnInterval_Test05NullArray() {
        int numberN = 7;
        int inf = 8;
        int sup = 8;
        double expected = Double.NaN;
        double result = MarianaEx3.averageOfNumberNMultiplesInAnInterval(numberN, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    void averageOfNumberNMultiplesInAnInterval_Test06NegativeNumberPossibleResult() {
        int numberN = -7;
        int inf = -36;
        int sup = 14;
        double expected = -17.5;
        double result = MarianaEx3.averageOfNumberNMultiplesInAnInterval(numberN, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    void averageOfTheMultiplesOf2NumbersInAnInterval_Test01NullArray() {
        int number1 = 7;
        int number2 = 9;
        int inf = 10;
        int sup = 10;
        double expected = Double.NaN;
        double result = MarianaEx3.averageOfTheMultiplesOf2NumbersInAnInterval(number1, number2, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    void averageOfTheMultiplesOf2NumbersInAnInterval_Test02NegativeAndPositiveNumbersAndNegativeAndPositiveExtremes() {
        int number1 = -2;
        int number2 = 4;
        int inf = -6;
        int sup = 8;
        double expected = 0;
        double result = MarianaEx3.averageOfTheMultiplesOf2NumbersInAnInterval(number1, number2, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    void averageOfTheMultiplesOf2NumbersInAnInterval_Test03NegativeAndPositiveNumbersAndNegativeAndPositiveExtremes() {
        int number1 = -2;
        int number2 = 4;
        int inf = -6;
        int sup = 12;
        double expected = 1.71;
        double result = MarianaEx3.averageOfTheMultiplesOf2NumbersInAnInterval(number1, number2, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    void averageOfTheMultiplesOf2NumbersInAnInterval_Test04ArrayWithDimensionZero() {
        int number1 = -2;
        int number2 = 4;
        int inf = 13;
        int sup = 15;
        double expected = Double.NaN;
        double result = MarianaEx3.averageOfTheMultiplesOf2NumbersInAnInterval(number1, number2, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    void averageOfTheMultiplesOf2NumbersInAnInterval_Test05PossibleNoMultiplesOfOneNumber() {
        int number1 = -2;
        int number2 = 4;
        int inf = -6;
        int sup = -3;
        double expected = -5.0;
        double result = MarianaEx3.averageOfTheMultiplesOf2NumbersInAnInterval(number1, number2, inf, sup);
        assertEquals(expected, result, 0.01);
    }


    //Tests with arrays:
    @Test
    void evenNumbersInAnInterval_Test01PossibleCaseGeneralInterval() {
        int inf = -5;
        int sup = 10;
        int[] expected = {-4, -2, 0, 2, 4, 6, 8, 10};
        int[] result = MarianaEx3.evenNumbersInAnInterval(inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void evenNumbersInAnInterval_Test02PossibleCaseGeneralInterval() {
        int inf = 2;
        int sup = 10;
        int[] expected = {2, 4, 6, 8, 10};
        int[] result = MarianaEx3.evenNumbersInAnInterval(inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void evenNumbersInAnInterval_Test03ImpossibleCase() {
        int inf = 10;
        int sup = 2;
        int[] expected = null;
        int[] result = MarianaEx3.evenNumbersInAnInterval(inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void oddNumbersInAnInterval_Test01PossibleCaseGeneralInterval() {
        int inf = -5;
        int sup = 10;
        int[] expected = {-5, -3, -1, 1, 3, 5, 7, 9};
        int[] result = MarianaEx3.oddNumbersInAnInterval(inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void oddNumbersInAnInterval_Test02PossibleCaseGeneralInterval() {
        int inf = 2;
        int sup = 10;
        int[] expected = {3, 5, 7, 9};
        int[] result = MarianaEx3.oddNumbersInAnInterval(inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void oddNumbersInAnInterval_Test03ImpossibleCase() {
        int inf = 10;
        int sup = 2;
        int[] expected = null;
        int[] result = MarianaEx3.oddNumbersInAnInterval(inf, sup);
        assertArrayEquals(expected, result);
    }
}