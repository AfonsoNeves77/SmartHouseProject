package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test.Exercicio3Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio3.HugoEx3;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.HugoTools;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HugoEx3Test {

    // 3a----------------------------------------------------------
    @Test
    void resolucao3aSucesso() {
        int inf = 1;
        int sup = 5;
        int expected = 6;
        int result = HugoEx3.resolucao3a(inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void resolucao3aNegatives() {
        int inf = -5;
        int sup = -1;
        int expected = -6;
        int result = HugoEx3.resolucao3a(inf, sup);
        assertEquals(expected, result);
    }

    // 3b---------------------------------------------------------
    @Test
    void resolucao3b_Sucesso(){
        int inf = 1;
        int sup = 10;
        int expected = 5;
        int result = HugoEx3.resolucao3b(inf,sup);
        assertEquals(expected,result);
    }
    @Test
    void altResolucao3bSucess() {
        int inf = 1;
        int sup = 6;
        int[] expected = {2, 4, 6};
        int[] result = HugoEx3.alternativaResolucao3b(inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void altResolucao3bSucessNegatives() {
        int inf = -6;
        int sup = -1;
        int[] expected = {-6, -4, -2};
        int[] result = HugoEx3.alternativaResolucao3b(inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void altResolucao3bSucessNoneFound() {
        int inf = 1;
        int sup = 1;
        int[] expected = {};
        int[] result = HugoEx3.alternativaResolucao3b(inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void altResolucao3bSucessZeroes() {
        int inf = 0;
        int sup = 0;
        int[] expected = {0};
        int[] result = HugoEx3.alternativaResolucao3b(inf, sup);
        assertArrayEquals(expected, result);
    }

    // 3c-------------------------------------------------------------
    @Test
    void resolucao3cSuccess() {
        int inf = 1;
        int sup = 5;
        int expected = 9;
        int result = HugoEx3.resolucao3c(inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void resolucao3cNegatives() {
        int inf = -5;
        int sup = -1;
        int expected = -9;
        int result = HugoEx3.resolucao3c(inf, sup);
        assertEquals(expected, result);
    }

    //3d -----------------------------------------------------
    @Test
    void resolucao3d(){
        int inf = 0;
        int sup = 5;
        int expected = 3;
        int result = HugoEx3.resolucao3d(inf,sup);
        assertEquals(expected, result);
    }
    @Test
    void altResolucao3dSucess() {
        int inf = 1;
        int sup = 6;
        int[] expected = {1, 3, 5};
        int[] result = HugoEx3.altResolucao3d(inf,sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void altResolucao3dSucessNegatives() {
        int inf = -6;
        int sup = -1;
        int[] expected = {-5, -3, -1};
        int[] result = HugoEx3.altResolucao3d(inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void altResolucao3dSucessNoGap() {
        int inf = 1;
        int sup = 1;
        int[] expected = {1};
        int[] result = HugoEx3.altResolucao3d(inf, sup);
        assertArrayEquals(expected, result);
    }

    @Test
    void altResolucao3dSucessNoneFound() {
        int inf = 0;
        int sup = 0;
        int[] expected = {};
        int[] result = HugoEx3.altResolucao3d(inf, sup);
        assertArrayEquals(expected, result);
    }

    // 3e ------------------------------------------------
    @Test
    void resolucao3eSucessUsingSwap(){
        int num = 2;
        int inf = 7;
        int sup = 1;
        int expected = 12;
        int result = HugoEx3.resolucao3e(num,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void resolucao3eSucess(){
        int num = 3;
        int inf = 2;
        int sup = 8;
        int expected = 9;
        int result = HugoEx3.resolucao3e(num,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void resolucao3eNegatives(){
        int num = -3;
        int inf = -2;
        int sup = -8;
        int expected = -9;
        int result = HugoEx3.resolucao3e(num,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void resolucao3eNumZero(){
        int num = 0;
        int inf = -2;
        int sup = -8;
        int expected = 0;
        int result = HugoEx3.resolucao3e(num,inf,sup);
        assertEquals(expected,result);
    }

    // 3f -------------------------------------------------
    @Test
    void resolucao3fSucess(){
        int num = 2;
        int inf = 1;
        int sup = 5;
        int expected = 8;
        int result = HugoEx3.resolucao3f(num,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void resolucao3fNegatives(){
        int num = -2;
        int inf = -4;
        int sup = -1;
        int expected = 8;
        int result = HugoEx3.resolucao3f(num,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void resolucao3fZeroeInf(){
        int num = 2;
        int inf = 0;
        int sup = 4;
        int expected = 8;
        int result = HugoEx3.resolucao3f(num,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void resolucao3fZeroeSup(){
        int num = -2;
        int inf = -4;
        int sup = 0;
        int expected = 8;
        int result = HugoEx3.resolucao3f(num,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void resolucao3fZeroNum(){
        int num = 0;
        int inf = -1;
        int sup = 1;
        int expected = 0;
        int result = HugoEx3.resolucao3f(num,inf,sup);
        assertEquals(expected,result);
    }

    // 3g ---------------------------------------------------------------------
    @Test
    void resolucao3gSucess(){
        int num = 2;
        int inf = 0;
        int sup = 4;
        double expected = 2;
        double result = HugoEx3.resolucao3g(num,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void resolucao3gzero(){
        int num = 5;
        int inf = 0;
        int sup = 4;
        int expected = 0;
        double result = HugoEx3.resolucao3g(num,inf,sup);
        assertEquals(expected,result);
    }

    @Test
    void resolucao3gNegatives(){
        int num = -2;
        int inf = -4;
        int sup = -2;
        int expected = -3;
        double result = HugoEx3.resolucao3g(num,inf,sup);
        assertEquals(expected,result);
    }

    //3h -------------------------------------------------
    @Test
    void resolucao3hSucess(){
        int num1 = 2;
        int num2 = 3;
        int inf = 0;
        int sup = 10;
        double[] expected = {5, 4.5};
        double[] result = HugoEx3.resolucao3h(num1,num2,inf,sup);
        assertArrayEquals(expected,result);
    }

    @Test
    void resolucao3hnegatives(){
        int num1 = -2;
        int num2 = -3;
        int inf = -10;
        int sup = 0;
        double[] expected = {-5, -4.5};
        double[] result = HugoEx3.resolucao3h(num1,num2,inf,sup);
        assertArrayEquals(expected,result);
    }
}
