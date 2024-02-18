package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test.Exercicio5Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio5.AfonsoEx5;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AfonsoEx5Test {
    @Test
    void amstrongNumber() {
        boolean expected = AfonsoEx5.AmstrongNumber(153);
        assertTrue(expected);
    }

    @Test
    void amstrongNumberFalse() {
        boolean expected = AfonsoEx5.AmstrongNumber(111);
        assertFalse(expected);
    }

    @Test
    void amstrongNumberError() {
        boolean expected = AfonsoEx5.AmstrongNumber(0);
        assertFalse(expected);
    }

    @Test
    void isCapicua() {
        boolean expected = AfonsoEx5.isCapicua(-151);
        assertTrue(expected);
    }

    @Test
    void isCapicuaV2() {
        boolean expected = AfonsoEx5.isCapicua(0);
        assertTrue(expected);
    }

    @Test
    void isCapicuaFalse() {
        boolean expected = AfonsoEx5.isCapicua(456);
        assertFalse(expected);
    }

    @Test
    void firstNumber_RangeValuesAreTheSame() {
        int expected = AfonsoEx5.firstNumber(111,111,2);
        assertEquals(0,expected);
    }

    @Test
    void firstNumber_MinIsHigherThanMax() {
        int expected = AfonsoEx5.firstNumber(111,99,1);
        assertEquals(-2,expected);
    }


    @Test
    void firstCapicua() {
        int expected = AfonsoEx5.firstNumber(1,9,1);
        assertEquals(1,expected);
    }

    @Test
    void firstCapicua_CapicuaIsMaxValue() {
        int expected = AfonsoEx5.firstNumber(120,121,1);
        assertEquals(121,expected);
    }


    @Test
    void firstCapicua_ZeroCapicuas() {
        int expected = AfonsoEx5.firstNumber(23,25,1);
        assertEquals(0,expected);
    }

    @Test
    void firstAmstrong() {
        int expected = AfonsoEx5.firstNumber(350,2000,2);
        assertEquals(370,expected);
    }


    @Test
    void firstNumber_InvalidTypeOfNumber() {
        int expected = AfonsoEx5.firstNumber(111,121,3);
        assertEquals(-1,expected);
    }

    //--------------------------------------------------------------------------


    @Test
    void biggestCapicua() {
        int expected = AfonsoEx5.biggestCapicua(0,9);
        assertEquals(9,expected);
    }

    @Test
    void biggestCapicua_InfValueIsHigherThanMax() {
        int expected = AfonsoEx5.biggestCapicua(20,5);
        assertEquals(-1,expected);
    }

    @Test
    void biggestCapicua_RangeValuesAreEqual() {
        int expected = AfonsoEx5.biggestCapicua(9,9);
        assertEquals(9,expected);
    }

    @Test
    void biggestCapicua_RangeValuesAreEquual() {
        int expected = AfonsoEx5.biggestCapicua(9,10);
        assertEquals(9,expected);
    }

    @Test
    void biggestCapicua_RangeWithNoCapicuas() {
        int expected = AfonsoEx5.biggestCapicua(102,105);
        assertEquals(-1,expected);
    }

    //_______________________________________________________________________________

    @Test
    void numberOfCapicuas() {
        int[] expected = AfonsoEx5.numberOfSpecialNumbers(110,121,1);
        int[] a = {111,121};
        assertArrayEquals(expected,a);
    }

    @Test
    void numberOfCapicuasIsOnlyZero() {
        int[] expected = AfonsoEx5.numberOfSpecialNumbers(0,0,1);
        int[] a = {0};
        assertArrayEquals(expected,a);
    }

    @Test
    void numberOfSpecialNumber_InfIsHigherThanMax() {
        int[] expected = AfonsoEx5.numberOfSpecialNumbers(0,-3,1);
        int[] a = {};
        assertArrayEquals(expected,a);
    }

    @Test
    void numberOfAmstrongNumbers() {
        int[] expected = AfonsoEx5.numberOfSpecialNumbers(150,407,2);
        int[] a = {153,370,371,407};
        assertArrayEquals(expected,a);
    }


    @Test
    void numberOfAmstrongIsZero() {
        int[] expected = AfonsoEx5.numberOfSpecialNumbers(0,0,2);
        int[] a = {};
        assertArrayEquals(expected,a);
    }

    @Test
    void numberOfSpecialNumbersCounter_InvalidTypeOfNumber() {
        //Arrange
        int nMax = 153;
        int nMin = 151;
        int typeOfNumber = 3;
        int[] expected = {};

        //Act
        int[] result = AfonsoEx5.numberOfSpecialNumbers(nMin,nMax,typeOfNumber);

        //Assert
        assertArrayEquals(expected,result);
    }


    //------------------------------------------------------------------------------------------------------

    @Test
    void numberCounter_OneCapicua() {
        //Arrange
        int nMax = 10;
        int nMin = 5;
        int typeOfNumber = 1;
        int expected = 5;

        //Act
        int result = AfonsoEx5.numberCounter(nMin,nMax,typeOfNumber);

        //Assert
        assertEquals(expected,result);
    }

    @Test
    void numberCounter_OneAmstrongNumber() {
        //Arrange
        int nMax = 153;
        int nMin = 151;
        int typeOfNumber = 2;
        int expected = 1;

        //Act
        int result = AfonsoEx5.numberCounter(nMin,nMax,typeOfNumber);

        //Assert
        assertEquals(expected,result);
    }

    @Test
    void numberCounter_InvalidTypeOfNumber() {
        //Arrange
        int nMax = 153;
        int nMin = 151;
        int typeOfNumber = 3;
        int expected = -1;

        //Act
        int result = AfonsoEx5.numberCounter(nMin,nMax,typeOfNumber);

        //Assert
        assertEquals(expected,result);
    }




}
