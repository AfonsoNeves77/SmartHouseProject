package pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio2;

import pt.ipp.isep.dei.examples.basic.domain.Bloco3.TiagoTools;

public class TiagoEx2 {
    //Exercicio2------------------------------------------------------------------------------------------------------------
//Exercicio2a-----------------------------------------------------------------------------------------------------------
    public static int resolucao2a(int inf, int sup) {

        return TiagoTools.multiplosDeN(3, inf, sup);
    }

    //Exercicio2b-----------------------------------------------------------------------------------------------------------
    public static int resolucao2b(int num, int inf, int sup) {
        return TiagoTools.multiplosDeN(num, inf, sup);

    }

    //Exercicio2c-----------------------------------------------------------------------------------------------------------
    public static int resolucao2c(int inf, int sup) {
        int array = TiagoTools.multiplesOf2NumbersInRange(3, 5, inf, sup);
        return array;
    }

    //Exercicio2d-----------------------------------------------------------------------------------------------------------
    public static int resolucao2d(int num1, int num2, int inf, int sup) {
        return TiagoTools.multiplesOf2NumbersInRange(num1, num2, inf, sup);

    }

    //Exercicio2e-----------------------------------------------------------------------------------------------------------
    public static int resolucao2e(int num1, int num2, int inf, int sup) {
        int somaDosMultiplos = TiagoTools.sumOf2NumbersInRange(num1, num2, inf, sup);
        return somaDosMultiplos;
    }
}
