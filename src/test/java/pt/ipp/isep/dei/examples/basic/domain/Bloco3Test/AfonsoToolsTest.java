package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.AfonsoTools;

import static org.junit.jupiter.api.Assertions.*;

public class AfonsoToolsTest {
    @Test
    void isAboveOneFalse() {
        boolean expected = AfonsoTools.isAboveOne(1);
        assertTrue(expected);
    }

    @Test

    void isAboveOneTrue() {
        boolean expected = AfonsoTools.isAboveOne(0);
        assertFalse(expected);
    }

    @Test
    void isZeroFalse() {
        boolean expected = AfonsoTools.isZero(-1);
        assertFalse(expected);
    }

    @Test
    void isZeroTrue() {
        boolean expected = AfonsoTools.isZero(0);
        assertTrue(expected);
    }

    @Test
    void isEvenTrue() {
        boolean expected = AfonsoTools.isEven(2);
        assertTrue(expected);
    }

    @Test
    void isEvenFalse() {
        boolean expected = AfonsoTools.isEven(3);
        assertFalse(expected);
    }


    @Test
    void quantityOfMultiplesOfaCertainNumber() {
       int expected = AfonsoTools.numberOfMultiplesOfaCertainNumber(3,15,10);
       assertEquals(2,expected);
    }

    @Test
    void quantityOfMultiplesMaxInfThanMin() {
        int expected = AfonsoTools.numberOfMultiplesOfaCertainNumber(3,10,15);
        assertEquals(-1,expected);
    }

    @Test
    void quantityOfMultiplesNumMinorThanZero() {
        int expected = AfonsoTools.numberOfMultiplesOfaCertainNumber(0,15,12);
        assertEquals(-2,expected);
    }

    @Test
    void numberOfMultiplesOfTwoCertainNumbers() {
        int expected = AfonsoTools.numberOfTwoMultiplesOfaCertainNumber(3,2,20,10);
        assertEquals(2,expected);
    }

    @Test
    void numberOfMultiplesOfTwoCertainNumbers_nIsNegative() {
        int expected = AfonsoTools.numberOfTwoMultiplesOfaCertainNumber(-3,2,20,10);
        assertEquals(-2,expected);
    }

    @Test
    void numberOfMultiplesOfTwoCerutainNumbers_zIsZero() {
        int expected = AfonsoTools.numberOfTwoMultiplesOfaCertainNumber(3,0,20,10);
        assertEquals(-2,expected);
    }

    @Test
    void multiplesOfaCertainNumber() {
        int[] expected = AfonsoTools.multiplesOfaCertainNumber(3, 15, 10);
        int[] a = {12,15};
        assertArrayEquals(expected,a);
    }

    @Test
    void multiplesOfZero() {
        int[] expected = AfonsoTools.multiplesOfaCertainNumber(0,15,10);
        int[] a = {};
        assertArrayEquals(expected,a);
    }

    @Test
    void multiplesOfMinusTwo() {
        int[] expected = AfonsoTools.multiplesOfaCertainNumber(-2,0,-8);
        int[] a = {-8,-6,-4,-2,0};
        assertArrayEquals(expected,a);
    }

    @Test
    void multiplesOfTwoNmbers() {
        int[] expected = AfonsoTools.multiplesOfTwoNumbers(2,3,15,10);
        int[] a = {10, 12, 14, 12, 15};
        assertArrayEquals(expected,a);
    }

    @Test
    void multiplesOfTwoNumbersZero() {
        int[] expected = AfonsoTools.multiplesOfTwoNumbers(0,0,15,10);
        int[] a = {};
        assertArrayEquals(expected,a);
    }

    @Test
    void multiplesOfTwoNumbersOneZero() {
        int[] expected = AfonsoTools.multiplesOfTwoNumbers(0,3,15,10);
        int[] a = {12,15};
        assertArrayEquals(expected,a);
    }

    @Test
    void summingElementsArray() {
        int[] b = {1,2,4};
        int expected = AfonsoTools.summingMultipleNumbers(b);
        assertEquals(expected,7);
    }





}
