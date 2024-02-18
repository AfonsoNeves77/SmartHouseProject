package pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio2;

import pt.ipp.isep.dei.examples.basic.domain.Bloco3.AndreTools;

public class AndreEx2 {

    //EXERCICIO 2

    //a) Múltiplos de 3

    public static int countMultiples3 (int min, int max) {
        return AndreTools.countMultiplesNum(min, max, 3);
    }

    //b) Múltiplos de dado número
    public static int countMultiplesNum (int min, int max, int num) {
        return AndreTools.countMultiplesNum(min, max, num);
    }

    //c) Múltiplos de 3 e 5
    public static int countMultiples3And5 (int min, int max) {
        return AndreTools.countMultiples2Num(min, max, 3, 5);
    }

    //d) Múltiplos de dado número
    public static int countMultiples2Num (int min, int max, int num1, int num2) {
        return AndreTools.countMultiples2Num(min, max, num1, num2);
    }

    //e) Soma múltiplos dois números
    public static int sumMultiples2Num (int min, int max, int num1, int num2) {
        if (min < 0 || min > max || num1 == 0 || num2 == 0) {
            return -1;
        }
        int sum = 0;
        for (int i = min; i <= max; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                sum = i + sum; //sum += i
            }
        }
        return sum;
    }

}
