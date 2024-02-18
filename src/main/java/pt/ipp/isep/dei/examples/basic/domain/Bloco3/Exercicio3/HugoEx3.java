package pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio3;

import pt.ipp.isep.dei.examples.basic.domain.Bloco3.HugoTools;

public class HugoEx3 {
    public static int resolucao3a(int inf, int sup){
        // duvida 1
        int sumNum = 0;
        for (int i = inf; i <= sup; i++){
            if (i%2 == 0){
                sumNum += i;
            }
        }
        return sumNum;
    }
    // 3b------------------------------------------------------------------------------
    public static int resolucao3b(int inf, int sup){
        return HugoTools.countOfMultiplesOfNumInRange(2,inf,sup);
    }
    public static int[] alternativaResolucao3b(int inf, int sup){ //Em vez de quantidade (int) a solucao retorna uma array de todos os numeros pares
        int[] arrayPairs = new int [0];
        int index = 0;
        for (int f = inf; f <= sup; f++){
            if (f == 0){
                arrayPairs = HugoTools.increaseArraySizeByOne(arrayPairs);
                arrayPairs[index] = f;
                index++;
            } else if (f%2 == 0){
                arrayPairs = HugoTools.increaseArraySizeByOne(arrayPairs);
                arrayPairs[index] = f;
                index++;
            }
        }
        return arrayPairs;
    }
    // 3c------------------------------------------------------------------------------------
    public static int resolucao3c(int inf, int sup){
        int sumNum = 0;
        for (int i = inf; i <= sup; i++){
            if (i%2 != 0){
                sumNum += i;
            }
        }
        return sumNum;
    }
    // 3d------------------------------------------------------------------------------------------
    public static int resolucao3d(int inf, int sup){
        int counter = 0;
        for (int i = inf; i <= sup; i++){
            if (i%2 != 0){
                counter++;
            }
        }
        return counter;
    }
    public static int[]altResolucao3d(int inf, int sup){ //Em vez de quantidade (int) a solucao retorna uma array de todos os numeros pares
        int[] arrayOdds = new int [0];
        int index = 0;
        for (int f = inf; f <= sup; f++){
            if (f%2 != 0){
                arrayOdds = HugoTools.increaseArraySizeByOne(arrayOdds);
                arrayOdds[index] = f;
                index++;
            }
        }
        return arrayOdds;
    }

    public static int resolucao3e(int num, int inf, int sup) {
        if (num == 0) {
            return 0;
        } else {
            if (inf > sup) {
                int temp = inf;
                inf = sup;
                sup = temp;
            }
            int sumMultiples = 0;
            for (int i = inf; i <= sup; i++) {
                if (i % num == 0) {
                    sumMultiples += i;
                }
            }
            return sumMultiples;
        }
    }

    public static int resolucao3f(int num, int inf, int sup){
        if (num == 0){
            return 0;
        } else {
            int productMultiples = 1;
            for (int i = inf; i <= sup; i++) {
                if (i % num == 0) {
                    if (i != 0) {
                        productMultiples *= i;
                    }
                }
            }
            return productMultiples;
        }
    }

    public static double resolucao3g(int num, int inf, int sup){
        if (num == 0){
            return 0;
        } else {
            int sumMultiples = 0;
            int counter = 0;
            for (int i = inf; i <= sup; i++) {
                if (i % num == 0) {
                    sumMultiples += i;
                    counter++;
                }
            }
            return (double)sumMultiples / counter;
        }
    }

    public static double[] resolucao3h(int num1, int num2, int inf, int sup ){
        double[] arrayMedias = new double[2];
        arrayMedias[0] = resolucao3g(num1,inf,sup);
        arrayMedias[1] = resolucao3g(num2,inf,sup);
        return arrayMedias;
    }
}
