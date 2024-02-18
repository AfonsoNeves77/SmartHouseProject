package pt.ipp.isep.dei.examples.basic.domain.Bloco4Test;
import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio11;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio18;

import static org.junit.jupiter.api.Assertions.*;

public class Exercicio18Test {

    //Alínea A
    @Test
    void lowestValue(){
        new Exercicio18();
        //Arrange
        int[][] matrix =  {
                {1,2},
                {4,5},

        };
        int expected = 1;
        //Act
        int result = Exercicio18.lowestValueMatrix(matrix);
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void lowestValue_NegativeNumbers(){
        //Arrange
        int[][] matrix = {
                {1,-5},
                {4,5},
                {1,8,90,-7,4},

        };
        int expected = -7;
        //Act
        int result = Exercicio18.lowestValueMatrix(matrix);
        //Assert
        assertEquals(expected,result);
    }

    //Alínea B
    @Test
    void highestValue(){
        //Arrange
        int[][] matrix =  {
                {1,2},
                {4,5},
        };
        int expected = 5;
        //Act
        int result = Exercicio18.highestValueMatrix(matrix);
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void highestValue_NegativeNumbers(){
        //Arrange
        int[][] matrix =  {
                {1,-5},
                {4,5},
                {1,8,90,-7,4},

        };
        int expected = 90;
        //Act
        int result = Exercicio18.highestValueMatrix(matrix);
        //Assert
        assertEquals(expected,result);
    }

    //Alínea c

    @Test
    void averageValuesMatrix_EmptyArray (){
        //Arrange
        int[][] matrix = {};
        double expected = Double.NaN;
        //Act
        double result = Exercicio18.averageValuesMatrix(matrix);
        //Assert
        assertEquals(expected, result);
    }

    @Test
    void averageValuesMatrix (){
        //Arrange
        int[][] matrix = {
                {1,2},
                {3,4},
                {5,6},
        };
        double expected = 3.5;
        //Act
        double result = Exercicio18.averageValuesMatrix(matrix);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void averageValuesMatrix_NegativePositiveNumbers (){
        //Arrange
        int[][] matrix =  {
                {1,-2},
                {3,4},
                {-5,6}
        };
        double expected = 1.167;
        //Act
        double result = Exercicio18.averageValuesMatrix(matrix);
        //Assert
        assertEquals(expected, result, 0.01);
    }

    //Alínea D
    @Test
    void productMatrixElements(){
        //Arrange
        int[][] matrix = {
                {1,2},
                {3,4},
                {5,6}
        };
        int expected = 720;
        //Act
        int result = Exercicio18.productMatrixElements(matrix);
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void productMatrixElements_Negatives(){
        //Arrange
        int[][] matrix = {
                {1,-2},
                {3,4},
                {-5,6},
        };
        int expected = 720;
        //Act
        int result = Exercicio18.productMatrixElements(matrix);
        //Assert
        assertEquals(expected,result);
    }
    @Test
    void productMatrixElements_IrregularMatrix(){
        //Arrange
        int[][] matrix = {
                {1,-2},
                {3},
                {-5,6},
        };
        int expected = 180;
        //Act
        int result = Exercicio18.productMatrixElements(matrix);
        //Assert
        assertEquals(expected,result);
    }
    @Test
    void productMatrixElements_EmptyMatrix(){
        //Arrange
        int[][] matrix = {};
        int expected = 0;
        //Act
        int result = Exercicio18.productMatrixElements(matrix);
        //Assert
        assertEquals(expected,result);
    }

    //Alinea E
    @Test
    void nonRepeatedNumbersInMatrix(){
        //Arrange
        int[][] matrix = {{1,2,2},{4,5,5},{10,21,32}};
        int[] expected = {1,2,4,5,10,21,32};
        //Act
        int[] result = Exercicio18.nonRepeatedNumbersInMatrix(matrix);
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    void nonRepeatedNumbersInMatrix_emptyArray (){
        //Arrange
        int[][] matrix = {};
        int[] expected = {};
        //Act
        int[] result = Exercicio18.nonRepeatedNumbersInMatrix(matrix);
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    void nonRepeatedNumbersInMatrix_IrregularMatrix(){
        //Arrange
        int[][] matrix = {{1,2,2},{4,5},{10,21,32}};
        int[] expected = {1,2,4,5,10,21,32};
        //Act
        int[] result = Exercicio18.nonRepeatedNumbersInMatrix(matrix);
        //Assert
        assertArrayEquals(expected, result);
    }


//Alínea F--------------------------------------------------------------------------------------------------------------
    @Test
    public void primeElementsInAMatrix(){
        //Arrange
        int[][] matrix = {{3,0,0},{0,19,0},{0,79,0}};
        int[] expected = {3,19,79};
        //Act
        int[] result = Exercicio18.primeElementsInAMatrix(matrix);
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    public void primeElementsInAMatrix_NoPrimeNumbers(){
        //Arrange
        int[][] matrix = {{4,0,0},{0,18,0},{40,78,0}};
        int[] expected = {};
        //Act
        int[] result = Exercicio18.primeElementsInAMatrix(matrix);
        //Assert
        assertArrayEquals(expected, result);
    }
//Alínea G---------------------------------------------------------------------------------------------------------------
    @Test
    public void mainDiagonalOfAMatrix_SquareMatrix(){
        //Arrange
        int[][] matrix = {{3,0,0},{0,19,0},{41,79,0}};
        int[] expected = {3,19,0};
        //Act
        int[] result = Exercicio18.mainDiagonalOfAMatrix(matrix);
        //Assert
        assertArrayEquals(expected, result);
}
    @Test
    public void mainDiagonalOfAMatrix_IrregularMatrix() {
        //Arrange
        int[][] matrix = {{1,2,3},{4,5,25,6},{7,8,9}};
        int[] result = Exercicio18.mainDiagonalOfAMatrix(matrix);
        //Act
        int[] expected = null;
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    public void mainDiagonalOfAMatrix_TallRectangularMatrix() {
        //Arrange
        int[][] matrix = {{1,2},{4,5},{7,8}};
        int[] result = Exercicio18.mainDiagonalOfAMatrix(matrix);
        //Act
        int[] expected = {1,5};
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    public void mainDiagonalOfAMatrix_LongRectangularMatrix() {
        //Arrange
        int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10}};
        int[] result = Exercicio18.mainDiagonalOfAMatrix(matrix);
        //Act
        int[] expected = {1,7};
        //Assert
        assertArrayEquals(expected, result);
    }
//Alínea H

    @Test
    public void secondaryDiagonalOfAMatrix(){
        //Arrange
        int[][] matrix = {{3,0,0}, {0,19,0}, {41,79,0}};
        int[] expected = {0,19,41};
        //Act
        int[] result = Exercicio18.secondaryDiagonalOfAMatrix(matrix);
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    public void secondaryDiagonalOfAMatrix_IrregularMatrix() {
        //Arrange
        int[][] matrix = {{1,2,3},{4,5,25,6},{7,8,9}};
        int[] result = Exercicio18.secondaryDiagonalOfAMatrix(matrix);
        //Act
        int[] expected = null;
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    public void secondaryDiagonalOfAMatrix_TallRectangularMatrix() {
        //Arrange
        int[][] matrix = {{1,2}, {4,5}, {7,8}};
        int[] result = Exercicio18.secondaryDiagonalOfAMatrix(matrix);
        //Act
        int[] expected = {2,4};
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    public void secondaryDiagonalOfAMatrix_LongRectangularMatrix() {
        //Arrange
        int[][] matrix = {{1,2,3,4,5}, {6,7,8,9,10}};
        int[] result = Exercicio18.secondaryDiagonalOfAMatrix(matrix);
        //Act
        int[] expected = {5,9};
        //Assert
        assertArrayEquals(expected, result);
    }

    //Alínea I
    @Test
    void isItAnIdentityMatrix_SquareMatrixTrue(){
        //Arrange
        int[][] matrix = {
                {1,0,0,0},
                {0,1,0,0},
                {0,0,1,0},
                {0,0,0,1}};
        //Act
        boolean result = Exercicio18.isItAnIdentityMatrix(matrix);
        //Assert
        assertTrue(result);
    }

    @Test
    void isItAnIdentityMatrix_SquareMatrixFalse(){
        //Arrange
        int[][] matrix = {
                {1,2,0,0},
                {0,1,0,4},
                {0,3,1,0},
                {0,5,0,1}};
        //Act
        boolean result = Exercicio18.isItAnIdentityMatrix(matrix);
        //Assert
        assertFalse(result);
    }

    @Test
    void isItAnIdentityMatrix_IrregularMatrix(){
        //Arrange
        int[][] matrix = {
                {1,2},
                {0,1,0},
                {0,3,1,0},
                {0,5,0,1}};
        //Act
        boolean result = Exercicio18.isItAnIdentityMatrix(matrix);
        //Assert
        assertFalse(result);
    }

    @Test
    void isItAnIdentityMatrix_RectangularMatrix(){
        //Arrange
        int[][] matrix = {
                {0,3,1,0},
                {0,5,0,1}};
        //Act
        boolean result = Exercicio18.isItAnIdentityMatrix(matrix);
        //Assert
        assertFalse(result);
    }

    @Test
    void isItAnIdentityMatrix_EmptyMatrix(){
        //Arrange
        int[][] matrix = {};
        //Act
        boolean result = Exercicio18.isItAnIdentityMatrix(matrix);
        //Assert
        assertFalse(result);
    }

    //Alínea J
    @Test
    void inverseMatrix() {
        //Arrange
        int[][] matrix = {
                {2,5,3},
                {6,9,5},
                {2,1,5}};
        int[][] expected = {
                {-5/7,11/28,1/28},
                {5/14,-1/14,-1/7},
                {3/14,-1/7,3/14}};
        //Act
        int[][] result = Exercicio18.inverseMatrix(matrix);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void inverseMatrix_DeterminantIsZero() {
        //Arrange
        int[][] matrix = {
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4}};
        int[][] expected = null;
        //Act
        int[][] result = Exercicio18.inverseMatrix(matrix);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void inverseMatrix_RectangularMatrix() {
        //Arrange
        int[][] matrix = {
                {2,5,3,4},
                {6,9,5,3},
                {2,1,5,1}};
        int[][] expected = null;
        //Act
        int[][] result = Exercicio18.inverseMatrix(matrix);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void inverseMatrix_IrregularMatrix() {
        //Arrange
        int[][] matrix = {
                {1,2},
                {1,2,3,4},
                {1,2,3},
                {1,2,3,4}};
        int[][] expected = null;
        //Act
        int[][] result = Exercicio18.inverseMatrix(matrix);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void inverseMatrix_EmptyMatrix() {
        //Arrange
        int[][] matrix = {};
        int[][] expected = null;
        //Act
        int[][] result = Exercicio18.inverseMatrix(matrix);
        //Assert
        assertArrayEquals(expected,result);
    }


    //Alínea K
    @Test
    void transposeOfAMatrix_IdentityMatrix() {
        //Arrange
        int[][] matrix = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}};
        int[][] expected = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}};
        //Act
        int[][] result = Exercicio18.transposeOfAMatrix(matrix);
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void transposeOfAMatrix_RectangularMatrix() {
        //Arrange
        int[][] matrix = {
                {11, 13, 15, 17},
                {22, 24, 26, 28},
                {33, 35, 37, 39}};
        int[][] expected = {
                {11, 22, 33},
                {13, 24, 35},
                {15, 26, 37},
                {17, 28, 39}};
        //Act
        int[][] result = Exercicio18.transposeOfAMatrix(matrix);
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void transposeOfAMatrix_IrregularMatrix() {
        //Arrange
        int[][] matrix = {
                {11, 13, 15, 17},
                {22, 24, 26},
                {33, 35}};
        int[][] expected = null;
        //Act
        int[][] result = Exercicio18.transposeOfAMatrix(matrix);
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void transposeOfAMatrix_EmptyMatrix() {
        //Arrange
        int[][] matrix = {};
        int[][] expected = null;
        //Act
        int[][] result = Exercicio18.transposeOfAMatrix(matrix);
        //Assert
        assertArrayEquals(expected, result);
    }

}
