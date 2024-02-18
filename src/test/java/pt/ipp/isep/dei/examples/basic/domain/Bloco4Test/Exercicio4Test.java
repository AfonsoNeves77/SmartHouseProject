package pt.ipp.isep.dei.examples.basic.domain.Bloco4Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio1;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio4;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Exercicio4Test {
    @Test
    public void evenNumbersInArray() {
        new Exercicio4();
        //Arrange
        int[] array = {4, 5, 7, 8};
        int[] expected = {4, 8};
        //Act
        int[] result = Exercicio4.evenNumbersInArray(array);
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    public void evenNumbersInArray_PositiveAndNegativeNumbers() {
        //Arrange
        int[] array = {4, -7, 7, -14};
        int[] expected = {4, -14};
        //Act
        int[] result = Exercicio4.evenNumbersInArray(array);
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    public void evenNumbersInArray_EmptyArray() {
        //Arrange
        int[] array = {};
        int[] expected = {};
        //Act
        int[] result = Exercicio4.evenNumbersInArray(array);
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    public void evenNumbersInArray_OnlyOddNumbers() {
        //Arrange
        int[] array = {1,3,5,9};
        int[] expected = {};
        //Act
        int[] result = Exercicio4.evenNumbersInArray(array);
        //Assert
        assertArrayEquals(expected, result);
    }
}
