package pt.ipp.isep.dei.examples.basic.domain.Bloco3;

public class Exercicio8{

    public static int numberOfOperations(int n) {
        if (n >= 1 && n <= 20) {
            int counter = 0;
            int[] rangeOfValues = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            for (int rangeOfValue : rangeOfValues) {
                for (int ofValue : rangeOfValues) {
                    if (rangeOfValue + ofValue == n) {
                        counter++;
                    }
                }
            }

            if(counter == 1){
                return 1;
            }

            return (int) Math.ceil((double) counter /2);
            /*
            Dividing by two to ensure that the repeated possibilities of reaching n
            are not considered in the final returned result. We want the "casted" value -> (double) (counter/2), rounded up (Math.ceil)
             */

        }
        return -1;
    }

}
