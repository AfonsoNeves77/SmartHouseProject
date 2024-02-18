package pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio4;

public class TiagoEx4 {

    public static int countOfAlgarismsInANumber(long num) {
        int counter = 0;
        if (num == 0) {
            return 1;
        }
        while (num != 0) {
            num = num / 10;
            counter++;
        }
        return counter;
    }


//Exercicio4B-----------------------------------------------------------------------------------------------------------

    public static int countOfEvenAlgarismsInANumber(long num) {
        int counter = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                counter++;
            }
            num = num / 10;
        }
        return counter;
    }
//Exercicio4C-----------------------------------------------------------------------------------------------------------

    public static int countOfOddAlgarismsInANumber(long num) {
        int counter = 0;
        while (num != 0) {
            if (num % 2 != 0) {
                counter++;
            }
            num = num / 10;
        }
        return counter;
    }
//Exercicio4D-----------------------------------------------------------------------------------------------------------

    public static long sumOfNumbersInARange(long num) {
        long sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

//Exercicio4E-----------------------------------------------------------------------------------------------------------

    public static long sumOfEvenNumbersInARange(long num) {
        long sum = 0; // Inicializa sum a 0
        while (num != 0) { // Enquanto o input for maior do que 0.
            if (num % 2 == 0) { // Se o número for par.
                sum = sum + num % 10; // Soma o último dígito par.
            }
            num = num / 10; //Retira um dígito ao número.
        }
        return sum;
    }

//Exercicio4F-----------------------------------------------------------------------------------------------------------

    public static long sumOfOddNumbersInARange(long num) {
        long sum = 0; // Inicializa sum a 0
        while (num != 0) { // Enquanto o input for maior do que 0.
            if (num % 2 != 0) { // Se o número for impar.
                sum = sum + num % 10; // Soma o último dígito par.
            }
            num = num / 10; //Retira um dígito ao número.
        }
        return sum;
    }

//Exercicio4G-------------------------------------------------------------------------------------------------------

    public static double averageOfNumbersInALongNumber(long num) {
        return (double) sumOfNumbersInARange(num) / countOfAlgarismsInANumber(num);
    }
    //Exercicio4H------------------------------------------------------------------------------------------------------------
    public static double averageOfEvenNumbersInALongNumber(long num) {
        if (countOfEvenAlgarismsInANumber(num) != 0) {
            return (double) sumOfEvenNumbersInARange(num) / countOfEvenAlgarismsInANumber(num);
        }
        else {
            return -1;
        }
    }
//Exercicio4I---------------------------------------------------------------------------------------------------------------

    public static double averageOfOddNumbersInALongNumber(long num) {
        if (countOfOddAlgarismsInANumber(num) == 0) {
            return -1;
        }else {
            return (double) sumOfOddNumbersInARange(num) / countOfOddAlgarismsInANumber(num);
        }
    }
    //Exercicio 4J----------------------------------------------------------------------------------------------------------
    public static long invertNumber (long num) {
        long reverse = 0;
        while (num !=0) {
            reverse = reverse * 10 + num % 10;
            num/=10;
        }
        return reverse;
    }
}
