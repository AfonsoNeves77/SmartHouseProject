package pt.ipp.isep.dei.examples.basic.domain.Bloco3;

public class MarianaTools {
    public static int[] increaseArrayLength(int[] arrayToIncrease)
    {
        int[] newArray = new int[arrayToIncrease.length + 1];

        for(int i = 0; i < arrayToIncrease.length; i++)
            newArray[i] = arrayToIncrease[i];
        return newArray;
    }

    public static int sumOfArrayNumbers(int[] array)
    {
        if ((array == null) || (array.length == 0))
            return 0;
        int sumOfArrayNumbers = 0;
        for(int i = 0; i < array.length; i++)
            sumOfArrayNumbers += array[i];
        return sumOfArrayNumbers;
    }

    public static int productOfArrayNumbers(int[] array)
    {
        if ((array == null) || (array.length == 0))
            return 0;
        int productOfArrayNumbers = 1;
        for(int i = 0; i < array.length; i++)
            productOfArrayNumbers *= array[i];
        return productOfArrayNumbers;
    }

    public static int[] multiplesOfNumberNInAnInterval(int numberN, int inf, int sup)
    {
        if (inf >= sup)
            return null;

        if((numberN == 0) && ((sup == 0) || (inf == 0)))
            return new int[]{0};
        else if ((numberN == 0) && (sup > 0) && (inf < 0))
            return new int[]{0};
        else if (numberN == 0)
            return null;

        int[] multiples = new int[0];

        int index = 0;
        for(int i = inf; i <= sup; i++) {
            if (((i % numberN) == 0) && ((i / numberN) >= 0)){
                multiples = increaseArrayLength(multiples);
                multiples[index] = i;
                index++;
            }
        }
        return multiples;
    }

    //Array values are not sorted!! Display multiples of number1 and then number2.
    public static int[] multiplesOf2NumbersInAnInterval(int number1, int number2, int inf, int sup) {
        if (inf >= sup)
            return null;

        int[] number1multiples = multiplesOfNumberNInAnInterval(number1, inf, sup);
        int[] number2multiples = multiplesOfNumberNInAnInterval(number2, inf, sup);

        if ((number1multiples == null) || (number1multiples.length == 0))
            return number2multiples;
        else if ((number2multiples == null) || (number2multiples.length == 0))
            return number1multiples;

        //Starts the final array with one of the number's arrays.
        int[] multiplesOf2Numbers = number1multiples;

        for (int i = 0; i < number2multiples.length; i++) {
            boolean toInsert = true;
            for (int k = 0; k < number1multiples.length; k++) {
                if (number2multiples[i] == number1multiples[k]) {
                    toInsert = false;
                    break;
                }
            }
            //Increases the final array by 1 and adds the extra number.
            if (toInsert) {
                int index = multiplesOf2Numbers.length;
                multiplesOf2Numbers = increaseArrayLength(multiplesOf2Numbers);
                multiplesOf2Numbers[index] = number2multiples[i];
            }
        }
        return multiplesOf2Numbers;
    }

    public static int[] revertArray(int[] array) {
        if ((array == null) || (array.length == 0))
            return null;

        for(int i = 0, k = array.length-1; i<k; i++, k--){
            int extraVar = array[i];
            array[i] = array[k];
            array[k] = extraVar;
        }
        return array;
    }

    public static int numberOfDigitsOfALongNumber(long numberN) {
        if (numberN == 0)
            return 1;

        int numberCounter = 0;
        while(Math.abs(numberN) > 0) {
            numberN = numberN / 10;
            numberCounter += 1;
        }
        return numberCounter;
    }
}
