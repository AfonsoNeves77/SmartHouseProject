package pt.ipp.isep.dei.examples.basic.domain.Bloco5Test;
import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco5.Array;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {
    /*
    Testing for void methods is done indirectly while testing for methods that return something that
    the intended operation was actually made
    */

    // e ----------------------------------------------------------------
    @Test
    void getValue(){
        //arrange
        int[] array = {1,2,3};
        Array instance = new Array(array);
        int index = 1;
        int expected = 2;
        //Act
        int result = instance.getValue(index);
        //assert
        assertEquals(expected,result);
    }
    @Test
    void getValue_emptyClassArray(){
        //arrange
        int[] array = {};
        Array instance = new Array(array);
        int index = 1;
        int expected = -1;
        //act
        int result = instance.getValue(index);
        //assert
        assertEquals(expected,result);
    }
    @Test
    void getValue_negativeIndex(){
        //arrange
        int[] array = {1,2,3};
        Array instance = new Array(array);
        int index = -1;
        int expected = -1;
        //act
        int result = instance.getValue(index);
        //assert
        assertEquals(expected,result);
    }

    @Test
    void orderingAscendingValues(){
        //arrange
        int[] array = {4,-6,1};
        Array instance = new Array(array);
        int expected = 4;
        int index = 2;
        int option = 1;
        //Act
        instance.sortByOption(option);
        int result = instance.getValue(index);
        //Assert
        assertEquals(result,expected);
    }

    @Test
    void orderingDescendingValues(){
        //Arrange
        int[] array = {4,-6,1};
        Array instance = new Array(array);
        int expected = -6;
        int index = 2;
        int option = 2;
        //Act
        instance.sortByOption(option);
        int result = instance.getValue(index);
        //Assert
        assertEquals(result,expected);
    }

    @Test
    void getValue_indexOutOfBounds(){
        //arrange
        int[] array = {1,2,3};
        Array instance = new Array(array);
        int index = 4;
        int expected = -1;
        //act
        int result = instance.getValue(index);
        //assert
        assertEquals(expected,result);
    }

    // f----------------------------------
    @Test
    void arrayLength(){
        //arrange
        int[] array = {1,2,3};
        Array instance = new Array(array);
        int expected = 3;
        //act
        int result = instance.arrayLength();
        //assert
        assertEquals(expected,result);
    }
    @Test
    void arrayLength_emptyArray(){
        //arrange
        int[] array = {};
        Array instance = new Array(array);
        int expected = 0;
        //act
        int result = instance.arrayLength();
        //assert
        assertEquals(expected,result);
    }
    @Test
    void arrayLength_withAddElement(){
        //arrange
        int[] array = {1,2,3};
        Array instance = new Array(array);
        instance.addElement(1);
        int expected = 4;
        //act
        int result = instance.arrayLength();
        //assert
        assertEquals(expected,result);
    }
    @Test
    void arrayLength_withRemoveElement(){
        //arrange
        int[] array = {1,2,3};
        Array instance = new Array(array);
        instance.removeOccurrenceElement(1);
        int expected = 2;
        //act
        int result = instance.arrayLength();
        //assert
        assertEquals(expected,result);
    }

    // g----------------------------------
    @Test
    void getHighestElementInVector(){
        //Arrange
        int[] vector = {1,2,7,4,5};
        Array instance = new Array(vector);
        int expected = 7;
        //Act
        int result = instance.getHighestElementInVector();
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void getHighestElementInVector_EmptyVector(){
        //Arrange
        Array instance = new Array();
        String expectedMessage = "The vector is empty";
        //Act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            instance.getHighestElementInVector();
        });
        String actualMessage = exception.getMessage();
        //Assert
        assertTrue(actualMessage.contains(expectedMessage));
    }

    // h----------------------------------
    @Test
    void getLowestElementInVector() {
        //Arrange
        int[] vector = {1,2,7,0,-5,1,3};
        Array instance = new Array(vector);
        int expected = -5;
        //Act
        int result = instance.getLowestElementInVector();
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void getLowestElementInVector_EmptyVector(){
        //Arrange
        Array instance = new Array();
        String expectedMessage = "The vector is empty";
        //Act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            instance.getLowestElementInVector();
        });
        String actualMessage = exception.getMessage();
        //Assert
        assertTrue(actualMessage.contains(expectedMessage));
    }

    // i----------------------------------
    @Test
    void getAverageOfVectorElements(){
        //Arrange
        int[] vector = {1,2,3,4,5,6};
        Array instance = new Array(vector);
        double expected = 3.5;
        //Act
        double result = instance.getAverageOfVectorElements();
        //Assert
        assertEquals(expected,result,0.1);
    }

    @Test
    void getAverageOfVectorElements_EmptyVector(){
        //Arrange
        Array instance = new Array();
        double expected = 0.0;
        //Act
        double result = instance.getAverageOfVectorElements();
        //Assert
        assertEquals(expected,result);
    }

    // j----------------------------------
    @Test
    void getAverageOfEvenVectorElements(){
        //Arrange
        int[] vector = {1,2,3,4,5,6};
        Array instance = new Array(vector);
        double expected = 4.0;
        //Act
        double result = instance.getAverageOfEvenVectorElements();
        //Assert
        assertEquals(expected,result,0.1);
    }

    @Test
    void getAverageOfEvenVectorElements_NoEvenElements(){
        //Arrange
        int[] vector = {1,3,5,7};
        Array instance = new Array(vector);
        double expected = 0.0;
        //Act
        double result = instance.getAverageOfEvenVectorElements();
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void getAverageOfEvenVectorElements_EmptyVector(){
        //Arrange
        Array instance = new Array();
        double expected = 0.0;
        //Act
        double result = instance.getAverageOfEvenVectorElements();
        //Assert
        assertEquals(expected,result);
    }

    // k----------------------------------
    @Test
    void getAverageOfOddVectorElements(){
        //Arrange
        int[] vector = {1,2,3,4,5,6};
        Array instance = new Array(vector);
        double expected = 3.0;
        //Act
        double result = instance.getAverageOfOddVectorElements();
        //Assert
        assertEquals(expected,result,0.1);
    }

    @Test
    void getAverageOfOddVectorElements_NoOddElements(){
        //Arrange
        int[] vector = {2,4,6,8};
        Array instance = new Array(vector);
        double expected = 0.0;
        //Act
        double result = instance.getAverageOfOddVectorElements();
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void getAverageOfOddVectorElements_EmptyVector(){
        //Arrange
        Array instance = new Array();
        double expected = 0.0;
        //Act
        double result = instance.getAverageOfOddVectorElements();
        //Assert
        assertEquals(expected,result);
    }

    // l----------------------------------
    @Test
    void getAverageOfMultiplesOfANumberInVector(){
        //Arrange
        int[] vector = {1,2,3,4,5,6};
        Array instance = new Array(vector);
        int number = 2;
        double expected = 4.0;
        //Act
        double result = instance.getAverageOfMultiplesOfANumberInVector(number);
        //Assert
        assertEquals(expected,result,0.1);
    }

    @Test
    void getAverageOfMultiplesOfANumberInVector_NoMultiples(){
        //Arrange
        int[] vector = {2,4,6,8};
        Array instance = new Array(vector);
        int number = 5;
        double expected = 0.0;
        //Act
        double result = instance.getAverageOfMultiplesOfANumberInVector(number);
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void getAverageOfMultiplesOfANumberInVector_EmptyVector(){
        //Arrange
        Array instance = new Array();
        int number = 3;
        double expected = 0.0;
        //Act
        double result = instance.getAverageOfMultiplesOfANumberInVector(number);
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void getAverageOfMultiplesOfANumberInVector_NumberIsZero(){
        //Arrange
        int[] vector = {2,4,6,8};
        Array instance = new Array(vector);
        int number = 0;
        double expected = 0.0;
        //Act
        double result = instance.getAverageOfMultiplesOfANumberInVector(number);
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void getAverageOfMultiplesOfANumberInVector_VectorContainsZero(){
        //Arrange
        int[] vector = {2,4,0,6,8};
        Array instance = new Array(vector);
        int number = 2;
        double expected = 4.0;
        //Act
        double result = instance.getAverageOfMultiplesOfANumberInVector(number);
        //Assert
        assertEquals(expected,result);
    }

    //n)_________________________________________________


    @Test
    void arrayIsEmpty() {
        //Arrange
        Array array = new Array();

        //Act
        boolean result = array.isArrayEmpty();

        //Assert
        assertTrue(result);
    }

    @Test
    void arrayIsNotEmpty() {
        //Arrange
        int[] newArray = {7, 3, -9, 11, 1, 7, -9, -9};
        Array array = new Array(newArray);

        //Act
        boolean result = array.isArrayEmpty();

        //Assert
        assertFalse(result);
    }


    //O---------------------------------------------------------
    @Test
    void isArrayOneElement (){
        //Arrange
        int[] array = {1};
        Array instance = new Array(array);
        //Act
        boolean result = instance.doesArrayContainOnlyOneElement();
        //Assert
        assertTrue(result);
    }

    @Test
    void isArrayOneElement_Empty (){
        //Arrange
        int[] array = {};
        Array instance = new Array(array);
        //Act
        boolean result = instance.doesArrayContainOnlyOneElement();
        //Assert
        assertFalse(result);
    }

    @Test
    void isArrayOneElement_TwoElements (){
        //Arrange
        int[] array = {1,2};
        Array instance = new Array(array);
        //Act
        boolean result = instance.doesArrayContainOnlyOneElement();
        //Assert
        assertFalse(result);
    }


    //P----------------------------------------------------
    @Test
    void isArrayOfEvens (){
        //Arrange
        int[] array = {2,4,6};
        Array instance = new Array(array);
        //Act
        boolean result = instance.doesArrayContainOnlyEvenNumbers();
        //Assert
        assertTrue(result);
    }

    @Test
    void isArrayOfEvens_WithOdd (){
        //Arrange
        int[] array = {2,4,5,6};
        Array instance = new Array(array);
        //Act
        boolean result = instance.doesArrayContainOnlyEvenNumbers();
        //Assert
        assertFalse(result);
    }


    //Q-------------------------------------
    @Test
    void isArrayOfOdds (){
        //Arrange
        int[] array = {1,3,5};
        Array instance = new Array(array);
        //Act
        boolean result = instance.doesArrayContainOnlyOddNumbers();
        //Assert
        assertTrue(result);
    }

    @Test
    void isArrayOfOdds_WithEven (){
        //Arrange
        int[] array = {1,3,4,5};
        Array instance = new Array(array);
        //Act
        boolean result = instance.doesArrayContainOnlyOddNumbers();
        //Assert
        assertFalse(result);
    }


    //r)_______________________________________________________


    @Test
    void noRepeteadNumbersInArray() {

        //Arrange
        int[] newArray = {8,2,4};
        Array array = new Array(newArray);

        //Act
        boolean result = array.doesArrayHaveRepeatedNumbers();

        //Assert
        assertFalse(result);
    }

    @Test
    void arrayHasRepeteadNumbers() {

        //Arrange
        int[] newArray = {8,2,4,2,4};
        Array array = new Array(newArray);

        //Act
        boolean result = array.doesArrayHaveRepeatedNumbers();

        //Assert
        assertTrue(result);
    }

    @Test
    void arrayHasRepeteadNumbers_OneElementArray() {

        //Arrange
        int[] newArray = {1};
        Array array = new Array(newArray);

        //Act
        boolean result = array.doesArrayHaveRepeatedNumbers();

        //Assert
        assertFalse(result);
    }

    @Test
    void arrayHasRepeteadNumbers_TwoEqualElementArray() {

        //Arrange
        int[] newArray = {1,1};
        Array array = new Array(newArray);

        //Act
        boolean result = array.doesArrayHaveRepeatedNumbers();

        //Assert
        assertTrue(result);
    }

    @Test
    void arrayHasRepeteadNumbers_emptyArray() {

        //Arrange
        int[] newArray = {};
        Array array = new Array(newArray);

        //Act
        boolean result = array.doesArrayHaveRepeatedNumbers();

        //Assert
        assertFalse(result);
    }

    //s)____________________________________________________________

    @Test
    void elementsWithHigherNumberOfElementsThanAverage() {


        //Arrange
        int[] initialValues = {0,1,-22,36,90,122};
        Array initialArray = new Array(initialValues);
        int[] expected = {-22,36,90,122};

        //Act

        int[] result = initialArray.elementsWithHigherNumberOfDigitsThanAverage();

        //Assert
        assertArrayEquals(expected,result);


    }

    @Test
    void elementsWithHigherNumberOfElementsThanAverage_EmptyArray() {


        //Arrange
        int[] initialValues = {};
        Array initialArray = new Array(initialValues);
        int[] expected = {};

        //Act

        int[] result = initialArray.elementsWithHigherNumberOfDigitsThanAverage();

        //Assert
        assertArrayEquals(expected,result);


    }

    @Test
    void elementsWithHigherNumberOfElementsThanAverage_NoElements() {


        //Arrange
        int[] initialValues = {1,-7,0,5,1};
        Array initialArray = new Array(initialValues);
        int[] expected = {};

        //Act

        int[] result = initialArray.elementsWithHigherNumberOfDigitsThanAverage();

        //Assert
        assertArrayEquals(expected,result);


    }

    //t)_______________________________________________________________

    @Test
    void elementsBiggerThanMediaOfEvenPercentage() {

        //Arrange
        int[] initialValues = {24,57,69,44};
        Array initialArray = new Array(initialValues);
        int[] expected = {24,44};

        //Act

        int[] result = initialArray.elementsBiggerThanAverageOfEvenPercentage();

        //Assert

        assertArrayEquals(expected,result);

    }

    @Test
    void elementsBiggerThanMediaOfEvenPercentage_EmptyArray() {

        //Arrange
        int[] initialValues = {};
        Array initialArray = new Array(initialValues);
        int[] expected = {};

        //Act

        int[] result = initialArray.elementsBiggerThanAverageOfEvenPercentage();

        //Assert
        assertArrayEquals(expected,result);

    }

    @Test
    void elementsBiggerThanMediaOfEvenPercentage_ZeroAndNegativeNumbers() {

        //Arrange
        int[] inicialValues = {0,1,-22,36,90,122};
        Array inicialArray = new Array(inicialValues);
        int[] expected = {0,-22,122};

        //Act

        int[] result = inicialArray.elementsBiggerThanAverageOfEvenPercentage();

        //Assert
        assertArrayEquals(expected,result);

    }



    //u)_____________________________________________________________

    @Test
    void elementsOfAnArrayComposedOnlyByEvenElements() {

        //Arrange
        int[] inicialValues = {1,2,92,22,79,72,100};
        Array inicialArray = new Array(inicialValues);

        int[] expected = {2,22};

        //Act
        int[] result = inicialArray.elementsWithOnlyEvenDigits();

        //Assert
        assertArrayEquals(expected,result);

    }

    @Test
    void elementsOfAnArrayComposedOnlyByEvenElements_OnlyOddElements() {

        //Arrange
        int[] inicialValues = {5,7,9};
        Array inicialArray = new Array(inicialValues);

        int[] expected = {};

        //Act
        int[] result = inicialArray.elementsWithOnlyEvenDigits();

        //Assert
        assertArrayEquals(expected,result);
    }


    @Test
    void elementsOfAnArrayComposedOnlyByEvenElements_ArrayIsEmpty() {
        //Arrange
        String expected = "The array is empty";
        int[] inicialValues = {};
        Array inicialArray = new Array(inicialValues);

        //Act
        Exception exception = assertThrows(IllegalArgumentException.class,inicialArray::elementsWithOnlyEvenDigits);
        String result = exception.getMessage();

        //Assert
        assertEquals(expected,result);
    }


    @Test
    void arrayHasOnlyNumbersComposedByEvenDigits() {

        //Arrange
        int[] inicialValues = {22,44,44,66,88};
        Array inicialArray = new Array(inicialValues);

        int[] expected = {22,44,44,66,88};

        //Act
        int[] result = inicialArray.elementsWithOnlyEvenDigits();

        //Assert
        assertArrayEquals(expected,result);
    }

    //v)__________________________________________________________

    @Test
    void crescentNumbersInAVector() {

        //Arrange
        int[] inicialValues = {123,3,456,95,89,10,1};
        Array inicialArray = new Array(inicialValues);

        int[] expected = {123,456,89};

        //Act
        int[] result = inicialArray.ascendingNumbersInAVector();

        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void crescentNumbersInAVector_NoCrescentNumbers() {
        //Arrange
        int[] inicialValues = {10,6,-9,11};
        Array inicialArray = new Array(inicialValues);

        int[] expected = {};

        //Act
        int[] result = inicialArray.ascendingNumbersInAVector();

        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void crescentNumbersInAVector_EmptyVector() {

        //Arrange
        int[] inicialValues = {};
        Array inicialArray = new Array(inicialValues);

        int[] expected = {};

        //Act
        int[] result = inicialArray.ascendingNumbersInAVector();

        //Assert
        assertArrayEquals(expected,result);
    }

    //W---------------------------------------------------------------------------------------------------------------------
    @Test
    void capicuaElementsOfTheArray_NoneElements() {

        //Arrange
        int[] initialValues = {32,37,987,852};
        Array array = new Array(initialValues);

        int[] expectedValues = {};

        //Act
        int[] result = array.elementsOfTheArrayThatArePalindrome();

        //Assert
        assertArrayEquals(result, expectedValues);
    }
    @Test
    void capicuaElementsOfTheArray_AllElements() {

        //Arrange
        int[] initialValues = {121,2,44,323,454};
        Array array = new Array(initialValues);

        int[] expectedValues = {121,2,44,323,454};


        //Act
        int[] result = array.elementsOfTheArrayThatArePalindrome();

        //Assert
        assertArrayEquals(result,expectedValues);
    }
    @Test
    void capicuaElementsOfTheArray_SomeElements() {

        //Arrange
        int[] initialValues = {23,43,6,8,45};
        Array array = new Array(initialValues);

        int[] expectedValues = {6,8};

        //Act
        int[] result = array.elementsOfTheArrayThatArePalindrome();

        //Assert
        assertArrayEquals(result,expectedValues);
    }
    @Test
    void capicuaElementsOfTheArray_EmptyArray() {

        //Arrange
        int[] initialValues = {};
        Array array = new Array(initialValues);

        int[] expectedValues = {};

        //Act
        int[] result = array.elementsOfTheArrayThatArePalindrome();

        //Assert
        assertArrayEquals(result,expectedValues);
    }

    //X---------------------------------------------------------------------------------------------------------------------
    @Test
    void elementsWithTheSameDigitsOfTheArray_None() {

        //Arrange
        int[] initialValues = {32,37,987,852};
        Array array = new Array(initialValues);

        int[] expectedValues = {};

        //Act
        int[] result = array.elementsWithTheSameDigits();

        //Assert
        assertArrayEquals(result,expectedValues);
    }
    @Test
    void elementsWithTheSameDigitsOfTheArray_All() {

        //Arrange
        int[] initialValues = {444,55,44,333,555};
        Array array = new Array(initialValues);

        int[] expectedValues = {444,55,44,333,555};

        //Act
        int[] result = array.elementsWithTheSameDigits();

        //Assert
        assertArrayEquals(result,expectedValues);
    }
    @Test
    void elementsWithTheSameDigitsOfTheArray_Some() {

        //Arrange
        int[] initialValues = {22,43,6,8,45};
        Array array = new Array(initialValues);

        int[] expectedValues = {22,6,8};

        //Act
        int[] result = array.elementsWithTheSameDigits();

        //Assert
        assertArrayEquals(result,expectedValues);
    }

    @Test
    void elementsWithTheSameDigitsOfTheArray_EmptyArray() {

        //Arrange
        int[] initialValues = {};
        Array array = new Array(initialValues);

        int[] expectedValues = {};

        //Act
        int[] result = array.elementsWithTheSameDigits();

        //Assert
        assertArrayEquals(result,expectedValues);
    }
//Y---------------------------------------------------------------------------------------------------------------------
    @Test
    void elementsThatAreNotArmstrongNumbers_None() {

        //Arrange
        int[] initialValues = {25,27,80,95};
        Array array = new Array(initialValues);

        int[] expectedValues = {25,27,80,95};

        //Act
        int[] result = array.elementsThatAreNotArmstrongNumbers();

        //Assert
        assertArrayEquals(result,expectedValues);
    }
    @Test
    void elementsThatAreNotArmstrongNumbers_All() {

        //Arrange
        int[] initialValues = {153,370,371};
        Array array = new Array(initialValues);

        int[] expectedValues = {};

        //Act
        int[] result = array.elementsThatAreNotArmstrongNumbers();

        //Assert
        assertArrayEquals(result,expectedValues);
    }
    @Test
    void elementsThatAreNotArmstrongNumbers_Some() {

        //Arrange
        int[] initialValues = {153,43,6,8,371};
        Array array = new Array(initialValues);

        int[] expectedValues = {43};

        //Act
        int[] result = array.elementsThatAreNotArmstrongNumbers();

        //Assert
        assertArrayEquals(result,expectedValues);
    }
    @Test
    void elementsThatAreNotArmstrongNumbers_EmptyArray() {

        //Arrange
        int[] initialValues = {};
        Array array = new Array(initialValues);

        int[] expectedValues = {};

        //Act
        int[] result = array.elementsThatAreNotArmstrongNumbers();

        //Assert
        assertArrayEquals(result,expectedValues);
    }

//Z---------------------------------------------------------------------------------------------------------------------
    @Test
    void elementsThatAreAscendingMoreThenNTimes_None() {
        //Arrange
        int[] initialValues = {231,589,4789,4569};
        Array array = new Array(initialValues);
        int[] expectedValues = {};
        int sequence = 100;
        //Act
        int[] result = array.elementsThatAreAscendingMoreThanNTimes(sequence);
        //Assert
        assertArrayEquals(result,expectedValues);
    }
    @Test
    void elementsThatAreAscendingMoreThenNTimes_All() {
        //Arrange
        int[] initialValues = {145,145678,14789};
        Array array = new Array(initialValues);
        int[] expectedValues = {145,145678,14789};
        int sequence = 2;
        //Act
        int[] result = array.elementsThatAreAscendingMoreThanNTimes(sequence);
        //Assert
        assertArrayEquals(result,expectedValues);
    }
    @Test
    void elementsThatAreAscendingMoreThenNTimes_Some() {
        //Arrange
        int[] initialValues = {1234,43,6,8,1478};
        Array array = new Array(initialValues);
        int[] expectedValues = {1234,1478};
        int sequence = 4;
        //Act
        int[] result = array.elementsThatAreAscendingMoreThanNTimes(sequence);
        //Assert
        assertArrayEquals(result,expectedValues);
    }

    @Test
    void elementsThatAreAscendingMoreThenNTimes_EmptyArray() {
        //Arrange
        int[] initialValues = {};
        Array array = new Array(initialValues);
        int[] expectedValues = {};
        int sequence = 4;
        //Act
        int[] result = array.elementsThatAreAscendingMoreThanNTimes(sequence);
        //Assert
        assertArrayEquals(result,expectedValues);
    }
    @Test
    void elementsThatAreAscendingMoreThenNTimes_partiallyAscending() {
        //Arrange
        int[] initialValues = {1,2,3,1234321};
        Array array = new Array(initialValues);
        int[] expectedValues = {1234321};
        int sequence = 4;
        //Act
        int[] result = array.elementsThatAreAscendingMoreThanNTimes(sequence);
        //Assert
        assertArrayEquals(result,expectedValues);
    }

//AA--------------------------------------------------------------------------------------------------------------------
    @Test
    void checkIfArraysAreTheSame_True() {
        //Arrange
        int[] initialArray = {1, 2, 3, 4, 5};
        Array array = new Array(initialArray);
        //Act
        int[] newArray = {1, 2, 3, 4, 5};
        boolean result = array.checkIfArraysAreTheSame(newArray);
        //Assert
        assertTrue(result);
    }

    @Test
    void checkIfArraysAreTheSame_False(){
        //Arrange
        int [] initialArray = {1,2,3,4,5};
        Array array = new Array(initialArray);
        int[] newArray = {1,1,3,4,5};
        //Act
        boolean result = array.checkIfArraysAreTheSame(newArray);
        //Assert
        assertFalse(result);
    }

    @Test
    void checkIfArraysAreTheSame_EmptyArray(){
        //Arrange
        int [] initialArray = {};
        Array array = new Array(initialArray);
        int[] newArray = {};
        //Act
        boolean result = array.checkIfArraysAreTheSame(newArray);
        //Assert
        assertTrue(result);
    }

    @Test
    void checkIfArraysAreTheSame_DifferentArrayLengths(){
        //Arrange
        int [] initialArray = {1,2,3};
        Array array = new Array(initialArray);
        int[] newArray = {1,2,3,4};
        //Act
        boolean result = array.checkIfArraysAreTheSame(newArray);
        //Assert
        assertFalse(result);
    }

}
