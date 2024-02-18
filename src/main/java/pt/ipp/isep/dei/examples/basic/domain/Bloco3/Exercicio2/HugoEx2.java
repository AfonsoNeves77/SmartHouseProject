package pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio2;

import pt.ipp.isep.dei.examples.basic.domain.Bloco3.HugoTools;

public class HugoEx2 {
    // exercicio 2a --------------------------------------------------------------------------------------
    public static int resolucaoExercicio2a(int inf, int sup){
        return HugoTools.countOfMultiplesOfNumInRange(3,inf,sup);
    }
    public static int[] altResolucaoExercicio2a(int inf, int sup){
        int[] multiplesOfNum = new int[0]; //array inicializada com 0 posições
        int index = 0; // contador de posicoes inicializado a 0
        for (int i = inf; i <= sup; i++) { // começando no limite inferior, e até que o i seja maior do que o limite superior
            if (i % 3 == 0) { // ver se é m
                // ultiplo
                multiplesOfNum = HugoTools.increaseArraySizeByOne(multiplesOfNum); // Vai buscar a outra função que aumenta as posicoes das arrays, para esta nos retornar uma nova array com os mesmos numeros, mais uma posição livre
                multiplesOfNum[index] = i; // insere o valor que for multiplo, no index (posição) da multiplesOfNum
                index++; // aumenta uma posição, para o proximo valor já ir para o proximo index
            }
        }
        return multiplesOfNum;
    }

    // exercicio 2b --------------------------------------------------------------------------------
    public static int resolucaoexercicio2b(int num, int inf, int sup){
        return HugoTools.countOfMultiplesOfNumInRange(num,inf,sup);
    }

    public static int[] altResolucaoExercicio2b(int num, int inf, int sup){
        return HugoTools.multiplesOfNumInRange(num, inf, sup);
    }

    // exercicio 2c----------------------------------------------------------------------------------
    public static int resolucaoExercicio2c(int inf, int sup){
        return HugoTools.countOfCommonMultiplesOfNum1Num2InRange(3,5,inf,sup);
    }
    public static int [] altResolucaoExercicio2c(int inf, int sup){
        return HugoTools.arrayOfCommonMultiplesOfTwoNumsInSetRange(3,5,inf,sup);
    }

    // exercicio 2d------------------------------------------------------------------------------------
    public static int resolucaoExercicio2d(int num1, int num2, int inf, int sup){
        return HugoTools.countOfCommonMultiplesOfNum1Num2InRange(num1,num2,inf,sup);
    }
    public static int [] altResolucaoExercicio2d(int num1, int num2, int inf, int sup){
        return HugoTools.arrayOfCommonMultiplesOfTwoNumsInSetRange(num1,num2,inf,sup);
    }

    // exercicio 2e ---------------------------------------------------------------------------------
    public static int resolucaoExercicio2e(int num1, int num2, int inf, int sup){
        if (inf > sup) {
            return -1;
        }
        int sum = 0;
        if (num1 == 0 && num2 == 0){
            return 0;
        } else if (num1 == 0){
            for (int i = inf; i <= sup; i++){
                if (i%num2 == 0) {
                    sum++;
                }
            }
        } else if (num2 == 0){
            for (int i = inf; i <= sup; i++){
                if (i%num1 == 0){
                    sum++;
                }
            }
        } else {
            for (int i = inf; i <= sup; i++){
                if (i%num1 == 0 && i%num2 == 0){
                    sum++;
                }
            }
        }
        return sum;
    }

    public static int[] altResolucaoExercicio2e(int num1, int num2, int inf, int sup){
        int[] multiplesNum1 = HugoTools.multiplesOfNumInRange(num1,inf,sup);
        int[] multiplesNum2 = HugoTools.multiplesOfNumInRange(num2,inf,sup);
        int sumMultiplesNum1 = 0;
        int sumMultiplesNum2 = 0;
        for (int i = 0; i < multiplesNum1.length; i++) {
            sumMultiplesNum1 += multiplesNum1[i];
        }
        for (int f = 0; f < multiplesNum2.length; f++){
            sumMultiplesNum2 += multiplesNum2[f];
        }
        int[] arrayFinal = new int [2];
        arrayFinal[0] = sumMultiplesNum1;
        arrayFinal[1] = sumMultiplesNum2;
        return arrayFinal;
    }
}
