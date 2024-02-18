package pt.ipp.isep.dei.examples.basic.domain.Bloco4Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercicio1Test {

    @Test
    void digitCounter () {
        new Exercicio1();
        //Arrange
        int num = 12345;
        //Act
        int expected = 5;
        int result = Exercicio1.digitCounter(num);
        //Assert
        assertEquals (expected, result);
    }
    @Test
    void digitCounter_Negative () {
        //Arrange
        int num = -12345;
        //Act
        int expected = -1;
        int result = Exercicio1.digitCounter(num);
        //Assert
        assertEquals (expected, result);
    }

    @Test
    void rdigitCounter_Zero () {
        //Arrange
        int num = 0;
        //Act
        int expected = -1;
        int result = Exercicio1.digitCounter(0);
        //Assert
        assertEquals (expected, result);
    }

}
