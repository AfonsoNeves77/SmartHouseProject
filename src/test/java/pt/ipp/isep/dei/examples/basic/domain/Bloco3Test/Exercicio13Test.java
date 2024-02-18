package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio13;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio8;

import static org.junit.jupiter.api.Assertions.*;

public class Exercicio13Test {

    @Test
    void dogEvaluationInvalid(){
        int result = Exercicio13.dogEvaluation(20,-40);
        assertEquals(-2, result);
    }

    @Test
    void dogEvaluationInvalidSmallDog(){
        int result = Exercicio13.dogEvaluation(10,100);
        assertEquals(0, result);
    }

    @Test
    void dogEvaluationInvalidSmallDogPlus(){
        int result = Exercicio13.dogEvaluation(10,101);
        assertEquals(1, result);
    }

    @Test
    void dogEvaluationInvalidSmallDogInsuf(){
        int result = Exercicio13.dogEvaluation(10,99);
        assertEquals(-1, result);
    }

    @Test
    void dogEvaluationInvalidMediumDog(){
        int result = Exercicio13.dogEvaluation(25,250);
        assertEquals(0, result);
    }

    @Test
    void dogEvaluationInvalidMediumDogPlus(){
        int result = Exercicio13.dogEvaluation(25,251);
        assertEquals(1, result);
    }

    @Test
    void dogEvaluationInvalidMediumDogInsuficient(){
        int result = Exercicio13.dogEvaluation(25,249);
        assertEquals(-1, result);
    }

    @Test
    void dogEvaluationInvalidBigDog(){
        int result = Exercicio13.dogEvaluation(45,300);
        assertEquals(0, result);
    }

    @Test
    void dogEvaluationInvalidBigDogPlus(){
        int result = Exercicio13.dogEvaluation(45,301);
        assertEquals(1, result);
    }

    @Test
    void dogEvaluationInvalidBigDogInsuf(){
        int result = Exercicio13.dogEvaluation(45,299);
        assertEquals(-1, result);
    }

    @Test
    void dogEvaluationInvalidGiant(){
        int result = Exercicio13.dogEvaluation(46,500);
        assertEquals(0, result);
    }

    @Test
    void dogEvaluationInvalidGiantPlus(){
        int result = Exercicio13.dogEvaluation(46,501);
        assertEquals(1, result);
    }

    @Test
    void dogEvaluationInvalidGiantInsuf(){
        int result = Exercicio13.dogEvaluation(46,499);
        assertEquals(-1, result);
    }

    @Test
    void MultipledogEvaluationInvalid(){
        int[][] matrix = {
                {45, 299},
                {56,-501},
                {27,300}
        };
        int[] result = Exercicio13.multipleDogEvaluationA(matrix);
        assertArrayEquals(new int[0],result);

    }

    @Test
    void MultipledogEvaluationValidValues(){
        int[][] matrix = {
                {10, 100},
                {56,501},
                {27,300}
        };
        int[] a = {0,1,0};
        int[] result = Exercicio13.multipleDogEvaluationA(matrix);
        assertArrayEquals(a,result);

    }

    @Test
    void MultipledogEvaluationValidValuesV2(){
        int[][] matrix = {
                {45, 300},
                {56,499},
                {27,300}
        };
        int[] a = {0,-1,0};
        int[] result = Exercicio13.multipleDogEvaluationA(matrix);
        assertArrayEquals(a,result);

    }





}
