package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.AndreTools;

import static org.junit.jupiter.api.Assertions.*;

class AndreToolsTest {

    @Test
    void countMultiplesNum () {
        int result = 3;
        int expected = AndreTools.countMultiplesNum(3, 9, 3);
        assertEquals(result, expected);
    }

    @Test
    void countMultiplesNumMinMaiorMAx () {
        int result = -1;
        int expected = AndreTools.countMultiplesNum(9, 3, 3);
        assertEquals(result, expected);
    }

    @Test
    void countMultiplesNumEqual0 () {
        int result = -1;
        int expected = AndreTools.countMultiplesNum(9, 3, 0);
        assertEquals(result, expected);
    }

    @Test
    void countMultiples2NumFrontierMax () {
        int result = 1;
        int expected = AndreTools.countMultiples2Num(5, 15, 3, 5);
        assertEquals(result, expected);
    }

    @Test
    void countMultiples2NumFrontierMin () {
        int result = 2;
        int expected = AndreTools.countMultiples2Num(15, 40, 3, 5);
        assertEquals(result, expected);
    }

    @Test
    void countMultiples2NumMinBiggerMax () {
        int result = -1;
        int expected = AndreTools.countMultiples2Num(40, 15, 3, 5);
        assertEquals(result, expected);
    }

    @Test
    void countMultiples2Num1Equals0 () {
        int result = -1;
        int expected = AndreTools.countMultiples2Num(15, 40, 0, 5);
        assertEquals(result, expected);
    }

    @Test
    void countMultiples2Num2Equals0 () {
        int result = -1;
        int expected = AndreTools.countMultiples2Num(15, 40, 3, 0);
        assertEquals(result, expected);
    }

    @Test
    void countMultiples2MinLowerZero () {
        int result = -1;
        int expected = AndreTools.countMultiples2Num(-5, 40, 3, 0);
        assertEquals(result, expected);
    }

}