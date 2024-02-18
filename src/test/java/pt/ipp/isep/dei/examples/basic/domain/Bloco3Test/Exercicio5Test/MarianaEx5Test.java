package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test.Exercicio5Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio5.MarianaEx5;

import static org.junit.jupiter.api.Assertions.*;

class MarianaEx5Test {
    @Test
    void isItACapicua_Test01True() {
        long numberN = 1234321;
        boolean result = MarianaEx5.isItACapicua(numberN);
        assertTrue(result);
    }

    @Test
    void isItACapicua_Test02False() {
        long numberN = 12344444444L;
        boolean result = MarianaEx5.isItACapicua(numberN);
        assertFalse(result);
    }

    @Test
    void isItACapicua_Test03False() {
        long numberN = 0;
        boolean result = MarianaEx5.isItACapicua(numberN);
        assertFalse(result);
    }

    @Test
    void isItAnAmstrongNumber_Test01True() {
        long numberN = 407;
        boolean result = MarianaEx5.isItAnAmstrongNumber(numberN);
        assertTrue(result);
    }

    @Test
    void isItAnAmstrongNumber_Test02False() {
        long numberN = 450;
        boolean result = MarianaEx5.isItAnAmstrongNumber(numberN);
        assertFalse(result);
    }

    @Test
    void isItAnAmstrongNumber_Test03TrueNumberZero() {
        long numberN = 0;
        boolean result = MarianaEx5.isItAnAmstrongNumber(numberN);
        assertTrue(result);
    }

    @Test
    void returnFirstCapicuaInAnInterval_Test01PositiveCase() {
        int inf = 100;
        int sup = 900;
        int expected = 101;
        int result = MarianaEx5.returnFirstCapicuaInAnInterval(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void returnFirstCapicuaInAnInterval_Test02ImpossibleCase() {
        int inf = 2070;
        int sup = 2110;
        int expected = -1;
        int result = MarianaEx5.returnFirstCapicuaInAnInterval(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void returnFirstCapicuaInAnInterval_Test03ImpossibleCase() {
        int inf = 30000;
        int sup = 500;
        int expected = -1;
        int result = MarianaEx5.returnFirstCapicuaInAnInterval(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void returnFirstCapicuaInAnInterval_Test04ImpossibleCase() {
        int inf = 30000;
        int sup = 30000;
        int expected = -1;
        int result = MarianaEx5.returnFirstCapicuaInAnInterval(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void returnFirstCapicuaInAnInterval_Test05ImpossibleCase() {
        int inf = 30003;
        int sup = 30003;
        int expected = -1;
        int result = MarianaEx5.returnFirstCapicuaInAnInterval(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void returnLastCapicuaInAnInterval_Test01PositiveCase() {
        int inf = 100;
        int sup = 900;
        int expected = 898;
        int result = MarianaEx5.returnLastCapicuaInAnInterval(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void returnLastCapicuaInAnInterval_Test02ImpossibleCase() {
        int inf = 2070;
        int sup = 2110;
        int expected = -1;
        int result = MarianaEx5.returnLastCapicuaInAnInterval(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void returnLastCapicuaInAnInterval_Test03ImpossibleCase() {
        int inf = 30000;
        int sup = 500;
        int expected = -1;
        int result = MarianaEx5.returnLastCapicuaInAnInterval(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void returnLastCapicuaInAnInterval_Test04ImpossibleCase() {
        int inf = 30000;
        int sup = 30000;
        int expected = -1;
        int result = MarianaEx5.returnLastCapicuaInAnInterval(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void returnLastCapicuaInAnInterval_Test05ImpossibleCase() {
        int inf = 30003;
        int sup = 30003;
        int expected = -1;
        int result = MarianaEx5.returnLastCapicuaInAnInterval(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void numberOfCapicuasInAnInterval_Test01PossibleCase() {
        int inf = 100;
        int sup = 200;
        int expected = 10;
        int result = MarianaEx5.numberOfCapicuasInAnInterval(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void numberOfCapicuasInAnInterval_Test02ImpossibleCase() {
        int inf = 200;
        int sup = 100;
        int expected = -1;
        int result = MarianaEx5.numberOfCapicuasInAnInterval(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void numberOfCapicuasInAnInterval_Test03ImpossibleCase() {
        int inf = 200;
        int sup = 200;
        int expected = -1;
        int result = MarianaEx5.numberOfCapicuasInAnInterval(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void numberOfCapicuasInAnInterval_Test04ZeroCase() {
        int inf = 203;
        int sup = 211;
        int expected = 0;
        int result = MarianaEx5.numberOfCapicuasInAnInterval(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void returnFirstAmstrongNumberInAnInterval_Test01PositiveCase() {
        int inf = 100;
        int sup = 900;
        int expected = 153;
        int result = MarianaEx5.returnFirstAmstrongNumberInAnInterval(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void returnFirstAmstrongNumberInAnInterval_Test02ImpossibleCase() {
        int inf = 375;
        int sup = 405;
        int expected = -1;
        int result = MarianaEx5.returnFirstAmstrongNumberInAnInterval(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void returnFirstAmstrongNumberInAnInterval_Test03ImpossibleCase() {
        int inf = 30000;
        int sup = 500;
        int expected = -1;
        int result = MarianaEx5.returnFirstAmstrongNumberInAnInterval(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void returnFirstAmstrongNumberInAnInterval_Test04ImpossibleCase() {
        int inf = 30000;
        int sup = 30000;
        int expected = -1;
        int result = MarianaEx5.returnFirstAmstrongNumberInAnInterval(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void returnFirstAmstrongNumberInAnInterval_Test05ImpossibleCase() {
        int inf = 30003;
        int sup = 30003;
        int expected = -1;
        int result = MarianaEx5.returnFirstAmstrongNumberInAnInterval(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void numberOfAmstrongsInAnInterval_Test01PossibleCase() {
        int inf = 0;
        int sup = 410;
        int expected = 6;
        int result = MarianaEx5.numberOfAmstrongsInAnInterval(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void numberOfAmstrongsInAnInterval_Test02ImpossibleCase() {
        int inf = 200;
        int sup = 100;
        int expected = -1;
        int result = MarianaEx5.numberOfAmstrongsInAnInterval(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void numberOfAmstrongsInAnInterval_Test03ImpossibleCase() {
        int inf = 200;
        int sup = 200;
        int expected = -1;
        int result = MarianaEx5.numberOfAmstrongsInAnInterval(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void numberOfAmstrongsInAnInterval_Test04ZeroCase() {
        int inf = 154;
        int sup = 350;
        int expected = 0;
        int result = MarianaEx5.numberOfAmstrongsInAnInterval(inf,sup);
        assertEquals(expected,result);
    }

}