package pt.ipp.isep.dei.examples.basic.domain.Bloco5Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco5.Matrix;
import pt.ipp.isep.dei.examples.basic.domain.Bloco5.MatrixOfVector;

import static org.junit.jupiter.api.Assertions.*;

public class MatrixOfVectorTest {

    // c -----------------------------------------------

    @Test
    void addElementsToMatrix_AddElementToEmptyMatrix(){
        // arrange
        int[][] matrix = {};
        MatrixOfVector instance = new MatrixOfVector(matrix);
        // act
       instance.addElementToMatrix(1,0);
       boolean result = instance.isMatrixEmpty();
        // assert
        assertFalse(result);
    }

    @Test
    void addElementsToMatrix_AddElement(){
        // arrange
        int[][] matrix = {
                {1,2,3},
                {1,2,3},
                {1,2,3},
        };
        MatrixOfVector instance = new MatrixOfVector(matrix);
        // act
        instance.addElementToMatrix(1,2);
        boolean result = instance.isMatrixSquare();
        // assert
        assertFalse(result);
    }

    @Test
    void addElementsToMatrix_LineToInsertBiggerThanMatrixLenght(){
        // arrange
        int[][] matrix = {
                {1,2,3},
        };
        MatrixOfVector instance = new MatrixOfVector(matrix);
        String result = "Error: Invalid Argument";
        // act
        Exception exception = assertThrows(IllegalArgumentException.class,() -> instance.addElementToMatrix(1,2));
        String expected = exception.getMessage();
        // assert
        assertEquals(result,expected);
    }

    @Test
    void addElementsToMatrix_LineToInsertIsNegative(){
        // arrange
        int[][] matrix = {
                {1,2,3},
        };
        MatrixOfVector instance = new MatrixOfVector(matrix);
        String result = "Error: Invalid Argument";
        // act
        Exception exception = assertThrows(IllegalArgumentException.class,() -> instance.addElementToMatrix(1,-2));
        String expected = exception.getMessage();
        // assert
        assertEquals(result,expected);
    }

    // d ------------------------------------------
   //tested indirecty using isMatrixSquare
    @Test
    void testingRemoveElement() {
        //Arrange
        int[][] matrix = {
                {1,2,3,4},
                {1,4,7},
                {1,3,5}
        };
        MatrixOfVector instance = new MatrixOfVector(matrix);
        instance.removeFirstOccurrenceNum(4);
        //Act
        boolean result = instance.isMatrixSquare();
        //Assert
        assertTrue(result);
    }

    // e ---------------------------------------
    @Test
    void isEmpty(){
        // arrange
        int[][] matrix = {};
        MatrixOfVector instance = new MatrixOfVector(matrix);
        // act
        boolean result = instance.isMatrixEmpty();
        // assert
        assertTrue(result);
    }
    @Test
    void isEmpty_testingFalse(){
        // arrange
        int[][] matrix = {{1,2,3},{1,2,3}};
        MatrixOfVector instance = new MatrixOfVector(matrix);
        // act
        boolean result = instance.isMatrixEmpty();
        // assert
        assertFalse(result);
    }

    // f ----------------------------------
    @Test
    void getBiggestElementInMatrix(){
        //arrange
        int[][] matrix = {
                {1,2,3},
                {4,5,6}
        };
        MatrixOfVector instance = new MatrixOfVector(matrix);
        int expected = 6;
        //act
        int result = instance.getBiggestElementInMatrix();
        //assert
        assertEquals(expected,result);
    }
    @Test
    void getBiggestElementInMatrix_EmptyArray(){
        //arrange
        MatrixOfVector instance = new MatrixOfVector();
        String expectedMessage = "empty";
        //act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            instance.getBiggestElementInMatrix();
        });
        String actualMessage = exception.getMessage();
        //assert
        assertTrue(actualMessage.contains(expectedMessage));
    }

    // g -------------------------------------------------

    @Test
    void searchMatSmallestElement_EveryLineIsFull() {
        //Arrange
        int[][] matrix = {
                {200},
                {-8, 9},
                {700, 9},
                {4, -9, 55},
                {-1},
        };
        MatrixOfVector matrix1 = new MatrixOfVector(matrix);
        int expected = -9;
        //Act
        int result = matrix1.searchMatSmallestElement();
        //Assert
        assertEquals(expected, result);
    }

    @Test
    void searchMatSmallestElement_EmptyMatrix() {

        //Arrange
        MatrixOfVector matrix1 = new  MatrixOfVector();
        String expectedMessage = "This matrix is empty.";

        //Act
        Exception exception = assertThrows(IllegalArgumentException.class, matrix1::searchMatSmallestElement);
        String actualMessage = exception.getMessage();

        //Assert
        assertEquals(expectedMessage, actualMessage);
    }

    // h ---------------------------------------------------

    @Test
    void averageOfMatrix(){
        // arrange
        int[][] matrix = {{1,2,3},
                          {1,2,3}};
        MatrixOfVector instance = new MatrixOfVector(matrix);
        double expected = 2;
        // act
       double result = instance.averageOfAMatrix();
        // assert
        assertEquals(expected,result);
    }

    @Test
    void averageOfMatrix_MatrixIsEmpty(){
        // arrange
        MatrixOfVector instance = new MatrixOfVector();
        double expected = 0;
        // act
        double result = instance.averageOfAMatrix();
        // assert
        assertEquals(expected,result);
    }

    // i ---------------------------------------------
    @Test
    void homologousLine() {
        //arrange
        int[][] matrix = {{1, 2, 3}, {3, 4, 5}, {4, 5, 6}};
        ;
        MatrixOfVector instance = new MatrixOfVector(matrix);
        int[] expected = {6, 12, 15};
        //act
        int[] result = instance.homologousLine();
        //assert
        assertArrayEquals(expected, result);
    }

    @Test
    void homologousLine_differentSizedLines() {
        //arrange
        int[][] matrix = {{1, 2}, {3, 4, 5}, {4, 5, 6, 1}};
        ;
        MatrixOfVector instance = new MatrixOfVector(matrix);
        int[] expected = {3, 12, 16};
        //act
        int[] result = instance.homologousLine();
        //assert
        assertArrayEquals(expected, result);
    }

    @Test
    void homologousLine_emptyClassMatrix() {
        //arrange
        int[][] matrix = {};
        ;
        MatrixOfVector instance = new MatrixOfVector(matrix);
        int[] expected = {};
        //act
        int[] result = instance.homologousLine();
        //assert
        assertArrayEquals(expected, result);
    }

    // j ----------------------------------------
    @Test
    void sumOfElementsInEachMatrixColumn() {
        //Arrange
        int[][] matrix = {
                {1,2,3},
                {1,4},
                {1,3,5,6}
        };
        MatrixOfVector instance = new MatrixOfVector(matrix);
        int[] expected = {3,9,8,6};
        //Act
        int[] result = instance.sumOfElementsInEachMatrixColumn();
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void matrixRotationByMinusNinetyDegrees() {
        //Arrange
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        MatrixOfVector instance = new MatrixOfVector(matrix);
        instance.matrixRotationByMinusNinetyDegrees();
        int[] expected = {24,15,6};
        //Act
        int[] result = instance.sumOfElementsInEachMatrixColumn();
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void matrixRotationByMinusNinetyDegrees_EmptyMatrix() {
        //Arrange
        MatrixOfVector instance = new MatrixOfVector();
        int[] expected = {};
        //Act
        int[] result = instance.sumOfElementsInEachMatrixColumn();
        //Assert
        assertArrayEquals(expected,result);
    }


    // k -----------------------------------
    @Test
    void getIndexOfMaximumLineSumValueInMatrix (){
        //Arrange
        int[][] matrix = {
                {1,20},
                {1000},
                {-50,77},
                {100,56,90}
        };
        MatrixOfVector instance = new MatrixOfVector(matrix);
        int expected = 1;
        //Act
        int result = instance.getMatrixLineIndexWithHighestSum();
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void getIndexOfMaximumLineSumValueInMatrix_EmptyArray(){
        //arrange
        MatrixOfVector instance = new MatrixOfVector();
        String expectedMessage = "empty";
        //act
        Exception exception = assertThrows(IllegalArgumentException.class, instance::getMatrixLineIndexWithHighestSum);
        String actualMessage = exception.getMessage();
        //assert
        assertTrue(actualMessage.contains(expectedMessage));
    }

    // l --------------------------------------------------

    @Test
    void isMatrixSquare() {
        //Arrange
        int[][] matrix = {
                {1,2,3},
                {1,4,7},
                {1,3,5}
        };
        MatrixOfVector instance = new MatrixOfVector(matrix);
        //Act
        boolean result = instance.isMatrixSquare();
        //Assert
        assertTrue(result);
    }

    @Test
    void matrixIsNotSquare() {
        //Arrange
        int[][] matrix = {
                {1, 2, 3},
                {1, 4, 7},
                {1, 3, 5, 9}
        };
        MatrixOfVector instance = new MatrixOfVector(matrix);
        //Act
        boolean result = instance.isMatrixSquare();
        //Assert
        assertFalse(result);
    }

    // m ------------------------------------------------
    @Test
    void symmetricMatrix_true() {
        //Arrange
        int[][] initialMatrix = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 6}};
        MatrixOfVector matrix = new MatrixOfVector(initialMatrix);

        //Act
        boolean result = matrix.symmetricMatrix();

        //Assert
        assertTrue(result);

    }

    @Test
    void symmetricMatrix_false() {
        //Arrange
        int[][] initialMatrix = {
                {1, 2, 3},
                {8, 0, 0},
                {2, 77, 5},
                };
        MatrixOfVector matrix = new MatrixOfVector(initialMatrix);
        //Act
        boolean result = matrix.symmetricMatrix();
        //Assert
        assertFalse(result);
    }

    @Test
    void symmetricMatrix_EmptyMatrix() {
        //Arrange
        MatrixOfVector matrix = new MatrixOfVector();
        //Act
        boolean result = matrix.symmetricMatrix();
        //Assert
        assertFalse(result);
    }

    @Test
    void symmetricMatrix_NotSquareMatrix() {
        //Arrange
        int[][] initialMatrix = {{1, 2},
                {2, 5, 3},
                {1, 2}};
        MatrixOfVector matrix = new MatrixOfVector(initialMatrix);

        //Act
        boolean result = matrix.symmetricMatrix();

        //Assert
        assertFalse(result);

    }

    // n -------------------------------------------------
    @Test
    void quantityNonNullElementsInMainDiagonal() {
        //arrange
        int[][] matrix = {{1, 2, 3}, {3, 4, 5}, {4, 5, 6}};
        MatrixOfVector instance = new MatrixOfVector(matrix);
        int expected = 3;
        //act
        int result = instance.quantityNonNullElementsInMainDiagonal();
        //assert
        assertEquals(expected, result);
    }
    @Test
    void quantityNonNullElementsInMainDiagonal_allZeroes() {
        //arrange
        int[][] matrix = {{0,0,0},{0,0,0},{0,0,0}};
        MatrixOfVector instance = new MatrixOfVector(matrix);
        int expected = 0;
        //act
        int result = instance.quantityNonNullElementsInMainDiagonal();
        //assert
        assertEquals(expected, result);
    }
    @Test
    void quantityNonNullElementsInMainDiagonal_emptyClassArray() {
        //arrange
        int[][] matrix = {};
        MatrixOfVector instance = new MatrixOfVector(matrix);
        int expected = -1;
        //act
        int result = instance.quantityNonNullElementsInMainDiagonal();
        //assert
        assertEquals(expected, result);
    }
    @Test
    void quantityNonNullElementsInMainDiagonal_irregularMatrix() {
        //arrange
        int[][] matrix = {{1,2,3},{1,2,3,4},{6,7,8}};
        MatrixOfVector instance = new MatrixOfVector(matrix);
        int expected = -1;
        //act
        int result = instance.quantityNonNullElementsInMainDiagonal();
        //assert
        assertEquals(expected, result);
    }

    // o -----------------------------------------------------------
    @Test
    void areMainAndSecondaryDiagonalsEqual_2By3Matrix(){
        //Arrange
        int[][] matrix = {
                {1,3,1},
                {2,2,4}
        };
        MatrixOfVector instance = new MatrixOfVector(matrix);
        //Act
        boolean result = instance.areMainAndSecondaryDiagonalsEqual();
        //Assert
        assertTrue(result);
    }


    @Test
    void areMainAndSecondaryDiagonalsEqual_4By3Matrix(){
        //Arrange
        int[][] matrix = {
                {1,3,1},
                {2,2,4},
                {9,5,9},
                {4,2,3}
        };
        MatrixOfVector instance = new MatrixOfVector(matrix);
        //Act
        boolean result = instance.areMainAndSecondaryDiagonalsEqual();
        //Assert
        assertTrue(result);
    }

    @Test
    void areMainAndSecondaryDiagonalsEqual_False(){
        //Arrange
        int[][] matrix = {
                {1,3,1},
                {2,2,4},
                {9,5,4},
                {4,2,3}
        };
        MatrixOfVector instance = new MatrixOfVector(matrix);
        //Act
        boolean result = instance.areMainAndSecondaryDiagonalsEqual();
        //Assert
        assertFalse(result);
    }

    @Test
    void areMainAndSecondaryDiagonalsEqual_IrregularMatrix(){
        //Arrange
        int[][] matrix = {
                {1,3,1},
                {2},
                {9,5,4},
                {4,2,3}
        };
        MatrixOfVector instance = new MatrixOfVector(matrix);
        String expectedMessage = "not rectangular";
        //Act
        Exception exception = assertThrows(IllegalArgumentException.class, instance::areMainAndSecondaryDiagonalsEqual);
        String result = exception.getMessage();
        //Assert
        assertTrue(result.contains(expectedMessage));
    }

    @Test
    void areMainAndSecondaryDiagonalsEqual_EmptyMatrix(){
        //Arrange
        MatrixOfVector instance = new MatrixOfVector();
        String expectedMessage = "is empty";
        //Act
        Exception exception = assertThrows(IllegalArgumentException.class, instance::areMainAndSecondaryDiagonalsEqual);
        String result = exception.getMessage();
        //Assert
        assertTrue(result.contains(expectedMessage));
    }

    // p ---------------------------------------------------------
    @Test
    void getElementsInMatrixWithMoreDigitsThanMatrixAverageDigits() {
        //Arrange
        int[][] matrix = {
                {12, 3, 1},
                {2, 22, 4},
                {9, 5, 43},
                {4, 2, 35}
        };
        MatrixOfVector instance = new MatrixOfVector(matrix);
        int[] expected = {12,22,43,35};
        //Act
        int[] result = instance.getElementsInMatrixWithMoreDigitsThanMatrixAverageDigits();
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void getElementsInMatrixWithMoreDigitsThanMatrixAverageDigits_IrregularMatrix() {
        //Arrange
        int[][] matrix = {
                {1, 3, 1},
                {22},
                {9, 55, 4},
                {4, 2, 3}
        };
        MatrixOfVector instance = new MatrixOfVector(matrix);
        int[] expected = {22,55};
        //Act
        int[] result = instance.getElementsInMatrixWithMoreDigitsThanMatrixAverageDigits();
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void getElementsInMatrixWithMoreDigitsThanMatrixAverageDigits_EmptyMatrix(){
        //Arrange
        MatrixOfVector instance = new MatrixOfVector();
        String expectedMessage = "Empty";
        //Act
        Exception exception = assertThrows(IllegalArgumentException.class,
                instance::getElementsInMatrixWithMoreDigitsThanMatrixAverageDigits);
        String result = exception.getMessage();
        //Assert
        assertTrue(result.contains(expectedMessage));
    }

    @Test
    void getElementsInMatrixWithMoreDigitsThanMatrixAverageDigits_NoElements() {
        //Arrange
        int[][] matrix = {
                {1, 3, 1},
                {2, 2, 4},
                {9, 5, 4},
                {4, 2, 3}
        };
        MatrixOfVector instance = new MatrixOfVector(matrix);
        int[] expected = {};
        //Act
        int[] result = instance.getElementsInMatrixWithMoreDigitsThanMatrixAverageDigits();
        //Assert
        assertArrayEquals(expected,result);
    }

    // q -------------------------------------------------------------
    @Test
    void elementsBiggerThanAverageOfEvenPercentageNumbersInMatrix() {

        //Arrange
        int[][] initialValues = {
                {1,2,4},
                {200,6,8},
                {0},
                {-22,-17},
                {},
        };
        MatrixOfVector matrix = new MatrixOfVector(initialValues);
        int[] expected = {2,4,200,6,8,0,-22};
        //Act
        int[] result = matrix.elementsBiggerThanAverageOfEvenPercentageMatrix();
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void elementsBiggerThanAverageOfEvenPercentageMatrix_EmptyMatrix() {

        //Arrange
        MatrixOfVector matrix = new MatrixOfVector();
        int[] expected = {};
        //Act
        int[] result = matrix.elementsBiggerThanAverageOfEvenPercentageMatrix();
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void elementsBiggerThanAverageOfEvenPercentageMatrix_OnlyOddNumbers() {

        //Arrange
        int[][] initialValues = {
                {1,9,7},
                {1,13,97},
                {},
        };
        MatrixOfVector matrix = new MatrixOfVector(initialValues);
        int[] expected = {};
        //Act
        int[] result = matrix.elementsBiggerThanAverageOfEvenPercentageMatrix();
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void howManyElementsDoesMatrixHave(){

        //Arrange
        int[][] initialValues = {
                {1,9,7},
                {1,13,27},
                {},
        };
        MatrixOfVector matrix = new MatrixOfVector(initialValues);
        int expected = 6;
        //Act
        int result = matrix.howManyElementsDoesMatrixHave();
        //Assert
        assertEquals(expected,result);

    }

    @Test
    void howManyElementsDoesMatrixHave_(){

        //Arrange
        int[][] initialValues = {
                {1,9,7},
                {1,13,27},
                {},
        };
        MatrixOfVector matrix = new MatrixOfVector(initialValues);
        int expected = 6;
        //Act
        int result = matrix.howManyElementsDoesMatrixHave();
        //Assert
        assertEquals(expected,result);

    }

    @Test
    void howManyElementsDoesMatrixHave_EmptyMatrix(){

        //Arrange
        MatrixOfVector matrix = new MatrixOfVector();
        int expected = 0;
        //Act
        int result = matrix.howManyElementsDoesMatrixHave();
        //Assert
        assertEquals(expected,result);

    }

    // r ----------------------------------------------------
    @Test
    void invertingLinesOfMatrix(){
        // arrange
        int[][] matrix = {
                {1,0,2,0},
                {2,2,0,6},
                {4,0,6,0},
                {1,0,4,0}
        };
        MatrixOfVector instance = new MatrixOfVector(matrix);
        int expected = 1;
        // act
        instance.invertedLinesOfMatrix();
        int nonNullElementsOfInvertedMatrixDiagonal = instance.quantityNonNullElementsInMainDiagonal();
        // assert
        assertEquals(expected,nonNullElementsOfInvertedMatrixDiagonal);
    }



    @Test
    void invertingLinesOfMatrix_EmptyMatrix(){
        //Arrange
        MatrixOfVector instance = new MatrixOfVector();
        String expectedMessage = "Empty matrix.";
        //Act
        Exception exception = assertThrows(IllegalArgumentException.class, instance::invertedLinesOfMatrix);
        String result = exception.getMessage();
        //Assert
        assertTrue(result.contains(expectedMessage));
    }

    // s --------------------------------------------------------------------------
    //Tested indirectly using HomologousLine method
    @Test
    void testingInvertColumnMatrix_usingHomologousLine() {
        //arrange
        int[][] matrix = {{1, 2}, {3, 4, 5}, {4, 5, 6, 1}};
        MatrixOfVector instance = new MatrixOfVector(matrix);
        instance.invertColumnMatrix();
        int[] expected = {16, 12, 3};
        //act
        int[] result = instance.homologousLine();
        //assert
        assertArrayEquals(expected, result);
    }

    // u -----------------------
    //Tested indirectly using method of sum of matrix column elements;
    /*
    @Test
    void rotateMatrix180Degrees_ReturnsArrayWithSumOfColumnCorrespondingMatrixIndexElements(){
        //Arrange
        int[][] matrix = {
                {2,3,4,5},
                {6,7,2,7},
                {1,2,3,5},
                {2,7,6,7},
                {2,6,9,8}
        };
        MatrixOfVector instance = new MatrixOfVector(matrix);
        instance.matrixRotationBy180Degrees();
        int[] expected = {32,24,25,13};
        //Act
        int[] result = instance.sumOfElementsInEachMatrixColumn();
        //Assert
        assertArrayEquals(expected,result);
    }

     */

    @Test
    void rotateMatrix180Degrees_NoRotationEmptyMatrix(){
        //Arrange
        MatrixOfVector instance = new MatrixOfVector();
        String expectedMessage = "Empty";
        //Act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            instance.matrixRotationBy180Degrees();
        });
        String result = exception.getMessage();
        //Assert
        assertTrue(result.contains(expectedMessage));
    }

    @Test
    void rotateMatrix180Degrees_NoRotationIrregularMatrix(){
        //Arrange
        int[][] matrix = {
                {2,3,4,5},
                {6,7},
                {1,2,3,5},
                {2,7,6,7},
                {2,6,9,8}
        };
        MatrixOfVector instance = new MatrixOfVector(matrix);
        String expectedMessage = "Invalid";
        //Act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            instance.matrixRotationBy180Degrees();
        });
        String result = exception.getMessage();
        //Assert
        assertTrue(result.contains(expectedMessage));
    }

    // T ------------------------------------------
    /*
    @Test
    void matrixRotationByNinetyDegrees_ReturnsArrayWithSumOfColumnCorrespondingMatrixIndexElements(){
        //Arrange
        int[][] matrix = {
                {2,3,4,5},
                {6,7,2,7},
                {1,2,3,5},
                {2,7,6,7},
                {2,6,9,8}
        };
        MatrixOfVector instance = new MatrixOfVector(matrix);
        instance.matrixRotationByNinetyDegrees();
        int[] expected = {40,24,25,13};
        //Act
        int[] result = instance.sumOfElementsInEachMatrixColumn();
        //Assert
        assertArrayEquals(expected,result);
    }
    */


    /**@Test
    void matrixRotationByNinetyDegrees_ReturnsArrayWithSumOfColumnCorrespondingMatrixIndexElements(){
        //Arrange
        int[][] matrix = {
                {2,3,4,5},
                {6,7,2,7},
                {1,2,3,5},
                {2,7,6,7},
                {2,6,9,8}
        };
        MatrixOfVector instance = new MatrixOfVector(matrix);
        instance.matrixRotationByNinetyDegrees();
        int[] expected = {14,22,11,22,25};
        //Act
        int[] result = instance.sumOfElementsInEachMatrixColumn();
        //Assert
        assertArrayEquals(expected,result);
    }
    */

}
