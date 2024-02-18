package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test.Exercicio2Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio2.MarianaEx2;

import static org.junit.jupiter.api.Assertions.*;

class MarianaEx2Test {
    //TESTS FOR THE EXERCISES AS REQUESTED.
    //a)
    @Test
    void multiplesOfNumber3_Test01PossibleCase() {
        int inf = 6;
        int sup = 12;
        int expected = 3;
        int result = MarianaEx2.multiplesOf3(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void multiplesOfNumber3_Test02ImpossibleInterval() {
        int inf = 6;
        int sup = 3;
        int expected = -1;
        int result = MarianaEx2.multiplesOf3(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void multiplesOfNumber3_Test03InfEqualsSupAndNotAMultiple() {
        int inf = 7;
        int sup = 7;
        int expected = -1;
        int result = MarianaEx2.multiplesOf3(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void multiplesOfNumber3_Test04InfEqualsSupAndIsAMultiple() {
        int inf = 3;
        int sup = 3;
        int expected = -1;
        int result = MarianaEx2.multiplesOf3(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void multiplesOfNumber3_Test05IntervalWithNegativeAndPositiveExtremes() {
        int inf = -12;
        int sup = 12;
        int expected = 5;
        int result = MarianaEx2.multiplesOf3(inf,sup);
        assertEquals(expected,result);
    }

    //b)
    @Test
    void multiplesOfNumberN_Test01PossibleCase() {
        int numberN = 3;
        int inf = 3;
        int sup = 6;
        int expected = 2;
        int result = MarianaEx2.multiplesOfNumberN(numberN,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void multiplesOfNumberN_Test02ImpossibleInterval() {
        int numberN = 3;
        int inf = 6;
        int sup = 3;
        int expected = -1;
        int result = MarianaEx2.multiplesOfNumberN(numberN,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void multiplesOfNumberN_Test03InfEqualsSupAndIsNotAMultiple() {
        int numberN = 3;
        int inf = 4;
        int sup = 4;
        int expected = -1;
        int result = MarianaEx2.multiplesOfNumberN(numberN,inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void multiplesOfNumberN_Test04InfEqualsSupAndIsAMultiple() {
        int numberN = 2;
        int inf = 4;
        int sup = 4;
        int expected = -1;
        int result = MarianaEx2.multiplesOfNumberN(numberN,inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void multiplesOfNumberN_Test05InfEqualsSupAndIsAMultiple() {
        int numberN = 0;
        int inf = 0;
        int sup = 0;
        int expected = -1;
        int result = MarianaEx2.multiplesOfNumberN(numberN, inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void multiplesOfNumberN_Test06NumberZero() {
        int numberN = 0;
        int inf = 0;
        int sup = 3;
        int expected = 1;
        int result = MarianaEx2.multiplesOfNumberN(numberN, inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void multiplesOfNumberN_Test07NumberZero() {
        int numberN = 0;
        int inf = -8;
        int sup = 0;
        int expected = 1;
        int result = MarianaEx2.multiplesOfNumberN(numberN, inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void multiplesOfNumberN_Test08NumberZero() {
        int numberN = 0;
        int inf = -8;
        int sup = 8;
        int expected = 1;
        int result = MarianaEx2.multiplesOfNumberN(numberN, inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void multiplesOfNumberN_Test09NumberZero() {
        int numberN = 0;
        int inf = -8;
        int sup = -1;
        int expected = 0;
        int result = MarianaEx2.multiplesOfNumberN(numberN, inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void multiplesOfNumberN_Test10IntervalWithNegativeAndPositiveExtremes() {
        int numberN = -3;
        int inf = -7;
        int sup = 7;
        int expected = 3;
        int result = MarianaEx2.multiplesOfNumberN(numberN, inf, sup);
        assertEquals(expected, result);
    }

    //c)
    @Test
    void multiplesOfNumber3and5_Test01PossibleCase() {
        int inf = 3;
        int sup = 15;
        int expected = 1;
        int result = MarianaEx2.multiplesOfNumber3And5(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void multiplesNumber3and5_Test02ImpossibleInterval() {
        int inf = 6;
        int sup = 3;
        int expected = -1;
        int result = MarianaEx2.multiplesOfNumber3And5(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void multiplesOfNumber3And5_Test03InfEqualsSupAndNotAMultiple() {
        int inf = 7;
        int sup = 7;
        int expected = -1;
        int result = MarianaEx2.multiplesOfNumber3And5(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void multiplesOfNumber3And5_Test04InfEqualsSupAndIsAMultiple() {
        int inf = 5;
        int sup = 5;
        int expected = -1;
        int result = MarianaEx2.multiplesOfNumber3And5(inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void multiplesOfNumber3And5_Test05InfIsNegative() {
        int inf = -15;
        int sup = 15;
        int expected = 2;
        int result = MarianaEx2.multiplesOfNumber3And5(inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void multiplesOfNumber3And5_Test06NegativeIntervalExtremes() {
        int inf = -20;
        int sup = -3;
        int expected = 0;
        int result = MarianaEx2.multiplesOfNumber3And5(inf, sup);
        assertEquals(expected, result);
    }

    //d)
    @Test
    void sharedMultiplesOf2Numbers_Test01PossibleCase() {
        int number1 = 4;
        int number2 = 6;
        int inf = 1;
        int sup = 36;
        int expected = 3;
        int result = MarianaEx2.sharedMultiplesOf2Numbers(number1,number2,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void sharedMultiplesOf2Numbers_Test02ImpossibleInterval() {
        int number1 = 4;
        int number2 = 6;
        int inf = 18;
        int sup = 1;
        int expected = -1;
        int result = MarianaEx2.sharedMultiplesOf2Numbers(number1,number2,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void sharedMultiplesOf2Numbers_Test03InfEqualsSupAndNotAMultiple() {
        int number1 = 4;
        int number2 = 6;
        int inf = 15;
        int sup = 15;
        int expected = -1;
        int result = MarianaEx2.sharedMultiplesOf2Numbers(number1,number2,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void sharedMultiplesOf2Numbers_Test04InfEqualsSupAndIsAMultiple() {
        int number1 = 4;
        int number2 = 6;
        int inf = number1;
        int sup = number1;
        int expected = -1;
        int result = MarianaEx2.sharedMultiplesOf2Numbers(number1,number2,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void sharedMultiplesOf2Numbers_Test05InfEqualsSupAndIsAMultiple() {
        int number1 = 4;
        int number2 = 6;
        int inf = number2;
        int sup = number2;
        int expected = -1;
        int result = MarianaEx2.sharedMultiplesOf2Numbers(number1,number2,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void sharedMultiplesOf2Numbers_Test06PossibleCaseNegativeAndPositiveExtremes() {
        int number1 = 4;
        int number2 = 6;
        int inf = -19;
        int sup = 19;
        int expected = 2;
        int result = MarianaEx2.sharedMultiplesOf2Numbers(number1,number2,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void sharedMultiplesOf2Numbers_Test07PossibleCaseNegativeExtremesPositiveNumbers() {
        int number1 = 4;
        int number2 = 6;
        int inf = -13;
        int sup = -1;
        int expected = 0;
        int result = MarianaEx2.sharedMultiplesOf2Numbers(number1,number2,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void sharedMultiplesOf2Numbers_Test08PossibleCaseNegativeNumbersPositiveExtremes() {
        int number1 = -4;
        int number2 = -6;
        int inf = 1;
        int sup = 13;
        int expected = 0;
        int result = MarianaEx2.sharedMultiplesOf2Numbers(number1,number2,inf,sup);
        assertEquals(expected,result);
    }


    @Test
    void sharedMultiplesOf2Numbers_Test09PossibleCaseNumberZero() {
        int number1 = 6;
        int number2 = 0;
        int inf = 1;
        int sup = 13;
        int expected = 0;
        int result = MarianaEx2.sharedMultiplesOf2Numbers(number1,number2,inf,sup);
        assertEquals(expected,result);
    }

    //e)
    @Test
    void sumOfSharedMultiplesOf2Numbers_Test01PositiveValue() {
        int number1 = 6;
        int number2 = 4;
        int inf = 1;
        int sup = 24;
        int expected = 36;
        int result = MarianaEx2.sumOfSharedMultiplesOf2Numbers(number1,number2,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void sumOfSharedMultiplesOf2Numbers_Test02OneNegativeExtreme() {
        int number1 = 6;
        int number2 = 4;
        int inf = -5;
        int sup = 24;
        int expected = 36;
        int result = MarianaEx2.sumOfSharedMultiplesOf2Numbers(number1,number2,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void sumOfSharedMultiplesOf2Numbers_Test03NumberZero() {
        int number1 = 0;
        int number2 = 4;
        int inf = -5;
        int sup = 24;
        int expected = 0;
        int result = MarianaEx2.sumOfSharedMultiplesOf2Numbers(number1,number2,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void sumOfSharedMultiplesOf2Numbers_Test03BothNegativeExtremes() {
        int number1 = 6;
        int number2 = 4;
        int inf = -25;
        int sup = -4;
        int expected = 0;
        int result = MarianaEx2.sumOfSharedMultiplesOf2Numbers(number1,number2,inf,sup);
        assertEquals(expected,result);
    }


    //TESTS FOR THE RESOLUTION WITH ARRAYS.
    //a)
    @Test
    void multiplesOfNumber3Arrays_Test01PossibleCase() {
        int inf = 6;
        int sup = 12;
        int[] expected = {6,9,12};
        int[] result = MarianaEx2.multiplesOfNumber3Arrays(inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void multiplesNumber3Arrays_Test02ImpossibleInterval() {
        int inf = 6;
        int sup = 3;
        int[] expected = null;
        int[] result = MarianaEx2.multiplesOfNumber3Arrays(inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void multiplesOfNumber3Arrays_Test03InfEqualsSupAndNotAMultiple() {
        int inf = 7;
        int sup = 7;
        int[] expected = null;
        int[] result = MarianaEx2.multiplesOfNumber3Arrays(inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void multiplesOfNumber3Arrays_Test04InfEqualsSupAndIsAMultiple() {
        int inf = 3;
        int sup = 3;
        int[] expected = null;
        int[] result = MarianaEx2.multiplesOfNumber3Arrays(inf,sup);
        assertArrayEquals(expected,result);
    }

    //b)
    @Test
    void multiplesOfNumberNArrays_Test01PossibleCase() {
        int numberN = 3;
        int inf = 3;
        int sup = 6;
        int[] expected = {3,6};
        int[] result = MarianaEx2.multiplesOfNumberNArrays(numberN,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void multiplesOfNumberNArrays_Test02ImpossibleInterval() {
        int numberN = 3;
        int inf = 6;
        int sup = 3;
        int[] expected = null;
        int[] result = MarianaEx2.multiplesOfNumberNArrays(numberN,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void multiplesOfNumberNArrays_Test03InfEqualsSupAndIsNotAMultiple() {
        int numberN = 3;
        int inf = 4;
        int sup = 4;
        int[] expected = null;
        int[] result = MarianaEx2.multiplesOfNumberNArrays(numberN,inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void multiplesOfNumberNArrays_Test04InfEqualsSupAndIsAMultiple() {
        int numberN = 2;
        int inf = 4;
        int sup = 4;
        int[] expected = null;
        int[] result = MarianaEx2.multiplesOfNumberNArrays(numberN,inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void multiplesOfNumberNArrays_Test05InfEqualsSupAndIsAMultiple() {
        int numberN = 0;
        int inf = 0;
        int sup = 0;
        int[] expected = null;
        int[] result = MarianaEx2.multiplesOfNumberNArrays(numberN, inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void multiplesOfNumberNArrays_Test06NumberZero() {
        int numberN = 0;
        int inf = 0;
        int sup = 3;
        int[] expected = {0};
        int[] result = MarianaEx2.multiplesOfNumberNArrays(numberN, inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void multiplesOfNumberNArrays_Test07NumberZero() {
        int numberN = 0;
        int inf = -8;
        int sup = 0;
        int[] expected = {0};
        int[] result = MarianaEx2.multiplesOfNumberNArrays(numberN, inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void multiplesOfNumberNArrays_Test08NumberZero() {
        int numberN = 0;
        int inf = -8;
        int sup = 8;
        int[] expected = {0};
        int[] result = MarianaEx2.multiplesOfNumberNArrays(numberN, inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void multiplesOfNumberNArrays_Test09NumberZero() {
        int numberN = 0;
        int inf = -8;
        int sup = -1;
        int[] expected = null;
        int[] result = MarianaEx2.multiplesOfNumberNArrays(numberN, inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void multiplesOfNumberNArrays_Test10ArrayWithZero() {
        int numberN = -3;
        int inf = -7;
        int sup = 7;
        int[] expected = {-6,-3,0};
        int[] result = MarianaEx2.multiplesOfNumberNArrays(numberN, inf, sup);
        assertArrayEquals(expected, result);
    }

    //c)
    @Test
    void multiplesOfNumber3and5Arrays_Test01PossibleCase() {
        int inf = 3;
        int sup = 15;
        int[] expected = {15};
        int[] result = MarianaEx2.multiplesOfNumber3And5Arrays(inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void multiplesNumber3and5Arrays_Test02ImpossibleInterval() {
        int inf = 6;
        int sup = 3;
        int[] expected = null;
        int[] result = MarianaEx2.multiplesOfNumber3And5Arrays(inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void multiplesOfNumber3And5Arrays_Test03InfEqualsSupAndNotAMultiple() {
        int inf = 7;
        int sup = 7;
        int[] expected = null;
        int[] result = MarianaEx2.multiplesOfNumber3And5Arrays(inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void multiplesOfNumber3And5Arrays_Test04InfEqualsSupAndIsAMultiple() {
        int inf = 5;
        int sup = 5;
        int[] expected = null;
        int[] result = MarianaEx2.multiplesOfNumber3And5Arrays(inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void multiplesOfNumber3And5Arrays_Test05InfIsNegative() {
        int inf = -15;
        int sup = 15;
        int[] expected = {0,15};
        int[] result = MarianaEx2.multiplesOfNumber3And5Arrays(inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void multiplesOfNumber3And5Arrays_Test06NegativeIntervalExtremes() {
        int inf = -20;
        int sup = -3;
        int[] expected = {};
        int[] result = MarianaEx2.multiplesOfNumber3And5Arrays(inf, sup);
        assertArrayEquals(expected, result);
    }

    //d)
    @Test
    void sharedMultiplesOf2NumbersArrays_Test01PossibleCase() {
        int number1 = 4;
        int number2 = 6;
        int inf = 1;
        int sup = 36;
        int[] expected = {12,24,36};
        int[] result = MarianaEx2.sharedMultiplesOf2NumbersArrays(number1,number2,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void sharedMultiplesOf2NumbersArrays_Test02ImpossibleInterval() {
        int number1 = 4;
        int number2 = 6;
        int inf = 18;
        int sup = 1;
        int[] expected = null;
        int[] result = MarianaEx2.sharedMultiplesOf2NumbersArrays(number1,number2,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void sharedMultiplesOf2NumbersArrays_Test03InfEqualsSupAndNotAMultiple() {
        int number1 = 4;
        int number2 = 6;
        int inf = 15;
        int sup = 15;
        int[] expected = null;
        int[] result = MarianaEx2.sharedMultiplesOf2NumbersArrays(number1,number2,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void sharedMultiplesOf2NumbersArrays_Test04InfEqualsSupAndIsAMultiple() {
        int number1 = 4;
        int number2 = 6;
        int inf = number1;
        int sup = number1;
        int[] expected = null;
        int[] result = MarianaEx2.sharedMultiplesOf2NumbersArrays(number1,number2,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void sharedMultiplesOf2NumbersArrays_Test05InfEqualsSupAndIsAMultiple() {
        int number1 = 4;
        int number2 = 6;
        int inf = number2;
        int sup = number2;
        int[] expected = null;
        int[] result = MarianaEx2.sharedMultiplesOf2NumbersArrays(number1,number2,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void sharedMultiplesOf2NumbersArrays_Test06PossibleCaseNegativeAndPositiveExtremes() {
        int number1 = 4;
        int number2 = 6;
        int inf = -19;
        int sup = 19;
        int[] expected = {0,12};
        int[] result = MarianaEx2.sharedMultiplesOf2NumbersArrays(number1,number2,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void sharedMultiplesOf2NumbersArrays_Test07PossibleCaseNegativeExtremesPositiveNumbers() {
        int number1 = 4;
        int number2 = 6;
        int inf = -13;
        int sup = -1;
        int[] expected = {};
        int[] result = MarianaEx2.sharedMultiplesOf2NumbersArrays(number1,number2,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void sharedMultiplesOf2NumbersArrays_Test08PossibleCaseNegativeNumbersPositiveExtremes() {
        int number1 = -4;
        int number2 = -6;
        int inf = 1;
        int sup = 13;
        int[] expected = {};
        int[] result = MarianaEx2.sharedMultiplesOf2NumbersArrays(number1,number2,inf,sup);
        assertArrayEquals(expected,result);
    }


    @Test
    void sharedMultiplesOf2NumbersArrays_Test09PossibleCaseNumberZero() {
        int number1 = 6;
        int number2 = 0;
        int inf = 1;
        int sup = 13;
        int[] expected = null;
        int[] result = MarianaEx2.sharedMultiplesOf2NumbersArrays(number1,number2,inf,sup);
        assertArrayEquals(expected,result);
    }

    //e)
    @Test
    void sumOfSharedMultiplesOf2NumbersArrays_Test01PositiveValue() {
        int number1 = 6;
        int number2 = 4;
        int inf = 1;
        int sup = 24;
        int expected = 36;
        int result = MarianaEx2.sumOfSharedMultiplesOf2NumbersArrays(number1,number2,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void sumOfSharedMultiplesOf2NumbersArrays_Test02OneNegativeExtreme() {
        int number1 = 6;
        int number2 = 4;
        int inf = -5;
        int sup = 24;
        int expected = 36;
        int result = MarianaEx2.sumOfSharedMultiplesOf2NumbersArrays(number1,number2,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void sumOfSharedMultiplesOf2NumbersArrays_Test03BothNegativeExtremes() {
        int number1 = 6;
        int number2 = 4;
        int inf = -25;
        int sup = -4;
        int expected = 0;
        int result = MarianaEx2.sumOfSharedMultiplesOf2NumbersArrays(number1,number2,inf,sup);
        assertEquals(expected,result);
    }
}