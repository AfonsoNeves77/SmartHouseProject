package pt.ipp.isep.dei.examples.basic.domain.Bloco4Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio1;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio9;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio9Test {

    @Test
    void multiplesOfNumber3_SuccessMultiplesFound() {
        new Exercicio9();
        //Arrange
        int inf = 4;
        int sup = 10;
        int[] expected = {6,9};
        //Act
        int[] result = Exercicio9.multiplesOfNumber3InChosenRange(inf,sup);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void multiplesOfNumber3_NoMultiples() {
        //Arrange
        int inf = 10;
        int sup = 11;
        int[] expected = {};
        //Act
        int[] result = Exercicio9.multiplesOfNumber3InChosenRange(inf,sup);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void multiplesOfNumber3_ErrorInfExtremeHigherThanSupExtreme() {
        //Arrange
        int inf = 20;
        int sup = 10;
        int[] expected = {};
        //Act
        int[] result = Exercicio9.multiplesOfNumber3InChosenRange(inf,sup);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void multiplesOfNumber3_IntervalWithNegativeAndPositiveExtremes() {
        //Arrange
        int inf = -6;
        int sup = 12;
        int[] expected = {};
        //Act
        int[] result = Exercicio9.multiplesOfNumber3InChosenRange(inf,sup);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void multiplesOfNumber3_SameIntervalExtremesWithMultiples() {
        //Arrange
        int inf = 6;
        int sup = 6;
        int[] expected = {6};
        //Act
        int[] result = Exercicio9.multiplesOfNumber3InChosenRange(inf,sup);
        //Assert
        assertArrayEquals(expected,result);
    }
    @Test
    void multiplesOfNumber3_SameIntervalExtremesNoMultiples() {
        //Arrange
        int inf = 7;
        int sup = 7;
        int[] expected = {};
        //Act
        int[] result = Exercicio9.multiplesOfNumber3InChosenRange(inf,sup);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void multiplesOfNumber3_InfEqualsZero() {
        //Arrange
        int inf = 0;
        int sup = 7;
        int[] expected = {0,3,6};
        //Act
        int[] result = Exercicio9.multiplesOfNumber3InChosenRange(inf,sup);
        //Assert
        assertArrayEquals(expected,result);
    }
}