package pt.ipp.isep.dei.examples.basic.domain.Bloco4Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio1;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio8;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio8Test {

    @Test
    void firstNElementsOfAVector_SuccessTest() {
        new Exercicio8();
        //Arrange
        int[] array = {1,2,5,6,8,9,11,14};
        int numberOfElements = 3;
        int[] expected = {1,2,5};
        //Act
        int[] result = Exercicio8.firstNElementsOfAVector(array,numberOfElements);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void firstNElementsOfAVector_NoElementsRequested() {
        //Arrange
        int[] array = {1,2,5,6,8,9,11,14};
        int numberOfElements = 0;
        int[] expected = {};
        //Act
        int[] result = Exercicio8.firstNElementsOfAVector(array,numberOfElements);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void firstNElementsOfAVector_NegativeNumberOfElementsRequested() {
        //Arrange
        int[] array = {1,2,5,6,8,9,11,14};
        int numberOfElements = -4;
        int[] expected = null;
        //Act
        int[] result = Exercicio8.firstNElementsOfAVector(array,numberOfElements);
        //Assert
        assertArrayEquals(expected,result);
    }
}