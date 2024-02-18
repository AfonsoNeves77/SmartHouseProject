package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test.Exercicio2Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio2.AndreEx2;

import static org.junit.jupiter.api.Assertions.*;

class AndreEx2Test {

    @Test
    void countMultiples3 () {
        int result = 3;
        int expected = AndreEx2.countMultiples3(3, 9);
        assertEquals(expected, result);
    }

    @Test
    void countMultiples3And5 () {
        int result = 1;
        int expected = AndreEx2.countMultiples3And5(5, 15);
        assertEquals(expected, result);
    }

    @Test
    void countMultiples2Num () {
        int result = 1;
        int expected = AndreEx2.countMultiples2Num(5, 15, 3, 5);
        assertEquals(expected, result);
    }

    @Test
    void sumMultiples2NumSuccessFrontierMax () {
        int result = 15;
        int expected = AndreEx2.sumMultiples2Num(5, 15,3,5);
        assertEquals(result, expected);
    }

    @Test
    void sumMultiples2NumSuccessFrontierMin () {
        int result = 45;
        int expected = AndreEx2.sumMultiples2Num(15, 40,3,5);
        assertEquals(result, expected);
    }

    @Test
    void sumMultiples2NumSuccess2MultiplesMinZero () {
        int result = 45;
        int expected = AndreEx2.sumMultiples2Num(0, 40,3,5);
        assertEquals(result, expected);
    }

    @Test
    void sumMultiples2NumMinBiggerMax () {
        int result = -1;
        int expected = AndreEx2.sumMultiples2Num(40, 5,3,5);
        assertEquals(result, expected);
    }

    @Test
    void sumMultiples2NumNum1EqualsZero () {
        int result = -1;
        int expected = AndreEx2.sumMultiples2Num(5, 40,0,5);
        assertEquals(result, expected);
    }

    @Test
    void sumMultiples2NumNum2EqualsZero () {
        int result = -1;
        int expected = AndreEx2.sumMultiples2Num(5, 40,3,0);
        assertEquals(result, expected);
    }

    @Test
    void sumMultiples2NumMinLowerZero () {
        int result = -1;
        int expected = AndreEx2.sumMultiples2Num(-5, 40,3,0);
        assertEquals(result, expected);
    }
}