package pt.ipp.isep.dei.examples.basic.domain.Bloco3;

public class HugoTools {

    public static boolean isAboveOrEqualto1(int num){
        return num >= 1;
    }

    public static int[] increaseArraySizeByOne(int[] arrayToIncrease){ //array que recebe uma array como argumento e devolve uma nova array com uma posicao livre.
        int[] newIncreasedArray = new int[arrayToIncrease.length + 1]; // inicia uma array nova, com o numero de posicoes da antiga + 1. Importante, esta array neste momento esta vazia!
        for (int i = 0; i < arrayToIncrease.length; i++) { // Este for loop copia todos os numeros que estao dentro da array antiga para a nova.
            newIncreasedArray[i] = arrayToIncrease[i];
        }
        return newIncreasedArray;
    }

    public static long[] increaseArraySizeByOneLong(long[] arrayToIncrease){ //array que recebe uma array como argumento e devolve uma nova array com uma posicao livre.
        long[] newIncreasedArray = new long[arrayToIncrease.length + 1]; // inicia uma array nova, com o numero de posicoes da antiga + 1. Importante, esta array neste momento esta vazia!
        for (int i = 0; i < arrayToIncrease.length; i++) { // Este for loop copia todos os numeros que estao dentro da array antiga para a nova.
            newIncreasedArray[i] = arrayToIncrease[i];
        }
        return newIncreasedArray;
    }
    public static int[] multiplesOfNumInRange(int num, int limiteInferior, int limiteSuperior) {
        int[] multiples = new int[0]; // Inicializo uma array com 0 posições
        int posicao = 0;
        if (num == 0){
            multiples = increaseArraySizeByOne(multiples);
            multiples[posicao] = 0; // Se num = 0 então quer dizer que posso devolver simplesmente 0, portanto nem deixo a função continuar para o for loop abaixo
            return multiples;
        } else {
            for (int i = limiteInferior; i <= limiteSuperior; i++) { // Inicializo o i para servir de contador de iteração, desde o valor minimo até ao maximo, incrementando um de cada vez
                if (i % num == 0) { // Se i%num significa que não há resto na divisao, logo asseguro que é multiplo. Nesta situação, se num for 0 a função parte aqui, daí ter criado uma condição especial para o 0 acima.
                    multiples = increaseArraySizeByOne(multiples); // ou seja, cada vez que encontro um numero para por na minha array de multiplos, tenho de aumentar uma posicao à array para lá caber o valor
                    multiples[posicao] = i;
                    posicao++;
                }
            }
        }
        return multiples;
    }

    public static boolean doesRangeContain0(int inf, int sup){
        for (int i = inf; i != sup; i++){
            if (i != 0){
                continue;
            } else {
                return true;
            }
        }return false;
    }

    public static int[] arrayOfCommonMultiplesOfTwoNumsInSetRange(int num1, int num2, int inf, int sup) {
        int[] arrayMultiplos = new int[0]; // Inicializo uma nova array
        int posicao = 0;
        if (num1 == 0 && num2 == 0 && doesRangeContain0(inf,sup)){ // para que a função abaixo não corra o risco de ficar i % 0. Crio condições especiais para evitar que um 0 passe aos for loops abaixo
            arrayMultiplos = increaseArraySizeByOne(arrayMultiplos);
            arrayMultiplos[posicao] = 1;
            return arrayMultiplos;
        } else if (num1 == 0){
            if  (doesRangeContain0(inf,sup)){
                arrayMultiplos = increaseArraySizeByOne(arrayMultiplos);
                arrayMultiplos[posicao] = 0;
                posicao++;
            }
            for (int i = inf; i <= sup; i++) {
                if (i % num2 == 0) {
                    arrayMultiplos = increaseArraySizeByOne(arrayMultiplos);
                    arrayMultiplos[posicao] = i;
                    posicao++;
                }
            }
        } else if (num2 == 0) {
            if  (doesRangeContain0(inf,sup)){
                arrayMultiplos = increaseArraySizeByOne(arrayMultiplos);
                arrayMultiplos[posicao] = 0;
                posicao++;
            }
            for (int i = inf; i <= sup; i++) {
                if (i % num1 == 0 && i % num2 == 0) {
                    arrayMultiplos = increaseArraySizeByOne(arrayMultiplos);
                    arrayMultiplos[posicao] = i;
                    posicao++;
                }
            }
        } else {
            for (int i = inf; i <= sup; i++) {
                if (i % num1 == 0 && i % num2 == 0) {
                    arrayMultiplos = increaseArraySizeByOne(arrayMultiplos);
                    arrayMultiplos[posicao] = i;
                    posicao++;
                }
            }
        }
        return arrayMultiplos;
    }


    public static int[] arraySorterBackToFront(int[] arrayToSort){
        int[] newArraySorted = new int[arrayToSort.length]; // crio uma array com length igual
        int index = 0;
        for (int i = arrayToSort.length-1; i >= 0; i--){ // inicializo o i no length-1 que nos dá a ultima casa, e vou iterando para baixo.
            newArraySorted[index] = arrayToSort[i]; // À medida que vou descendo nos indexes de arrayToSort, vou copiando os valores para o index da nova array, que vai subindo
            index++;
        }
        return newArraySorted;
    }

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

    public static int[] listEvenNumbersArray(int[]array){
        int[] evenArray = new int[0];
        int index = 0;
        for (int i = 0; i <= array.length-1 ; i++){
            if (array[i] % 2 == 0){
                evenArray = HugoTools.increaseArraySizeByOne(evenArray);
                evenArray[index] = array[i];
                index++;
            }
        }
        return evenArray;
    }

    public static long[] listOddNumbersArrayLong(long[]array){
        long [] oddArray = new long[0];
        int index = 0;
        for (int i = 0; i <= array.length-1 ; i++){
            if (array[i] % 2 != 0){
                oddArray = HugoTools.increaseArraySizeByOneLong(oddArray);
                oddArray[index] = array[i];
                index++;
            }
        }
        return oddArray;
    }

    public static long[] longNumDigitExtractionIntoArray(long num){
        if (num == 0){
            return new long[]{0};
        }
        long[] newArray = new long[0];
        int index = 0;
        while (num/1 != 0 || num/10 != 0){
            newArray = HugoTools.increaseArraySizeByOneLong(newArray);
            newArray[index] = num%10;
            index++;
            num/=10;
        }
        return newArray;
    }

    public static long[] longArraySorterBackToFront(long[] arrayToSort){
        long[] newArraySorted = new long[arrayToSort.length];
        int index = 0;
        for (int i = arrayToSort.length-1; i >= 0; i--){
            newArraySorted[index] = arrayToSort[i];
            index++;
        }
        return newArraySorted;
    }

    public static long[] longListEvenNumbersArray(long[]array){
        long[] evenArray = new long[0];
        int index = 0;
        for (int i = 0; i <= array.length-1 ; i++){
            if (array[i] % 2 == 0){
                evenArray = HugoTools.increaseArraySizeByOneLong(evenArray);
                evenArray[index] = array[i];
                index++;
            }
        }
        return evenArray;
    }

    public static long digitsInLongNumToPow3AndTheirSum(long num){
        long[] arrayToPow = HugoTools.longNumDigitExtractionIntoArray(num);
        long sum = 0;
        for (int i=0; i != arrayToPow.length ; i++){
            sum += Math.pow(arrayToPow[i], 3);
        }
        return sum;
    }

    public static boolean isRangeAscending(int inf, int sup){
        return inf < sup;
    }
    public static long[] extractDigitsFromAscendingRange(int inf, int sup){
        if (!isRangeAscending(inf,sup)){
            return null;
        }
        long [] array = new long [0];
        int index = 0;
        for (int i = inf; i <= sup; i++){
            array = HugoTools.increaseArraySizeByOneLong(array);
            array[index] = i;
            index++;
        }
        return array;
    }

    public static boolean isLongNumPalindrome(long num){
        long[] inversedNum = HugoTools.longNumDigitExtractionIntoArray(num); // primeiro crio uma array com os digitos de num de tras para a frente
        long[] correctNum = HugoTools.longArraySorterBackToFront(inversedNum); // agora crio outra array com os digitos na mesma ordem que num
        for (int i=0; i != inversedNum.length; i++){
            if (inversedNum[i] != correctNum[i]){ // comparo se em cada index das duas arrays, se em algum momento, o valor no index for diferente nas duas funções, retorno logo capicua falsa
                return false;
            }
        }
        return true;
    }

    public static boolean isAmstrong (long num){
        if (num != HugoTools.digitsInLongNumToPow3AndTheirSum(num)){
            return false;
        }
        return true;
    }

    public static int countOfMultiplesOfNumInRange(int num, int inf, int sup){
        if (inf > sup || inf < 0){
            return -1;
        }
        int counter = 0;
        for (int i = inf; i <= sup; i++){
            if (num == 0){
                counter++;
            } else if (i%num==0){
                counter++;
            }
        }
        return counter;
    }

    public static int countOfCommonMultiplesOfNum1Num2InRange(int num1, int num2, int inf, int sup) {
        if (inf > sup || inf < 0) {
            return -1;
        }
        int counter = 0;
        if (num1 == 0 && num2 == 0){
            counter += sup-inf;
        } else if (num1 == 0){
            for (int i = inf; i <= sup; i++){
                if (i%num2 == 0) {
                    counter++;
                }
            }
        } else if (num2 == 0){
            for (int i = inf; i <= sup; i++){
                if (i%num1 == 0){
                    counter++;
                }
            }
        } else {
            for (int i = inf; i <= sup; i++){
                if (i%num1 == 0 && i%num2 == 0){
                    counter++;
                }
            }
        }
        return counter;
    }
}
