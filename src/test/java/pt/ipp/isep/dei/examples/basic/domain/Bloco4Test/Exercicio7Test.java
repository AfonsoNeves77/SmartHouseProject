package pt.ipp.isep.dei.examples.basic.domain.Bloco4Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio1;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio7;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio7Test {

    @Test
    void sumOfOddDigitsOfAPositiveNumber_NumberWithOddDigits() {
        new Exercicio7();
        //Arrange
        int number = 123456789;
        int expected = 25;
        //Act
        int result = Exercicio7.sumOfOddDigitsOfAPositiveNumber(number);
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void sumOfOddDigitsOfAPositiveNumber_NegativeNumber() {
        //Arrange
        int number = -123456789;
        int expected = 0;
        //Act
        int result = Exercicio7.sumOfOddDigitsOfAPositiveNumber(number);
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void sumOfOddDigitsOfAPositiveNumber_NumberZero() {
        //Arrange
        int number = 0;
        int expected = 0;
        //Act
        int result = Exercicio7.sumOfOddDigitsOfAPositiveNumber(number);
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void sumOfOddDigitsOfAPositiveNumber_NumberWithoutddDigits() {
        //Arrange
        int number = 224466;
        int expected = 0;
        //Act
        int result = Exercicio7.sumOfOddDigitsOfAPositiveNumber(number);
        //Assert
        assertEquals(expected,result);
    }
}