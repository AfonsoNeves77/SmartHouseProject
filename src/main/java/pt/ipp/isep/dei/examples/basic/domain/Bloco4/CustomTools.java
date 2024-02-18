package pt.ipp.isep.dei.examples.basic.domain.Bloco4;


public class CustomTools {

    public static int[] intIncreaseArraySizeBy1(int[] arrayToIncrease) {
        int[] increasedArray = new int[arrayToIncrease.length + 1];
        for (int i = 0; i != arrayToIncrease.length; i++) {
            increasedArray[i] = arrayToIncrease[i];
        }
        return increasedArray;
    }

    //---------------------------------------------------------------------------
    public static int[] intArrayOfEachDigitInNum(int num){ // 12345
        int[] inversedArrayOfDigits = new int[0];
        int index = 0;
        if (num == 0){
            return new int[]{0};
        }
        while (num != 0) { // This method extract num inversed: if num 12345, array is {5,4,3,2,1}
            inversedArrayOfDigits = intIncreaseArraySizeBy1(inversedArrayOfDigits);
            inversedArrayOfDigits[index] = num % 10;
            num /= 10;
            index++;
        }
        int[] properArrayOfDigits = new int[inversedArrayOfDigits.length]; // This reverts the array back to the proper order of digits
        for (int i = 0; i <= inversedArrayOfDigits.length - 1; i++) {
            properArrayOfDigits[i] = inversedArrayOfDigits[index - 1]; // Note: Index-1 is used because at the end of the previous while loop,
            index--;                                                // the index lands at length size (therefore +1, than the actual occupied index)
        }
        return properArrayOfDigits;
    }

    //------------------------------------------------------------------------------
    public static int intCountOfDigitsInNumber(int n){
        if (n == 0 ){
            return -1;
        }
        int counter = 0;
        do{
            n /= 10;
            counter++;
        } while(n!=0);
        return counter;
    }
    public static int[] arrayInverter(int[] n){
        int newCounter = 0;
        int[] finalArray = new int[n.length];
        for(int i = n.length-1; i >= 0; i--){
            finalArray[newCounter] = n[i];
            newCounter++;
        }
        return finalArray;
    }
    public static int sumOfTheElementsOfAnArray(int[] array) {
        int sum = 0; // Inicializo a variável soma com o valor de 0.
        for (int i = 0; i < array.length; i++) { // Começo pelo index 0, até chegar ao length da array e vou incrementado um valor em cada loop.
            sum += array[i]; // Soma todas as casas da array.
        }
        return sum; // Input: Array || Output: Soma dos valores da Array.
    }
    public static int evenNumberInAnArrayCounter(int[] array) {
        int counter = 0; //Inicializo o contador a 0.
        for (int i = 0; i < array.length; i++) { //Vou percorrendo o indíce da Array
            if (array[i] % 2 == 0) { //Confiro se o nº é par
                counter++; // Se for o contador incrementa
            }
        }
        return counter; //Input: Array || Output: Contagem de nº pares
    }
    public static int productNumbersArray(int[] array){
        int product = 1;
        if (array.length == 0){
            product = 0;
        }
        for (int i = 0; i < array.length;i++){
            product *= array[i];
        }
        return product;
    }

    public static int[] evenNumbersInArray(int[] array) {
        int[] evenNumbersInArray = new int[array.length]; //Array dos nº pares vai ter como length o total da array inicial
        int index = 0; // Inicio o counter a 0.
        for (int i = 0; i < array.length; i++) { // For loop vai percorrer a array original.
            if (array[i] % 2 == 0) { //De cada vez que encontrar o número par.
                evenNumbersInArray[index] = array[i]; //É colocado no Array.
                index++; //Incrementa o counter
            }
        }
        return intArrayCrop(evenNumbersInArray,index); // Input: Array com pares e ímpares || Output: Array só com pares
    }
    public static int oddNumberInAnArrayCounter(int[] array) {
        int counter = 0; //Inicializo o contador a 0.
        for (int i = 0; i < array.length; i++) { //Vou percorrendo o indíce da Array
            if (array[i] % 2 != 0) { //Confiro se o nº é impar
                counter++; // Se for o contador incrementa
            }
        }
        return counter; //Input: Array || Output: Contagem de nº impares
    }
    public static int[] oddNumbersInArray(int[] array) {
        int[] oddNumbersInArray = new int[array.length]; //Array dos nº ímpares vai ter como length o total da array inicial
        int index = 0; // Inicio o counter a 0.
        for (int i = 0; i < array.length; i++) { // For loop vai percorrer a array original.
            if (array[i] % 2 != 0) { //De cada vez que encontrar o número par.
                oddNumbersInArray[index] = array[i]; //É colocado no Array.
                index++; //Incrementa o counter
            }
        }
        return intArrayCrop(oddNumbersInArray,index); // Input: Array com pares e ímpares || Output: Array só com pares
    }
    public static int[] intArrayCrop(int[] arrayToCrop, int numOccupiedIndexes){
        if (numOccupiedIndexes > arrayToCrop.length){ // verifica que a array precisa de crop
            return null;
        }
        int[] croppedArray = new int[numOccupiedIndexes]; // cria uma array com o numero de posições pretendido
        for (int i = 0; i != croppedArray.length; i++){
            croppedArray[i] = arrayToCrop[i]; // itera pelo index de arrayToCrop e copia para o mesmo index da array nova
        }
        return croppedArray;
    }

    //There is one mutation due to the capacity of the array. Ignore.
    public static int[] arrayWithMultiplesOfNumInSetRange(int num, int inf, int sup){
        if (inf > sup) {
            return null;
        }

        if (num < 0) {
            return null;
        }

        if (inf < 0){
            return null;
        }

        if (num == 0) {
            if (inf == 0) { // se num for 0, verifico se 0 está contido no intervalo, se estiver devolvo 0 que é o unico multiplo de 0
                return new int[]{0};
            }
            else { // se nao estiver no intervalo retorno string vazia
                return new int[0];
            }
        }

        int capacity = sup - inf + 1;
        int[] array = new int[capacity];
        int multipleCounter = 0;
        for (int i = inf; i <= sup; i++){
            if (i % num == 0){
                array[multipleCounter] = i;
                multipleCounter++;
            }
        }
        array = intArrayCrop(array,multipleCounter);
        return array;
    }

    public static boolean doesRangeContain0(int inf, int sup){
        for (int i = inf; i <= sup; i++){
            if (i == 0){
                return true;
            }
        }return false;
    }

    /* Nota multiplos2nums: Se num1 ou num2 forem 0, então o unico multiplo comum possivel (mesmo o outro num não sendo 0) é 0. Portanto é importante
    verificar se o intervalo contem 0 ou não. Caso o intervalo não contenha 0, a array é devolvida vazia, caso haja 0s, é devolvida com {0}
     */

    public static int[] arrayCommonMultiplesOfTwoNumsInSetRange(int num1,int num2,int inf, int sup){
        if (inf > sup || num1 < 0 || num2 < 0 ||inf < 0){
            return null;
        }

        int[] arrayMultiplos = new int[sup-inf];
        int posicao = 0;
        if ((num1 == 0 || num2 == 0) && doesRangeContain0(inf,sup)){
            return new int[]{0};
        }
        else if ((num1 == 0 || num2 == 0) && !doesRangeContain0(inf,sup)){
            return new int[0];

        } else if (inf == sup && inf%num1==0 && inf%num2==0){ //se não tiverms esta condição a função
            // quebra em valores limite de intervalo iguais iguais
            return new int[]{inf};

        } else {
            for (int i = inf; i <= sup; i++) {
                if (i % num1 == 0 && i % num2 == 0) {
                    arrayMultiplos[posicao] = i;
                    posicao++;
                }
            }
        }
        arrayMultiplos = intArrayCrop(arrayMultiplos,posicao);
        return arrayMultiplos;
    }

    public static boolean isIntNumPalindrome(int num){
        int copyNum = num;
        int reversedNum = 0;
        do{
            reversedNum = reversedNum*10 + num%10;
            num /= 10;
        } while (num != 0);
        return copyNum == reversedNum;
    }
    public static boolean doesArrayContainNum(int num, int[] array){ // atenção aos 0 criados quando se inicializa uma array com "posicoes a mais"
        for (int i = 0; i <= array.length-1; i++){
            if (array[i] == num){
                return true;
            }
        }
        return false;
    }


    public static int[] commonMultiplesInSetRange(int[] arrayOfNums, int inf, int sup){
        if (inf > sup || inf < 0)
            return new int[0];
        else if (arrayOfNums.length==0)
            return new int[0];
        else if (doesArrayContainNum(0,arrayOfNums)){
            if(inf==0)
                return new int[]{0};
            else
                return new int[]{};
            }
        int arrayLenght = 1;

        if(inf!=sup)
            arrayLenght = sup - inf + 1;

        int[] arrayMultiples = new int[arrayLenght];
        int indexArrMultiples = 0;
        for (int i = inf; i <= sup; i++) {
            boolean areAllMultiples = true;
            for (int k = 0; k != arrayOfNums.length; k++) {
                if (i % arrayOfNums[k] != 0) {
                    areAllMultiples = false;
                    break;
                }
            }
            if (areAllMultiples){
                arrayMultiples[indexArrMultiples] = i;
                indexArrMultiples++;
            }
        }
        arrayMultiples = intArrayCrop(arrayMultiples,indexArrMultiples);
        return arrayMultiples;
    }

    public static boolean arrayHasZeroOrNegNumbers(int[] array){
        for (int i = 0; i < array.length; i++){
            if(array[i] <= 0){
                return true;
            }
        }
        return false;
    }

    public static boolean isEmptyArray(int[] n){
        return n.length == 0;
    }
    public static boolean isInverted(int nMax,int nMin){
        return nMin > nMax;
    }

    public static int minimumElementInAnArray(int[] array){
        // Due to limitations in returning an error code, in the event of an empty array, the function will produce and error.
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }


    public static int maximumElementInAnArray(int[] array){
        // Due to limitations in returning an error code, in the event of an empty array, the function will produce and error.
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static boolean isMatrixIrregular(int[][] matrix){
        //boolean isIrregular = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != matrix[0].length) {
                //isIrregular = true;
                //break;
                return true;
            }
        }
        //return isIrregular;
        return false;
    }

    public static boolean isASquareMatrix(int[][] array){
        if(!isMatrixIrregular(array)){
            return array[0].length == array.length;
        }
        return false;
    }

    public static boolean isARectangularMatrix(int[][] mat) {
        if (!isMatrixIrregular(mat)) {
            return mat[0].length != mat.length;
        }
        return false;
    }

    public static int sumOfEvenDigitsInAPositiveNumber(int number) {
        int sum = 0; // Inicializar a sum.

        if(number <= 0){
            return 0;
        }
        while (number != 0) {
            int lastDigit = number % 10; //Isolar o último algarismo.
            if (lastDigit % 2 == 0) { // Confirmar se é par.
                sum = sum + lastDigit;// Se se confirmar: somar o seu valor.
            }
            number /= 10;
        }
        return sum;
    }
    public static int sumOfOddDigitsInAPositiveNumber(int number) {
        int soma = 0; // Inicializar a sum.

        if(number <= 0){
            return 0;
        }
        while (number != 0) {
            int lastDigit = number % 10; //Isolar o último algarismo.
            if (lastDigit % 2 != 0) { // Confirmar se é par.
                soma = soma + lastDigit;// Se se confirmar: somar o seu valor.
            }
            number /= 10;
        }
        return soma;
    }

    public static boolean isASquareChar(char[][] array){ //For char values
        boolean isSquare = true;
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) {
                //isSquare = false;
                //break;
                return false;
            }
        }
        //return isSquare;
        return true;
    }

    public static boolean numberIsPositive (int num) {
        return (num > 0);
    }

    public static boolean numberIsNegative (int num) {
        return (num < 0);
    }

    public static int intInvertedNum(int num) {
        int sum = 0;
        if (num == 0) {
            return 0;
        } while (num != 0) {
            sum = sum * 10 + num % 10;
            num /= 10;
        }
        return sum;
    }

    public static boolean areTwoMatricesEqualSize(int[][] matrix1, int[][]matrix2){
        return (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length);
    }

    public static boolean checkIfNumberIsPrime(int number) {
        if(number > 1 ){
            if (number <=3) {
                return true;
            }
            for (int i = 2; i <= number/2; i++) {
                if (number % i == 0){
                    return false;
                }
            }
            return true;
        }
        return false;

    }

    public static int primeNumberInMatrixCounter(int[][] matriz) {
        int counter = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length;j++)
                if (checkIfNumberIsPrime(matriz[i][j])){
                    counter ++;
                }
        }
        return counter;
    }

    //Reduzir tamanho da matriz:
    public static int[][] reduceMatrixOrderByOne(int[][] matrix, int lineToRemove, int columnToRemove){
        int nrLines = matrix.length - 1;
        int nrColumns = matrix[0].length - 1;
        int[][] reducedMatrix = new int[nrLines][nrColumns];
        int line = 0;   //Para controlar quando queremos mudar a linha em interação;
        int column = 0; //Para controlar quando queremos mudar a coluna em interação;
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == lineToRemove || j == columnToRemove)   //Estes índices não são para considerar, dado que estamos a retirar os elementos da matriz abrangentes.
                    continue;
                reducedMatrix[line][column] = matrix[i][j];
                column++;
                if (column == nrColumns) {
                    line++;
                    column = 0;
                }
            }
        }
        return reducedMatrix;
    }

    //Calcular o determinante de uma matriz:
    public static int determinantOfAMatrix(int[][] matrix){
        int determinant = 0;
        if(matrix.length == 2)
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];   //Cálculo para determinante de uma matriz de ordem 2.
        int lineToRemove = 0;   //Podemos colocar um valor qualquer, mas defini a primeira linha para ser mais fácil de visualizar a matriz resultante.
        for(int j = 0; j < matrix[0].length; j++){
            int[][] submatrix = reduceMatrixOrderByOne(matrix,lineToRemove,j);
            determinant += (int) (matrix[lineToRemove][j] * Math.pow(-1,(lineToRemove+j)) * determinantOfAMatrix(submatrix));
        }
        return determinant;
    }


}




