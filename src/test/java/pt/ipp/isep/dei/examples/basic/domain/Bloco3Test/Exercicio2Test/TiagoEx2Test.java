package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test.Exercicio2Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio2.TiagoEx2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TiagoEx2Test {
    //Exercicio2------------------------------------------------------------------------------------------------------------
//Exercicio2A-----------------------------------------------------------------------------------------------------------

    @Test
    public void testeMultiplosDe3() {
        int inf = 10;
        int sup = 15;
        int expected = 2;
        int result = TiagoEx2.resolucao2a(inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testeMultiplosDe3ValorFronteira() {
        int inf = 0;
        int sup = 10;
        int expected = 4;
        int result = TiagoEx2.resolucao2a(inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testeMultiplosDe3ValoresNegativos() {
        int inf = -3;
        int sup = 10;
        int expected = 5;
        int result = TiagoEx2.resolucao2a(inf, sup);
        assertEquals(expected, result, 0.01);
    }

//Exercicio2B-----------------------------------------------------------------------------------------------------------

    @Test
    public void testeMultiplosDeN() {
        int num = 3;
        int inf = 10;
        int sup = 15;
        int expected = 2;
        int result = TiagoEx2.resolucao2b(num, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testeMultiplosDeNDiferente() {
        int num = 5;
        int inf = 10;
        int sup = 15;
        int expected = 2;
        int result = TiagoEx2.resolucao2b(num, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testeMultiplosDeNLimite() {
        int num = 2;
        int inf = 0;
        int sup = 4;
        int expected = 2;
        int result = TiagoEx2.resolucao2b(num, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testeMultiplosDeNNegativo() {
        int num = -2;
        int inf = 0;
        int sup = 4;
        int expected = 2;
        int result = TiagoEx2.resolucao2b(num, inf, sup);
        assertEquals(expected, result, 0.01);
    }
//Exercicio2C-----------------------------------------------------------------------------------------------------------

    @Test
    public void testeMultiplosDe3E5() {
        int inf = 10;
        int sup = 15;
        int expected = 1;
        int result = TiagoEx2.resolucao2c(inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testeMultiplosDe3E5NoutroIntervalo() {
        int inf = 0;
        int sup = 33;
        int expected = 3;
        int result = TiagoEx2.resolucao2c(inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testeMultiplosDe3E5EmIntervaloNegativo() {
        int inf = -16;
        int sup = 33;
        int expected = 4;
        int result = TiagoEx2.resolucao2c(inf, sup);
        assertEquals(expected, result, 0.01);
    }

//Exercicio2D-----------------------------------------------------------------------------------------------------------

    @Test
    public void testeMultiploDeDoisNums() {
        int num1 = 3;
        int num2 = 5;
        int inf = 10;
        int sup = 15;
        int expected = 1;
        int result = TiagoEx2.resolucao2d(num1, num2, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testeMultiploDeDoisNumsDiferentes() {
        int num1 = 2;
        int num2 = 4;
        int inf = 0;
        int sup = 8;
        int expected = 3;
        int result = TiagoEx2.resolucao2d(num1, num2, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testeMultiploDeDoisNumsDiferentesComUmNegativo() {
        int num1 = -4;
        int num2 = 4;
        int inf = -4;
        int sup = 8;
        int expected = 4;
        int result = TiagoEx2.resolucao2d(num1, num2, inf, sup);
        assertEquals(expected, result, 0.01);
    }

//Exercicio2E-----------------------------------------------------------------------------------------------------------

    @Test
    public void testeSomaMultiplosDeDoisNums() {
        int num1 = 2;
        int num2 = 4;
        int inf = 1;
        int sup = 10;
        int expected = 12;
        int result = TiagoEx2.resolucao2e(num1, num2, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testeSomaMultiplosDeDoisNumsDiferentes() {
        int num1 = 4;
        int num2 = 6;
        int inf = 0;
        int sup = 24;
        int expected = 36;
        int result = TiagoEx2.resolucao2e(num1, num2, inf, sup);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testeSomaMultiplosDeDoisNumsComUmNegativo() {
        int num1 = -12;
        int num2 = 6;
        int inf = -12;
        int sup = 24;
        int expected = 24;
        int result = TiagoEx2.resolucao2e(num1, num2, inf, sup);
        assertEquals(expected, result, 0.01);
    }
}