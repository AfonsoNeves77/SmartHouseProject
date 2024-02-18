package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio16;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercicio16Test {

    @Test
    void numberEvaluationPerfect() {
        int expected = Exercicio16.numberEvaluation(6);
        assertEquals(0,expected);
    }

    @Test
    void numberEvaluationReduced() {
        int expected = Exercicio16.numberEvaluation(9);
        assertEquals(-1,expected);
    }

    @Test
    void numberEvaluationAbundant() {
        int expected = Exercicio16.numberEvaluation(12);
        assertEquals(1,expected);
    }


    @Test
    void numberEvaluationZero() {
        int expected = Exercicio16.numberEvaluation(0);
        assertEquals(-2,expected);
    }
}
