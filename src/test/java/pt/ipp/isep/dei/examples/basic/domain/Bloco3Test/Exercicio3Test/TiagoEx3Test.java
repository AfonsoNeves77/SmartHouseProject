package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test.Exercicio3Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio3.TiagoEx3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TiagoEx3Test {
    //Exercicio3A-------------------------------------------------------------------------------------------------------
    @Test
    public void testeSomaNumsParesDeUmIntervalo() {
        int inf = 2;
        int sup = 6;
        int expected = 12;
        int result = TiagoEx3.sumOfEvenNumbersInARange(inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testeSomaNumsParesDeUmIntervaloLimite() {
        int inf = 0;
        int sup = 6;
        int expected = 12;
        int result = TiagoEx3.sumOfEvenNumbersInARange(inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testeSomaNumsParesDeUmIntervaloLimiteDiferente() {
        int inf = 0;
        int sup = 5;
        int expected = 6;
        int result = TiagoEx3.sumOfEvenNumbersInARange(inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testeSomaNumsParesDeUmIntervaloComNegativos() {
        int inf = -2;
        int sup = 6;
        int expected = 10;
        int result = TiagoEx3.sumOfEvenNumbersInARange(inf, sup);
        assertEquals(expected, result, 0.01);
    }

    //Exercicio 3B----------------------------------------------------------------------------------------------------------
    @Test
    public void testeQuantidadeDeNumsPares() {
        int inf = 2;
        int sup = 6;
        int expected = 3;
        int result = TiagoEx3.evenNumbersInARange(inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testeQuantidadeDeNumsParesCOmValorLimite() {
        int inf = 0;
        int sup = 6;
        int expected = 4;
        int result = TiagoEx3.evenNumbersInARange(inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testeQuantidadeDeNumsParesCOmValorNegativo() {
        int inf = -2;
        int sup = 6;
        int expected = 5;
        int result = TiagoEx3.evenNumbersInARange(inf, sup);
        assertEquals(expected, result, 0.01);
    }

    //Exercicio 3C----------------------------------------------------------------------------------------------------------
    @Test
    public void somaDeNumsImparesNumIntervalo() {
        int inf = 1;
        int sup = 3;
        int expected = 4;
        int result = TiagoEx3.sumOfOddNumbersInRange(inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void somaDeNumsImparesNumIntervaloLimite() {
        int inf = 0;
        int sup = 3;
        int expected = 4;
        int result = TiagoEx3.sumOfOddNumbersInRange(inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void somaDeNumsImparesNumIntervaloLimiteNegativo() {
        int inf = -1;
        int sup = 3;
        int expected = 3;
        int result = TiagoEx3.sumOfOddNumbersInRange(inf, sup);
        assertEquals(expected, result, 0.01);
    }

    //Exercicio 3D----------------------------------------------------------------------------------------------------------
    @Test
    public void listaDeNumerosImpares() {
        int inf = 0;
        int sup = 6;
        int expected = 3;
        int result = TiagoEx3.OddNumbersInARange(inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void listaDeNumerosImparesNumIntervaloIgual() {
        int inf = 6;
        int sup = 6;
        int expected = 0;
        int result = TiagoEx3.OddNumbersInARange(inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void listaDeNumerosImparesComLimiteNegativo() {
        int inf = -3;
        int sup = 6;
        int expected = 5;
        int result = TiagoEx3.OddNumbersInARange(inf, sup);
        assertEquals(expected, result, 0.01);
    }
//Exercicio 3E

    @Test
    public void somaDosMultiplosDeUmNumNumIntervaloNormal() {
        int num = 2;
        int inf = 2;
        int sup = 4;
        int expected = 6;
        int result = TiagoEx3.resolucao3e(num, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void somaDosMultiplosDeUmNumNumIntervaloIgual() {
        int num = 2;
        int inf = 2;
        int sup = 2;
        int expected = 2;
        int result = TiagoEx3.resolucao3e(num, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void somaDosMultiplosDeUmNumNumIntervaloLimite() {
        int num = 2;
        int inf = 0;
        int sup = 6;
        int expected = 12;
        int result = TiagoEx3.resolucao3e(num, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void somaDosMultiplosDeUmNumNegativo() {
        int num = -2;
        int inf = 0;
        int sup = 6;
        int expected = 12;
        int result = TiagoEx3.resolucao3e(num, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void somaDosMultiplosDeUmNumComIntervaloNegativo() {
        int num = 4;
        int inf = -4;
        int sup = 6;
        int expected = 0;
        int result = TiagoEx3.resolucao3e(num, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void somaDosMultiplosDeUmNumComIntervaloInverso() {
        int num = 4;
        int inf = 6;
        int sup = 4;
        int expected = 4;
        int result = TiagoEx3.resolucao3e(num, inf, sup);
        assertEquals(expected, result, 0.01);
    }

//Exercicio 3F----------------------------------------------------------------------------------------------------------

    @Test
    public void multiplicacaoDosMultiplosDeUmNumComIntervaloNormal() {
        int num = 2;
        int inf = 2;
        int sup = 4;
        int expected = 8;
        int result = TiagoEx3.resolucao3f(num, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void multiplicacaoDosMultiplosDeUmNumComIntervaloInvertido() {
        int num = 2;
        int inf = 4;
        int sup = 2;
        int expected = 8;
        int result = TiagoEx3.resolucao3f(num, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void multiplicacaoDosMultiplosDeUmNumComIntervaloLimite() {
        int num = 2;
        int inf = 0;
        int sup = 4;
        int expected = 0;
        int result = TiagoEx3.resolucao3f(num, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void multiplicacaoDosMultiplosDeUmNumComIntervaloNegativo() {
        int num = 2;
        int inf = -2;
        int sup = -1;
        int expected = -2;
        int result = TiagoEx3.resolucao3f(num, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    //Exercicio3G-----------------------------------------------------------------------------------------------------------
    @Test
    public void mediaDosMultiplosDeUmNum() {
        int num = 2;
        int inf = 2;
        int sup = 10;
        int expected = 6;
        double result = TiagoEx3.resolucao3g(num, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void mediaDosMultiplosDeUmNumSemMultiplosNoIntervalo() {
        int num = 7;
        int inf = 2;
        int sup = 5;
        double expected = -1;
        double result = TiagoEx3.resolucao3g(num, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void mediaDosMultiplosDeUmNumSemMultiplosNoIntervaloInvertido() {
        int num = 7;
        int inf = 5;
        int sup = 2;
        double expected = -1;
        double result = TiagoEx3.resolucao3g(num, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void mediaDosMultiplosDeUmNumComIntervaloLimite() {
        int num = 7;
        int inf = 0;
        int sup = 14;
        double expected = 7;
        double result = TiagoEx3.resolucao3g(num, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void mediaDosMultiplosDeUmNumComIntervaloNegativo() {
        int num = 7;
        int inf = -7;
        int sup = 14;
        double expected = 3.5;
        double result = TiagoEx3.resolucao3g(num, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    //Testes do 3H----------------------------------------------------------------------------------------------------------
    @Test
    public void mediaDosMultiplosdeDoisNumsPositivos() {
        int x = 2;
        int y = 4;
        int inf = 2;
        int sup = 4;
        double expected = 3.0;
        double result = TiagoEx3.resolucao3h(x, y, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void mediaDosMultiplosdeDoisNumsPositivosNumIntervaloInvertido() {
        int x = 2;
        int y = 4;
        int inf = 4;
        int sup = 2;
        double expected = 3.0;
        double result = TiagoEx3.resolucao3h(x, y, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void mediaDosMultiplosdeDoisNumsComIntervaloNegativo() {
        int x = 3;
        int y = 5;
        int inf = -4;
        int sup = 4;
        double expected = 0;
        double result = TiagoEx3.resolucao3h(x, y, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void mediaDosMultiplosdeDoisNumsComIntervaloIgual() {
        int x = 3;
        int y = 5;
        int inf = 4;
        int sup = 4;
        double expected = -1;
        double result = TiagoEx3.resolucao3h(x, y, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void casoEmQueNaoHaMultiplos() {
        int x = 4;
        int y = 7;
        int inf = 6;
        int sup = 6;
        double expected = -1;
        double result = TiagoEx3.resolucao3h(x, y, inf, sup);
        assertEquals(expected, result, 0.01);
    }
}