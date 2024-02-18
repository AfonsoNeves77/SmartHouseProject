package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.HugoTools;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HugoToolsTest {

    @Test
    void isAboveOrEqualto1Success() {
        int num = 1;
        boolean expected = true;
        boolean result = HugoTools.isAboveOrEqualto1(num);
        assertEquals(expected,result);
    }

    @Test
    void isAboveOrEqualto1NotAbove() {
        int num = -1;
        boolean expected = false;
        boolean result = HugoTools.isAboveOrEqualto1(num);
        assertEquals(expected,result);
    }

    @Test     // Quando aumentamos array, é importante colocar o 0 no final do expected
    void increaseArraySizeByOneSuccess() {
        int [] arrayParaAumentar = {1,3,5,7};
        int [] expected = {1,3,5,7,0};
        int [] result = HugoTools.increaseArraySizeByOne(arrayParaAumentar);
        assertArrayEquals(expected,result);
    }

    @Test    // Para testar o incremento de uma array que começa sem posições, temos que escrever como se estivessemos a inicializar
    void increaseArraySizeByOneSucessZero() {
        int [] arrayParaAumentar = new int[0];
        int [] expected = {0}; // Uma array com 1 index aberto, sem valores dentro escreve-se 0. O que pode confundir com o valor 0 que poderia estar la dentro
        int [] result = HugoTools.increaseArraySizeByOne(arrayParaAumentar);
        assertArrayEquals(expected,result);
    }

    @Test
    void mmultiplesOfNumInRangeSucess() {
        int num = 3;
        int limiteMin = 1;
        int limiteMax = 9;
        int [] expected = {3,6,9};
        int [] result = HugoTools.multiplesOfNumInRange(num,limiteMin,limiteMax);
        assertArrayEquals(expected,result);
    }
    @Test
    void multiplesOfNumInRangeNegativeDomain() {
        int num = -5;
        int limiteMin = -25;
        int limiteMax = -5;
        int [] expected = {-25,-20,-15,-10,-5};
        int [] result = HugoTools.multiplesOfNumInRange(num,limiteMin,limiteMax);
        assertArrayEquals(expected,result);
    }

    @Test
    void multiplesOfNumInRangeReturnEmptyArray() {
        int num = 5;
        int limiteMin = 1;
        int limiteMax = 2;
        int [] expected = {};
        int [] result = HugoTools.multiplesOfNumInRange(num,limiteMin,limiteMax);
        assertArrayEquals(expected,result);
    }

    @Test
    void commonMultiplesOfTwoNumsInSetRangeSucess() {
        int num1 = 3;
        int num2 = 5;
        int limiteMin = 10;
        int limiteMax = 20;
        int[] expected = {15};
        int[] result = HugoTools.arrayOfCommonMultiplesOfTwoNumsInSetRange(num1,num2,limiteMin,limiteMax);
        assertArrayEquals(expected,result);
    }

    @Test
    void commonMultiplesOfTwoNumsInSetRangeNoCommons() {
        int num1 = 5;
        int num2 = 7;
        int limiteMin = 10;
        int limiteMax = 30;
        int[] expected = {};
        int[] result = HugoTools.arrayOfCommonMultiplesOfTwoNumsInSetRange(num1,num2,limiteMin,limiteMax);
        assertArrayEquals(expected,result);
    }

    @Test
    void commonMultiplesOfTwoNumsInSetRangeNegatives() {
        int num1 = -3;
        int num2 = -5;
        int limiteMin = -10;
        int limiteMax = -20;
        int[] expected = {};
        int[] result = HugoTools.arrayOfCommonMultiplesOfTwoNumsInSetRange(num1,num2,limiteMin,limiteMax);
        assertArrayEquals(expected,result);
    }

    @Test
    void arraySorterBackToFrontSucess(){
        int[] arrayToSort = {5,4,3,2,1};
        int[] expected = {1,2,3,4,5};
        int[] result = HugoTools.arraySorterBackToFront(arrayToSort);
        assertArrayEquals(expected,result);
    }

    @Test
    void arraySorterBackToFrontEmptyArrays(){
        int[] arrayToSort = {};
        int[] expected = {};
        int[] result = HugoTools.arraySorterBackToFront(arrayToSort);
        assertArrayEquals(expected,result);
    }

    @Test
    void intNumDigitExtractionIntoArray(){
        int num = 12345;
        int[] expected = {5,4,3,2,1};
        int[] result = HugoTools.intNumDigitExtractionIntoArray(num);
        assertArrayEquals(expected,result);
    }

    @Test
    void intNumDigitExtractionZero(){
        int num = 0;
        int[] expected = {0};
        int[] result = HugoTools.intNumDigitExtractionIntoArray(num);
        assertArrayEquals(expected,result);
    }

    @Test
    void intNumDigitExtractionZeroInMiddle(){
        int num = 109;
        int[] expected = {9,0,1};
        int[] result = HugoTools.intNumDigitExtractionIntoArray(num);
        assertArrayEquals(expected,result);
    }

    @Test
    void intNumDigitExtractionZeroLastDigit(){
        int num = 100;
        int[] expected = {0,0,1};
        int[] result = HugoTools.intNumDigitExtractionIntoArray(num);
        assertArrayEquals(expected,result);
    }

    @Test
    void listEvenNumbersArraySucess(){
        int[] array = {1,2,3,4,5,6,7,8};
        int[] expected = {2,4,6,8};
        int[] result = HugoTools.listEvenNumbersArray(array);
        assertArrayEquals(expected,result);
    }

    @Test
    void listEvenNumbersArrayZeroes(){
        int[] array = {0,0,0,0,0,0,0,0};
        int[] expected = {0,0,0,0,0,0,0,0};
        int[] result = HugoTools.listEvenNumbersArray(array);
        assertArrayEquals(expected,result);
    }

    @Test
    void increaseArraySizeByOneLongSuccess() {
        long [] arrayParaAumentar = {1,3,5,7};
        long [] expected = {1,3,5,7,0};
        long [] result = HugoTools.increaseArraySizeByOneLong(arrayParaAumentar);
        assertArrayEquals(expected,result);
    }

    @Test
    void increaseArraySizeByOneSucessLongZero() {
        long [] arrayParaAumentar = new long[0];
        long [] expected = {0};
        long [] result = HugoTools.increaseArraySizeByOneLong(arrayParaAumentar);
        assertArrayEquals(expected,result);
    }

    @Test
    void listOddArrayLongSucess(){
        long [] array = {1,2,4,6,7,9};
        long [] expected = {1,7,9};
        long [] result = HugoTools.listOddNumbersArrayLong(array);
        assertArrayEquals(expected,result);
    }

    @Test
    void listOddArrayLongZeros(){
        long [] array = {0,0,0,0,0,0};
        long [] expected = {};
        long [] result = HugoTools.listOddNumbersArrayLong(array);
        assertArrayEquals(expected,result);
    }

    @Test
    void longNumDigitExtractionIntoArray(){
        long num = 12345;
        long[] expected = {5,4,3,2,1};
        long[] result = HugoTools.longNumDigitExtractionIntoArray(num);
        assertArrayEquals(expected,result);
    }

    @Test
    void longNumDigitExtractionZero(){
        long num = 0;
        long[] expected = {0};
        long[] result = HugoTools.longNumDigitExtractionIntoArray(num);
        assertArrayEquals(expected,result);
    }

    @Test
    void longNumDigitExtractionZeroInMiddle(){
        long num = 109;
        long[] expected = {9,0,1};
        long[] result = HugoTools.longNumDigitExtractionIntoArray(num);
        assertArrayEquals(expected,result);
    }

    @Test
    void longNumDigitExtractionZeroLastDigit(){
        long num = 100;
        long[] expected = {0,0,1};
        long[] result = HugoTools.longNumDigitExtractionIntoArray(num);
        assertArrayEquals(expected,result);
    }

    @Test
    void longArraySorterBackToFrontSucess(){
        long[] arrayToSort = {5,4,3,2,1};
        long[] expected = {1,2,3,4,5};
        long[] result = HugoTools.longArraySorterBackToFront(arrayToSort);
        assertArrayEquals(expected,result);
    }

    @Test
    void longArraySorterBackToFrontEmptyArrays(){
        long[] arrayToSort = {};
        long[] expected = {};
        long[] result = HugoTools.longArraySorterBackToFront(arrayToSort);
        assertArrayEquals(expected,result);
    }

    @Test
    void longListEvenNumbersArraySucess(){
        long[] array = {1,2,3,4,5,6,7,8};
        long[] expected = {2,4,6,8};
        long[] result = HugoTools.longListEvenNumbersArray(array);
        assertArrayEquals(expected,result);
    }

    @Test
    void longListEvenNumbersArrayZeroes(){
        long[] array = {0,0,0,0,0,0,0,0};
        long[] expected = {0,0,0,0,0,0,0,0};
        long[] result = HugoTools.longListEvenNumbersArray(array);
        assertArrayEquals(expected,result);
    }

    @Test
    void digitsInLongNumToPow3AndTheirSumSucess(){
        long num = 123;
        long expected = 36;
        long result = HugoTools.digitsInLongNumToPow3AndTheirSum(num);
        assertEquals(expected,result);
    }

    @Test
    void digitsInLongNumToPow3AndTheirSumZero(){
        long num = 1204;
        long expected = 73;
        long result = HugoTools.digitsInLongNumToPow3AndTheirSum(num);
        assertEquals(expected,result);
    }

    @Test
    void isRangeAscending(){
        int inf = 0;
        int sup = 1;
        boolean expected = true;
        boolean result = HugoTools.isRangeAscending(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void extractDigitsFromAscendingRangeSucess(){
        int inf = 10;
        int sup = 15;
        long[] expected = {10,11,12,13,14,15};
        long[] result = HugoTools.extractDigitsFromAscendingRange(inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void isLongNumPalindromeSucess(){
        long num = 12345;
        boolean expected = false;
        boolean result = HugoTools.isLongNumPalindrome(num);
        assertEquals(expected,result);
    }

    @Test
    void isLongNumPalindromeSucess2(){
        long num = 12321;
        boolean expected = true;
        boolean result = HugoTools.isLongNumPalindrome(num);
        assertEquals(expected,result);
    }

    @Test
    void isLongNumPalindromeSingleDigit(){
        long num = 1;
        boolean expected = true;
        boolean result = HugoTools.isLongNumPalindrome(num);
        assertEquals(expected,result);
    }

    @Test
    void isAmstrongSucess(){
        long num = 407;
        boolean expected = true;
        boolean result = HugoTools.isAmstrong(num);
        assertEquals(expected,result);
    }
    @Test
    void isAmstrongSucessFalse(){
        long num = 405;
        boolean expected = false;
        boolean result = HugoTools.isAmstrong(num);
        assertEquals(expected,result);
    }

    @Test
    void isAmstrongSucessNegative(){
        long num = -1;
        boolean expected = true;
        boolean result = HugoTools.isAmstrong(num);
        assertEquals(expected,result);
    }

    @Test
    void countOfMultiplesOfNumInRange(){
        int num = 0;
        int inf = 0;
        int sup = 10;
        int expected = 11;
        int result = HugoTools.countOfMultiplesOfNumInRange(num,inf,sup);
        assertEquals(expected,result);
    }
    @Test
    void countOfMultiplesOfNumInRange_zeros(){
        int num = 0;
        int inf = 0;
        int sup = 10;
        int expected = 11;
        int result = HugoTools.countOfMultiplesOfNumInRange(num,inf,sup);
        assertEquals(expected,result);
    }
    @Test
    void countOfMultiplesOfNumInRange_zeros1(){
        int num = 5;
        int inf = -5;
        int sup = 10;
        int expected = -1;
        int result = HugoTools.countOfMultiplesOfNumInRange(num,inf,sup);
        assertEquals(expected,result);
    }
    @Test
    void countOfMultiplesOfNumInRange_InversedRange(){
        int num = 5;
        int inf = 20;
        int sup = 10;
        int expected = -1;
        int result = HugoTools.countOfMultiplesOfNumInRange(num,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void countOfMultiplesOfNumInRange_Success(){
        int num = 5;
        int inf = 0;
        int sup = 10;
        int expected = 3;
        int result = HugoTools.countOfMultiplesOfNumInRange(num,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void doesRangeContain0(){
        int inf = 0;
        int sup = 1;
        boolean expected = true;
        boolean result = HugoTools.doesRangeContain0(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void doesRangeContain0_false(){
        int inf = 1;
        int sup = 3;
        boolean expected = false;
        boolean result = HugoTools.doesRangeContain0(inf,sup);
        assertEquals(expected,result);
    }
}
