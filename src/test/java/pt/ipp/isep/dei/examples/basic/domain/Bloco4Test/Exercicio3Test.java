package pt.ipp.isep.dei.examples.basic.domain.Bloco4Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio1;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercicio3Test {

    @Test
    void sumArrayElements_Success () {
        new Exercicio3();
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        //Act
        int expected = 15;
        int result = Exercicio3.sumArrayElements(array);
        //Assert
        assertEquals(expected, result);
    }

    @Test
    void sumArrayElements_SuccessNegNumber () {
        //Arrange
        int[] array = {-1, -2, -3, -4, -5};
        //Act
        int expected = -15;
        int result = Exercicio3.sumArrayElements(array);
        //Assert
        assertEquals(expected, result);
    }

    @Test
    void sumArrayElements_SuccessEmptyArray () {
        //Arrange
        int[] array = {};
        //Act
        int expected = 0;
        int result = Exercicio3.sumArrayElements(array);
        //Assert
        assertEquals(expected, result);
    }


}
