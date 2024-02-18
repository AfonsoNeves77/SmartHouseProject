package pt.ipp.isep.dei.examples.basic.domain.Bloco4Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio11;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio20;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio20Test {

    //20a
    @Test
    void matrixMultipliedByNum_success() {
        new Exercicio20();
        //arrange
        int num = 3;
        int[][] matrix = {{1, 2, 3}, {1, 2, 3}};
        int[][] expected = {{3, 6, 9}, {3, 6, 9}};
        //act
        int[][] result = Exercicio20.matrixMultipliedByNum(num,matrix);
        //assert
        assertArrayEquals(expected,result);
    }
    @Test
    void matrixMultipliedByNum_emptyMatrix() {
        //arrange
        int num = 3;
        int[][] matrix = {};
        int[][] expected = {};
        //act
        int[][] result = Exercicio20.matrixMultipliedByNum(num,matrix);
        //assert
        assertArrayEquals(expected,result);
    }
    @Test
    void matrixMultipliedByNum_numEqualszero() {
        //arrange
        int num = 0;
        int[][] matrix = {{1, 2, 3}, {1, 2, 3}};
        int[][] expected = {{0,0,0},{0,0,0}};
        //act
        int[][] result = Exercicio20.matrixMultipliedByNum(num,matrix);
        //assert
        assertArrayEquals(expected,result);
    }

    //20b
    @Test
    void sumOfTwoMatrices_success() {
        //arrange
        int[][] matrix1 = {{1, 2, 3}, {1, 2, 3}};
        int[][] matrix2 = {{1, 2, 3}, {1, 2, 3}};
        int[][] expected = {{2,4,6},{2,4,6}};
        //act
        int[][] result = Exercicio20.sumOfTwoMatrixes(matrix1,matrix2);
        //assert
        assertArrayEquals(expected,result);
    }
    @Test
    void sumOfTwoMatrices_DifferentSizedMatrixIsNull() {
        //arrange
        int[][] matrix1 = {{1, 2, 3, 4}, {1, 2, 3}};
        int[][] matrix2 = {{1, 2, 3}, {1, 2, 3}};
        int[][] expected = {};
        //act
        int[][] result = Exercicio20.sumOfTwoMatrixes(matrix1,matrix2);
        //assert
        assertArrayEquals(expected,result);
    }
    @Test
    void sumOfTwoMatrices_emptyMatrixIsNull() {
        //arrange
        int[][] matrix1 = {};
        int[][] matrix2 = {{1, 2, 3}, {1, 2, 3}};
        int[][] expected = {};
        //act
        int[][] result = Exercicio20.sumOfTwoMatrixes(matrix1,matrix2);
        //assert
        assertArrayEquals(expected,result);
    }

    @Test
    void areTheseArraysEmpty(){
        //arrange
        int[][] matrix1 = {};
        int[][] matrix2 = {};
        //act
        boolean result = Exercicio20.areTheseArraysEmpty(matrix1,matrix2);
        //assert
        assertTrue(result);
    }
    @Test
    void areTheseArraysEmpty_matrix1notEmpty(){
        //arrange
        int[][] matrix1 = {{1},{1}};
        int[][] matrix2 = {};
        //act
        boolean result = Exercicio20.areTheseArraysEmpty(matrix1,matrix2);
        //assert
        assertFalse(result);
    }
    @Test
    void areTheseArraysEmpty_matrix2notEmpty(){
        //arrange
        int[][] matrix1 = {};
        int[][] matrix2 = {{1},{1}};
        //act
        boolean result = Exercicio20.areTheseArraysEmpty(matrix1,matrix2);
        //assert
        assertFalse(result);
    }
    //20c
    @Test
    void productOfTwoMatrices_Matrix3X3TimesMatrix3X4() {
        //arrange
        int[][] matrix1 = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}};
        int[][] matrix2 = {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4}};
        int[][] expected = {
                {6, 12, 18, 24},
                {6, 12, 18, 24},
                {6, 12, 18, 24}};
        //Act
        int[][] result = Exercicio20.productOfTwoMatrices(matrix1,matrix2);
        //assert
        assertArrayEquals(expected,result);
    }
    @Test
    void productOfTwoMatrices_FirstEmptyMatrix() {
        //Arrange
        int[][] matrixA = {};
        int[][] matrixB = {
                {1, 2},
                {1, 2}};
        int[][] expected = {};
        //Act
        int[][] result = Exercicio20.productOfTwoMatrices(matrixA,matrixB);
        //Assert
        assertArrayEquals(expected,result);
    }
    @Test
    void productOfTwoMatrices_SecondEmptyMatrix() {
        //Arrange
        int[][] matrixA = {
                {1, 2},
                {1, 2}};;
        int[][] matrixB = {};
        int[][] expected = {};
        //Act
        int[][] result = Exercicio20.productOfTwoMatrices(matrixA,matrixB);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void productOfTwoMatrices_OneIrregularMatrix() {
        //Arrange
        int[][] matrixA = {
                {1, 2, 3},
                {1, 2}};
        int[][] matrixB = {
                {1, 2},
                {1, 2}};
        int[][] expected = {};
        //Act
        int[][] result = Exercicio20.productOfTwoMatrices(matrixA,matrixB);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void productOfTwoMatrices_ImpossibleProduct() {
        //Arrange
        int[][] matrixA = {
                {1, 2, 3},
                {1, 2, 3}};
        int[][] matrixB = {
                {1, 2},
                {1, 2}};
        int[][] expected = {};
        //Act
        int[][] result = Exercicio20.productOfTwoMatrices(matrixA,matrixB);
        //Assert
        assertArrayEquals(expected,result);
    }
}
