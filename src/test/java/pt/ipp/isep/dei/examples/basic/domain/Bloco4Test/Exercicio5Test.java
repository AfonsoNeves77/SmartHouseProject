package pt.ipp.isep.dei.examples.basic.domain.Bloco4Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio1;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio5;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Exercicio5Test {
    @Test
    public void oddNumbersInArray() {
        new Exercicio5();
        //Arrange
        int[] array = {4,5,7,8};
        int[] expected = {5,7};
        //Act
        int[] result = Exercicio5.oddNumbersInArray(array);
        //Arrange
        assertArrayEquals(expected, result);
    }
    @Test
    public void oddNumbersInArray_NegativeAndPositiveNumbers() {
        //Arrange
        int[] array = {4,-7,7,-14};
        int[] expected = {-7,7};
        //Act
        int[] result = Exercicio5.oddNumbersInArray(array);
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    public void oddNumbersInArray_EmptyArray() {
        //Arrange
        int[] array = {};
        int[] expected = {};
        //Act
        int[] result = Exercicio5.oddNumbersInArray(array);
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    public void oddNumbersInArray_OnlyEvenNumbers() {
        //Arrange
        int[] array = {2,4,6,8,10};
        int[] expected = {};
        //Act
        int[] result = Exercicio5.oddNumbersInArray(array);
        //Assert
        assertArrayEquals(expected, result);
    }

}
