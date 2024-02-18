package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio6;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercicio6Test {


    @Test
    void baseSalaryPlusOvertime(){
        int overtimeHours = 7;
        double baseSalary =1000;
        double expected = 1140;
        double result = Exercicio6.baseSalaryPlusOvertime(overtimeHours,baseSalary);
        assertEquals(expected,result);
    }

    @Test
    void baseSalaryPlusOvertimeNoExtra(){
        int overtimeHours = 0;
        double baseSalary = 1000;
        double expected = 1000;
        double result = Exercicio6.baseSalaryPlusOvertime(overtimeHours,baseSalary);
        assertEquals(expected,result);
    }

    @Test
    void baseSalaryPlusOvertimeInvalid(){
        int overtimeHours = -6;
        double baseSalary = 1000;
        double expected = -1;
        double result = Exercicio6.baseSalaryPlusOvertime(overtimeHours,baseSalary);
        assertEquals(expected,result);
    }
}

