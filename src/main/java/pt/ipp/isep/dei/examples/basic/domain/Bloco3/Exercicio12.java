package pt.ipp.isep.dei.examples.basic.domain.Bloco3;

public class Exercicio12 {
    /**
     * @param grossSalary
     * @return net salary of a worker.
     */
    public static double netSalaryOfAWorker(double grossSalary) {

        double retention = 0.2;

        if(grossSalary <= 0)
            return -1;
        if(grossSalary <= 500)
            retention = 0.1;
        else if(grossSalary <= 1000)
            retention = 0.15;

        double netSalary = grossSalary * (1 - retention);
        return netSalary;
    }
}
