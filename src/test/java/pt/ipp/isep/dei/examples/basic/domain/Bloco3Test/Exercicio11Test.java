package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Exercicio11Test {

    @Test
    void gradeIntoString(){
        int nota = -1;
        String expected = "Nota inválida";
        String result = Exercicio11.gradeIntoString(nota);
        assertEquals(expected,result);
    }
    @Test
    void gradeIntoString_1(){
        int nota = 3;
        String expected = "Mau";
        String result = Exercicio11.gradeIntoString(nota);
        assertEquals(expected,result);
    }
    @Test
    void gradeIntoString_2(){
        int nota = 7;
        String expected = "Medíocre";
        String result = Exercicio11.gradeIntoString(nota);
        assertEquals(expected,result);
    }
    @Test
    void gradeIntoString_3(){
        int nota = 10;
        String expected = "Suficiente";
        String result = Exercicio11.gradeIntoString(nota);
        assertEquals(expected,result);
    }
    @Test
    void gradeIntoString_4(){
        int nota = 16;
        String expected = "Bom";
        String result = Exercicio11.gradeIntoString(nota);
        assertEquals(expected,result);
    }
    @Test
    void gradeIntoString_5(){
        int nota = 19;
        String expected = "Muito bom";
        String result = Exercicio11.gradeIntoString(nota);
        assertEquals(expected,result);
    }
    @Test
    void gradeIntoString_6(){
        int nota = 22;
        String expected = "Nota não pode ser superior a 20";
        String result = Exercicio11.gradeIntoString(nota);
        assertEquals(expected,result);
    }
}
