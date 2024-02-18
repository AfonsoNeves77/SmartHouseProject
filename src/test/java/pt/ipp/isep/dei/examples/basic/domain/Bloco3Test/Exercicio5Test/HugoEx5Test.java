package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test.Exercicio5Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio5.HugoEx5;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HugoEx5Test {

    @Test
    void resolucao5a(){
        long num = 1221;
        boolean expected = true;
        boolean result = HugoEx5.resolucao5a(num);
        assertEquals(expected,result);
    }

    @Test
    void resolucao5aFalse(){
        long num = 1220;
        boolean expected = false;
        boolean result = HugoEx5.resolucao5a(num);
        assertEquals(expected,result);
    }

    @Test
    void resolucao5aSingleDigit(){
        long num = 1;
        boolean expected = true;
        boolean result = HugoEx5.resolucao5a(num);
        assertEquals(expected,result);
    }

    // 5b -------------------------------------------------------------------
    @Test
    void resolucao5b(){
        long num = 407;
        boolean expected = true;
        boolean result = HugoEx5.resolucao5b(num);
        assertEquals(expected,result);
    }
    @Test
    void resolucao5bfalse(){
        long num = 405;
        boolean expected = false;
        boolean result = HugoEx5.resolucao5b(num);
        assertEquals(expected,result);
    }

    // 5c ----------------------------------------------------------------------------
    @Test
    void resolucao5cSucess() {
        int inf = 10;
        int sup = 20;
        long expected = 11;
        long result = HugoEx5.resolucao5c(inf, sup);
        assertEquals(expected, result);


    }

    // 5d -----------------------------------------------------------------------------
    @Test
    void resolucao5d(){
        int inf = 9;
        int sup = 13;
        long expected = 11;
        long result = HugoEx5.resolucao5d(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void resolucao5dNeg(){ // this works if biggest means higher number, if biggest means most digits it does not
        int inf = -13;
        int sup = -9;
        long expected = -9;
        long result = HugoEx5.resolucao5d(inf,sup);
        assertEquals(expected,result);
    }
    @Test
    void resolucao5e(){
        int inf = 0;
        int sup = 11;
        int expected = 11;
        int result = HugoEx5.resolucao5e(inf,sup);
        assertEquals(expected,result);
    }
    @Test
    void altResolucao5eSucess(){
        int inf = 9;
        int sup = 13;
        long [] expected = {9, 11};
        long [] result = HugoEx5.altResolucao5e(inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void altResolucao5eSingle(){
        int inf = 9;
        int sup = 10;
        long [] expected = {9};
        long [] result = HugoEx5.altResolucao5e(inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void altResolucao5eSwappedRanges(){
        int inf = 10;
        int sup = 9;
        long [] expected = null;
        long [] result = HugoEx5.altResolucao5e(inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void altResolucao5eSeveral(){
        int inf = 5;
        int sup = 22;
        long [] expected = {5,6,7,8,9,11,22};
        long [] result = HugoEx5.altResolucao5e(inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void resolucao5fSucess(){
        int inf = 152;
        int sup = 154;
        long expected = 153;
        long result = HugoEx5.resolucao5f(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void resolucao5fNoneFound(){
        int inf = 3;
        int sup = 5;
        long expected = -1;
        long result = HugoEx5.resolucao5f(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void resolucao5fSwappedRanges(){
        int inf = 5;
        int sup = 3;
        long expected = -2;
        long result = HugoEx5.resolucao5f(inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void resolucao5gSucesss(){
        int inf = 0;
        int sup = 3;
        long[] expected = {0,1};
        long[] result = HugoEx5.resolucao5g(inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void resolucao5gNegative(){
        int inf = -5;
        int sup = 0;
        long[] expected = {-1,0};
        long[] result = HugoEx5.resolucao5g(inf,sup);
        assertArrayEquals(expected,result);
    }
}
