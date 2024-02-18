package pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio3;

import pt.ipp.isep.dei.examples.basic.domain.Bloco3.AfonsoTools;

import java.util.Arrays;

public class AfonsoEx3 {

    //A)
    public static int sumAllEvenNumbers(int nMax, int nMin) {
        int sum = 0;
        for (int i = nMin; i <= nMax; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    //B)

    public static int quantityEvenNumbers(int nMax, int nMin) {
        int counter = 0;
        for (int i = nMin; i <= nMax; i++) {
            if (i % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    //C)

    public static int sumAllOddNumbers(int nMax, int nMin) {
        int sum = 0;
        for (int i = nMin; i <= nMax; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    //D)

    public static int quantityOddNumbers(int nMax, int nMin) {
        int counter = 0;
        for (int i = nMin; i <= nMax; i++) {
            if (i % 2 != 0) {

                counter++;
            }
        }
        return counter;
    }

    //E)


    public static int sumAllMultiplesInAGivenInterval(int n,int nMax, int nMin) {
        if(nMax < nMin){
            int aux;
            aux = nMax;
            nMax = nMin;
            nMin = aux;
        }
        if (n == 0) {
            return 0;
        }
        int sum = 0;
        for(int i = nMax; i >= nMin; i--) {
            if (i%n == 0){
                sum+=i;
            }
        }
        return sum;
    }

    //F)

    public static int productMultiplesOnaGivenInterval(int n, int nMax, int nMin){
        if(AfonsoTools.isZero(n) && nMax == 0 && nMin == 0){
            return 0;
        }
        if(AfonsoTools.isZero(n)){
            return -1;
        }
        if(nMax == 0 && nMin == 0){
            return 0;
        }

        int[] productArray = AfonsoTools.multiplesOfaCertainNumber(n,nMax,nMin);
        //Case the only multiple is zero the functions returns 0;
        if(Arrays.equals(productArray, new int[]{0})){
            return 0;
        }
        int prod = 1;
        //0 can be considered a multiple of every whole number.

        /*If the interval has 0 in it, the presence of 0 would make any product equal to zero
        so, if productArray at any index is 0, becomes equal to one to have no influence in the calculation */
        for(int i = 0; i < productArray.length;i++){
            if (productArray[i] == 0 ){
                productArray[i] = 1;
            }
            prod *= productArray[i];
        }
        return prod;
    }

    //G)
    public static double mediaMultiplesGivenInterval(int n, int nMax, int nMin){
        if(AfonsoTools.isZero(n)){
            return -1;
        }
        int[] mediaArray = AfonsoTools.multiplesOfaCertainNumber(n,nMax,nMin);
        int sum = 0;
        for(int i = 0; i < mediaArray.length;i++){
            sum+= mediaArray[i];
        }
        return (double) sum /mediaArray.length;
    }

    //H)

    public static double mediaofTwoMultiplesGivenInterval(int n, int z,int nMax, int nMin){
        if(AfonsoTools.isZero(n) || AfonsoTools.isZero(z)){
            return -1;
        }
        int[] multiplesArray = AfonsoTools.multiplesOfTwoNumbers(n,z,nMax,nMin);
        int sum = AfonsoTools.summingMultipleNumbers(multiplesArray);
        return (double) sum /multiplesArray.length;
    }


    //Extra Exercise --------------------------------------------------------

    public static int[] arrayAllEvenNumbers(int nMax, int nMin) {
        int[] arr1 = new int[0];
        int pos = 0;
        for (int i = nMin; i <= nMax; i++) {
            if (i % 2 == 0) {
                arr1 = AfonsoTools.increaseSize(arr1);
                arr1[pos] = i;
                pos++;

            }
        }
        return arr1;
    }

}


