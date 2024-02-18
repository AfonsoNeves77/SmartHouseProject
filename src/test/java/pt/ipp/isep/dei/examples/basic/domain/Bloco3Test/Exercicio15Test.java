package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class Exercicio15Test {
    @Test
    void resolucao15(){
        long num = 123456;
        long expected = 135246;
        long result = Exercicio15.resolucao15(num);
        assertEquals(expected,result);
    }

    @Test
    void resolucao15Zeros(){
        long num = 103006;
        long expected = 130006;
        long result = Exercicio15.resolucao15(num);
        assertEquals(expected,result);
    }
    @Test
    void resolucao15ZerosMore(){
        long num = 103000;
        long expected = 130000;
        long result = Exercicio15.resolucao15(num);
        assertEquals(expected,result);
    }
    @Test
    void resolucao15OutOfBounds(){
        long num = -11515;
        long expected = -1;
        long result = Exercicio15.resolucao15(num);
        assertEquals(expected,result);
    }

    @Test
    void alternativaresolucao15(){
        long[] array = {1,2,3,4,5,6};
        long[][] expected = {{1,3,5},{2,4,6}};
        long[][] result = Exercicio15.alternativaResolucao15(array);
        assertArrayEquals(expected,result);
    }
    @Test
    void alternativaresolucao15_Uneven(){
        long[] array = {1,2,3,3,5,6};
        long[][] expected = {{1,3,3,5},{2,6}};
        long[][] result = Exercicio15.alternativaResolucao15(array);
        assertArrayEquals(expected,result);
    }
}
