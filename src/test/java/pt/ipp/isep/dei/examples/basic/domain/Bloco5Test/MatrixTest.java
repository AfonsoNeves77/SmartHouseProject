package pt.ipp.isep.dei.examples.basic.domain.Bloco5Test;

import org.junit.jupiter.api.Test;

import pt.ipp.isep.dei.examples.basic.domain.Bloco5.Matrix;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    //c) -----------------------------------------------------------------------

    //Tested indirectly using isMatrixSquare method.

    // d) --------------------------------------------------------------------
    // This is tested indirectly using isMatrixSquare method.

    //e)_______________________________________________________________

    @Test
    void matrixNotEmpty_InvalidMatrix() throws InstantiationException {
        //Arrange
        int[][] matrix = {
                {},
                {200},
                {-22, -17},
                {},
        };
        String expectedMessage = "has empty lines";
        //Act
        Exception exception = assertThrows(InstantiationException.class, () -> {
            new Matrix(matrix);
        });
        String actualMessage = exception.getMessage();
        //Assert
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void matrixNotEmpty_ValidMatrix() throws InstantiationException {
        //Arrange
        int[][] initialValues = {
                {22},
                {200},
                {-22, -17},
                {1,3,6,8},
        };
        Matrix matrix = new Matrix(initialValues);
        //Act
        boolean result = matrix.isMatrixEmpty();
        //Assert
        assertFalse(result);
    }


    @Test
    void matrixIsEmpty() {
        //Arrange
        Matrix matrix = new Matrix();
        //Act
        boolean result = matrix.isMatrixEmpty();
        //Assert
        assertTrue(result);
    }

    //f)_______________________________-
    @Test
    void searchMatrixMaxValue() throws InstantiationException {
        //Arrange
        int[][] matrix = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        Matrix matrix1 = new Matrix(matrix);
        int expected = 6;
        //Act
        int result = matrix1.searchMatrixMaxValue();
        //Assert
        assertEquals(expected, result);
    }

    @Test
    void searchMatrixMaxValue_IrregularMatrix() throws InstantiationException {
        //Arrange
        int[][] matrix = {
                {2},
                {1, 2},
                {3, 4},
                {5, 6}
        };
        Matrix testMatrix = new Matrix(matrix);
        int expected = 6;
        //Act
        int result = testMatrix.searchMatrixMaxValue();
        //Assert
        assertEquals(expected, result);
    }

    @Test
    void searchMatrixMaxValue_EmptyMatrix() {
        //Arrange
        Matrix testMatrix = new Matrix();
        String expected = "The matrix is empty.";
        //Act
        Exception exception = assertThrows(IllegalArgumentException.class, testMatrix::searchMatrixMaxValue);
        String result = exception.getMessage();
        //Assert
        assertEquals(expected, result);
    }


    //g)_____________________________________________________________

    @Test
    void searchMatSmallestElement_IrregularMatrix() throws InstantiationException {
        //Arrange
        int[][] matrix = {
                {1},
                {200},
                {-22, -17},
                {5},
                {700, 150, -9},
                {300, -6, -9},
        };
        Matrix matrix1 = new Matrix(matrix);
        int expected = -22;
        //Act
        int result = matrix1.searchMatSmallestElement();
        //Assert
        assertEquals(expected, result);
    }

    @Test
    void searchMatSmallestElement_EmptyMatrix() {
        //Arrange
        Matrix matrix1 = new Matrix();
        String expectedMessage = "This matrix is empty.";

        //Act
        Exception exception = assertThrows(IllegalArgumentException.class, matrix1::searchMatSmallestElement);
        String actualMessage = exception.getMessage();

        //Assert
        assertEquals(expectedMessage, actualMessage);
    }

    //H-----------------------------------------------------------------------------------------------------------------
    @Test
    void averageOfAMatrix() throws InstantiationException {
        //Arrange
        int[][] initialMatrix = {{1, 2}, {3, 4}};
        Matrix matrix = new Matrix(initialMatrix);

        double expectedValue = 2.5;

        //Act
        double result = matrix.averageOfAMatrix();

        //Assert
        assertEquals(expectedValue, result);

    }

    @Test
    void averageOfAMatrix_Empty() {
        //Arrange
        Matrix matrix = new Matrix();

        double expectedValue = -1;

        //Act
        double result = matrix.averageOfAMatrix();

        //Assert
        assertEquals(expectedValue, result);
    }

    @Test
    void averageOfAIrregularMatrix() throws InstantiationException {
        //Arrange
        int[][] initialMatrix = {{1, 2, 7}, {3, 4}};
        Matrix matrix = new Matrix(initialMatrix);

        double expectedValue = 3.4;

        //Act
        double result = matrix.averageOfAMatrix();

        //Assert
        assertEquals(expectedValue, result);
    }


    // i ----------------------------------------------------------------------------------
    @Test
    void homologousLine() throws InstantiationException {
        //arrange
        int[][] matrix = {{1, 2, 3}, {3, 4, 5}, {4, 5, 6}};
        Matrix instance = new Matrix(matrix);
        int[] expected = {6, 12, 15};
        //act
        int[] result = instance.homologousLine();
        //assert
        assertArrayEquals(expected, result);
    }


    @Test
    void homologousLine_differentSizedLines() throws InstantiationException {
        //arrange
        int[][] matrix = {{1, 2}, {3, 4, 5}, {4, 5, 6, 1}};
        Matrix instance = new Matrix(matrix);
        int[] expected = {3, 12, 16};
        //act
        int[] result = instance.homologousLine();
        //assert
        assertArrayEquals(expected, result);
    }

    @Test
    void homologousLine_emptyClassMatrix() {
        //arrange
        Matrix instance = new Matrix();
        int[] expected = {};
        //act
        int[] result = instance.homologousLine();
        //assert
        assertArrayEquals(expected, result);
    }

    // j) ----------------------------------------------------------------------------------
    @Test
    void sumOfElementsInEachMatrixColumn() throws InstantiationException {
        //Arrange
        int[][] matrix = {
                {1, 2, 3},
                {1, 4},
                {1, 3, 5, 6}
        };
        Matrix instance = new Matrix(matrix);
        int[] expected = {3, 9, 8, 6};
        //Act
        int[] result = instance.sumOfElementsInEachMatrixColumn();
        //Assert
        assertArrayEquals(expected, result);
    }


    @Test
    void sumOfElementsInEachMatrixColumn_EmptyMatrix() {
        //Arrange
        Matrix instance = new Matrix();
        int[] expected = {};
        //Act
        int[] result = instance.sumOfElementsInEachMatrixColumn();
        //Assert
        assertArrayEquals(expected, result);
    }

    //K____________________________________________________________________________________
    @Test
    void getIndexOfMaximumLineSumValueInMatrix_IrregularMatrix() throws InstantiationException {
        //Arrange
        int[][] matrix = {
                {1, 20, 400},
                {-50},
                {100,600},
                {0}
        };
        Matrix testMatrix = new Matrix(matrix);
        int expected = 2;
        //Act
        int result = testMatrix.getIndexOfMaximumLineSumValueInMatrix();
        //Assert
        assertEquals(expected, result);
    }


    //l)_________________________________________________________________________________________________

    @Test
    void matrixIsIrregular() throws InstantiationException {
        //Arrange
        int[][] matrix = {
                {1, 7, 8},
                {1, 3, 9, 9, 8, 9},
                {300, 6, 7},
        };

        Matrix matrix1 = new Matrix(matrix);
        //Act
        boolean result = matrix1.isMatrixIrregular();
        //Assert
        assertTrue(result);
    }

    @Test
    void matrixIsNotIrregular() throws InstantiationException {
        //Arrange
        int[][] matrix = {
                {1, 7, 8},
                {1, 3, 9},
                {300, 6, 7},

        };

        Matrix matrix1 = new Matrix(matrix);
        //Act
        boolean result = matrix1.isMatrixIrregular();
        //Assert
        assertFalse(result);
    }

    @Test
    void matrixIsIrregular_EmptyMatrix() {
        //Arrange
        Matrix instance = new Matrix();
        String expectedMessage = "This matrix is empty.";
        //Act
        Exception exception = assertThrows(IllegalArgumentException.class, instance::isMatrixIrregular);
        String result = exception.getMessage();
        //Assert
        assertEquals(expectedMessage, result);
    }

    //l)_______________________________________________________________


    @Test
    void isMatrixSquare() throws InstantiationException {
        //Arrange
        int[][] matrix = {
                {1, 7, 8},
                {1, 3, 9},
                {300, 6, 7},

        };
        Matrix matrix1 = new Matrix(matrix);
        //Act
        boolean result = matrix1.isMatrixSquare();
        //Assert
        assertTrue(result);
    }

    @Test
    void matrixIsNotSquareAndIrregular() throws InstantiationException {
        //Arrange
        int[][] matrix = {
                {1, 7, 8},
                {1, 3, 9, 9, 9},
                {300, 6, 7},
        };
        Matrix matrix1 = new Matrix(matrix);
        //Act
        boolean result = matrix1.isMatrixSquare();

        //Assert
        assertFalse(result);
    }

    @Test
    void matrixIsNotSquare_RegularMatrix() throws InstantiationException {
        //Arrange
        int[][] matrix = {
                {1, 7, 8, 9},
                {1, 3, 9, 9},

        };
        Matrix matrix1 = new Matrix(matrix);
        //Act
        boolean result = matrix1.isMatrixSquare();
        //Assert
        assertFalse(result);
    }

    @Test
    void matrixIsNotSquare__EmptyMatrix() {
        //Arrange
        Matrix instance = new Matrix();
        String expectedMessage = "This matrix is empty.";
        //Act
        Exception exception = assertThrows(IllegalArgumentException.class, instance::isMatrixSquare);
        String result = exception.getMessage();
        //Assert
        assertEquals(expectedMessage, result);
    }

    @Test
    void isMatrixSquare_testingRemoveFirstOccurrenceOfNum() throws InstantiationException {

        int[][] matrix = {
                {1, 7, 8, 0},
                {1, 3, 9},
                {300, 6, 7},

        };

        Matrix matrix1 = new Matrix(matrix);
        matrix1.removeFirstOccurrenceNum(0);
        //Act
        boolean result = matrix1.isMatrixSquare();

        //Assert
        assertTrue(result);
    }

    @Test
    void isMatrixSquare_testingRemoveFirstOccurrenceOfNumWithNoneFound() throws InstantiationException {

        int[][] matrix = {
                {1, 7, 8},
                {1, 3, 9},
                {300, 6, 7},

        };

        Matrix matrix1 = new Matrix(matrix);
        int numberToRemove = 10;
        matrix1.removeFirstOccurrenceNum(numberToRemove);
        //Act
        boolean result = matrix1.isMatrixSquare();

        //Assert
        assertTrue(result);
    }

    @Test
    void isMatrixSquare_testingRemoveFirstOccurrenceIncreasingCoverage() throws InstantiationException {

        int[][] matrix = {
                {1, 7, 4, 8},
                {1, 3, 9},
                {300, 6, 7},

        };

        Matrix matrix1 = new Matrix(matrix);
        int numberToRemove = 4;
        matrix1.removeFirstOccurrenceNum(numberToRemove);
        //Act
        boolean result = matrix1.isMatrixSquare();

        //Assert
        assertTrue(result);
    }

    @Test
    void isMatrixSquare_FalseAfterAddingElement() throws InstantiationException {

        int[][] matrix = {
                {1, 7, 0},
                {1, 3, 9},
                {300, 6, 8},

        };

        Matrix matrix1 = new Matrix(matrix);
        int line = 1;
        int element = 2;
        matrix1.addElementToMatrix(line,element);
        //Act
        boolean result = matrix1.isMatrixSquare();

        //Assert
        assertFalse(result);
    }

    @Test
    void isMatrixSquare_TrueAfterAddingElement() throws InstantiationException {

        int[][] matrix = {
                {1, 7, 0},
                {1, 3},
                {300, 6, 8},

        };

        Matrix matrix1 = new Matrix(matrix);
        int line = 1;
        int element = 2;
        matrix1.addElementToMatrix(line,element);
        //Act
        boolean result = matrix1.isMatrixSquare();

        //Assert
        assertTrue(result);
    }

    @Test
    void isMatrixSquare_LineExceedsMatrixLength() throws InstantiationException {
        int[][] matrix = {
                {1, 7, 0},
                {1, 3, 5},
                {300, 6, 8},

        };
        Matrix matrix1 = new Matrix(matrix);
        int line = 100;
        int element = 2;
        matrix1.addElementToMatrix(line,element);
        //Act
        boolean result = matrix1.isMatrixSquare();
        //Assert
        assertTrue(result);
    }

    //M-----------------------------------------------------------------------------------------------------------------

    // Pode ser feito assertTrue/False
    @Test
    void symmetricMatrix_true() throws InstantiationException {
        //Arrange
        int[][] initialMatrix = {{1, 2, 3},
                {2, 4, 5},
                {3, 5, 6}};
        Matrix matrix = new Matrix(initialMatrix);

        boolean expectedValue = true;

        //Act
        boolean result = matrix.symmetricMatrix();

        //Assert
        assertEquals(expectedValue, result);

    }

    @Test
    void symmetricMatrix_false() throws InstantiationException {
        // Arrange
        int[][] initialMatrix = {{1, 2},
                {3, 5},
        };
        Matrix matrix = new Matrix(initialMatrix);

        boolean expectedValue = false;

        // Act
        boolean result = matrix.symmetricMatrix();

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    void symmetricMatrix_EmptyMatrix() throws InstantiationException {
        //Arrange
        int[][] initialMatrix = {};
        Matrix matrix = new Matrix(initialMatrix);

        boolean expectedValue = false;

        //Act
        boolean result = matrix.symmetricMatrix();

        //Assert
        assertEquals(expectedValue, result);

    }

    @Test
    void symmetricMatrix_NonRectangularMatrix() throws InstantiationException {
        //Arrange
        int[][] initialMatrix = {{1, 2},
                {2, 5, 3},
                {1, 2, 3}};
        Matrix matrix = new Matrix(initialMatrix);

        boolean expectedValue = false;

        //Act
        boolean result = matrix.symmetricMatrix();

        //Assert
        assertEquals(expectedValue, result);

    }

    // n -----------------------------------------------
    @Test
    void quantityNonNullElementsInMainDiagonal() throws InstantiationException {
        //arrange
        int[][] matrix = {{1, 2, 3}, {3, 4, 5}, {4, 5, 6}};
        Matrix instance = new Matrix(matrix);
        int expected = 3;
        //act
        int result = instance.quantityNonNullElementsInMainDiagonal();
        //assert
        assertEquals(expected, result);
    }

    @Test
    void quantityNonNullElementsInMainDiagonal_allZeroes() throws InstantiationException {
        //arrange
        int[][] matrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        Matrix instance = new Matrix(matrix);
        int expected = 0;
        //act
        int result = instance.quantityNonNullElementsInMainDiagonal();
        //assert
        assertEquals(expected, result);
    }

    @Test
    void quantityNonNullElementsInMainDiagonal_emptyClassArray() throws InstantiationException {
        //arrange
        int[][] matrix = {};
        Matrix instance = new Matrix(matrix);
        int expected = -1;
        //act
        int result = instance.quantityNonNullElementsInMainDiagonal();
        //assert
        assertEquals(expected, result);
    }

    @Test
    void quantityNonNullElementsInMainDiagonal_irregularMatrix() throws InstantiationException {
        //arrange
        int[][] matrix = {{1, 2, 3}, {1, 2, 3, 4}, {6, 7, 8}};
        Matrix instance = new Matrix(matrix);
        int expected = -1;
        //act
        int result = instance.quantityNonNullElementsInMainDiagonal();
        //assert
        assertEquals(expected, result);
    }

    //o)________________________________________________________________________________________________
    @Test
    void areMainAndSecondaryDiagonalsEqual_2By3Matrix() throws InstantiationException {
        //Arrange
        int[][] matrix = {
                {1, 3, 1},
                {2, 2, 4}
        };
        Matrix instance = new Matrix(matrix);
        //Act
        boolean result = instance.areMainAndSecondaryDiagonalsEqual();
        //Assert
        assertTrue(result);
    }


    @Test
    void areMainAndSecondaryDiagonalsEqual_4By3Matrix() throws InstantiationException {
        //Arrange
        int[][] matrix = {
                {1, 3, 1},
                {2, 2, 4},
                {9, 5, 9},
                {4, 2, 3}
        };
        Matrix instance = new Matrix(matrix);
        //Act
        boolean result = instance.areMainAndSecondaryDiagonalsEqual();
        //Assert
        assertTrue(result);
    }

    @Test
    void areMainAndSecondaryDiagonalsEqual_False() throws InstantiationException {
        //Arrange
        int[][] matrix = {
                {1, 3, 1},
                {2, 2, 4},
                {9, 5, 4},
                {4, 2, 3}
        };
        Matrix instance = new Matrix(matrix);
        //Act
        boolean result = instance.areMainAndSecondaryDiagonalsEqual();
        //Assert
        assertFalse(result);
    }

    @Test
    void areMainAndSecondaryDiagonalsEqual_IrregularMatrix() throws InstantiationException{
        //Arrange
        int[][] matrix = {
                {1, 3, 1},
                {2},
                {9, 5, 4},
                {4, 2, 3}
        };
        Matrix instance = new Matrix(matrix);
        String expectedMessage = "not rectangular";
        //Act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            instance.areMainAndSecondaryDiagonalsEqual();
        });
        String result = exception.getMessage();
        //Assert
        assertTrue(result.contains(expectedMessage));
    }

    @Test
    void areMainAndSecondaryDiagonalsEqual_EmptyMatrix() {
        //Arrange
        Matrix instance = new Matrix();
        String expectedMessage = "is empty";
        //Act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            instance.areMainAndSecondaryDiagonalsEqual();
        });
        String result = exception.getMessage();
        //Assert
        assertTrue(result.contains(expectedMessage));
    }

    //P______________________________________________________________________-
    @Test
    void elementsWithHigherNumberOfDigitsThanAverageInMatrix() throws InstantiationException {
        //Arrange
        int[][] matrix = {
                {1,233},
                {5435,1},
                {233,12}
        };
        Matrix testMatrix = new Matrix(matrix);
        int[] expected = {233,5435,233};
        //Act
        int[] result = testMatrix.elementsWithHigherNumberOfDigitsThanAverageInMatrix();
        //Assert
        assertArrayEquals(result,expected);

    }

    @Test
    void elementsWithHigherNumberOfDigitsThanAverageInMatrix_emptyMatrix() {
        //Arrange
        Matrix testMatrix = new Matrix();
        int[] expected = {};
        //Act
        int[] result = testMatrix.elementsWithHigherNumberOfDigitsThanAverageInMatrix();
        //Assert
        assertArrayEquals(expected,result);
    }


    //q)________________________________________________________________________________________________


    @Test
    void elementsBiggerThanMediaOfEvenPercentageNumbersInMatrix_IrregularMatrix() throws InstantiationException {
        //Arrange
        int[][] initialValues = {
                {1,2,4},
                {200,6,8},
                {0},
                {-22,-17},
        };
        Matrix matrix = new Matrix(initialValues);
        int[] expected = {2,4,200,6,8,0,-22};
        //Act
        int[] result = matrix.elementsBiggerThanMediaOfEvenPercentageMatrix();
        //Assert
       assertArrayEquals(expected,result);
    }

    @Test
    void elementsBiggerThanMediaOfEvenPercentageNumbersInMatrix_EmptyMatrix() {
        //Arrange
        Matrix matrix = new Matrix();
        int[] expected = {};
        //Act
        int[] result = matrix.elementsBiggerThanMediaOfEvenPercentageMatrix();
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void elementsBiggerThanMediaOfEvenPercentageNumbersInMatrix_OnlyOddNumbers() throws InstantiationException {
        //Arrange
        int[][] initialValues = {
                {1,9,7},
                {1,13,97},
        };
        Matrix matrix = new Matrix(initialValues);
        int[] expected = {};
        //Act
        int[] result = matrix.elementsBiggerThanMediaOfEvenPercentageMatrix();
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void howManyElementsDoesMatrixHave() throws InstantiationException {

        //Arrange
        int[][] initialValues = {
                {1,9,7},
                {1,13,27},
        };
        Matrix matrix = new Matrix(initialValues);
        int expected = 6;
        //Act
        int result = matrix.howManyElementsDoesMatrixHave();
        //Assert
        assertEquals(expected,result);

    }

    @Test
    void howManyElementsDoesMatrixHave_EmptyMatrix(){

        //Arrange
        Matrix matrix = new Matrix();
        int expected = 0;
        //Act
        int result = matrix.howManyElementsDoesMatrixHave();
        //Assert
        assertEquals(expected,result);

    }

    //R-----------------------------------------------------------------------------------------------------------------
//Indirect testing, using exercise 2.j
    @Test
    void sumOfElementsInEachMatrixColumn_invertedLinesOfMatrix() throws InstantiationException {
        //Arrange
        int[][] matrix = {
                {1,2,3},
                {1,4,5},
                {1,3,5}
        };
        Matrix instance = new Matrix(matrix);
        instance.invertedLinesOfMatrix();
        int[] expected = {13,9,3};

        //Act
        int[] result = instance.sumOfElementsInEachMatrixColumn();
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void sumOfElementsInEachMatrixColumn_invertedLinesOfEmptyMatrix()  {
        //Arrange
        Matrix instance = new Matrix();
        instance.invertedLinesOfMatrix();
        int[] expected = {};

        //Act
        int[] result = instance.sumOfElementsInEachMatrixColumn();
        //Assert
        assertArrayEquals(expected,result);
    }



    // s -----------------------------------------------------
    @Test
    void testingInvertColumnMatrix_usingHomologousLine() throws InstantiationException {
        //arrange
        int[][] matrix = {{1, 2}, {3, 4, 5}, {4, 5, 6, 1}};
        Matrix instance = new Matrix(matrix);
        instance.invertColumnMatrix();
        int[] expected = {16, 12, 3};
        //act
        int[] result = instance.homologousLine();
        //assert
        assertArrayEquals(expected, result);
    }
    /*
    @Test
    void invertColumnMatrix() {
        //arrange
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        Matrix instance = new Matrix(matrix);
        int[][] expected = {{7,8,9},{4,5,6},{1,2,3}};
        //act
        int[][] result = instance.invertColumnMatrix();
        //assert
        assertArrayEquals(expected,result);
    }
    @Test
    void invertColumnMatrix_irregular() {
        //arrange
        int[][] matrix = {{1,2,3,5},{4,5,6},{7,8}};
        Matrix instance = new Matrix(matrix);
        int[][] expected = {{7,8},{4,5,6},{1,2,3,5}};
        //act
        int[][] result = instance.invertColumnMatrix();
        //assert
        assertArrayEquals(expected,result);
    }
    @Test
    void invertColumnMatrix_emptyClassMatrix() {
        //arrange
        int[][] matrix = {};
        Matrix instance = new Matrix(matrix);
        int[][] expected = {};
        //act
        int[][] result = instance.invertColumnMatrix();
        //assert
        assertArrayEquals(expected,result);
    }
    */

    //v_______________________________________________________________
    //Indirect testing, using exercise 2.j
    @Test
    void matrixRotationByMinusNinetyDegrees_ReturnsArrayWithSumOfColumnCorrespondingMatrixIndexElements() throws InstantiationException{
        //Arrange
        int[][] matrix = {
                {2,3,4,5},
                {6,7,2,7},
                {1,2,3,5},
                {2,7,6,7},
                {2,6,9,8}
        };
        Matrix instance = new Matrix(matrix);
        instance.matrixRotationByMinusNinetyDegrees();
        int[] expected = {25,22,11,22,14};
        //Act
        int[] result = instance.sumOfElementsInEachMatrixColumn();
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void matrixRotationByMinusNinetyDegrees_NoRotationEmptyMatrix(){
        //Arrange
        Matrix instance = new Matrix();
        String expectedMessage = "Empty";
        //Act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            instance.matrixRotationByMinusNinetyDegrees();
                });
        String result = exception.getMessage();
        //Assert
        assertTrue(result.contains(expectedMessage));
    }

    @Test
    void matrixRotationByMinusNinetyDegrees_NoRotationIrregularMatrix() throws InstantiationException{
        //Arrange
        int[][] matrix = {
                {2,3,4,5},
                {6,7},
                {1,2,3,5},
                {2,7,6,7},
                {2,6,9,8}
        };
        Matrix instance = new Matrix(matrix);
        String expectedMessage = "Invalid";
        //Act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            instance.matrixRotationByMinusNinetyDegrees();
        });
        String result = exception.getMessage();
        //Assert
        assertTrue(result.contains(expectedMessage));
    }

    //U_______________________________________________________________
    // Using Mariana's strategy to test:
    // Indirect testing, using exercise 2.j
    @Test
    void rotateMatrix180Degrees_ReturnsArrayWithSumOfColumnCorrespondingMatrixIndexElements() throws InstantiationException{
        //Arrange
        int[][] matrix = {
                {2,3,4,5},
                {6,7,2,7},
                {1,2,3,5},
                {2,7,6,7},
                {2,6,9,8}
        };
        Matrix instance = new Matrix(matrix);
        instance.rotateMatrix180Degrees();
        int[] expected = {32,24,25,13};
        //Act
        int[] result = instance.sumOfElementsInEachMatrixColumn();
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void rotateMatrix180Degrees_NoRotationEmptyMatrix(){
        //Arrange
        Matrix instance = new Matrix();
        String expectedMessage = "Empty";
        //Act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            instance.rotateMatrix180Degrees();
        });
        String result = exception.getMessage();
        //Assert
        assertTrue(result.contains(expectedMessage));
    }

    @Test
    void rotateMatrix180Degrees_NoRotationIrregularMatrix() throws InstantiationException {
        //Arrange
        int[][] matrix = {
                {2,3,4,5},
                {6,7},
                {1,2,3,5},
                {2,7,6,7},
                {2,6,9,8}
        };
        Matrix instance = new Matrix(matrix);
        String expectedMessage = "Invalid";
        //Act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            instance.rotateMatrix180Degrees();
        });
        String result = exception.getMessage();
        //Assert
        assertTrue(result.contains(expectedMessage));
    }
    //t_______________________________________________________________

    @Test
    void returningASelectedMatrixLine() throws InstantiationException {
        //Arrange
        int[][] initialValues = {
                {4,5,6},
                {7,8,9},
                {1,2,3},

        };
        int[] result = {7,8,9};
        Matrix matrix = new Matrix(initialValues);
        //Act
        int[] expected = matrix.returningLine(1);
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void returningASelectedMatrixLine_EmptyMatrix() {
        //Arrange
        Matrix matrix = new Matrix();
        int[] expected = {};
        int line = 1;
        //Act
        int[] result = matrix.returningLine(line);
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void returningASelectedMatrixLine_SelectingEmptyLine() throws InstantiationException {

        //Arrange
        int[][] initialValues = {
                {4,5,6},
                {2},
                {1,2,3}
        };
        Matrix matrix = new Matrix(initialValues);
        int line = 1;
        int[] expected = {2};
        //Act
        int[] result = matrix.returningLine(line);
        //Assert
        assertArrayEquals(expected, result);


    }


    @Test
    void rotatingNinetyDegrees_() throws InstantiationException {
        //Arrange
        int[][] initialValues = {
                {4,5,6},
                {7,8,9},
                {1,2,3},
        };
        Matrix matrix = new Matrix(initialValues);
        int line = 0;
        int[] result = {6,9,3};
        //Act
        matrix.rotatingNinetyDegrees();
        int[] expected = matrix.returningLine(line);
        //Assert
        assertArrayEquals(expected, result);


    }

    @Test
    void rotatingNinetyDegrees_EmptyMatrix() {
        //Arrange
        Matrix matrix = new Matrix();
        int line = 0;
        int[] expected = {};
        //Act
        matrix.rotatingNinetyDegrees();
        int[] result = matrix.returningLine(line);
        //Assert
        assertArrayEquals(expected, result);
    }
}
