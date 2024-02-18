package pt.ipp.isep.dei.examples.basic.domain.Bloco5Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio18;
import pt.ipp.isep.dei.examples.basic.domain.Bloco5.CustomTools;

import static org.junit.jupiter.api.Assertions.*;

class CustomToolsTest {
    @Test
    void isElementPresent(){
        //arrange
        int element = 2;
        int[] array = {1,2,3};
        //act
        boolean result = CustomTools.isNumInArray(array,element);
        //assertEquals
        assertTrue(result);
    }
    @Test
    void isElementPresent_notPresent(){
        //arrange
        int element = 4;
        int[] array = {1,2,3};
        //act
        boolean result = CustomTools.isNumInArray(array,element);
        //assertEquals
        assertFalse(result);
    }
    @Test
    void isElementPresent_emptyArray(){
        //arrange
        int element = 4;
        int[] array = {};
        //act
        boolean result = CustomTools.isNumInArray(array,element);
        //assertEquals
        assertFalse(result);
    }
    // ------------------------------------------------------------------------
    @Test
    void checkIfNumberIsCapicua_True() {
        //Arrange
        int number = 121;
        //Act
        boolean result = CustomTools.checkIfNumberIsPalindrome(number);
        //Assert
        assertTrue(result);
    }
    @Test
    void checkIfNumberIsCapicua_False() {
        //Arrange
        int number = 48652;
        //Act
        boolean result = CustomTools.checkIfNumberIsPalindrome(number);
        //Assert
        assertFalse(result);
    }
    @Test
    void checkIfNumberIsCapicua_OnlyOneDigit() {
        //Arrange
        int number = 9;
        //Act
        boolean result = CustomTools.checkIfNumberIsPalindrome(number);
        //Assert
        assertTrue(result);
    }
//----------------------------------------------------------------------------------------------------------------------
    @Test
    void intArrayCrop_Success(){
        //Arrange
        int[] arrayToCrop = {1,2,3,4,5,0,0,0,0,0};
        int numOfOccupiedIndexes = 5;
        int[] expected = {1,2,3,4,5};
        //Act
        int[] result = CustomTools.intArrayCrop(arrayToCrop, numOfOccupiedIndexes);
        //Assert
        assertArrayEquals(expected,result);
    }
    @Test
    void intArrayCrop_ArrayTooShort(){
        //Arrange
        int[] arrayToCrop = {1,2,3,4,5};
        int numOfOccupiedIndexes = 7;
        int[] expected = {};
        //Act
        int[] result = CustomTools.intArrayCrop(arrayToCrop,  numOfOccupiedIndexes);
        //Assert
        assertArrayEquals(expected,result);
    }
    @Test
    void intArrayCrop_NoNeedForCrop(){
        //Arrange
        int[] arrayToCrop = {1,2,3,4,5};
        int numOfOccupiedIndexes = 5;
        int[] expected = {1,2,3,4,5};
        //Act
        int[] result = CustomTools.intArrayCrop(arrayToCrop, numOfOccupiedIndexes);
        //Assert
        assertArrayEquals(expected,result);
    }

//----------------------------------------------------------------------------------------------------------------------
    @Test
    void checkIfNumberIsComposedByTheSameDigits_True() {
        //Arrange
        int number = 222;
        //Act
        boolean result = CustomTools.checkIfNumberIsComposedByTheSameDigits(number);
        //Assert
        assertTrue(result);
    }
    @Test
    void checkIfNumberIsComposedByTheSameDigits_False() {
        //Arrange
        int number = 48652;
        //Act
        boolean result = CustomTools.checkIfNumberIsComposedByTheSameDigits(number);
        //Assert
        assertFalse(result);
    }
    @Test
    void checkIfNumberIsComposedByTheSameDigits_OnlyOneDigit() {
        //Arrange
        int number = 9;
        //Act
        boolean result = CustomTools.checkIfNumberIsComposedByTheSameDigits(number);
        //Assert
        assertTrue(result);
    }
    @Test
    void checkIfNumberIsComposedByTheSameDigits_zero() {
        //Arrange
        int number = 0;
        boolean expected = true;
        //Act
        boolean result = CustomTools.checkIfNumberIsComposedByTheSameDigits(number);
        //Assert
        assertEquals(expected, result);
    }

 //___________________________________________________________________________________________________

    @Test
    void isNumberAnAscendingSequence() {

        //Arrange
        int number = 123;

        //Act
        boolean result = CustomTools.isNumberAnAscendingSequence(number);

        //Assert
        assertTrue(result);
    }

    @Test
    void isNumberAnAscendingSequence_CrescentNegativeNumber() {

        //Arrange
        int number = -321;
        //In negative numbers case the logic is reversed -3 is smaller than -2 and so on...

        //Act
        boolean result = CustomTools.isNumberAnAscendingSequence(number);

        //Assert
        assertTrue(result);
    }

    @Test
    void isNumberAnAscendingSequence_DescendingNegativeNumber() {

        //Arrange
        int number = -123;

        //Act
        boolean result = CustomTools.isNumberAnAscendingSequence(number);

        //Assert
        assertFalse(result);
    }

    @Test
    void isNumberAnAscendingSequence_OneDigitNumberNegativeNumber() {

        //Arrange
        int number = -9;

        //Act
        boolean result = CustomTools.isNumberAnAscendingSequence(number);

        //Assert
        assertFalse(result);
    }

    @Test
    void isNumberAnAscendingSequence_OneDigitNumberPositiveNumber() {

        //Arrange
        int number = 9;

        //Act
        boolean result = CustomTools.isNumberAnAscendingSequence(number);

        //Assert
        assertFalse(result);
    }
    @Test
    void isNumberAnAscendingSequence_partiallyAscending() {

        //Arrange
        int number = 12321;

        //Act
        boolean result = CustomTools.isNumberAnAscendingSequence(number);

        //Assert
        assertFalse(result);
    }
    //_________________________________________

    @Test
    void numberOfDigitsInANumber(){

        //Arrange
        int number = 99090;
        int expected = 5;

        //Act
        int result = CustomTools.numberOfDigitsInANumber(number);

        //Assert
        assertEquals(expected,result);
    }

    @Test
    void numberOfDigitsInANumber_SingleNegativeNumber(){

        //Arrange
        int number = -9;
        int expected = 1;

        //Act
        int result = CustomTools.numberOfDigitsInANumber(number);

        //Assert
        assertEquals(expected,result);
    }

    @Test
    void numberOfDigitsInANumber_SinglePositiveNumber(){

        //Arrange
        int number =  9;
        int expected = 1;

        //Act
        int result = CustomTools.numberOfDigitsInANumber(number);

        //Assert
        assertEquals(expected,result);
    }

    @Test
    void numberOfDigitsInANumber_BorderlinePositiveNumber(){

        //Arrange
        int number =  10;
        int expected = 2;

        //Act
        int result = CustomTools.numberOfDigitsInANumber(number);

        //Assert
        assertEquals(expected,result);
    }

    @Test
    void isArmstrong_True(){
        //Arrange
        int num = 153;

        //Act
        boolean result = CustomTools.checkIfIsArmstrongNumber(num);

        //Assert
        assertTrue(result);
    }

    @Test
    void isArmstrong_False(){
        //Arrange
        int num = 144;

        //Act
        boolean result = CustomTools.checkIfIsArmstrongNumber(num);

        //Assert
        assertFalse(result);
    }

    @Test
    void isArmstrong_Number0(){
        //Arrange
        int num = 0;

        //Act
        boolean result = CustomTools.checkIfIsArmstrongNumber(num);

        //Assert
        assertTrue(result);
    }
    @Test
    void checkIndexNum(){
        //arrange
        int num = 1;
        int[] array = {1,2,3};
        int expected = 0;
        //act
        int result = CustomTools.checkIndexNum(num,array);
        //assert
        assertEquals(expected,result);
    }
    @Test
    void checkIndexNum_notFound(){
        //arrange
        int num = 4;
        int[] array = {1,2,3};
        int expected = -1;
        //act
        int result = CustomTools.checkIndexNum(num,array);
        //assert
        assertEquals(expected,result);
    }
    @Test
    void checkIndexNum_emptyArray(){
        //arrange
        int num = 4;
        int[] array = {};
        int expected = -1;
        //act
        int result = CustomTools.checkIndexNum(num,array);
        //assert
        assertEquals(expected,result);
    }
    @Test
    void checkIndexNum_numZero(){
        //arrange
        int num = 0;
        int[] array = {3,1,2,0};
        int expected = 3;
        //act
        int result = CustomTools.checkIndexNum(num,array);
        //assert
        assertEquals(expected,result);
    }
    @Test
    void sumElements(){
        //arrange
        int[] array = {1,2,3};
        int expected = 6;
        //act
        int result = CustomTools.sumElements(array);
        //assert
        assertEquals(expected,result);
    }
    @Test
    void sumElements_emptyArray() {
        //arrange
        int[] array = {};
        int expected = 0;
        //act
        int result = CustomTools.sumElements(array);
        //assert
        assertEquals(expected, result);
    }
    @Test
    void numberOfAlgarismsInAnNumber_One(){
        //arrange
        int num = 1;
        int expected = 1;
        //act
        int result = CustomTools.digitCount(num);
        //assert
        assertEquals(expected, result);
    }
    @Test
    void numberOfAlgarismsInAnNumber_MultipleAlgarisms() {
        //arrange
        int num = 253;
        int expected = 3;
        //act
        int result = CustomTools.digitCount(num);
        //assert
    }

    @Test
    void numberOfDigitsInAnNumber_One(){
        int num = 1;
        int expected = 1;
        int result = CustomTools.digitCount(num);
        assertEquals(expected, result);
    }
    @Test
    void numberOfDigitsInAnNumber_MultipleDigits(){
        int num = 253;
        int expected = 3;
        int result = CustomTools.digitCount(num);
        assertEquals(expected, result);
    }

    @Test
    void diagonalSizeOfAMatrix_2By3(){
        //Arrange
        int[][] matrix = {
                {1,3,1},
                {2,2,4}
        };
        int expected = 2;
        //Act
        int result = CustomTools.diagonalSizeOfAMatrix(matrix);
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void diagonalSizeOfAMatrix_3By2(){
        //Arrange
        int[][] matrix = {
                {1,3},
                {2,2},
                {4,5}
        };
        int expected = 2;
        //Act
        int result = CustomTools.diagonalSizeOfAMatrix(matrix);
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void mainDiagonalOfAMatrix_3By2(){
        //Arrange
        int[][] matrix = {
                {1,3},
                {2,2},
                {4,5}
        };
        int[] expected = {1,2};
        //Act
        int[] result = CustomTools.mainMatrixDiagonal(matrix);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void mainDiagonalOfAMatrix_3By4(){
        //Arrange
        int[][] matrix = {
                {1,3,5,8},
                {2,2,6,9},
                {4,5,2,1}
        };
        int[] expected = {1,2,2};
        //Act
        int[] result = CustomTools.mainMatrixDiagonal(matrix);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void secondaryDiagonalOfAMatrix_3By2(){
        //Arrange
        int[][] matrix = {
                {1,3},
                {2,2},
                {4,5}
        };
        int[] expected = {3,2};
        //Act
        int[] result = CustomTools.secondaryMatrixDiagonal(matrix);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void secondaryDiagonalOfAMatrix_3By4(){
        //Arrange
        int[][] matrix = {
                {1,3,5,8},
                {2,2,6,9},
                {4,5,2,1}
        };
        int[] expected = {8,6,5};
        //Act
        int[] result = CustomTools.secondaryMatrixDiagonal(matrix);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void invertArray(){
        int[] array = {1,2,3,4,5};
        int[] expected = {5,4,3,2,1};
        int[] result = CustomTools.invertArray(array);
        assertArrayEquals(expected,result);
    }

    @Test
    void invertEmptyArray(){
        int[] array = {};
        int[] expected = {  };
        int[] result = CustomTools.invertArray(array);
        assertArrayEquals(expected,result);
    }



}
