package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test.Exercicio4Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio4.TiagoEx4;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TiagoEx4Test {
    @Test
    public void numeroPositivo() {
        //Arrange
        int num = 8458;
        int expected = 4;
        //Act
        int result = TiagoEx4.countOfAlgarismsInANumber(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void numero0() {
        //Arrange
        int num = 0;
        int expected = 1;
        //Act
        int result = TiagoEx4.countOfAlgarismsInANumber(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void numeroGrande() {
        //Arrange
        int num = 57085264;
        int expected = 8;
        //Act
        int result = TiagoEx4.countOfAlgarismsInANumber(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void numeroNegativo() {
        //Arrange
        int num = -753;
        int expected = 3;
        //Act
        int result = TiagoEx4.countOfAlgarismsInANumber(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }
//Exercicio4B-----------------------------------------------------------------------------------------------------------

    @Test
    public void algarismosParesDeUmNum() {
        //Arrange
        int num = 722;
        int expected = 2;
        //Act
        int result = TiagoEx4.countOfEvenAlgarismsInANumber(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void algarismosParesDeUmNumGrande() {
        //Arrange
        int num = 722458168;
        int expected = 6;
        //Act
        int result = TiagoEx4.countOfEvenAlgarismsInANumber(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }

//Exercicio4C-----------------------------------------------------------------------------------------------------------

    @Test
    public void algarismosImparesDeUmNum() {
        //Arrange
        int num = 722;
        int expected = 1;
        //Act
        int result = TiagoEx4.countOfOddAlgarismsInANumber(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }
    @Test
    public void algarismosImparesDeUmNumInexistente() {
        //Arrange
        int num = 22;
        int expected = 0;
        //Act
        int result = TiagoEx4.countOfOddAlgarismsInANumber(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void algarismosImparesDeUmNumGrande() {
        //Arrange
        int num = 123456789;
        int expected = 5;
        //Act
        int result = TiagoEx4.countOfOddAlgarismsInANumber(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }
//Exercicio4D-----------------------------------------------------------------------------------------------------------

    @Test
    public void somaDosAlgarismosDeUmNum() {
        //Arrange
        long num = 145;
        long expected = 10;
        //Act
        long result = TiagoEx4.sumOfNumbersInARange(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void somaDosAlgarismosDeUmNumGrande() {
        //Arrange
        long num = 178462;
        long expected = 28;
        //Act
        long result = TiagoEx4.sumOfNumbersInARange(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }
//Exercicio4E-----------------------------------------------------------------------------------------------------------

    @Test
    public void somaDosAlgarismosParesDeUmNumGrande() {
        //Arrange
        long num = 178462;
        long expected = 20;
        //Act
        long result = TiagoEx4.sumOfEvenNumbersInARange(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void somaDosAlgarismosParesDeUmNumGrandeNegativo() {
        //Arrange
        long num = -24;
        long expected = -6;
        //Act
        long result = TiagoEx4.sumOfEvenNumbersInARange(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void somaDosAlgarismosParesDeUmNumComAlgarismosRepetidos() {
        //Arrange
        long num = 222222222;
        long expected = 18;
        //Act
        long result = TiagoEx4.sumOfEvenNumbersInARange(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }
    //Exercicio 4F-----------------------------------------------------------------------------------------------------
    @Test
    public void somaDosAlgarismosImparesDeUmNumGrande() {
        //Arrange
        long num = 178462;
        long expected = 20;
        //Act
        long result = TiagoEx4.sumOfEvenNumbersInARange(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void somaDosAlgarismosImparesDeUmNumComAlgarismosRepetidos() {
        //Arrange
        long num = 222222222;
        long expected = 18;
        //Act
        long result = TiagoEx4.sumOfEvenNumbersInARange(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }

//Exercicio 4G---------------------------------------------------------------------------------------------------------

    @Test
    public void averageOfNumbersInALongNumber1() {
        //Arrange
        long num = 25798;
        double expected = 6.2;
        //Act
        double result = TiagoEx4.averageOfNumbersInALongNumber(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void averageOfNumbersInALongNumber2() {
        //Arrange
        long num = -4732;
        double expected = -4;
        //Act
        double result = TiagoEx4.averageOfNumbersInALongNumber(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }
    //Exercicio4H----------------------------------------------------------------------------------------------------
    @Test
    public void averageOfEvenNumbersInALongNumber1() {
        //Arrange
        long num = 25798;
        double expected = 5;
        //Act
        double result = TiagoEx4.averageOfEvenNumbersInALongNumber(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }
    @Test
    public void averageOfEvenNumbersInALongNumberWithoutEvenNumbers() {
        //Arrange
        long num = 11111;
        double expected = -1;
        //Act
        double result = TiagoEx4.averageOfEvenNumbersInALongNumber(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void averageOfEvenNumbersInALongNumber2() {
        //Arrange
        long num = -4732;
        double expected = -3;
        //Act
        double result = TiagoEx4.averageOfEvenNumbersInALongNumber(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }
    //Exercicio4I------------------------------------------------------------------------------------------------

    @Test
    public void averageOfOddNumbersInALongNumber1() {
        //Arrange
        long num = 25798;
        double expected = 7;
        //Act
        double result = TiagoEx4.averageOfOddNumbersInALongNumber(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }
    @Test
    public void averageOfOddNumbersInALongNumberWithNoOddNumbers() {
        //Arrange
        long num = 22222;
        double expected = -1;
        //Act
        double result = TiagoEx4.averageOfOddNumbersInALongNumber(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void averageOfOddNumbersInALongNumber2() {
        //Arrange
        long num = -4732;
        double expected = -5;
        //Act
        double result = TiagoEx4.averageOfOddNumbersInALongNumber(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }
    //Exercicio 4J--------------------------------------------------------------------------------------------
    @Test
    public void invertNumber1() {
        //Arrange
        long num = 12345;
        double expected = 54321;
        //Act
        double result = TiagoEx4.invertNumber(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }
    @Test
    public void invertNumber2() {
        //Arrange
        long num = 54785;
        double expected = 58745;
        //Act
        double result = TiagoEx4.invertNumber(num);
        //Assert
        assertEquals(expected, result, 0.01);
    }
}
