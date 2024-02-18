package pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio4;

import pt.ipp.isep.dei.examples.basic.domain.Bloco3.HugoTools;

public class HugoEx4 {
    // 4a--------------------------------------------------------------------
    public static long resolucao4a(long num){
        long[] arrayAlgarismos;
        long counter = 0;
        arrayAlgarismos = HugoTools.longNumDigitExtractionIntoArray(num);
        for (int i = 0; i != arrayAlgarismos.length ; i++){
            counter++;
        }
        return counter;
    }

    public static int[] altResolucao4a(int num){
        int[] arrayAlgarismos;
        arrayAlgarismos = HugoTools.intNumDigitExtractionIntoArray(num);
        arrayAlgarismos = HugoTools.arraySorterBackToFront(arrayAlgarismos);
        return arrayAlgarismos;

    }
    // 4b-------------------------------------------------------------------
    public static long resolucao4b(long num){
        long[] arrayAlgarismos;
        long counter = 0;
        arrayAlgarismos = HugoTools.longNumDigitExtractionIntoArray(num);
        for (int i = 0; i != arrayAlgarismos.length ; i++){
            if (arrayAlgarismos[i] % 2 == 0){
                counter++;
            }
        }
        return counter;
    }
    public static int[] altResolucao4b(int num){
        int[] arrayAlgarismos;
        arrayAlgarismos = HugoTools.intNumDigitExtractionIntoArray(num);
        arrayAlgarismos = HugoTools.arraySorterBackToFront(arrayAlgarismos);
        arrayAlgarismos = HugoTools.listEvenNumbersArray(arrayAlgarismos);
        return arrayAlgarismos;
    }

    // 4c ---------------------------------------------------------------------------------------
    public static long resolucao4c(long num){
        long[] arrayAlgarismos;
        long counter = 0;
        arrayAlgarismos = HugoTools.longNumDigitExtractionIntoArray(num);
        for (int i = 0; i != arrayAlgarismos.length ; i++){
            if (arrayAlgarismos[i] % 2 != 0){
                counter++;
            }
        }
        return counter;
    }
    public static long[] altResolucao4c(long num){
        long[] arrayAlgarismos;
        arrayAlgarismos = HugoTools.longNumDigitExtractionIntoArray(num);
        arrayAlgarismos = HugoTools.longArraySorterBackToFront(arrayAlgarismos);
        return arrayAlgarismos;
    }

    public static long resolucao4d(long num){
        long sum = 0;
        long[] numArray = HugoTools.longNumDigitExtractionIntoArray(num);
        for (int i=0; i<=numArray.length-1;i++){
            sum += numArray[i];
        }
        return sum;
    }

    public static long resolucao4e(long num){
        long sum = 0;
        long[] numArray = HugoTools.longNumDigitExtractionIntoArray(num);
        numArray = HugoTools.longListEvenNumbersArray(numArray);
        for (int i=0; i<=numArray.length-1;i++){
            sum += numArray[i];
        }
        return sum;
    }

    public static long resolucao4f(long num){
        long sum = 0;
        long[] numArray = HugoTools.longNumDigitExtractionIntoArray(num);
        numArray = HugoTools.listOddNumbersArrayLong(numArray);
        for (int i=0; i<=numArray.length-1;i++){
            sum += numArray[i];
        }
        return sum;
    }

    public static double resolucao4g(long num){
        long[] numArray = HugoTools.longNumDigitExtractionIntoArray(num);
        long sum = 0;
        long counter = 0;
        for (int i=0; i<=numArray.length-1;i++){
            sum += numArray[i];
            counter++;
        }
        return (double) sum/counter;
    }

    public static double resolucao4h(long num){
        long[] numArray = HugoTools.longNumDigitExtractionIntoArray(num);
        numArray = HugoTools.longListEvenNumbersArray(numArray);
        long sum = 0;
        long counter = 0;
        for (int i=0; i<=numArray.length-1;i++){
            sum += numArray[i];
            counter++;
        }
        return (double) sum/counter;
    }

    public static double resolucao4i(long num){
        long[] numArray = HugoTools.longNumDigitExtractionIntoArray(num);
        numArray = HugoTools.listOddNumbersArrayLong(numArray);
        long sum = 0;
        long counter = 0;
        for (int i=0; i<=numArray.length-1;i++){
            sum += numArray[i];
            counter++;
        }
        return (double) sum/counter;
    }

    public static long resolucao4j(long num){
        long num1 = 0;
        long[] array= HugoTools.longNumDigitExtractionIntoArray(num);
        for (int i=0; i < array.length;i++){
            num1 = num1 * 10 + array[i];
        }
        return num1;
    }
}
