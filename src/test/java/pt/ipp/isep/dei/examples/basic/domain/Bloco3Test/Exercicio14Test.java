package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio14;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercicio14Test {
    @Test
    void exercicio14() {
        int num = 136138128;
        boolean expected = true;
        boolean result = Exercicio14.isCCvalid(num);
        assertEquals(expected, result);
    }
    @Test
    void exercicio14invalid() {
        int num = 136138129;
        boolean expected = false;
        boolean result = Exercicio14.isCCvalid(num);
        assertEquals(expected, result);
    }
}
