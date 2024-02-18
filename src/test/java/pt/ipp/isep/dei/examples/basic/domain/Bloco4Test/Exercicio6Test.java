package pt.ipp.isep.dei.examples.basic.domain.Bloco4Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio1;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio6;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercicio6Test {
    @Test
    public void sumOfEvenDigitsOfANumber() {
        new Exercicio6();
        //Arrange
        int number = 2222;
        int expected = 8;
        //Act
        int result = Exercicio6.sumOfEvenDigitsOfANumber(number);
        //Assert
        assertEquals(expected, result);
    }

    @Test
    public void sumOfEvenDigitsOfANumber_NegativeNumber() {
        //Arrange
        int number = -24572;
        int expected = 0;
        //Act
        int result = Exercicio6.sumOfEvenDigitsOfANumber(number);
        //Assert
        assertEquals(expected, result);
    }

    @Test
    public void sumOfEvenAlgarismsInNumber_NumberZero() {
        //Arrange
        int number = 0;
        int expected = 0;
        //Act
        int result = Exercicio6.sumOfEvenDigitsOfANumber(number);
        //Assert
        assertEquals(expected, result);
    }

}
