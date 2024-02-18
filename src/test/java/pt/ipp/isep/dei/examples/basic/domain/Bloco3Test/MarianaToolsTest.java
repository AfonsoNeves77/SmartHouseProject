package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio4.MarianaEx4;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.MarianaTools;

import static org.junit.jupiter.api.Assertions.*;

class MarianaToolsTest {

    @Test
    void increaseArrayLength_Test01PossibleCase() {
        int[] array = {1,3,5};
        int[] expected = {1,3,5,0};
        int[] result = MarianaTools.increaseArrayLength(array);
        assertArrayEquals(expected,result);
    }

    @Test
    void increaseArrayLength_Test02PossibleCaseLengthZero() {
        int[] array = {};
        int[] expected = {0};
        int[] result = MarianaTools.increaseArrayLength(array);
        assertArrayEquals(expected,result);
    }

    @Test
    void sumOfArrayNumbers_Test01PositiveNumbers() {
        int[] array = {1,3,5};
        int expected = 9;
        int result = MarianaTools.sumOfArrayNumbers(array);
        assertEquals(expected,result);
    }

    @Test
    void sumOfArrayNumbers_Test02NegativeNumbers() {
        int[] array = {-5,-3,-1};
        int expected = -9;
        int result = MarianaTools.sumOfArrayNumbers(array);
        assertEquals(expected,result);
    }

    @Test
    void sumOfArrayNumbers_Test03NegativeAndPositiveNumbers() {
        int[] array = {-5,-3-1,1,3,5,6};
        int expected = 6;
        int result = MarianaTools.sumOfArrayNumbers(array);
        assertEquals(expected,result);
    }

    @Test
    void sumOfArrayNumbers_Test04LengthZero() {
        int[] array = {};
        int expected = 0;
        int result = MarianaTools.sumOfArrayNumbers(array);
        assertEquals(expected,result);
    }

    @Test
    void sumOfArrayNumbers_Test04NullArray() {
        int[] array = null;
        int expected = 0;
        int result = MarianaTools.sumOfArrayNumbers(array);
        assertEquals(expected,result);
    }

    @Test
    void productOfArrayNumbers_Test01PossibleCase() {
        int[] array = {1,2,3};
        int expected = 6;
        int result = MarianaTools.productOfArrayNumbers(array);
        assertEquals(expected,result);
    }

    @Test
    void productOfArrayNumbers_Test02PossibleCase() {
        int[] array = {};
        int expected = 0;
        int result = MarianaTools.productOfArrayNumbers(array);
        assertEquals(expected,result);
    }

    @Test
    void productOfArrayNumbers_Test03NullArray() {
        int[] array = null;
        int expected = 0;
        int result = MarianaTools.productOfArrayNumbers(array);
        assertEquals(expected,result);
    }

    @Test
    void multiplesOfNumberN_Test01PossibleCase() {
        int numberN = 3;
        int inf = 3;
        int sup = 6;
        int[] expected = {3,6};
        int[] result = MarianaTools.multiplesOfNumberNInAnInterval(numberN,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void multiplesOfNumberN_Test02ImpossibleInterval() {
        int numberN = 3;
        int inf = 6;
        int sup = 3;
        int[] expected = null;
        int[] result = MarianaTools.multiplesOfNumberNInAnInterval(numberN,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void multiplesOfNumberN_Test03InfEqualsSupAndIsNotAMultiple() {
        int numberN = 3;
        int inf = 4;
        int sup = 4;
        int[] expected = null;
        int[] result = MarianaTools.multiplesOfNumberNInAnInterval(numberN,inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void multiplesOfNumberN_Test04InfEqualsSupAndIsAMultiple() {
        int numberN = 2;
        int inf = 4;
        int sup = 4;
        int[] expected = null;
        int[] result = MarianaTools.multiplesOfNumberNInAnInterval(numberN,inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void multiplesOfNumberN_Test05InfEqualsSupAndIsAMultiple() {
        int numberN = 0;
        int inf = 0;
        int sup = 0;
        int[] expected = null;
        int[] result = MarianaTools.multiplesOfNumberNInAnInterval(numberN, inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void multiplesOfNumberN_Test06NumberZero() {
        int numberN = 0;
        int inf = 0;
        int sup = 3;
        int[] expected = {0};
        int[] result = MarianaTools.multiplesOfNumberNInAnInterval(numberN, inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void multiplesOfNumberN_Test07NumberZero() {
        int numberN = 0;
        int inf = -8;
        int sup = 0;
        int[] expected = {0};
        int[] result = MarianaTools.multiplesOfNumberNInAnInterval(numberN, inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void multiplesOfNumberN_Test08NumberZero() {
        int numberN = 0;
        int inf = -8;
        int sup = 8;
        int[] expected = {0};
        int[] result = MarianaTools.multiplesOfNumberNInAnInterval(numberN, inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void multiplesOfNumberN_Test09NumberZero() {
        int numberN = 0;
        int inf = -8;
        int sup = -1;
        int[] expected = null;
        int[] result = MarianaTools.multiplesOfNumberNInAnInterval(numberN, inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void multiplesOfNumberN_Test10NumberZero() {
        int numberN = -3;
        int inf = -7;
        int sup = 7;
        int[] expected = {-6,-3,0};
        int[] result = MarianaTools.multiplesOfNumberNInAnInterval(numberN, inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void multiplesOf2Numbers_Test01PossibleCase() {
        int number1 = 4;
        int number2 = 6;
        int inf = 1;
        int sup = 18;
        int[] expected = {4,8,12,16,6,18};
        int[] result = MarianaTools.multiplesOf2NumbersInAnInterval(number1,number2,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void multiplesOf2Numbers_Test02ImpossibleInterval() {
        int number1 = 4;
        int number2 = 6;
        int inf = 18;
        int sup = 1;
        int[] expected = null;
        int[] result = MarianaTools.multiplesOf2NumbersInAnInterval(number1,number2,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void multiplesOf2Numbers_Test03InfEqualsSupAndNotAMultiple() {
        int number1 = 4;
        int number2 = 6;
        int inf = 15;
        int sup = 15;
        int[] expected = null;
        int[] result = MarianaTools.multiplesOf2NumbersInAnInterval(number1,number2,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void multiplesOf2Numbers_Test04InfEqualsSupAndIsAMultiple() {
        int number1 = 4;
        int number2 = 6;
        int inf = number1;
        int sup = number1;
        int[] expected = null;
        int[] result = MarianaTools.multiplesOf2NumbersInAnInterval(number1,number2,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void multiplesOf2Numbers_Test05InfEqualsSupAndIsAMultiple() {
        int number1 = 4;
        int number2 = 6;
        int inf = number2;
        int sup = number2;
        int[] expected = null;
        int[] result = MarianaTools.multiplesOf2NumbersInAnInterval(number1,number2,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void multiplesOf2Numbers_Test06PossibleCaseNegativeAndPositiveExtremes() {
        int number1 = 4;
        int number2 = 6;
        int inf = -3;
        int sup = 7;
        int[] expected = {0,4,6};
        int[] result = MarianaTools.multiplesOf2NumbersInAnInterval(number1,number2,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void multiplesOf2Numbers_Test07PossibleCaseNegativeExtremesPositiveNumbers() {
        int number1 = 4;
        int number2 = 6;
        int inf = -13;
        int sup = -1;
        int[] expected = {};
        int[] result = MarianaTools.multiplesOf2NumbersInAnInterval(number1,number2,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void multiplesOf2Numbers_Test08PossibleCaseNegativeNumbersPositiveExtremes() {
        int number1 = -4;
        int number2 = -6;
        int inf = 1;
        int sup = 13;
        int[] expected = {};
        int[] result = MarianaTools.multiplesOf2NumbersInAnInterval(number1,number2,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void multiplesOf2Numbers_Test09PossibleCaseNumberZero() {
        int number1 = 0;
        int number2 = 6;
        int inf = 1;
        int sup = 13;
        int[] expected = {6,12};
        int[] result = MarianaTools.multiplesOf2NumbersInAnInterval(number1,number2,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void multiplesOf2Numbers_Test10PossibleCaseDimensionZero() {
        int number1 = 6;
        int number2 = 0;
        int inf = 1;
        int sup = 13;
        int[] expected = {6,12};
        int[] result = MarianaTools.multiplesOf2NumbersInAnInterval(number1,number2,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void revertArray_Test01PossibleCase() {
        int[] array = {6,5,4,3,2,1};
        int[] expected = {1,2,3,4,5,6};
        int[] result = MarianaTools.revertArray(array);
        assertArrayEquals(expected,result);
    }

    @Test
    void revertArray_Test02ImpssibleCase() {
        int[] array = null;
        int[] expected = null;
        int[] result = MarianaTools.revertArray(array);
        assertArrayEquals(expected,result);
    }

    @Test
    void revertArray_Test03ImpssibleCase() {
        int[] array = {};
        int[] expected = null;
        int[] result = MarianaTools.revertArray(array);
        assertArrayEquals(expected,result);
    }

    @Test
    void numberOfDigitisOfALongNumber_Test01PossibleCase() {
        long number = 123789123789L;
        int expected = 12;
        int result = MarianaTools.numberOfDigitsOfALongNumber(number);
        assertEquals(expected, result);
    }

    @Test
    void numberOfDigitisOfALongNumber_Test02PossibleCase() {
        long number = -123789123789L;
        int expected = 12;
        int result = MarianaTools.numberOfDigitsOfALongNumber(number);
        assertEquals(expected, result);
    }

    @Test
    void numberOfDigitsOfALongNumber_Test03NumberZero() {
        long number = 0;
        int expected = 1;
        int result = MarianaTools.numberOfDigitsOfALongNumber(number);
        assertEquals(expected, result);
    }
}