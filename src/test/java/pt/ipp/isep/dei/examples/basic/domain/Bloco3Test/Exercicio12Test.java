package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio12;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio12Test {

    @Test
    void netSalaryOfAWorker_Test01NegativeGrossSalary() {
        double grossSalary = -4000;
        double expected = -1;
        double result = Exercicio12.netSalaryOfAWorker(grossSalary);
        assertEquals(expected,result,0.1);
    }

    @Test
    void netSalaryOfAWorker_Test02ZeroGrossSalary() {
        double grossSalary = 0;
        double expected = -1;
        double result = Exercicio12.netSalaryOfAWorker(grossSalary);
        assertEquals(expected,result,0.1);
    }

    @Test
    void netSalaryOfAWorker_Test03GrossSalaryLowerThan500() {
        double grossSalary = 250;
        double expected = 225;
        double result = Exercicio12.netSalaryOfAWorker(grossSalary);
        assertEquals(expected,result,0.1);
    }

    @Test
    void netSalaryOfAWorker_Test04GrossSalaryEquals1000() {
        double grossSalary = 1000;
        double expected = 850;
        double result = Exercicio12.netSalaryOfAWorker(grossSalary);
        assertEquals(expected,result,0.1);
    }

    @Test
    void netSalaryOfAWorker_Test05GrossSalaryHigherThan1000() {
        double grossSalary = 1500;
        double expected = 1200;
        double result = Exercicio12.netSalaryOfAWorker(grossSalary);
        assertEquals(expected,result,0.1);
    }
}