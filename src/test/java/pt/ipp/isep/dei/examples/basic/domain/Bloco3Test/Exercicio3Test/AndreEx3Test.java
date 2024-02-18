package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test.Exercicio3Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio3.AndreEx3;

import static org.junit.jupiter.api.Assertions.*;

class AndreEx3Test {

    //a) testes
    @Test
    void calcularSomaParesNumIntervaloMinMenor0 () {
        int expected = -1;
        int result = AndreEx3.calcularSomaParesNumIntervalo(-1, 50);
        assertEquals(expected, result);
    }

    @Test
    void calcularSomaParesNumIntervaloMinMaiorMax () {
        int expected = -1;
        int result = AndreEx3.calcularSomaParesNumIntervalo(75, 50);
        assertEquals(expected, result);
    }

    @Test
    void calcularSomaParesNumIntervaloFronteira () {
        int expected = 30;
        int result = AndreEx3.calcularSomaParesNumIntervalo(2, 10);
        assertEquals(expected, result);
    }

    @Test
    void calcularSomaParesNumIntervaloSucesso () {
        int expected = 250;
        int result = AndreEx3.calcularSomaParesNumIntervalo(45, 55);
        assertEquals(expected, result);
    }

    //b) teste
    @Test
    void calcularQuantidadeParesNumIntervaloMinMenor0 () {
        int expected = -1;
        int result = AndreEx3.calcularQuantidadeParesNumIntervalo(-5, 10);
        assertEquals(expected,result);
    }

    @Test
    void calcularQuantidadeParesNumIntervaloMinMaiorMax () {
        int expected = -1;
        int result = AndreEx3.calcularQuantidadeParesNumIntervalo(34, 10);
        assertEquals(expected,result);
    }

    @Test
    void calcularQuantidadeParesNumIntervaloFronteira () {
        int expected = 5;
        int result = AndreEx3.calcularQuantidadeParesNumIntervalo(2, 10);
        assertEquals(expected, result);
    }

    @Test
    void calcularQuantidadeParesNumIntervaloSucesso () {
        int expected = 6;
        int result = AndreEx3.calcularQuantidadeParesNumIntervalo(45, 57);
        assertEquals(expected, result);
    }

    //c) testes
    @Test
    void calcularSomaImparesNumIntervaloMinMenor0 () {
        int expected = -1;
        int result = AndreEx3.calcularSomaImparesNumIntervalo(-1, 50);
        assertEquals(expected, result);
    }

    @Test
    void calcularSomaImparesNumIntervaloMinMaiorMax () {
        int expected = -1;
        int result = AndreEx3.calcularSomaImparesNumIntervalo(75, 50);
        assertEquals(expected, result);
    }

    @Test
    void calcularSomaImparesNumIntervaloFronteira () {
        int expected = 24;
        int result = AndreEx3.calcularSomaImparesNumIntervalo(3, 9);
        assertEquals(expected, result);
    }

    @Test
    void calcularSomaImparesNumIntervaloSucesso () {
        int expected = 300;
        int result = AndreEx3.calcularSomaImparesNumIntervalo(44, 56);
        assertEquals(expected, result);
    }

    //d) testes
    @Test
    void calcularQuantidadeImparesNumIntervaloMinMenor0 () {
        int expected = -1;
        int result = AndreEx3.calcularQuantidadeImparesNumIntervalo(-1, 50);
        assertEquals(expected, result);
    }

    @Test
    void calcularQuantidadeImparesNumIntervaloMinMaiorMax () {
        int expected = -1;
        int result = AndreEx3.calcularQuantidadeImparesNumIntervalo(75, 50);
        assertEquals(expected, result);
    }

    @Test
    void calcularQuantidadeImparesNumIntervaloFronteira () {
        int expected = 4;
        int result = AndreEx3.calcularQuantidadeImparesNumIntervalo(3, 9);
        assertEquals(expected, result);
    }

    @Test
    void calcularQuantidadeImparesNumIntervaloSucesso () {
        int expected = 6;
        int result = AndreEx3.calcularQuantidadeImparesNumIntervalo(44, 56);
        assertEquals(expected, result);
    }

    //e) testes
    @Test
    void somaMultiplosDadoNumeroNumIntervaloCrescenteOuDecrescenteMinMenor0 () {
        int expected = -1;
        int result = AndreEx3.somaMultiplosDadoNumeroNumIntervaloCrescenteOuDecrescente(-1, 50, 3);
        assertEquals(expected, result);
    }

    @Test
    void somaMultiplosDadoNumeroNumIntervaloCrescenteOuDecrescenteMinMaiorMax () {
        int expected = 50;
        int result = AndreEx3.somaMultiplosDadoNumeroNumIntervaloCrescenteOuDecrescente(20, 5, 5);
        assertEquals(expected, result);
    }

    @Test
    void somaMultiplosDadoNumeroNumIntervaloCrescenteOuDecrescenteFronteira () {
        int expected = 50;
        int result = AndreEx3.somaMultiplosDadoNumeroNumIntervaloCrescenteOuDecrescente(5, 20, 5);
        assertEquals(expected, result);
    }

    @Test
    void somaMultiplosDadoNumeroNumIntervaloCrescenteOuDecrescenteSucesso () {
        int expected = 45;
        int result = AndreEx3.somaMultiplosDadoNumeroNumIntervaloCrescenteOuDecrescente(6, 21, 5);
        assertEquals(expected, result);
    }

    //f) testes
    @Test
    void produtoMultiplosDadoNumeroNumIntervaloCrescenteOuDecrescenteMinMenor0 () {
        int expected = -1;
        int result = AndreEx3.produtoMultiplosDadoNumeroNumIntervaloCrescenteOuDecrescente(-1, 50, 3);
        assertEquals(expected, result);
    }

    @Test
    void produtoMultiplosDadoNumeroNumIntervaloCrescenteOuDecrescenteMinMaiorMax () {
        int expected = 294;
        int result = AndreEx3.produtoMultiplosDadoNumeroNumIntervaloCrescenteOuDecrescente(27, 14, 7);
        assertEquals(expected, result);
    }

    @Test
    void produtoMultiplosDadoNumeroNumIntervaloCrescenteOuDecrescenteFronteira () {
        int expected = 162;
        int result = AndreEx3.produtoMultiplosDadoNumeroNumIntervaloCrescenteOuDecrescente(3, 9, 3);
        assertEquals(expected, result);
    }

    @Test
    void produtoMultiplosDadoNumeroNumIntervaloCrescenteOuDecrescenteForaFronteira () {
        int expected = 3240;
        int result = AndreEx3.produtoMultiplosDadoNumeroNumIntervaloCrescenteOuDecrescente(10, 20, 3);
        assertEquals(expected, result);
    }

    //g) testes
    @Test
    void mediaMultiplosDadoNumeroNumIntervaloMinMenor0 () {
        double expected = -1;
        double result = AndreEx3.mediaMultiplosDadoNumeroNumIntervalo(-1, 50, 3);
        assertEquals(expected, result, 0.01);
    }

    @Test
    void mediaMultiplosDadoNumeroNumIntervaloMinMaiorMax () {
        double expected = 17.5;
        double result = AndreEx3.mediaMultiplosDadoNumeroNumIntervalo(27, 14, 7);
        assertEquals(expected, result, 0.01);
    }

    @Test
    void mediaMultiplosDadoNumeroNumIntervaloFronteira () {
        double expected = 7.5;
        double result = AndreEx3.mediaMultiplosDadoNumeroNumIntervalo(3, 12, 3);
        assertEquals(expected, result, 0.01);
    }

    @Test
    void mediaMultiplosDadoNumeroNumIntervaloForaFronteira () {
        double expected = 15;
        double result = AndreEx3.mediaMultiplosDadoNumeroNumIntervalo(9, 21, 5);
        assertEquals(expected, result, 0.01);
    }

    //f) testes

    @Test
    void mediaMultiplosDeDoisNumerosNumIntervaloMinMenor0 () {
        double expected = -1;
        double result = AndreEx3.mediaMultiplosDeDoisNumerosNumIntervalo(-1, 50, 3, 7);
        assertEquals(expected, result, 0.01);
    }

    @Test
    void mediaMultiplosDeDoisNumerosNumIntervaloMinMaiorMax () {
        double expected = 19;
        double result = AndreEx3.mediaMultiplosDeDoisNumerosNumIntervalo(27, 14, 7, 5);
        assertEquals(expected, result, 0.01);
    }

    @Test
    void mediaMultiplosDeDoisNumerosNumIntervaloFronteira () {
        double expected = 11.875;
        double result = AndreEx3.mediaMultiplosDeDoisNumerosNumIntervalo(5, 20, 3, 5);
        assertEquals(expected, result, 0.01);
    }

    @Test
    void mediaMultiplosDeDoisNumerosNumIntervaloForaFronteira () {
        double expected = 10.714;
        double result = AndreEx3.mediaMultiplosDeDoisNumerosNumIntervalo(4, 19, 5, 3);
        assertEquals(expected, result, 0.01);
    }

}