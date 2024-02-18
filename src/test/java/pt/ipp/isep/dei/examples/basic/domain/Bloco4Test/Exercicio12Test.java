package pt.ipp.isep.dei.examples.basic.domain.Bloco4Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio11;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio12;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercicio12Test {
    @Test
    void checkIfNumIsPalindrome_Success(){
        new Exercicio12();
        int num = 121;
        boolean result = Exercicio12.checkIfNumIsPalindrome(num);
        assertTrue(result);
    }
    @Test
    void checkIfNumIsPalindrome_Zero(){
        int num = 0;
        boolean result = Exercicio12.checkIfNumIsPalindrome(num);
        assertTrue(result);
    }
    @Test
    void checkIfNumIsPalindrome_False(){
        int num = 1223;
        boolean result = Exercicio12.checkIfNumIsPalindrome(num);
        assertFalse(result);
    }
    @Test
    void checkIfNumIsPalindrome_Negative(){
        int num = -12321;
        boolean result = Exercicio12.checkIfNumIsPalindrome(num);
        assertTrue(result);
    }
}
