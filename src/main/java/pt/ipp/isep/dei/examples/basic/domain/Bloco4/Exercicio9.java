package pt.ipp.isep.dei.examples.basic.domain.Bloco4;

public class Exercicio9 {

    /**
     * Note: To have an interval, [a ; b], a must be != from b.
     * @param inf
     * @param sup
     * @return multiples of 3 in an interval [inf ; sup].
     */
    public static int[] multiplesOfNumber3InChosenRange(int inf, int sup) {
        if (inf > sup)
            return new int[0];
        if (inf < 0)
            return new int[0];

        int[] multiplesOfnumber3 = new int[sup];
        int counterOfMultiples = 0;
        for(int i = inf; i <= sup; i++) {
            if(i % 3 == 0) {
                multiplesOfnumber3[counterOfMultiples] = i;
                counterOfMultiples++;
            }
        }
        multiplesOfnumber3 = CustomTools.intArrayCrop(multiplesOfnumber3,counterOfMultiples);
        return multiplesOfnumber3;
    }

}
