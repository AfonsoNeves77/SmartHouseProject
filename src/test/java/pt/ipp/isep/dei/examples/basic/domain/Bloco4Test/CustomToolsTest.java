package pt.ipp.isep.dei.examples.basic.domain.Bloco4Test;

import pt.ipp.isep.dei.examples.basic.domain.Bloco4.CustomTools;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomToolsTest {
    @Test
    void intIncreaseArraySizeBy1_Success(){
        new CustomTools();
        int[] arrayToIncrease = {1,2,3};
        int[] expected = {1,2,3,0};
        int[] result = CustomTools.intIncreaseArraySizeBy1(arrayToIncrease);
        assertArrayEquals(expected,result);
    }
    @Test
    void intIncreaseArraySizeBy1_Negatives(){
        int[] arrayToIncrease = {0,-1,-5};
        int[] expected = {0,-1,-5,0};
        int[] result = CustomTools.intIncreaseArraySizeBy1(arrayToIncrease);
        assertArrayEquals(expected,result);
    }

    @Test
    void intArrayOfEachDigitInNum_Success(){
        int num = 12345;
        int[] expected = {1,2,3,4,5};
        int[] result = CustomTools.intArrayOfEachDigitInNum(num);
        assertArrayEquals(expected,result);
    }
    @Test
    void intArrayOfEachDigitInNum_numEndingIn0(){
        int num = 12340;
        int[] expected = {1,2,3,4,0};
        int[] result = CustomTools.intArrayOfEachDigitInNum(num);
        assertArrayEquals(expected,result);
    }

    @Test
    void intArrayOfEachDigitInNum_num0(){
        int num = 0;
        int[] expected = {0};
        int[] result = CustomTools.intArrayOfEachDigitInNum(num);
        assertArrayEquals(expected,result);
    }

    @Test
    void intCountOfDigitsInNumberFive(){
        int num = 13457;
        int expected = 5;
        int result = CustomTools.intCountOfDigitsInNumber(num);
        assertEquals(result, expected);
    }
    @Test
    void intCountOfDigitsInNumberZero(){
        int num = 0;
        int expected = -1;
        int result = CustomTools.intCountOfDigitsInNumber(num);
        assertEquals(result, expected);
    }

    @Test
    void arrayInverter(){
        int[] array = {1,2,3,4};
        int[] expcted = {4,3,2,1};
        int[] result = CustomTools.arrayInverter(array);
        assertArrayEquals(expcted,result);
    }

    @Test
    void sumOfTheElementsOfAnArray() {
        int[] array = {0,5,4,7,9};
        int expected = 25;
        int result = CustomTools.sumOfTheElementsOfAnArray(array);
        assertEquals(expected, result);
    }
    @Test
    void sumOfTheElementsOfAnArray_NegativeNumbers() {
        int[] array = {0,-15,4,-12,9};
        int expected = -14;
        int result = CustomTools.sumOfTheElementsOfAnArray(array);
        assertEquals(expected, result);
    }
    @Test
    void evenNumberInAnArrayCounter() {
        int[] array = {1,2,3,4,5};
        int expected = 2;
        int result = CustomTools.evenNumberInAnArrayCounter(array);
        assertEquals(expected, result);
    }

    @Test
    void evenNumberInAnArrayCounterInAnArrayWithNegativeNumbers() {
        int[] array = {1,2,-4,4,-7};
        int expected = 3;
        int result = CustomTools.evenNumberInAnArrayCounter(array);
        assertEquals(expected, result);
    }
    @Test
    void evenNumberInAnArrayCounterInAnArrayWithNumber0() {
        int[] array = {0,2,-4,4,-7};
        int expected = 4;
        int result = CustomTools.evenNumberInAnArrayCounter(array);
        assertEquals(expected, result);
    }

    @Test
    void productNumbersArray(){
        //arrange
        int[] array = {1,2,3,4};
        int expected = 24;
        //act
        int result = CustomTools.productNumbersArray(array);
        //assert
        assertEquals(expected,result);
    }
    @Test
    void productNumbersArray_EvenNumberNegatives(){
        //arrange
        int[] array = {1,-2,3,-4};
        int expected = 24;
        //act
        int result = CustomTools.productNumbersArray(array);
        //assert
        assertEquals(expected,result);
    }
    @Test
    void productNumbersArray_OddNumberNegatives(){
        //arrange
        int[] array = {1,2,3,-4};
        int expected = -24;
        //act
        int result = CustomTools.productNumbersArray(array);
        //assert
        assertEquals(expected,result);
    }
    @Test
    void productNumbersArray_EmptyArray(){
        //arrange
        int[] array = {};
        int expected = 0;
        //act
        int result = CustomTools.productNumbersArray(array);
        //assert
        assertEquals(expected,result);
    }

    @Test
    void evenNumbersInArray() {
        int[] array = {4,5,7,8};
        int[] expected = {4,8};
        int[] result = CustomTools.evenNumbersInArray(array);
        assertArrayEquals(expected, result);
    }
    @Test
    void evenNumbersInArrayWithNegatives() {
        int[] array = {4,-7,7,-14};
        int[] expected = {4, -14};
        int[] result = CustomTools.evenNumbersInArray(array);
        assertArrayEquals(expected, result);
    }
    @Test
    void evenNumbersInArrayWithLimitNumbers() {
        int[] array = {0, 14, 28, 37};
        int[] expected = {0, 14, 28};
        int[] result = CustomTools.evenNumbersInArray(array);
        assertArrayEquals(expected, result);
    }

    @Test
    void oddNumberInAnArrayCounter() {
        int[] array = {1,2,3,4,5};
        int expected = 3;
        int result = CustomTools.oddNumberInAnArrayCounter(array);
        assertEquals(expected, result, 0.01);
    }

    @Test
    void oddNumberInAnArrayCounterWithNegativeNumbers() {
        int[] array = {1,2,-4,4,-7};
        int expected = 2;
        int result = CustomTools.oddNumberInAnArrayCounter(array);
        assertEquals(expected, result, 0.01);
    }
    @Test
    void oddNumberInAnArrayCounterWithNumber0() {
        int[] array = {0,2,-4,4,-7};
        int expected = 1;
        int result = CustomTools.oddNumberInAnArrayCounter(array);
        assertEquals(expected, result, 0.01);
    }
    @Test
    void oddNumbersInArray() {
        int[] array = {4,5,7,8};
        int[] expected = {5,7};
        int[] result = CustomTools.oddNumbersInArray(array);
        assertArrayEquals(expected, result);
    }
    @Test
    void oddNumbersInArrayWithNegativeNumbers() {
        int[] array = {4,-7,7,-14};
        int[] expected = {-7,7,};
        int[] result = CustomTools.oddNumbersInArray(array);
        assertArrayEquals(expected, result);
    }
    @Test
    void oddNumbersInArrayWithLimitNumbers() {
        int[] array = {0, 14, 28, 37};
        int[] expected = {37};
        int[] result = CustomTools.oddNumbersInArray(array);
        assertArrayEquals(expected, result);
    }

    @Test
    void intArrayCrop_Success(){
        int[] arrayToCrop = {1,2,3,4,5,0,0,0,0,0};
        int numOfOccupiedIndexes = 5;
        int[] expected = {1,2,3,4,5};
        int[] result = CustomTools.intArrayCrop(arrayToCrop, numOfOccupiedIndexes);

        assertArrayEquals(expected,result);
    }
    @Test
    void intArrayCrop_ArrayTooShort(){
        int[] arrayToCrop = {1,2,3,4,5};
        int numOfOccupiedIndexes = 7;
        int[] expected = null;
        int[] result = CustomTools.intArrayCrop(arrayToCrop,  numOfOccupiedIndexes);
        assertArrayEquals(expected,result);
    }
    @Test
    void intArrayCrop_NoNeedForCrop(){
        int[] arrayToCrop = {1,2,3,4,5};
        int numOfOccupiedIndexes = 5;
        int[] expected = {1,2,3,4,5};
        int[] result = CustomTools.intArrayCrop(arrayToCrop, numOfOccupiedIndexes);
        assertArrayEquals(expected,result);
    }

    //-----------------------------------------------------------------------

    @Test
    void arrayWithMultiplesOfNumInSetRange_Success(){
        int num = 3;
        int inf = 0;
        int sup = 9;
        int[] expected = {0,3,6,9};
        int[] result = CustomTools.arrayWithMultiplesOfNumInSetRange(num,inf,sup);
        assertArrayEquals(expected,result);
    }
    @Test
    void arrayWithMultiplesOfNumInSetRange_numZero(){
        int num = 0;
        int inf = 0;
        int sup = 9;
        int[] expected = {0};
        int[] result = CustomTools.arrayWithMultiplesOfNumInSetRange(num,inf,sup);
        assertArrayEquals(expected,result);
    }
    @Test
    void arrayWithMultiplesOfNumInSetRange_numZeroWithoutRange(){
        int num = 0;
        int inf = 1;
        int sup = 9;
        int[] expected = {};
        int[] result = CustomTools.arrayWithMultiplesOfNumInSetRange(num,inf,sup);
        assertArrayEquals(expected,result);
    }
    @Test
    void arrayWithMultiplesOfNumInSetRange_reversedRanges(){
        int num = 4;
        int inf = 9;
        int sup = 1;
        int[] expected = null;
        int[] result = CustomTools.arrayWithMultiplesOfNumInSetRange(num,inf,sup);
        assertArrayEquals(expected,result);
    }
    @Test
    void arrayWithMultiplesOfNumInSetRange_InfEqualsSup(){
        int num = 4;
        int inf = 4;
        int sup = 4;
        int[] expected = {4};
        int[] result = CustomTools.arrayWithMultiplesOfNumInSetRange(num,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void arrayWithMultiplesOfNumInSetRange_equalRangeZero(){
        int num = 4;
        int inf = 0;
        int sup = 0;
        int[] expected = {0};
        int[] result = CustomTools.arrayWithMultiplesOfNumInSetRange(num,inf,sup);
        assertArrayEquals(expected,result);
    }
    @Test
    void arrayWithMultiplesOfNumInSetRange_NegativeNumber(){
        int num = -4;
        int inf = 5;
        int sup = 20;
        int[] result = CustomTools.arrayWithMultiplesOfNumInSetRange(num,inf,sup);
        assertNull(result);
    }
    @Test
    void arrayWithMultiplesOfNumInSetRange_InfIsNegative(){
        int num = 4;
        int inf = -5;
        int sup = 20;
        int[] result = CustomTools.arrayWithMultiplesOfNumInSetRange(num,inf,sup);
        assertNull(result);
    }

    @Test
    void arrayWithMultiplesOfNumInSetRange_equalRange(){
        int num = 2;
        int inf = 10;
        int sup = 10;
        int[] expected = {10};
        int[] result = CustomTools.arrayWithMultiplesOfNumInSetRange(num,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void arrayWithMultiplesOfNumInSetRange_equalRangeNoMultiples(){
        int num = 3;
        int inf = 10;
        int sup = 10;
        int[] expected = {};
        int[] result = CustomTools.arrayWithMultiplesOfNumInSetRange(num,inf,sup);
        assertArrayEquals(expected,result);
    }

    //---------------------------------------------------------

    @Test
    void doesRangeContain0_Success(){
        int inf = 0;
        int sup = 5;
        boolean result = CustomTools.doesRangeContain0(inf,sup);
        assertTrue(result);
    }
    @Test
    void doesRangeContain0_False(){
        int inf = 1;
        int sup = 5;
        boolean result = CustomTools.doesRangeContain0(inf,sup);
        assertFalse(result);
    }

    @Test
    void doesRangeContain0_True(){
        int inf = -3;
        int sup = 0;
        boolean result = CustomTools.doesRangeContain0(inf,sup);
        assertTrue(result);
    }

    //-----------------------------------------------------
    @Test
    void arrayCommonMultiplesOfTwoNumsInSetRange_Success(){
        int num1 = 3;
        int num2 = 5;
        int inf = 1;
        int sup = 15;
        int[] expected = {15};
        int[] result = CustomTools.arrayCommonMultiplesOfTwoNumsInSetRange(num1,num2,inf,sup);
        assertArrayEquals(expected,result);
    }
    @Test
    void arrayCommonMultiplesOfTwoNumsInSetRange_Zero(){
        int num1 = 3;
        int num2 = 5;
        int inf = 0;
        int sup = 15;
        int[] expected = {0,15};
        int[] result = CustomTools.arrayCommonMultiplesOfTwoNumsInSetRange(num1,num2,inf,sup);
        assertArrayEquals(expected,result);
    }
    @Test
    void arrayCommonMultiplesOfTwoNumsInSetRange_null(){
        int num1 = 3;
        int num2 = 5;
        int inf = 20;
        int sup = 15;
        int[] result = CustomTools.arrayCommonMultiplesOfTwoNumsInSetRange(num1,num2,inf,sup);
        assertNull(result);
    }
    @Test
    void arrayCommonMultiplesOfTwoNumsInSetRange_ZeroNoRange(){
        int num1 = 0;
        int num2 = 5;
        int inf = 1;
        int sup = 15;
        int[] expected = {};
        int[] result = CustomTools.arrayCommonMultiplesOfTwoNumsInSetRange(num1,num2,inf,sup);
        assertArrayEquals(expected,result);
    }
    @Test
    void arrayCommonMultiplesOfTwoNumsInSetRange_ZeroWithRange(){
        int num1 = 0;
        int num2 = 5;
        int inf = 0;
        int sup = 15;
        int[] expected = {0};
        int[] result = CustomTools.arrayCommonMultiplesOfTwoNumsInSetRange(num1,num2,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void arrayCommonMultiplesOfTwoNumsInSetRange_AllValuesSetToZero(){
        int num1 = 0;
        int num2 = 0;
        int inf = 0;
        int sup = 0;
        int[] expected = {0};
        int[] result = CustomTools.arrayCommonMultiplesOfTwoNumsInSetRange(num1,num2,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void arrayCommonMultiplesOfTwoNumsInSetRange_SameRangeValues(){
        int num1 = 1;
        int num2 = 2;
        int inf = 10;
        int sup = 10;
        int[] expected = {10};
        int[] result = CustomTools.arrayCommonMultiplesOfTwoNumsInSetRange(num1,num2,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void arrayCommonMultiplesOfTwoNumsInSetRange_SameRangeValuesNoComumn(){
        int num1 = 1;
        int num2 = 3;
        int inf = 10;
        int sup = 10;
        int[] expected = {};
        int[] result = CustomTools.arrayCommonMultiplesOfTwoNumsInSetRange(num1,num2,inf,sup);
        assertArrayEquals(expected,result);
    }

    //------------------------------------------------------------------

    @Test
    void isIntNumPalindrome_success(){
        int num = 12321;
        boolean result = CustomTools.isIntNumPalindrome(num);
        assertTrue(result);
    }
    @Test
    void isIntNumPalindrome_zero(){
        int num = 0;
        boolean result = CustomTools.isIntNumPalindrome(num);
        assertTrue(result);
    }
    @Test
    void isIntNumPalindrome_false(){
        int num = 12;
        boolean result = CustomTools.isIntNumPalindrome(num);
        assertFalse(result);
    }
    @Test
    void isIntNumPalindrome_negatives(){
        int num = -121;
        boolean result = CustomTools.isIntNumPalindrome(num);
        assertTrue(result);
    }

    //------------------------------------------------------------------------
    @Test
    void doesArrayContainNum_success(){
        int num = 1;
        int[] array = {2,3,1,5};
        boolean result = CustomTools.doesArrayContainNum(num, array);
        assertTrue(result);
    }
    @Test
    void doesArrayContainNum_false(){
        int num = 4;
        int[] array = {2,3,1,5};
        boolean result = CustomTools.doesArrayContainNum(num, array);
        assertFalse(result);
    }

    @Test
    void doesArrayContainNum_NumberInBorderLineIndex(){
        int num = 4;
        int[] array = {2,3,1,4};
        boolean result = CustomTools.doesArrayContainNum(num, array);
        assertTrue(result);
    }

    //--------------------------------------------------------------
    @Test
    void intArrayCommonMultiplesOfArrayOfNumsInSetRange_Success(){
        int[] arrayOfNums = {3,5};
        int inf = 1;
        int sup = 15;
        int[] expected = {15};
        int[] result = CustomTools.commonMultiplesInSetRange(arrayOfNums,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void intArrayCommonMultiplesOfArrayOfNumsInSetRange_ZeroAsInfNumber(){
        int[] arrayOfNums = {0,3,5};
        int inf = 0;
        int sup = 15;
        int[] expected = {0};
        int[] result = CustomTools.commonMultiplesInSetRange(arrayOfNums,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void intArrayCommonMultiplesOfArrayOfNumsInSetRange_AllValuesSetToZero(){
        int[] arrayOfNums = {0};
        int inf = 0;
        int sup = 0;
        int[] expected = {0};
        int[] result = CustomTools.commonMultiplesInSetRange(arrayOfNums,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void intArrayCommonMultiplesOfArrayOfNumsInSetRange_invertedLimitPoints(){
        int[] arrayOfNums = {3,5,15};
        int inf = 15;
        int sup = 1;
        int[] result = CustomTools.commonMultiplesInSetRange(arrayOfNums,inf,sup);
        int[] expected = {};
        assertArrayEquals(expected,result);
    }
    @Test
    void intArrayCommonMultiplesOfArrayOfNumsInSetRange_zeros(){
        int[] arrayOfNums = {3,0,15};
        int inf = 1;
        int sup = 15;
        int[] expected = {};
        int[] result = CustomTools.commonMultiplesInSetRange(arrayOfNums,inf,sup);
        assertArrayEquals(expected,result);
    }
    @Test
    void intArrayCommonMultiplesOfArrayOfNumsInSetRange_empty(){
        int[] arrayOfNums = {};
        int inf = 1;
        int sup = 15;
        int[] expected = {};
        int[] result = CustomTools.commonMultiplesInSetRange(arrayOfNums,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void intArrayCommonMultiplesOfArrayOfNumsInSetRange_NoMultiples(){
        int[] arrayOfNums = {3};
        int inf = 7;
        int sup = 8;
        int[] expected = {};
        int[] result = CustomTools.commonMultiplesInSetRange(arrayOfNums,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void intArrayCommonMultiplesOfArrayOfNumsInSetRange_RangeValuesAreTheSame(){
        int[] arrayOfNums = {2,1};
        int inf = 10;
        int sup = 10;
        int[] expected = {10};
        int[] result = CustomTools.commonMultiplesInSetRange(arrayOfNums,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void intArrayCommonMultiplesOfArrayOfNumsInSetRange_RangeValuesAreTheSameNoMultiples(){
        int[] arrayOfNums = {3,5};
        int inf = 10;
        int sup = 10;
        int[] expected = {};
        int[] result = CustomTools.commonMultiplesInSetRange(arrayOfNums,inf,sup);
        assertArrayEquals(expected,result);
    }


    //-------------------------------------------


    @Test
    void arrayHasZeroOrNegNumbersZero() {
        int[] a = {0,4,6,7,8,9};
        boolean expected = CustomTools.arrayHasZeroOrNegNumbers(a);
        assertTrue(expected);

    }

    @Test
    void arrayHasZeroOrNegNumbersNegNumber() {
        int[] a = {1,-4,6,7,8,9};
        boolean expected = CustomTools.arrayHasZeroOrNegNumbers(a);
        assertTrue(expected);

    }

    @Test
    void arrayHasZeroOrNegNumbersPositiveArray() {
        int[] a = {1,4,6,7,8,9};
        boolean expected = CustomTools.arrayHasZeroOrNegNumbers(a);
        assertFalse(expected);

    }

    //-------------------------------------------------------------------------

    @Test
    void isEmptyArray() {
        int[] a = {};
        boolean expected = CustomTools.isEmptyArray(a);
        assertTrue(expected);
    }

    @Test
    void isNotAnEmptyArray() {
        int[] a = {1};
        boolean expected = CustomTools.isEmptyArray(a);
        assertFalse(expected);
    }

    //--------------------------------------------------------------

    @Test
    void isInverted() {
        boolean expected = CustomTools.isInverted(12,17);
        assertTrue(expected);
    }

    @Test
    void isNotInverted() {
        boolean expected = CustomTools.isInverted(17,12);
        assertFalse(expected);
    }

    @Test
    void isNotInverted_EqualValues() {
        boolean expected = CustomTools.isInverted(17,17);
        assertFalse(expected);
    }

    //----------------------------------------------------------
    @Test
    void minimumElementInAnArray_Success() {
        int[] array = {5,8,6,1,5};
        int expected = 1;
        int result = CustomTools.minimumElementInAnArray(array);
        assertEquals(expected, result);
    }

    @Test
    void minimumElementInAnArray_NegativeValues() {
        int[] array = {5,-7,6,-2,5};
        int expected = -7;
        int result = CustomTools.minimumElementInAnArray(array);
        assertEquals(expected, result);
    }

    //Teste da ferramenta que dá o maior elemento de uma array---------------------------------------------
    @Test
    void maximumElementInAnArray() {
        int[] array = {5,8,6,1,5};
        int expected = 8;
        int result = CustomTools.maximumElementInAnArray(array);
        assertEquals(expected, result);
    }

    @Test
    void maximumElementInAnArray_FirstValue() {
        int[] array = {5,-7,2,1,4};
        int expected = 5;
        int result = CustomTools.maximumElementInAnArray(array);
        assertEquals(expected, result);
    }

    @Test
    void maximumElementInAnArray_LastValue() {
        int[] array = {4,-7,2,1,5};
        int expected = 5;
        int result = CustomTools.maximumElementInAnArray(array);
        assertEquals(expected, result);
    }


    @Test
    void maximumElementInAnArrayWithNegativeValues() {
        int[] array = {-4,-7,6,-2,5};
        int expected = 6;
        int result = CustomTools.maximumElementInAnArray(array);
        assertEquals(expected, result);
    }

    @Test
    void maximumElementInAnArrayWithLimitValues() {
        int[] array = {5,0,6,2,5};
        int expected = 6;
        int result = CustomTools.maximumElementInAnArray(array);
        assertEquals(expected, result);
    }

    //---------------------------------------------------------------

    @Test
    void isIrregular() {
        int[][] matrizIrregular =  {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9}
        };
        boolean expected = CustomTools.isMatrixIrregular(matrizIrregular);
        assertTrue(expected);

    }

    @Test
    void isIrregularFalse() {
        int[][] matrizIrregular =  {
                {1,2,3},
                {4,5,6},
                {8,9,4}
        };
        boolean expected = CustomTools.isMatrixIrregular(matrizIrregular);
        assertFalse(expected);

    }

    @Test
    void isSquareTrue() {
        int[][] squareMat = {
                {1,2},
                {4,5},

        };
        boolean expected = CustomTools.isASquareMatrix(squareMat);
        assertTrue(expected);

    }

    @Test
    void isSquareFalse_IrregularMatrix() {
        int[][] squareMat =  {
                {1,2},
                {4,5},
                {4},

        };
        boolean expected = CustomTools.isASquareMatrix(squareMat);
        assertFalse(expected);

    }

    @Test
    void isSquare_RegularButNotASquare() {
        int[][] squareMat =  {
                {1,2},
                {4,5},
                {4,8},

        };
        boolean expected = CustomTools.isASquareMatrix(squareMat);
        assertFalse(expected);

    }

    //---------------------------------------------------------------

    @Test
    void isRectangularTrue() {
        int[][] matrix =  {
                {1,2},
                {4,5},
                {4,5},

        };
        boolean expected = CustomTools.isARectangularMatrix(matrix);
        assertTrue(expected);

    }

    @Test
    void isRectangularFalse() {
        int[][] matrix =  {
                {1,2},
                {4}
        };

        boolean expected = CustomTools.isARectangularMatrix(matrix);
        assertFalse(expected);

    }

    @Test
    void isRectangular_IsRegularButNotRectangle() {
        int[][] matrix =  {
                {1,2},
                {4,3}
        };
        boolean expected = CustomTools.isARectangularMatrix(matrix);
        assertFalse(expected);

    }

    //--------------------------------------------------

    @Test
    void isSquareTrueCharMat() {
        char[][] squareMat = {
                {'a','b'},
                {'c','b'},


        };
        boolean expected = CustomTools.isASquareChar(squareMat);
        assertTrue(expected);

    }

    @Test
    void isSquareFalseCharMat() {
        char[][] squareMat = {
                {'a','b'},
                {'c','b'},
                {'c','b'},


        };
        boolean expected = CustomTools.isASquareChar(squareMat);
        assertFalse(expected);

    }

    //-----------------------------------------------------------------
    @Test
    void sumOfEvenDigitsInANumber() {
        int number = 24786;
        int expected = 20;
        int result = CustomTools.sumOfEvenDigitsInAPositiveNumber(number);
        assertEquals(expected, result);
    }
    @Test
    void sumOfEvenDigitsInNumber_RepeatedAlgarisms() {
        int number = 2222;
        int expected = 8;
        int result = CustomTools.sumOfEvenDigitsInAPositiveNumber(number);
        assertEquals(expected, result);
    }

    @Test
    void sumOfEvenDigits_NegativeNumber() {
        int number = -24572;
        int expected = 0;
        int result = CustomTools.sumOfEvenDigitsInAPositiveNumber(number);
        assertEquals(expected, result);
    }

    @Test
    void sumOfEvenDigits_NumberZero() {
        int number = 0;
        int expected = 0;
        int result = CustomTools.sumOfEvenDigitsInAPositiveNumber(number);
        assertEquals(expected, result);
    }

    //--------------------------------------------------

    @Test
    void sumOfOddDigitsInNumber() {
        int number = 24783;
        int expected = 10;
        int result = CustomTools.sumOfOddDigitsInAPositiveNumber(number);
        assertEquals(expected, result);
    }
    @Test
    void sumOfOddDigitsInNumber_NoOdds() {
        int number = 2222;
        int expected = 0;
        int result = CustomTools.sumOfOddDigitsInAPositiveNumber(number);
        assertEquals(expected, result);
    }

    @Test
    void sumOfOddDigits_NegativeNumber() {
        int number = -24572;
        int expected = 0;
        int result = CustomTools.sumOfOddDigitsInAPositiveNumber(number);
        assertEquals(expected, result);
    }

    @Test
    void sumOfOddDigits_NumberZero() {
        int number = 0;
        int expected = 0;
        int result = CustomTools.sumOfOddDigitsInAPositiveNumber(number);
        assertEquals(expected, result);
    }

    //-------------------------------------------------------------

    @Test
    void numberIsPositive_TrueBoarder () {
        boolean expected = true;
        boolean result = CustomTools.numberIsPositive(1);
        assertEquals (expected, result);
    }

    @Test
    void numberIsPositive_FalseZero () {
        boolean expected = false;
        boolean result = CustomTools.numberIsPositive(0);
        assertEquals (expected, result);
    }

    @Test
    void numberIsPositive_FalseNegativeBoarder () {
        boolean expected = false;
        boolean result = CustomTools.numberIsPositive(-1);
        assertEquals (expected, result);
    }

    @Test
    void numberIsNegative_TrueBoarder () {
        boolean expected = true;
        boolean result = CustomTools.numberIsNegative(-1);
        assertEquals (expected, result);
    }

    @Test
    void numberIsNegative_FalseZero () {
        boolean expected = false;
        boolean result = CustomTools.numberIsNegative(0);
        assertEquals (expected, result);
    }

    @Test
    void numberIsNegative_FalseNegativeBoarder () {
        boolean expected = false;
        boolean result = CustomTools.numberIsNegative(1);
        assertEquals (expected, result);
    }

    @Test
    void invertDigitsOrder_Success () {
        int numero = 4321;
        int expected = 1234;
        int result = CustomTools.intInvertedNum(numero);
        assertEquals (expected, result);
    }

    @Test
    void invertDigitsOrder_NegativeNumber () {
        int numero = -4321;
        int expected = -1234;
        int result = CustomTools.intInvertedNum(numero);
        assertEquals (expected, result);
    }

    @Test
    void invertDigitsOrder_NumberZero () {
        int numero = 0;
        int expected = 0;
        int result = CustomTools.intInvertedNum(numero);
        assertEquals (expected, result);
    }

    @Test
    void areTwoMatricesEqualSize_true(){
        //arrange
        int[][] matrix1 = {{1,3,4},{1,2,3}};
        int[][] matrix2 = {{1,3,4},{1,2,3}};
        //act
        boolean result = CustomTools.areTwoMatricesEqualSize(matrix1,matrix2);
        //assert
        assertTrue(result);
    }
    @Test
    void areTwoMatricesEqualSize_false(){
        //arrange
        int[][] matrix1 = {{1,3,4,4},{1,2,3}};
        int[][] matrix2 = {{1,3,4},{1,2,3}};
        //act
        boolean result = CustomTools.areTwoMatricesEqualSize(matrix1,matrix2);
        //assert
        assertFalse(result);
    }

    //----------------------------------------------
    @Test
    void checkIfNumberIsPrime() {
        int number = 11;
        boolean expected = true;
        boolean result = CustomTools.checkIfNumberIsPrime(number);
        assertEquals(expected, result);
    }
    @Test
    void checkIfNumberIsNotPrime() {
        int number = 4;
        boolean expected = false;
        boolean result = CustomTools.checkIfNumberIsPrime(number);
        assertEquals(expected, result);
    }
    @Test
    void checkIfNumberIsPrime_Zero() {
        int number = 0;
        boolean expected = false;
        boolean result = CustomTools.checkIfNumberIsPrime(number);
        assertEquals(expected, result);
    }

    @Test
    void checkIfNumberIsPrime_Number3() {
        int number = 3;
        boolean expected = true;
        boolean result = CustomTools.checkIfNumberIsPrime(number);
        assertEquals(expected, result);
    }

    @Test
    void checkIfNumberIsPrime_Number2() {
        int number = 2;
        boolean expected = true;
        boolean result = CustomTools.checkIfNumberIsPrime(number);
        assertEquals(expected, result);
    }

    @Test
    void checkIfNumberIsPrime_Number1() {
        int number = 1;
        boolean expected = false;
        boolean result = CustomTools.checkIfNumberIsPrime(number);
        assertEquals(expected, result);
    }

    //------------------------------------------------
    @Test
    void primeNumberInMatrixCounter(){
        int[][] matriz = {{3,0,0},{0,19,0},{0,0,0}};
        int expected = 2;
        int result = CustomTools.primeNumberInMatrixCounter(matriz);
        assertEquals(expected, result);
    }
    @Test
    void primeNumberInMatrixCounterWithNoPrimeNumbers(){
        int[][] matriz = {{1,18,24},{25,16,62},{63,64,70}};
        int expected = 0;
        int result = CustomTools.primeNumberInMatrixCounter(matriz);
        assertEquals(expected, result);
    }

    @Test
    void reduceMatrixOrderByOne_BlockFirstLineAndColumn() {
        //Arrange
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        int lineToRemove = 0;
        int columnToRemove = 0;
        int[][] expected = {
                {5,6},
                {8,9}};
        //Act
        int[][] result = CustomTools.reduceMatrixOrderByOne(matrix,lineToRemove,columnToRemove);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void reduceMatrixOrderByOneBlock_SecondLineAndColumn() {
        //Arrange
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        int lineToRemove = 1;
        int columnToRemove = 1;
        int[][] expected = {
                {1,3},
                {7,9}};
        //Act
        int[][] result = CustomTools.reduceMatrixOrderByOne(matrix,lineToRemove,columnToRemove);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void determinantOfAMatrix() {
        //Arrange
        int[][] matrix = {
                {3,5,5},
                {2,4,6},
                {3,5,7}};
        int expected = 4;
        //Act
        int result = CustomTools.determinantOfAMatrix(matrix);
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void determinantOfAMatrix_EqualsZero() {
        //Arrange
        int[][] matrix = {
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4}};
        int expected = 0;
        //Act
        int result = CustomTools.determinantOfAMatrix(matrix);
        //Assert
        assertEquals(expected,result);
    }
}

