package pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio4;

import pt.ipp.isep.dei.examples.basic.domain.Bloco3.AfonsoTools;

import java.util.Arrays;

public class AfonsoEx4 {

    //By typing (1) in filter variable we are saying we want odd numbers, (2) -- > even numbers and (0) ---> we don't want any filter;
    //The condition when the value is (0) and filter is set to (1) is because (0) is an even number, not odd. It's not necessary to do the calculations.
    // In these cases we should return an empty array.


    //A+B+C)

    public static int numberCounter(long n,int filter) {
        int count = 0;
        do {
            switch (filter) {
                case 0:
                    count++;
                    break;

                case 1:
                    if (n % 2 != 0) {
                        count++;
                    }
                    break;

                case 2:
                    if (n % 2 == 0) {
                        count++;
                    }
                    break;
                default:
                    return -1;
            }
            n = n / 10;
        } while (n != 0);
        return count;
    }

    //This function creates an array with the filtered numbers
    public static int[] numberOfAlgarisms(long n,int filter) {
        int arrayLenght;
        int[] number;
    if (filter == 2 || filter == 0 || filter == 1) {
        if (n == 0 && filter == 1) {
            return new int[0];
        }
        arrayLenght = numberCounter(n, filter);
        number = new int[arrayLenght];
        return numberInserter(n, filter, number);
    } else {
        return new int[0];
        }
    }

    //This function inserts filtered numbers in an array
    public static int[] numberInserter(long n,int filter,int[] array){
        int i = 0;
        while (n!=0){
            switch(filter){
                case 0:
                    array[i] = (int) (n%10);
                    i++;
                    break;

                case 1:
                    if (!AfonsoTools.isEven(n)){
                        array[i] = (int) (n%10);
                        i++;
                    }
                    break;

                case 2:
                    if (AfonsoTools.isEven(n)){
                        array[i] = (int) (n%10);
                        i++;
                    }
                    break;
                default:
                    return new int[0];
            }
            n /= 10;
        }
        return array;
    }

    //D+E+F
    public static int numberSum(long n,int filter){
        int sum = 0;
        int[] array = numberOfAlgarisms(n,filter);
        if (!Arrays.equals(array, new int[0])){
            for (int j : array) {
                sum += j;
            }
            return sum;
        }
        return -1;
    }

    //G+H+I)
    public static double numberMedia(long n,int filter) {
        int sumNumbers = numberSum(n,filter);
        int numberCounter = numberCounter(n,filter);
        if (sumNumbers != -1){
            return (double) sumNumbers /numberCounter;
        }
        return -1;

    }

    //J)
    public static long invertingNumber(long n){
        long number = 0;
        while(n!=0){
            long z = n%10;
            number = number*10 + z;
            n /=10;
        }
        return number;
    }


}
