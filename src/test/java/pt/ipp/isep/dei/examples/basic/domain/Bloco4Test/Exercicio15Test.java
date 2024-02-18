package pt.ipp.isep.dei.examples.basic.domain.Bloco4Test;
import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio11;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercicio15Test {

    @Test
    void isIrregular() {
        new Exercicio15();
        //Arrange
        int[][] matrixIrregular = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9}
        };
        int expected = -1;
        //Act
        int result = Exercicio15.numberMatrixColumns(matrixIrregular);
        //Assert
        assertEquals(expected,result);

    }

    @Test
    void isRegularNumberColumns() {
        //Arrange
        int[][] matrixIrregular = {
                {1,2,3},
                {4,5,6},
                {8,9,4}
        };
        int expected = 3;
        //Act
        int result = Exercicio15.numberMatrixColumns(matrixIrregular);
        //Assert
        assertEquals(expected,result);

    }


}
