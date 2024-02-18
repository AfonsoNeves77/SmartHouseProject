package pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio2;

import pt.ipp.isep.dei.examples.basic.domain.Bloco3.MarianaTools;

public class MarianaEx2 {
    //Exercises as requested.
    //Note: If interval extremes are the same, it was considered there is no interval and the function returns an error.
    /**
     * a)
     * @param inf
     * @param sup
     * @return quantity of number 3 multiples in an interval.
     */
    public static int multiplesOf3(int inf, int sup) {
        if (inf >= sup)
            return -1;

        int multiplesCounter = 0;
        for(int i = inf; i <= sup; i++) {
            if ((i % 3 == 0) && (i / 3 >= 0))
                multiplesCounter += 1;
        }
        return multiplesCounter;
    }

    /**
     * b)
     * @param numberN
     * @param inf
     * @param sup
     * @return quantity of number N multiples in an interval.
     */
    public static int multiplesOfNumberN(int numberN, int inf, int sup)
    {
        if (inf >= sup)
            return -1;

        if((numberN == 0) && ((sup == 0) || (inf == 0)))
            return 1;
        else if ((numberN == 0) && (sup > 0) && (inf < 0))
            return 1;
        else if (numberN == 0)
            return 0;

        int multiplesCounter = 0;
        for(int i = inf; i <= sup; i++) {
            if (((i % numberN) == 0) && ((i / numberN) >= 0))
                multiplesCounter += 1;
        }
        return multiplesCounter;
    }

    /**
     * c)
     * @param inf
     * @param sup
     * @return quantity of number 3 and 5 multiples in an interval.
     */
    public static int multiplesOfNumber3And5(int inf, int sup)
    {
        if(inf >= sup)
            return -1;

        int multiplesCounter = 0;
        for (int i = inf; i <= sup; i++) {
            if ((((i % 3) == 0) && ((i / 3) >= 0)) && (((i % 5) == 0) && ((i / 5) >= 0)))
                multiplesCounter += 1;
        }
        return multiplesCounter;
    }

    /**
     * d)
     * @param number1
     * @param number2
     * @param inf
     * @param sup
     * @return quantity of the shared multiples of 2 numbers in an interval.
     */
    public static int sharedMultiplesOf2Numbers(int number1, int number2, int inf, int sup)
    {
        if(inf >= sup)
            return -1;

        if(((number1 == 0) || (number2 == 0)) && ((sup == 0) || (inf == 0)))
            return 1;
        else if (((number1 == 0)  || (number2 == 0)) && (sup > 0) && (inf < 0))
            return 1;
        else if ((number1 == 0) || (number2 == 0))
            return 0;

        int multiplesOf2NumbersCounter = 0;

        int index = 0;
        for (int i = inf; i <= sup; i++) {
            if ((((i % number1) == 0) && ((i / number1) >= 0)) && (((i % number2) == 0) && ((i / number2) >= 0)))
               multiplesOf2NumbersCounter += 1;
        }
        return multiplesOf2NumbersCounter;
    }

    /**
     * e)
     * @param number1
     * @param number2
     * @param inf
     * @param sup
     * @return sum of the shared multiples of 2 numbers in an interval.
     */
    public static int sumOfSharedMultiplesOf2Numbers(int number1, int number2, int inf, int sup)
    {
        if(inf >= sup)
            return -1;

        if((number1 == 0) || (number2 == 0))
            return 0;

        int sumOfSharedMultiples = 0;
        for (int i = inf; i <= sup; i++) {
            if ((((i % number1) == 0) && ((i / number1) >= 0)) && (((i % number2) == 0) && ((i / number2) >= 0)))
                sumOfSharedMultiples += i;
        }

        return sumOfSharedMultiples;
    }

    //Exercises solved with arrays.
    /**
     *  a)
     * @param inf
     * @param sup
     * @return multiples of number 3 in an interval.
     * Interval has only positive extremes.
     */
    public static int[] multiplesOfNumber3Arrays(int inf, int sup)
    {
        if (inf >= sup)
            return null;

        int[] multiples = new int[0];

        int index = 0;
        for(int i = inf; i <= sup; i++) {
            if (((i % 3) == 0) && ((i / 3) >= 0)) {
                multiples = MarianaTools.increaseArrayLength(multiples);
                multiples[index] = i;
                index++;
            }
        }
        return multiples;
    }

    /**
     * 2. b)
     * @param numberN
     * @param inf
     * @param sup
     * @return multiples of a chosen number in an interval.
     * Interval has only positive extremes.
     */
    public static int[] multiplesOfNumberNArrays(int numberN, int inf, int sup)
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
                multiples = MarianaTools.increaseArrayLength(multiples);
                multiples[index] = i;
                index++;
            }
        }
        return multiples;
    }

    /**
     * 2. c)
     * @param inf
     * @param sup
     * @return multiples of 3 and 5 in an interval. The repeated values are just considered once in the array.
     * Interval has only positive extremes.
     */
    public static int[] multiplesOfNumber3And5Arrays(int inf, int sup)
    {
        //We don't know the array size by hand, because we could have repetitive values (common multiples).
        //Create a function which increases the length of an array.
        //We start with an empty array, i.e., dimension 0. If we find a multiple, we increase the array by 1 and add the multiple to the array.
        if(inf >= sup)
            return null;

        int[] multiples = new int[0];

        int index = 0;
        for (int i = inf; i <= sup; i++) {
            if ((((i % 3) == 0) && ((i / 3) >= 0)) && (((i % 5) == 0) && ((i / 5) >= 0))){
                //We need space to add the value, so we call the function to add a space in the array.
                multiples = MarianaTools.increaseArrayLength(multiples);
                multiples[index] = i;
                index ++;
            }
        }
        return multiples;
    }

    /**
     * 2. d)
     * @param number1
     * @param number2
     * @param inf
     * @param sup
     * @return multiples of 2 numbers in an interval (multiples in common).
     */
    public static int[] sharedMultiplesOf2NumbersArrays(int number1, int number2, int inf, int sup)
    {
        if(inf >= sup)
            return null;

        if(((number1 == 0) || (number2 == 0)) && ((sup == 0) || (inf == 0)))
            return new int[]{0};
        else if (((number1 == 0)  || (number2 == 0)) && (sup > 0) && (inf < 0))
            return new int[]{0};
        else if ((number1 == 0) || (number2 == 0))
            return null;

        int[] multiplesOf2Numbers = new int[0];

        int index = 0;
        for (int i = inf; i <= sup; i++) {
            if ((((i % number1) == 0) && ((i / number1) >= 0)) && (((i % number2) == 0) && ((i / number2) >= 0))){
                //We need space to add the value, so we call the function to add a space in the array.
                multiplesOf2Numbers = MarianaTools.increaseArrayLength(multiplesOf2Numbers);
                multiplesOf2Numbers[index] = i;
                index ++;
            }
        }
        return multiplesOf2Numbers;
    }

    /**
     *e)
     * @param number1
     * @param number2
     * @param inf
     * @param sup
     * @return sum of the multiples of 2 numbers in an interval (multiples in common).
     */
    public static int sumOfSharedMultiplesOf2NumbersArrays(int number1, int number2, int inf, int sup)
    {
        int[] arrayToSum = sharedMultiplesOf2NumbersArrays(number1,number2,inf,sup);
        int sumOfMultiples = MarianaTools.sumOfArrayNumbers(arrayToSum);
        return sumOfMultiples;
    }
}
