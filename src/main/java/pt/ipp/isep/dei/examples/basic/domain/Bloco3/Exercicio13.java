package pt.ipp.isep.dei.examples.basic.domain.Bloco3;

public class Exercicio13 {

    //Integer compare gives us the exact output required by the exercise

    public static int dogEvaluation(double weight, int totalOfFood) {
        if (weight <= 0 || totalOfFood <= 0) {
            return -2;
        }
        if (weight <= 10) {
            return Integer.compare(totalOfFood, 100);
        }

        if (weight <= 25) {
            return Integer.compare(totalOfFood, 250);
        }

        if (weight <= 45) {
            return Integer.compare(totalOfFood, 300);
        }

        return Integer.compare(totalOfFood, 500);

    }

    /*
    In this function we are considering the input -- > that is dogInfo[][]
    that has on the left column the weight and in the right column the total of food, of
    several dogs.
    Next, we iterate through that matrix and use that iteration as input for the previous function
    dogEvaluation
    Also, it´s established a condition that, if any of the vales is negative (weight, or total of food) it will be
    returned an empty array
     */


    public static int[] multipleDogEvaluationA(int[][] dogInfo) {

        int[] dogEvaluationArray = new int[dogInfo.length];

        for (int i = 0; i < dogInfo.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (dogInfo[i][j] < 0) {
                    return new int[0];
                }
                dogEvaluationArray[i] = dogEvaluation(dogInfo[i][0], dogInfo[i][1]);
            }
        }
        return dogEvaluationArray;
    }

}