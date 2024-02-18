package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercicio9Test {
    @Test
    public void testeCodigoInvalido() {
        int codigo = 27;
        String expected = "Código inválido";
        String result = Exercicio9.classificacaoProdutos(codigo);
        assertEquals(expected, result);
    }
    @Test
    public void testeAlimentoNaoPerecível() {
        int codigo = 1;
        String expected = "Alimento não perecível";
        String result = Exercicio9.classificacaoProdutos(codigo);
        assertEquals(expected, result);
    }
    @Test
    public void testeAlimentoPerecível() {
        int codigo = 2;
        String expected = "Alimento perecível";
        String result = Exercicio9.classificacaoProdutos(codigo);
        assertEquals(expected, result);
    }
    @Test
    public void testeLimiteAlimentoPerecível() {
        int codigo = 4;
        String expected = "Alimento perecível";
        String result = Exercicio9.classificacaoProdutos(codigo);
        assertEquals(expected, result);
    }
    @Test
    public void testeVestuario() {
        int codigo = 6;
        String expected = "Vestuário";
        String result = Exercicio9.classificacaoProdutos(codigo);
        assertEquals(expected, result);
    }
    @Test
    public void testeHigienePessoal() {
        int codigo = 7;
        String expected = "Higiene Pessoal";
        String result = Exercicio9.classificacaoProdutos(codigo);
        assertEquals(expected, result);
    }
    @Test
    public void testeLimpezaEUtensiliosDomesticos() {
        int codigo = 12;
        String expected = "Limpeza e utensílios domésticos";
        String result = Exercicio9.classificacaoProdutos(codigo);
        assertEquals(expected, result);
    }
    @Test
    public void testeLimiteUtensiliosDomesticos() {
        int codigo = 15;
        String expected = "Limpeza e utensílios domésticos";
        String result = Exercicio9.classificacaoProdutos(codigo);
        assertEquals(expected, result);
    }

}
