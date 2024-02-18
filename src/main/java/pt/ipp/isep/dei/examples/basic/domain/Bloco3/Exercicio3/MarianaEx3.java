package pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio3;

import pt.ipp.isep.dei.examples.basic.domain.Bloco3.MarianaTools;

public class MarianaEx3 {
    //Exercises as requested.
    //Note: If interval extremes are the same, it was considered there is no interval and the function returns an error.

    /**
     * a)
     * @param inf
     * @param sup
     * @return sum of all even numbers in an interval.
     */
    public static int sumOfAllEvenNumbersInAnInterval(int inf, int sup) {
        if (inf >= sup)
            return -1;

        int sumEvenNumbers = 0;
        for (int i = inf; i <= sup; i++) {
            if (i % 2 == 0)
                sumEvenNumbers += i;
        }
        return sumEvenNumbers;
    }


    /**
     * b)
     * @param inf
     * @param sup
     * @return how many odd numbers.
     */
    public static int quantityOfEvenNumbersInAInterval(int inf, int sup) {
        if(inf >= sup)
            return -1;

        int counter = 0;
        for (int i = inf; i <= sup; i++) {
            if (i % 2 == 0)
                counter += 1;
        }
        return counter;
    }

    /**
     * c)
     * @param inf
     * @param sup
     * @return sum of all odd numbers in an interval.
     */
    public static int sumOfAllOddNumbersInAnInterval(int inf, int sup) {
        if (inf >= sup)
            return -1;

        int sumOddNumbers = 0;
        for (int i = inf; i <= sup; i++) {
            if (i % 2 != 0)
                sumOddNumbers += i;
        }
        return sumOddNumbers;
    }

    /**
     * d)
     * @param inf
     * @param sup
     * @return how many odd numbers in an interval.
     */
    public static int quantityOfOddNumbersInAInterval(int inf, int sup) {
        if(inf >= sup)
            return -1;

        int counter = 0;
        for (int i = inf; i <= sup; i++) {
            if (i % 2 != 0)
                counter += 1;
        }
        return counter;
    }

    /**
     * e)
     * @param numberN
     * @param inf
     * @param sup
     * @return sum of the multiples of a number in an interval.
     */
    //There is no error if sup and inf are changed because they can be swapped.
    public static int sumOfNumberNMultiplesInAnInterval(int numberN, int inf, int sup)
    {
        if(inf >= sup) {
            int extraVar;
            extraVar = sup;
            sup = inf;
            inf = extraVar;
        }

        int[] multiplesOfNumberN = MarianaTools.multiplesOfNumberNInAnInterval(numberN,inf,sup);
        if (multiplesOfNumberN == null)
            return 0;
        int sumOfNumberNMultiples = MarianaTools.sumOfArrayNumbers(multiplesOfNumberN);
        return sumOfNumberNMultiples;
    }

    /**
     * f)
     * @param numberN
     * @param inf
     * @param sup
     * @return product of the multiples of a number.
     */
    public static int productOfNumberNMultiplesInAnInterval(int numberN, int inf, int sup)
    {
        int[] multiples = MarianaTools.multiplesOfNumberNInAnInterval(numberN,inf,sup);

        if ((multiples == null) || (multiples.length == 0))
            return 0;

        int productOfNumberNMultiples = MarianaTools.productOfArrayNumbers(multiples);
        return productOfNumberNMultiples;
    }

    /**
     * g)
     * @param numberN
     * @param inf
     * @param sup
     * @return average of the multiples of a number in an interval.
     */
    public static double averageOfNumberNMultiplesInAnInterval(int numberN, int inf, int sup)
    {
        int[] multiples = MarianaTools.multiplesOfNumberNInAnInterval(numberN,inf,sup);

        if ((multiples == null) || (multiples.length == 0))
            return Double.NaN;
        int sum = sumOfNumberNMultiplesInAnInterval(numberN,inf,sup);
        double averageOfNumberNMultiples = (double) sum /(multiples.length);
        return averageOfNumberNMultiples;
    }

    /**
     * h)
     * @param number1
     * @param number2
     * @param inf
     * @param sup
     * @return average of the multiples of 2 numbers in an interval.
     */
    public static double averageOfTheMultiplesOf2NumbersInAnInterval(int number1, int number2, int inf, int sup)
    {
        int[] multiples = MarianaTools.multiplesOf2NumbersInAnInterval(number1,number2,inf,sup);

        if ((multiples == null) || (multiples.length == 0))
            return Double.NaN;
        int sum = MarianaTools.sumOfArrayNumbers(multiples);
        double averageOfMultiplesOf2Numbers = (double) sum /(multiples.length);
        return averageOfMultiplesOf2Numbers;
    }

    //Exercises solved with arrays.

    /**
     * b) with arrays.
     * @param inf
     * @param sup
     * @return all even numbers in an interval.
     */
    public static int[] evenNumbersInAnInterval (int inf, int sup) {
        if (inf >= sup)
            return null;

        int arrayDimension = quantityOfEvenNumbersInAInterval(inf, sup);
        int[] evenNumbers = new int[arrayDimension];

        int index = 0;
        for (int i = inf; i <= sup; i++) {
            if (i % 2 == 0) {
                evenNumbers[index] = i;
                index++;
            }
        }

        return evenNumbers;
    }

    /**
     * d) with arrays
     * @param inf
     * @param sup
     * @return all odd numbers in an interval.
     */
    public static int[] oddNumbersInAnInterval (int inf, int sup) {
        if (inf >= sup)
            return null;

        int arrayDimension = quantityOfOddNumbersInAInterval(inf, sup);
        int[] oddNumbers = new int[arrayDimension];

        int index = 0;
        for (int i = inf; i <= sup; i++) {
            if (i % 2 != 0) {
                oddNumbers[index] = i;
                index++;
            }
        }
        return oddNumbers;
    }


}
