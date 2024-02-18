package pt.ipp.isep.dei.examples.basic.domain.Bloco3;


public class Exercicio6 {
    public static double baseSalaryPlusOvertime (int overtimeHours, double baseSalary){ // assumed 140 base hours/month
        if (overtimeHours < 0 || baseSalary <= 0){
            return -1;
        }
        double overtimePayPerHour = baseSalary * 0.02;
        double overtimeSalary = overtimePayPerHour*overtimeHours;
        return overtimeSalary+baseSalary;
    }
}

