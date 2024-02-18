package pt.ipp.isep.dei.examples.basic.domain.Bloco3;

public class AfonsoTools {

    /*
    This class has several functions that are considered as auxiliary. They will be used many times across Bloco3 Exercises.
    */


    public static boolean isAboveOne(int n){
        return n >= 1;
    }

    public static boolean isZero(int n){
        return n == 0;
    }


    public static boolean isEven(long n){
        return (n%10) % 2 == 0;

    }
    public static int numberOfMultiplesOfaCertainNumber(int n, int nMax, int nMin){
        //If the interval is reversed this method should return an error (-1)
        if(nMin > nMax){
            return -1;
        }
        //Considering only multiples of positive numbers in also, a range of positive numbers
        if(n <= 0 || nMax <= 0 || nMin <= 0){
            return -2;
        }
        int counter = 0;
        for(int i = nMin; i <= nMax; i++){
            if(i%n == 0) {
                counter++;
            }
        }
        return counter;
    }


    public static int numberOfTwoMultiplesOfaCertainNumber(int n, int z,int nMax, int nMin){
        if(nMin > nMax){
            return -1;
        }

        //Neither n or z can be zero, or we will have an arithmetic exception
        if(n <= 0 || z <= 0 || nMax <= 0 || nMin <= 0){
            return -2;
        }
        int counter = 0;
        for(int i = nMin; i <= nMax; i++){
            if(i%n == 0 && i%z == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int[] multiplesOfaCertainNumber(int n, int nMax, int nMin){
        //If all parameters are set to zero the result will be an array with only 0
        if(AfonsoTools.isZero(n) && nMax == 0 && nMin == 0){
            return new int[]{0};
        }
        //If n is set to zero, this method should return an empty array, because no number can be multiple of zero
        if(AfonsoTools.isZero(n)){
            return new int[0];
        }
        //If both range numbers are equal and equal to zero this method should return an empty array
        if(nMax == 0 && nMin == 0){
            return new int[0];
        }
        int[] array1 = new int[0];
        int pos = 0;
        for(int i = nMin; i <= nMax; i++) {
            if(i % n == 0){

                array1 = increaseSize(array1);
                array1[pos] = i;
                pos++;
            }
        }
        return array1;
    }

    /*
    This method is responsible for increasing array size "dynamically" (by demand);
    We start with creating an array that has (receivedArray.lenght + 1). Then copies the content
    of the received array to the new one.
     */

    public static int[] increaseSize(int[] array1){
        int[] newArray = new int[array1.length + 1];
        for(int i = 0; i < array1.length; i++){
            newArray[i] = array1[i];
        }
        return newArray;
    }

    /*
    This function is similar to a previous method numberOfTwoMultiplesOfaCertainNumber, the difference
    lies in what is returned by the method. The following method returns an array of the multiples instead of
    the number of multiples.
     */


    public static int[] multiplesOfTwoNumbers(int n, int z, int nMax, int nMin) {
        if(AfonsoTools.isZero(n) && AfonsoTools.isZero(z)){
            return new int[0];
        }
        int[] arr1 = multiplesOfaCertainNumber(n, nMax, nMin);
        int[] arr2 = multiplesOfaCertainNumber(z, nMax, nMin);

        int combinedLength = arr1.length + arr2.length;
        int[] combinedArray = new int[combinedLength];

        int index = 0;
        for (int j : arr1) {
            combinedArray[index] = j;
            index++;
        }
        for (int j : arr2) {
            combinedArray[index] = j;
            index++;
        }
        return combinedArray;
    }

    public static int summingMultipleNumbers(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
}
