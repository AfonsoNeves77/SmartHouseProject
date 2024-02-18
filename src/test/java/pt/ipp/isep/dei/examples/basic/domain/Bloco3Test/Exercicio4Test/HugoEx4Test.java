package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test.Exercicio4Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio4.HugoEx4;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HugoEx4Test {
    @Test
    void resolucao4a(){
        long num = 12345;
        long expected = 5;
        long result = HugoEx4.resolucao4a(num);
        assertEquals(expected,result);
    }
    @Test
    void altResolucao4aSucess(){
        int num = 12345;
        int[] expected = {1,2,3,4,5};
        int[] result = HugoEx4.altResolucao4a(num);
        assertArrayEquals(expected,result);
    }

    @Test
    void altResolucao4aZero(){
        int num = 0;
        int[] expected = {0};
        int[] result = HugoEx4.altResolucao4a(num);
        assertArrayEquals(expected,result);
    }

    @Test
    void altResolucao4a100(){
        int num = 100;
        int[] expected = {1,0,0};
        int[] result = HugoEx4.altResolucao4a(num);
        assertArrayEquals(expected,result);
    }

    // 4b-------------------------------------------------
    @Test
    void resolucao4b(){
        long num = 12345;
        long expected = 2;
        long result = HugoEx4.resolucao4b(num);
        assertEquals(expected,result);
    }
    @Test
    void altResolucao4bSuccess(){
        int num = 123456;
        int[] expected = {2,4,6};
        int[] result = HugoEx4.altResolucao4b(num);
        assertArrayEquals(expected,result);
    }

    @Test
    void altResolucao4bSuccessL(){
        int num = 874584;
        int[] expected = {8,4,8,4};
        int[] result = HugoEx4.altResolucao4b(num);
        assertArrayEquals(expected,result);
    }

    // 4c ----------------------------------------------------
    @Test
    void resolucao4c(){
        long num = 12345;
        long expected = 3;
        long result = HugoEx4.resolucao4c(num);
        assertEquals(expected,result);
    }
    @Test
    void altResolucao4cSucess(){
        long num = 12345;
        long[] expected = {1,2,3,4,5};
        long[] result = HugoEx4.altResolucao4c(num);
        assertArrayEquals(expected,result);
    }

    @Test
    void altResolucao4cZero(){
        long num = 0;
        long[] expected = {0};
        long[] result = HugoEx4.altResolucao4c(num);
        assertArrayEquals(expected,result);
    }

    @Test
    void altResolucao4c100(){
        long num = 100;
        long[] expected = {1,0,0};
        long[] result = HugoEx4.altResolucao4c(num);
        assertArrayEquals(expected,result);
    }

    // 4d-------------------------------------------------------------------

    @Test
    void resolucao4d(){
        long num = 12345;
        long expected = 15;
        long result = HugoEx4.resolucao4d(num);
        assertEquals(expected,result);
    }

    // 4e-------------------------------------------------------------------------
    @Test
    void resolucao4e(){
        long num = 123456;
        long expected = 12;
        long result = HugoEx4.resolucao4e(num);
        assertEquals(expected,result);
    }

    // 4f ----------------------------------------------------------------------------
    @Test
    void resolucao4f(){
        long num = 123456;
        long expected = 9;
        long result = HugoEx4.resolucao4f(num);
        assertEquals(expected,result);
    }

    // 4g -----------------------------------------------------------------------------
    @Test
    void resolucao4g(){
        long num = 123456;
        double expected = 3.5;
        double result = HugoEx4.resolucao4g(num);
        assertEquals(expected,result);
    }

    // 4h----------------------------------------------------------------------------------
    @Test
    void resolucao4h(){
        long num = 123456;
        double expected = 4;
        double result = HugoEx4.resolucao4h(num);
        assertEquals(expected,result);
    }

    // 4i ---------------------------------------------------------------------------------
    @Test
    void resolucao4i(){
        long num = 123456;
        double expected = 3;
        double result = HugoEx4.resolucao4i(num);
        assertEquals(expected,result);
    }

    //4j -----------------------------------------------------------------------------------
    @Test
    void resolucao4j(){
        long num = 123456;
        long expected = 654321;
        long result = HugoEx4.resolucao4j(num);
        assertEquals(expected,result);
    }

}
