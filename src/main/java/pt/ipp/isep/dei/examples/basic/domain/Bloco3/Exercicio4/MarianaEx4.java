package pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio4;

import pt.ipp.isep.dei.examples.basic.domain.Bloco3.MarianaTools;

public class MarianaEx4 {

    /**
     * a)
     * @param numberN
     * @return number of digits of a long number
     */
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

    /**
     * b)
     * @param numberN
     * @return number of even digits of a long number.
     */
    public static int numberOfEvenDigitsOfALongNumber(long numberN) {
        if (numberN == 0)
            return 1;

        int numberCounter = 0;
        while(Math.abs(numberN) > 0) {
            if (numberN % 2 == 0)
                numberCounter += 1;
            numberN = numberN / 10;
        }
        return numberCounter;
    }

    /**
     * c)
     * @param numberN
     * @return number of odd digits of a long number
     */
    public static int numberOfOddDigitsOfALongNumber(long numberN) {
        if (numberN == 0)
            return 1;

        int numberCounter = 0;
        while(Math.abs(numberN) > 0) {
            if (numberN % 2 != 0)
                numberCounter += 1;
            numberN = numberN / 10;
        }
        return numberCounter;
    }

    /**
     * d)
     * @param number
     * @return sum of the digits of a number.
     */
    public static long sumDigitsOfALongNumber(long number) {

        int[] totalDigitsArray = digitsOfANumber(number);

        long sum = 0;
        for(int i = 0; i < totalDigitsArray.length; i++) {
            sum += totalDigitsArray[i];
        }
        return sum;
    }

    /**
     * e)
     * @param number
     * @return sum of the even digits of a number.
     */
    public static long sumEvenDigitsOfALongNumber(long number) {

        int[] totalDigitsArray = evenDigitsOfANumber(number);

        long sum = 0;
        for(int i = 0; i < totalDigitsArray.length; i++) {
            sum += totalDigitsArray[i];
        }
        return sum;
    }

    /**
     * f)
     * @param number
     * @return sum of the odd digits of a number.
     */
    public static long sumOddDigitsOfALongNumber(long number) {

        int[] totalDigitsArray = oddDigitsOfANumber(number);

        long sum = 0;
        for(int i = 0; i < totalDigitsArray.length; i++) {
            sum += totalDigitsArray[i];
        }
        return sum;
    }

    /**
     * g)
     * @param number
     * @return average of the digits of a number.
     */
    public static double averageOfTheDigitsOfALongNumber(long number) {
        int[] totalDigitsArray = digitsOfANumber(number);
        long sum = sumDigitsOfALongNumber(number);
        double average = (double) sum / totalDigitsArray.length;
        return average;
    }

    /**
     * h)
     * @param number
     * @return average of the even digits of a number.
     */
    public static double averageOfTheEvenDigitsOfALongNumber(long number) {
        int[] totalDigitsArray = evenDigitsOfANumber(number);
        long sum = sumEvenDigitsOfALongNumber(number);
        double average = (double) sum / totalDigitsArray.length;
        return average;
    }

    /**
     * i)
     * @param number
     * @return average of the odd digits of a number.
     */
    public static double averageOfTheOddDigitsOfALongNumber(long number) {
        int[] totalDigitsArray = oddDigitsOfANumber(number);
        long sum = sumOddDigitsOfALongNumber(number);
        double average = (double) sum / totalDigitsArray.length;
        return average;
    }

    /**
     * j)
     * @param number
     * @return a number in its reverse order.
     */
    public static long numberInReverse(long number) {
        int[] totalDigitsArray = digitsOfANumber(number);

        long numberInReverse = 0;
        for (int i = 0; i < totalDigitsArray.length; i++) {
            numberInReverse += totalDigitsArray[i] * Math.pow(10,i);
        }
        return  numberInReverse;
    }

    //Exercises a) to c) using arrays.
    /**
     * a)
     * @param number
     * @return array with the digits of a number, in order.
     */
    public static int[] digitsOfANumber(long number) {
        if (number == 0)
            return new int[]{0};

        int[] digitsInReverseOrder = new int[0];

        number = Math.abs(number);
        int index = 0;
        while (number > 0) {
            if(number % 10 == 0) {
                digitsInReverseOrder = MarianaTools.increaseArrayLength(digitsInReverseOrder);
                digitsInReverseOrder[index] = (int) number;
                return MarianaTools.revertArray(digitsInReverseOrder);
            }

            digitsInReverseOrder = MarianaTools.increaseArrayLength(digitsInReverseOrder);
            digitsInReverseOrder[index] = (int) (number % 10);
            number = number / 10;
            index +=1;
        }
        return MarianaTools.revertArray(digitsInReverseOrder);
    }

    /**
     * b)
     * @param number
     * @return array with the even digits of a number, in order.
     */
    public static int[] evenDigitsOfANumber(long number) {

        int[] totalDigitsArray = digitsOfANumber(number);

        int[] evenDigitsArray = new int[0];

        int index = 0;
        for(int i = 0; i < totalDigitsArray.length; i++) {
            if(totalDigitsArray[i] % 2 == 0) {
                evenDigitsArray = MarianaTools.increaseArrayLength(evenDigitsArray);
                evenDigitsArray[index] = totalDigitsArray[i];
                index ++;
            }
        }
        return evenDigitsArray;
    }

    /**
     * c)
     * @param number
     * @return array with the odd digits of a number, in order.
     */
    public static int[] oddDigitsOfANumber(long number) {

        int[] totalDigitsArray = digitsOfANumber(number);

        int[] oddDigitsArray = new int[0];

        int index = 0;
        for(int i = 0; i < totalDigitsArray.length; i++) {
            if(totalDigitsArray[i] % 2 != 0) {
                oddDigitsArray = MarianaTools.increaseArrayLength(oddDigitsArray);
                oddDigitsArray[index] = totalDigitsArray[i];
                index ++;
            }
        }
        return oddDigitsArray;
    }
}
