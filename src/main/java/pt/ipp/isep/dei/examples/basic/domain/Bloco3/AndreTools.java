package pt.ipp.isep.dei.examples.basic.domain.Bloco3;

public class AndreTools {

    public static int countMultiplesNum (int min, int max, int num) {
        if (min > max || num == 0) {
            return -1;
        }
        int counter = 0;
        for (int i = min; i <= max; i++) {
            if (i % num == 0) {
                counter ++;
            }
        }
        return counter;
    }

    public static int countMultiples2Num (int min, int max, int num1, int num2) {
        if (min < 0 || min > max || num1 == 0 || num2 == 0) {
            return -1;
        }
        int counter = 0;
        for (int i = min; i <= max; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                counter ++;
            }
        }
        return counter;
    }
}
