package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test.Exercicio5Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio5.AndreEx5;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AndreEx5Test {

    //a) Testes
    @Test
    void verificaSeNumeroCapicua_Zero () {
        boolean expected = false;
        boolean result = AndreEx5.verificaSeNumeroCapicua(0);
        assertEquals (expected, result);
    }

    @Test
    void verificaSeNumeroCapicua_NaoCapicua () {
        boolean expected = false;
        boolean result = AndreEx5.verificaSeNumeroCapicua(123);
        assertEquals (expected, result);
    }

    @Test
    void verificaSeNumeroCapicua_NaoCapicuaNegativo () {
        boolean expected = false;
        boolean result = AndreEx5.verificaSeNumeroCapicua(-123);
        assertEquals (expected, result);
    }

    @Test
    void verificaSeNumeroCapicua_Capicua () {
        boolean expected = true;
        boolean result = AndreEx5.verificaSeNumeroCapicua(121);
        assertEquals (expected, result);
    }

    @Test
    void verificaSeNumeroCapicua_Capicua1Algarismo () {
        boolean expected = true;
        boolean result = AndreEx5.verificaSeNumeroCapicua(1);
        assertEquals (expected, result);
    }

    @Test
    void verificaSeNumeroCapicua_CapicuaNegativo () {
        boolean expected = true;
        boolean result = AndreEx5.verificaSeNumeroCapicua(-121);
        assertEquals (expected, result);
    }

    @Test
    void verificaSeNumeroCapicua_CapicuaDigitosPares () {
        boolean expected = true;
        boolean result = AndreEx5.verificaSeNumeroCapicua(1231221321);
        assertEquals (expected, result);
    }

    //b) testes

    @Test
    void verificaSeNumeroArmstrong_Zero () {
        boolean expected = false;
        boolean result = AndreEx5.verificaSeNumeroArmstrong(0);
        assertEquals (expected, result);
    }

    @Test
    void verificaSeNumeroArmstrong_NaoArmstrong () {
        boolean expected = false;
        boolean result = AndreEx5.verificaSeNumeroArmstrong(111);
        assertEquals (expected, result);
    }

    @Test
    void verificaSeNumeroArmstrong_Armstrong () {
        boolean expected = true;
        boolean result = AndreEx5.verificaSeNumeroArmstrong(407);
        assertEquals (expected, result);
    }


    //c) Testes

    @Test
    void retornaPrimeiraCapicuaNumIntervalo_Sucesso () {
        int expected = 22;
        int result = AndreEx5.retornaPrimeiraCapicuaNumIntervalo(12, 34);
        assertEquals(result, expected);
    }

    @Test
    void retornaPrimeiraCapicuaNumIntervalo_SemCapicua () {
        int expected = -1;
        int result = AndreEx5.retornaPrimeiraCapicuaNumIntervalo(12, 21);
        assertEquals(result, expected);
    }

    //d) Testes
    @Test
    void retornaMaiorCapicuaNumIntervalo_Sucesso () {
        int expected = 101;
        int result = AndreEx5.retornaMaiorCapicuaNumIntervalo(12, 101);
        assertEquals(result, expected);
    }

    @Test
    void retornaMaiorCapicuaNumIntervalo_SemCapicua () {
        int expected = -1;
        int result = AndreEx5.retornaMaiorCapicuaNumIntervalo(12, 21);
        assertEquals(result, expected);
    }

    //e) Testes

    @Test
    void retornaQuantidadeCapicuasNumIntervalo_Sucesso () {
        int expected = 2;
        int result = AndreEx5.retornaQuantidadeCapicuasNumIntervalo(12, 34);
        assertEquals(result, expected);
    }

    @Test
    void retornaQuantidadeCapicuasNumIntervalo_Sucesso1a9 () {
        int expected = 9;
        int result = AndreEx5.retornaQuantidadeCapicuasNumIntervalo(1, 9);
        assertEquals(result, expected);
    }

    @Test
    void retornaQuantidadeCapicuasNumIntervalo_SemCapicua () {
        int expected = 0;
        int result = AndreEx5.retornaQuantidadeCapicuasNumIntervalo(12, 21);
        assertEquals(result, expected);
    }

    //f) Testes
    @Test
    void retornaPrimeiroNumeroArmstrongNumIntervalo_Sucesso () {
        int expected = 153;
        int result = AndreEx5.retornaPrimeiroNumeroArmstrongNumIntervalo(100, 400);
        assertEquals(result, expected);
    }

    @Test
    void retornaPrimeiroNumeroArmstrongNumIntervalo_SemArmstrong () {
        int expected = -1;
        int result = AndreEx5.retornaPrimeiroNumeroArmstrongNumIntervalo(155, 350);
        assertEquals(result, expected);
    }

    //g) Testes

    //f) Testes
    @Test
    void retornaQuantidadeNumerosArmstrongNumIntervalo_Sucesso () {
        int expected = 4;
        int result = AndreEx5.retornaQuantidadeNumerosArmstrongNumIntervalo(100, 450);
        assertEquals(result, expected);
    }

    @Test
    void retornaQuantidadeNumerosArmstrongNumIntervalo_SemArmstrong () {
        int expected = 0;
        int result = AndreEx5.retornaQuantidadeNumerosArmstrongNumIntervalo(155, 350);
        assertEquals(result, expected);
    }



}
