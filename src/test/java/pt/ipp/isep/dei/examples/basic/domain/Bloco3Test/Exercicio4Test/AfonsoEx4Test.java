package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test.Exercicio4Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio4.AfonsoEx4;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AfonsoEx4Test {

    @Test
    void numberCounter() {
        int expected = AfonsoEx4.numberCounter(12345678912L,0);
        assertEquals(11,expected);
    }

    @Test
    void numberCounterOdd() {
        int expected = AfonsoEx4.numberCounter(12345678912L,1);
        assertEquals(6,expected);
    }

    @Test
    void numberCounterEven() {
        int expected = AfonsoEx4.numberCounter(12345678912L,2);
        assertEquals(5,expected);
    }

    @Test
    void numberCounterDefaultOption() {
        int expected = AfonsoEx4.numberCounter(12345678912L,3);
        assertEquals(-1,expected);
    }

    @Test
    void numberCounterNoNumbersCounted() {
        int expected = AfonsoEx4.numberCounter(22440,1);
        assertEquals(0,expected);
    }

    @Test
    void numberOfAlgarismLongNumber() {
        int[] expected = AfonsoEx4.numberOfAlgarisms(1234567890088900000L,0);
        int[] a = {0,0,0,0,0,9,8,8,0,0,9,8,7,6,5,4,3,2,1};
        assertArrayEquals(a,expected);
    }

    @Test
    void numberOfAlgarismZero() {
        int[] expected = AfonsoEx4.numberOfAlgarisms(0,0);
        int[] a = {0};
        assertArrayEquals(a,expected);
    }

    @Test
    void numberOfAlgarismNegNumber() {
        int[] expected = AfonsoEx4.numberOfAlgarisms(-1234567890088900000L,0);
        int[] a = {0,0,0,0,0,-9,-8,-8,0,0,-9,-8,-7,-6,-5,-4,-3,-2,-1};
        assertArrayEquals(a,expected);
    }

    @Test
    void numberOfEvenAlgarism() {
        int[] expected = AfonsoEx4.numberOfAlgarisms(5678,2);
        int[] a = {8,6};
        assertArrayEquals(a,expected);
    }

    @Test
    void numberOfEvenAlgarismV2() {
        int[] expected = AfonsoEx4.numberOfAlgarisms(-81466,2);
        int[] a = {-6,-6,-4,-8};
        assertArrayEquals(a,expected);
    }

    @Test
    void numberOfEvenAlgarismZero() {
        int[] expected = AfonsoEx4.numberOfAlgarisms(0,2);
        int[] a = {0};
        assertArrayEquals(a,expected);
    }


    @Test
    void numberOfOddAlgarisms() {
        int[] expected = AfonsoEx4.numberOfAlgarisms(813744616,1);
        int[] a = {1,7,3,1};
        assertArrayEquals(a,expected);
    }

    @Test
    void numberOfOddAlgarismsNegNumber() {
        int[] expected = AfonsoEx4.numberOfAlgarisms(-817379954466L,1);
        int[] a = {-5,-9,-9,-7,-3,-7,-1};
        assertArrayEquals(a,expected);
    }

    @Test
    void numberOfOddAlgarismsZero() {
        int[] expected = AfonsoEx4.numberOfAlgarisms(0,1);
        int[] a = {};
        assertArrayEquals(a,expected);
    }

    @Test
    void numberOfOddAlgarismsDefaultOption() {
        int[] expected = AfonsoEx4.numberOfAlgarisms(123,3);
        int[] a = {};
        assertArrayEquals(a,expected);
    }


    @Test
    void numberSum() {
        int expected = AfonsoEx4.numberSum(-15,0);
        assertEquals(-6,expected);
    }

    @Test
    void numberSumZero() {
        int expected = AfonsoEx4.numberSum(0,0);
        assertEquals(0,expected);
    }

    @Test
    void numberSumOdd() {
        int expected = AfonsoEx4.numberSum(649,1);
        assertEquals(9,expected);
    }

    @Test
    void numberSumEven() {
        int expected = AfonsoEx4.numberSum(727246,2);
        assertEquals(14,expected);
    }
    @Test
    void numberSumDefault() {
        int expected = AfonsoEx4.numberSum(649,3);
        assertEquals(-1,expected);
    }

    @Test
    void numberMedia() {
        double expected = AfonsoEx4.numberMedia(15,0);
        assertEquals(3,expected);
    }


    @Test
    void numberMediaV2() {
        double expected = AfonsoEx4.numberMedia(20,0);
        assertEquals(1,expected);
    }

    @Test
    void numberMediaEven() {
        double expected = AfonsoEx4.numberMedia(679312,2);
        assertEquals(4,expected);
    }

    @Test
    void numberMediaEvenV2() {
        double expected = AfonsoEx4.numberMedia(14820761,2);
        assertEquals(4,expected);
    }

    @Test
    void numberMediaOdd() {
        double expected = AfonsoEx4.numberMedia(670103,1);
        assertEquals(3.6,expected,0.1);
    }


    @Test
    void numberMediaOddZero() {
        double expected = AfonsoEx4.numberMedia(0,1);
        assertEquals(-1,expected);
    }


    @Test
    void numberMediaEvenZero() {
        double expected = AfonsoEx4.numberMedia(0,0);
        assertEquals(0,expected);
    }

    @Test
    void numberMediaZero() {
        double expected = AfonsoEx4.numberMedia(0,0);
        assertEquals(0,expected);
    }

    @Test
    void numberMediaZeroDefault() {
        double expected = AfonsoEx4.numberMedia(0,3);
        assertEquals(-1,expected);
    }


    @Test
    void invertingNumber() {
        long expected = AfonsoEx4.invertingNumber(1234567891L);
        assertEquals(1987654321,expected);
    }

    @Test
    void invertingNumberZero() {
        long expected = AfonsoEx4.invertingNumber(0);
        assertEquals(0,expected);
    }

    //-------------------------------------------------------

    @Test

    void numberInserter_OddNumbers() {
        //Arrange
        long n = 1234512345;
        int filter = 1; // Odd Numbers
        int[] array = new int[6];
        int[] expected = {5,3,1,5,3,1};

        //Act
        int[] result = AfonsoEx4.numberInserter(n,filter,array);
        //Assert

        assertArrayEquals(expected,result);
    }

    @Test

    void numberInserter_EvenNumbers() {
        //Arrange
        long n = 1234512345;
        int filter = 2; // Even Numbers
        int[] array = new int[4];
        int[] expected = {4,2,4,2};

        //Act
        int[] result = AfonsoEx4.numberInserter(n,filter,array);
        //Assert

        assertArrayEquals(expected,result);
    }
    @Test

    void numberInserter_NoFilter() {
        //Arrange
        long n = 1234512345;
        int filter = 0; // Even Numbers
        int[] array = new int[10];
        int[] expected = {5,4,3,2,1,5,4,3,2,1};

        //Act
        int[] result = AfonsoEx4.numberInserter(n,filter,array);
        //Assert

        assertArrayEquals(expected,result);
    }

    @Test

    void numberInserter_InvalidFilter() {
        //Arrange
        long n = 1234512345;
        int filter = -1; // Even Numbers
        int[] array = new int[10];
        int[] expected = {};

        //Act
        int[] result = AfonsoEx4.numberInserter(n,filter,array);
        //Assert
        assertArrayEquals(expected,result);
    }
}
