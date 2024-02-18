package pt.ipp.isep.dei.examples.basic.domain.Bloco4Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio11;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio16;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class Exercicio16Test {

    @Test
    void isSquareTrue() {
        new Exercicio16();
        //Arrange
        int[][] squareMat = {
                {1,2},
                {4,5},

        };
        //Act
        boolean result = Exercicio16.isaSquareExercise(squareMat);
        //Assert
        assertTrue(result);

    }

    @Test
    void isSquareFalse() {
        //Arrange
        int[][] squareMat =  {
                {1,2},
                {4,5},
                {4,5},

        };
        //Act
        boolean result = Exercicio16.isaSquareExercise(squareMat);
        //Assert
        assertFalse(result);

    }

}
