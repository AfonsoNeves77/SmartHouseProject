package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test.Exercicio2Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.AfonsoTools;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio2.AfonsoEx2;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio3.AfonsoEx3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AfonsoEx2Test {

    //A)

    @Test
    void quantityOfMultiplesOfThree() {
        //Arrange 
        int nMax = 15; 
        int nMin = 10;
        int expected = 2;
        //Act
        int result = AfonsoEx2.numberOfMultiplesOfThree(nMax,nMin);
        //Assert
        assertEquals(expected,result);
    }

    //B)

    @Test
    void quantityOfMultiplesOfaCertainNumber() {
        //Arrange
        int nMax = 15;
        int nMin = 10;
        int expected = 2;
        int number = 3;
        //Act
        int result = AfonsoEx2.numberOfMultiplesOfaCertainNumber(number,nMax,nMin);
        //Assert
        assertEquals(expected,result);
    }

    //C/D)
    @Test
    void quantityOfMultiplesOfTwoNumbers() {
        int result = AfonsoEx2.numberOfMultiplesOfTwoNumbers(3,2,20,15);
        assertEquals(1,result);
    }

    //C/D)

    @Test
    void numberofMultipesOfTwoCertainNumbersInvalid() {
        int result = AfonsoEx2.numberOfMultiplesOfTwoNumbers(-3,2,20,10);
        assertEquals(-2,result);
    }

    //E)

    @Test
    void sumOfTwoMultipleNumbers() {
        int result = AfonsoEx2.sumOfTwoMultipleNumbers(0,3,15,10);

        assertEquals(result,27);
    }

    @Test
    void sumOfTwoMultipleZero() {
        int result = AfonsoEx2.sumOfTwoMultipleNumbers(0,0,15,10);

        assertEquals(result,-1);
    }





}
