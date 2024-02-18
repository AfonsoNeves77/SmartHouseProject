package pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio5;

public class MarianaEx5 {
    /**
     * a)
     * @param numberN
     * @return if a number is a capicua (true) or not (false).
     */
    public static boolean isItACapicua(long numberN) {
        if(numberN == 0)
            return false;

        long copyOfNumberN = numberN;
        long sum = 0;
        while (numberN > 0)
        {
            int remainder = (int) (numberN % 10);
            sum = sum * 10 + remainder;
            numberN = numberN / 10;
        }
        if(sum == copyOfNumberN)
            return true;
        return false;
    }

    /**
     * b)
     * @param numberN
     * @return if a number is an Amstrong number (true) or not (false).
     */
    public static boolean isItAnAmstrongNumber(long numberN) {
        if(numberN == 0)
            return true;

        long copyOfNumberN = numberN;
        long sum = 0;
        while (numberN > 0)
        {
            int remainder = (int) (numberN % 10);
            sum += Math.pow(remainder,3);
            numberN = numberN / 10;
        }
        if(sum == copyOfNumberN)
            return true;
        return false;
    }

    /**
     * c)
     * @param inf
     * @param sup
     * @return first capicua in an interval.
     */
    public static int returnFirstCapicuaInAnInterval(int inf, int sup) {
        if(inf >= sup)
            return -1;

        for (int i = inf; i <= sup; i++) {
            if (isItACapicua(i))
                return i;
        }
        return -1;
    }

    /**
     * d)
     * @param inf
     * @param sup
     * @return last capicua in an interval.
     */
    public static int returnLastCapicuaInAnInterval(int inf, int sup) {
        if(inf >= sup)
            return -1;

        for (int i = sup; i >= inf; i--) {
            if (isItACapicua(i))
                return i;
        }
        return -1;
    }

    /**
     * e)
     * @param inf
     * @param sup
     * @return number of capicuas in an interval.
     */
    public static int numberOfCapicuasInAnInterval(int inf, int sup) {
        if(inf >= sup)
            return -1;

        int numberOfCapicuas = 0;
        for (int i = inf; i <= sup; i++) {
            if (isItACapicua(i))
                numberOfCapicuas += 1;
        }
        return numberOfCapicuas;
    }

    /**
     * f)
     * @param inf
     * @param sup
     * @return first Amstrong number in an interval.
     */
    public static int returnFirstAmstrongNumberInAnInterval(int inf, int sup) {
        if(inf >= sup)
            return -1;

        for (int i = inf; i <= sup; i++) {
            if (isItAnAmstrongNumber(i))
                return i;
        }
        return -1;
    }

    /**
     * g)
     * @param inf
     * @param sup
     * @return number of Amstrong numbers in an interval.
     */
    public static int numberOfAmstrongsInAnInterval(int inf, int sup) {
        if(inf >= sup)
            return -1;
        int numberOfAmstrongs = 0;
        for (int i = inf; i <= sup; i++) {
            if (isItAnAmstrongNumber(i))
                numberOfAmstrongs += 1;
        }
        return numberOfAmstrongs;
    }
}
