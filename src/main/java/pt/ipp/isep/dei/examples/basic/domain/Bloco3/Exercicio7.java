package pt.ipp.isep.dei.examples.basic.domain.Bloco3;

public class Exercicio7 {
    /**
     * @param arrayGiven
     * @param numberN chosen by the user.
     * @return position on the array where cumulative product > numberN.
     * Note1: On line 22. If at any point a negative number or 0 is found,
     the array is invalid, therefore returns -1.
     * Note2: Returns -2 if numberN is not found within the array.
     The iteration will be continued even if a suitable cumulativeProduct
     is found, to check if array has 0 or negative numbers (i.e. the array is not valid).
     */
    public static int positionOfCumulativeProductInAnArray(int[] arrayGiven, int numberN) {

        if (arrayGiven.length == 0)
            return -1;

        int cumulativeProduct = 1;
        int position = -2;
        for (int i = 0; i < arrayGiven.length; i++) {
            if (arrayGiven[i] <= 0)
                return -1;
            cumulativeProduct *= arrayGiven[i];
            if ((cumulativeProduct > numberN) && (position == -2))
               position = i;
        }
        return position;
    }
}
