package pt.ipp.isep.dei.examples.basic.domain.Bloco4Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio11;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio17;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercicio17Test {

    @Test
    void isRectangularTrue() {
        new Exercicio17();
        //Arrange
        int[][] mat = new int[][] {
                {1,2,3},
                {4,5,6},

        };
        //Act
        boolean expected = Exercicio17.isARectangularMatrix(mat);

        //Assert
        assertTrue(expected);

    }

    @Test
    void isRectangular_IsSquareFalse() {
        //Arrange
        int[][] mat = new int[][] {
                {1,2},
                {4,5},

        };
        //Act
        boolean expected = Exercicio17.isARectangularMatrix(mat);

        //Assert
        assertFalse(expected);
    }

    @Test
    void isRectangular_IsIrregularFalse() {
        //Arrange
        int[][] mat = new int[][] {
                {1,2},
                {4,5},
                {4,3,1},

        };
        //Act
        boolean expected = Exercicio17.isARectangularMatrix(mat);

        //Assert
        assertFalse(expected);
    }
}
