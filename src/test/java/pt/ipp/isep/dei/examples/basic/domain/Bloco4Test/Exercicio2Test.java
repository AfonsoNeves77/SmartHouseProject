package pt.ipp.isep.dei.examples.basic.domain.Bloco4Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio1;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio2;

import static org.junit.jupiter.api.Assertions.*;

public class Exercicio2Test {

    @Test
    void numDigitsIntoArray_Success () {
        new Exercicio2();
        //Arrange
        int num = 12345;
        //Act
        int[] expected = {1,2,3,4,5};
        int[] result = Exercicio2.numDigitsIntoArray(num);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void numDigitsIntoArray_Zero () {
        //Arrange
        int num = 0;
        //Act
        int[] result = Exercicio2.numDigitsIntoArray(num);
        //Assert
        assertNull(result);
    }

    @Test
    void numDigitsIntoArray_Negative () {
        //Arrange
        int num = -12354;
        //Act
        int[] result = Exercicio2.numDigitsIntoArray(num);
        //Assert
        assertNull(result);
    }

}
