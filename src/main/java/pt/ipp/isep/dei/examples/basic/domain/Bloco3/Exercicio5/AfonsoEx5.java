package pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio5;

public class AfonsoEx5 {

    public static boolean AmstrongNumber(long n)  {
        if (n <= 0){
            return false;
        }
        else {
            int sum = 0;
            long copyN = n;
            while (n!= 0){
                long r = n%10;
                sum = (int) (sum + Math.pow(r,3));
                n = n / 10;
            }
            return sum == copyN;
        }
    }
    public static boolean isCapicua(int n){
        int copyN = n;
        int sum = 0;
        while (n != 0){
            int r = n %10;
            sum = sum*10 + r;
            n = n /10;
        }
        return copyN == sum;
    }

    /*
    The following functions can be used to calculate simultaneously (1)-Capicua and (2)-Amstrong Number.
    By using this filter (typeOfNumber) 1 or 2, the user can specificate which number he wants. The idea is to
    reuse the same logic in similar exercises.
    This function returns (-1) --> case type of number is invalid;
    The value (-10) is returned in case capicua is not found;

    */
    public static int firstNumber(int inf, int sup,int typeOfNumber){
        if(sup < inf){
            return -2;
        }
        int numberOfSpecialNumbers=0;
        for(int i = inf; i<=sup; i++){
            if (typeOfNumber == 1){
                if (isCapicua(i)){
                    numberOfSpecialNumbers = i;
                    break;
                }
            }
            if (typeOfNumber == 2){
                if (AmstrongNumber(i)){
                    numberOfSpecialNumbers = i;
                    break;
                }
            }
            if (typeOfNumber !=1 && typeOfNumber!=2){
                return -1;
            }

        }
        return numberOfSpecialNumbers;
    }

    public static int numberCounter(int inf,int sup, int typeOfNumber){
        int counter = 0;
        for(int i = inf; i<=sup; i++){
            if (typeOfNumber == 1){
                if(isCapicua(i)){
                    counter++;
                }
            }
            if (typeOfNumber == 2){
                if(AmstrongNumber(i)){
                    counter++;
                }
            }
            if (typeOfNumber !=1 && typeOfNumber!=2){
                return -1;
            }
        }
        return counter;
    }

    public static int[] numberOfSpecialNumbers(int inf,int sup,int typeOfNumber){
        if(sup < inf){
            return new int[0];
        }
        if (typeOfNumber !=1 && typeOfNumber!=2){
            return new int[0];
        }
        int[] arrayOfCapicuas = new int[numberCounter(inf,sup,typeOfNumber)];
        int index = 0;
        for(int i = inf; i<=sup; i++){
            if (typeOfNumber == 1){
                if(isCapicua(i)){
                    arrayOfCapicuas[index] = i;
                    index++;
                }
            }
            if (typeOfNumber == 2){
                if(AmstrongNumber(i)){
                    arrayOfCapicuas[index] = i;
                    index++;
                }
            }

        }
        return arrayOfCapicuas;
    }

    public static int biggestCapicua(int inf, int sup){
        if(sup < inf){
            return -1;
        }
        if(numberCounter(inf,sup,1) == 0){
            return -1;
        }
        int maior = inf;
        for(int i = inf; i<=sup; i++){
            if (isCapicua(i)){
                if (i > maior) {
                    maior = i;
                }
            }
        }

        return maior;
    }

}
