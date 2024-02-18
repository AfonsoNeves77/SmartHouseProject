package pt.ipp.isep.dei.examples.basic.domain.Bloco5;

public class CustomTools {
    public static boolean isNumInArray(int [] array, int element){
        for (int i = 0; i < array.length; i++){
            if (array[i] == element){
                return true;
            }
        }
        return false;
    }
//----------------------------------------------------------------------------------------------------------------------
    public static boolean checkIfNumberIsPalindrome(int number){
        int numberClone = number;
        int reverse = 0;
        while (number != 0){
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return (reverse == numberClone);
    }
//----------------------------------------------------------------------------------------------------------------------
    public static int[] intArrayCrop(int[] arrayToCrop, int numOccupiedIndexes){
        if (numOccupiedIndexes > arrayToCrop.length){ // verifica que a array precisa de crop
            return new int[]{};
        }
        int[] croppedArray = new int[numOccupiedIndexes]; // cria uma array com o numero de posições pretendido
        for (int i = 0; i != croppedArray.length; i++){
            croppedArray[i] = arrayToCrop[i]; // itera pelo index de arrayToCrop e copia para o mesmo index da array nova
        }
        return croppedArray;
    }

//----------------------------------------------------------------------------------------------------------------------
    public static boolean checkIfNumberIsComposedByTheSameDigits(int number) {
        if (number < 10 && number > -10) {
            return true;
        }

        int lastDigit = number % 10;
        number /= 10;

        while (number != 0) {
            int currentDigit = number % 10;
            if (currentDigit != lastDigit) {
                return false;
            }
            number /= 10;
        }

        return true;
    }

//_____________________________________________________________________________________________________

    /*
        The following method receives a number and, first evaluates if it´s single digit, if it is, returns false,
        meaning that number is not a crescent sequence.
        Then, it initializes a variable previousDigit to -1 and enters a while loop that iterates through
        each digit of the number.If the loop ends without finding a not increasing  digit, the method returns true,
        witch indicates that the digits of number are a crescent sequence.
     */

    public static boolean isNumberAnAscendingSequence(int number){

        if (number > -10 && number < 10) {
            return false;
        }

        int previousDigit = -1;

        while(number != 0){
            int digit = number%10;

            if(digit >= previousDigit && previousDigit !=-1) {
                return false;
            }

            previousDigit = digit;
            number/=10;
        }
        return true;
    }

    //_____________________________________________________________________________

    public static int numberOfDigitsInANumber(int number){
        if(number > -10 && number <10){
            return 1;
        }

        int totalOfDigits = 0;
        while(number != 0){
            totalOfDigits++;
            number/=10;
        }
        return totalOfDigits;
    }


//--------------------------------------------------------------------------------------------------------------------
    // isArmstrong
    public static boolean checkIfIsArmstrongNumber(int num){
        int digit = digitCount(num);
        int sumToCube=0;
        int finalNumber = num;
        while (num > 0){
            sumToCube += (int) Math.pow(num % 10, digit);
            num/= 10;
        }
        return sumToCube == finalNumber;
    }
    // ------------------------------------------------------------------------------------
    public static int checkIndexNum (int num, int[] array){
        int index = -1;
        for (int i = 0; i < array.length; i++){
            if (array[i] == num){
                index = i;
            }
        }
        return index;
    }
    // ----------------------------------------------------------------------------------
    public static int sumElements (int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
//------------------------------------------------------------------------------------------------
    public static int digitCount(int number){
        int counter = 0;
        while (number != 0){
            number /= 10;
            counter++;
        }
        return counter;
    }

    // ----------------------------------------------------------------------------------
    public static int diagonalSizeOfAMatrix(int[][] matrix){
        int nLines = matrix.length;
        int nColumns = matrix[0].length;
        int diagonalSize;
        if (nLines > nColumns)
            diagonalSize = nColumns;
        else
            diagonalSize = nLines;
        return diagonalSize;
    }

    public static int[] mainMatrixDiagonal(int[][] matrix){
        int diagonalSize = diagonalSizeOfAMatrix(matrix);
        int[] primaryDiagonal = new int[diagonalSize];

        for(int i = 0; i < diagonalSize; i++){
            primaryDiagonal[i] = matrix[i][i];
        }
        return primaryDiagonal;
    }

    public static int[] secondaryMatrixDiagonal(int[][] matrix){
        int diagonalSize = diagonalSizeOfAMatrix(matrix);
        int[] secondaryDiagonal = new int[diagonalSize];

        for(int i = 0; i < diagonalSize; i++){
            secondaryDiagonal[i] = matrix[i][matrix[i].length - 1 - i];
        }
        return secondaryDiagonal;
    }
    public static int[] invertArray(int[] array){
        if (array.length == 0){
            return new int[]{};
        }
        int[] newArray = new int[array.length];
        int index = 0;
        for (int i = array.length -1; i >= 0; i--){
            newArray[i] = array[index];
            index++;
        }
        return newArray;
    }



}
