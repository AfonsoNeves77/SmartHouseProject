package pt.ipp.isep.dei.examples.basic.domain.Bloco4Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio11;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio19;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio19Test {

    @Test
    void determinantOfAMatrix() {
        new Exercicio19();
        //Arrange
        int[][] matrix = {
                {3,5,5},
                {2,4,6},
                {3,5,7}};
        int expected = 4;
        //Act
        int result = Exercicio19.determinantOfAMatrix(matrix);
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void determinantOfAMatrix_RectangularMatrix() {
        //Arrange
        int[][] matrix = {
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4}};
        int expected = 0;
        //Act
        int result = Exercicio19.determinantOfAMatrix(matrix);
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void determinantOfAMatrix_EmptyMatrix() {
        //Arrange
        int[][] matrix = {};
        int expected = 0;
        //Act
        int result = Exercicio19.determinantOfAMatrix(matrix);
        //Assert
        assertEquals(expected,result);
    }
}