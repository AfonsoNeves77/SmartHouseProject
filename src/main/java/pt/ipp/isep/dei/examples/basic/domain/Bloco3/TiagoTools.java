package pt.ipp.isep.dei.examples.basic.domain.Bloco3;

public class TiagoTools {

        //Ferramenta geral para aumentar arrays---------------------------------------------------------------------------------
        public static int[] arraySizeIncrease(int[] arrayToIncrease) {
            int[] increasedArray = new int[arrayToIncrease.length + 1];
            for (int i = 0; i < arrayToIncrease.length; i++) {
                increasedArray[i] = arrayToIncrease[i];
            }
            return increasedArray;
        }

        //Exercicio 2A e 2B-----------------------------------------------------------------------------------------------------
        public static int multiplosDeN(int num, int inf, int sup) {
            if (inf > sup) {
                return -1;
            }
            if (num == 0) {
                return 0;
            }
            int counter = 0;
            for (int i = inf; i <= sup; i++) {
                if (i % 3 == 0) {
                    counter++;
                }
            }
            return counter;
        }

        //Exercicio 2C e 2D-----------------------------------------------------------------------------------------------------
        public static int multiplesOf2NumbersInRange(int num1, int num2, int inf, int sup) {
            if (inf > sup) {
                return -1;
            }
            if (num1 == 0 || num2 == 0) {
                return 0;
            }
            int counter = 0;
            int index = 0;
            for (int i = inf; i <= sup; i++) {
                if (i % num1 == 0 && i % num2 == 0) {
                    counter++;
                }
            }
            return counter;
        }

//Exercicio 2E----------------------------------------------------------------------------------------------------------

        public static int sumOf2NumbersInRange(int num1, int num2, int inf, int sup) {
            int[] multiplesOfNum = new int[0];
            int index = 0;
            int sum = 0;
            for (int i = inf; i <= sup; i++) {
                if (i % num1 == 0 && i % num2 == 0) {
                    multiplesOfNum = arraySizeIncrease(multiplesOfNum);
                    multiplesOfNum[index] = i;
                    index++;
                }
                sum = 0;
                for (int counter = 0; counter < multiplesOfNum.length; counter++) {
                    sum = sum + multiplesOfNum[counter];
                }
            }
            return sum;
        }

        //Exercicio3A-----------------------------------------------------------------------------------------------------------
        public static int sumOfEvenNumbersInARange(int inf, int sup) {
            int[] multiplesOfNum = new int[0];
            int index = 0;
            int sum = 0;
            for (int i = inf; i <= sup; i++) {
                if (i % 2 == 0) {
                    multiplesOfNum = arraySizeIncrease(multiplesOfNum);
                    multiplesOfNum[index] = i;
                    index++;
                }
                sum = 0;
                for (int counter = 0; counter < multiplesOfNum.length; counter++) {
                    sum = sum + multiplesOfNum[counter];
                }
            }
            return sum;
        }

        //Exercicio3B-----------------------------------------------------------------------------------------------------------
        public static int evenNumbersInARange(int inf, int sup) {
            int[] multiplesOfNum = new int[0];
            int index = 0;
            for (int i = inf; i <= sup; i++) {
                if (i % 2 == 0) {
                    multiplesOfNum = arraySizeIncrease(multiplesOfNum);
                    multiplesOfNum[index] = i;
                    index++;
                }
            }
            return multiplesOfNum.length;
        }
//Exercicio3C-----------------------------------------------------------------------------------------------------------

        public static int sumOfOddNumbersInRange(int inf, int sup) {
            int sum = 0;
            for (int i = inf; i <= sup; i++) {
                if (i % 2 != 0) {
                    sum = sum + i; // rever isto-------------
                }
            }
            return sum;
        }
//Exercicio3D-----------------------------------------------------------------------------------------------------------

        public static int[] OddNumbersInARange(int inf, int sup) {
            int[] multiplesOfNum = new int[0];
            int index = 0;
            for (int i = inf; i <= sup; i++) {
                if (i % 2 != 0) {
                    multiplesOfNum = arraySizeIncrease(multiplesOfNum);
                    multiplesOfNum[index] = i;
                    index++;
                }
            }
            return multiplesOfNum;
        }
        //Exercicio14------------------------------------------------------
    public static int[] intNumDigitExtractionIntoArray(int num){
        if (num == 0){
            return new int[]{0}; // ou seja, se num for simplesmente 0, retorno uma array com 0 na primeira posicao, e nem procedo para o resto
        }
        int[] newArray = new int[0];
        int index = 0;
        while (num != 0){ // enquanto num for diferente de 0, vou tirando o digito mais à esquerda
            newArray = HugoTools.increaseArraySizeByOne(newArray);
            newArray[index] = num%10; // Aqui retiro o digito
            index++;
            num/=10; // aqui atualizo o valor de num para ser igual ao num antigo, mas sem a casa da esquerda
        }
        return newArray;
    }

//Fim da classe----------------------------------------------------------------------------------------------------------

    }
