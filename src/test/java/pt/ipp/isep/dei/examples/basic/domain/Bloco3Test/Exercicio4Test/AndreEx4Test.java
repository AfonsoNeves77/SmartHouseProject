package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test.Exercicio4Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio4.AndreEx4;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AndreEx4Test {


    //a) teste
    @Test
    void contaNumeroAlgarismosNumInteiroLongo_Sucesso (){
        long numero = 12340;
        long expected = 5;
        long result = AndreEx4.contaNumeroAlgarismosNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    @Test
    void contaNumeroAlgarismosNumInteiroLongo_Zero (){
        long numero = 0;
        long expected = 1;
        long result = AndreEx4.contaNumeroAlgarismosNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    @Test
    void contaNumeroAlgarismosNumInteiroLongo_Negativo (){
        long numero = -12340;
        long expected = 5;
        long result = AndreEx4.contaNumeroAlgarismosNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    //B) testes
    @Test
    void contaNumeroAlgarismosParesNumInteiroLongo_Sucesso (){
        long numero = 12340;
        long expected = 3;
        long result = AndreEx4.contaNumeroAlgarismosParesNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    @Test
    void contaNumeroAlgarismosParesNumInteiroLongo_Zero (){
        long numero = 0;
        long expected = 1;
        long result = AndreEx4.contaNumeroAlgarismosParesNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    @Test
    void contaNumeroAlgarismosParesNumInteiroLongo_Negativo (){
        long numero = -12340;
        long expected = 3;
        long result = AndreEx4.contaNumeroAlgarismosParesNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    //C) testes

    @Test
    void contaNumeroAlgarismosImparesNumInteiroLongo_Sucesso (){
        long numero = 12340;
        long expected = 2;
        long result = AndreEx4.contaNumeroAlgarismosImparesNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    @Test
    void contaNumeroAlgarismosImparesNumInteiroLongo_Zero (){
        long numero = 0;
        long expected = 1;
        long result = AndreEx4.contaNumeroAlgarismosImparesNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    @Test
    void contaNumeroAlgarismosImparesNumInteiroLongo_Negativo (){
        long numero = -12340;
        long expected = 2;
        long result = AndreEx4.contaNumeroAlgarismosImparesNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    //d) Testes
    @Test
    void somaAlgarismosNumInteiroLongo_Sucesso (){
        long numero = 12340;
        long expected = 10;
        long result = AndreEx4.somaAlgarismosNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    @Test
    void somaAlgarismosNumInteiroLongo_Zero (){
        long numero = 0;
        long expected = 0;
        long result = AndreEx4.somaAlgarismosNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    @Test
    void somaAlgarismosNumInteiroLongo_Negativo (){
        long numero = -12340;
        long expected = -10;
        long result = AndreEx4.somaAlgarismosNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    //e) Testes

    @Test
    void somaAlgarismosParesNumInteiroLongo_Sucesso (){
        long numero = 12340;
        long expected = 6;
        long result = AndreEx4.somaAlgarismosParesNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    @Test
    void somaAlgarismosParesNumInteiroLongo_Zero (){
        long numero = 0;
        long expected = 0;
        long result = AndreEx4.somaAlgarismosParesNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    @Test
    void somaAlgarismosParesNumInteiroLongo_Negativo (){
        long numero = -12340;
        long expected = -6;
        long result = AndreEx4.somaAlgarismosParesNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    //f) testes

    @Test
    void somaAlgarismosImparesNumInteiroLongo_Sucesso (){
        long numero = 12340;
        long expected = 4;
        long result = AndreEx4.somaAlgarismosImparesNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    @Test
    void somaAlgarismosImparesNumInteiroLongo_Zero (){
        long numero = 0;
        long expected = 0;
        long result = AndreEx4.somaAlgarismosImparesNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    @Test
    void somaAlgarismosImparesNumInteiroLongo_Negativo (){
        long numero = -12340;
        long expected = -4;
        long result = AndreEx4.somaAlgarismosImparesNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    //g) testes

    @Test
    void mediaAlgarismosNumInteiroLongo_Sucesso (){
        long numero = 12340;
        double expected = 2;
        double result = AndreEx4.mediaAlgarismosNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    @Test
    void mediaAlgarismosNumInteiroLongo_Zero (){
        long numero = 0;
        double expected = 0;
        double result = AndreEx4.mediaAlgarismosNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    @Test
    void mediaAlgarismosNumInteiroLongo_Negativo (){
        long numero = -12340;
        double expected = -2;
        double result = AndreEx4.mediaAlgarismosNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    //h) testes
    @Test
    void mediaAlgarismosParesNumInteiroLongo_Sucesso (){
        long numero = 12340;
        double expected = 2;
        double result = AndreEx4.mediaAlgarismosParesNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    @Test
    void mediaAlgarismosParesNumInteiroLongo_Zero (){
        long numero = 0;
        double expected = 0;
        double result = AndreEx4.mediaAlgarismosParesNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    @Test
    void mediaAlgarismosParesNumInteiroLongo_Negativo (){
        long numero = -12340;
        double expected = -2;
        double result = AndreEx4.mediaAlgarismosParesNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    //i) Testes

    @Test
    void mediaAlgarismosImparesNumInteiroLongo_Sucesso (){
        long numero = 12340;
        double expected = 2;
        double result = AndreEx4.mediaAlgarismosImparesNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    @Test
    void mediaAlgarismosImparesNumInteiroLongo_Zero (){
        long numero = 0;
        double expected = 0;
        double result = AndreEx4.mediaAlgarismosImparesNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    @Test
    void mediaAlgarismosImparesNumInteiroLongo_Negativo (){
        long numero = -12340;
        double expected = -2;
        double result = AndreEx4.mediaAlgarismosImparesNumInteiroLongo(numero);
        assertEquals(expected, result);
    }

    //j) testes
    @Test
    void inverteOrdemAlgarismosIntLongo_Sucesso () {
        long numero = 4321;
        long expected = 1234;
        long result = AndreEx4.inverteOrdemAlgarismosIntLongo(numero);
        assertEquals (expected, result);
    }

    @Test
    void inverteOrdemAlgarismosIntLongo_Negativo () {
        long numero = -4321;
        long expected = -1234;
        long result = AndreEx4.inverteOrdemAlgarismosIntLongo(numero);
        assertEquals (expected, result);
    }

    @Test
    void inverteOrdemAlgarismosIntLongo_Zero () {
        long numero = 0;
        long expected = 0;
        long result = AndreEx4.inverteOrdemAlgarismosIntLongo(numero);
        assertEquals (expected, result);
    }
}
