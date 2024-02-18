package pt.ipp.isep.dei.examples.basic.domain.Bloco4;

public class Exercicio13 {

    //13a
    //corrigir a) e b) para ordenar array primeiro e depois procurar apenas em metade do mesmo
    public static int lowestNumberInArray(int[] array) {
        // Due to limitations in returning an error code, in the event of an empty array, the function will produce and error.
        return CustomTools.minimumElementInAnArray(array);
    }

    //13b - As it is impossible, without exceptions, to return an error code, empty arrays are not controlled.
    public static int highestNumberInArray(int[] array) {
        // Due to limitations in returning an error code, in the event of an empty array, the function will produce and error.
        return CustomTools.maximumElementInAnArray(array);
    }

    //13c -
    public static double averageOfArrayNumbers(int[] array) {
        if(array.length == 0)
            return Double.NaN;

        int sumOfArrayNumbers = CustomTools.sumOfTheElementsOfAnArray(array);

        double average = (double) sumOfArrayNumbers / array.length;
        return average;
    }

    //13d - As it is impossible, without exceptions, to return an error code, empty arrays are not controlled.
    public static int productOfArrayNumbers(int[] array){
        return CustomTools.productNumbersArray(array);
    }

    //13e
    public static int[] nonRepeatedNumbersInArray(int[] array) {
        if (array.length == 0)
            return null;
        int[] nonRepeatedNumbers = new int[array.length];
        boolean isZeroIn = false;
        int index = 0;
        for (int i = 0; i != array.length; i++) {
            if (array[i] == 0 && !isZeroIn) {
                nonRepeatedNumbers[index] = 0;
                index++;
                isZeroIn = true;
            } else if (!CustomTools.doesArrayContainNum(array[i], nonRepeatedNumbers)) {
                nonRepeatedNumbers[index] = array[i];
                index++;
            }
        }
        nonRepeatedNumbers = CustomTools.intArrayCrop(nonRepeatedNumbers, index);
        return nonRepeatedNumbers;
    }

    //Alternative solution:
    public static int[] nonRepeteadNumbersInArrayV2(int[] array) {
        int[] nonRepeatedArray = new int[array.length];   //Maximum possible length.
        int numberCounter = 0;
        for(int i = 0; i < array.length; i++){
            boolean toInsert = true;
            //Only iterates until the actual numbers added to the array, since the rest has zeros and should not count.
            for(int k = 0; k < numberCounter; k++) {
                if (array[i] == nonRepeatedArray[k]) {
                    toInsert = false;
                    break;
                }
            }
            if(toInsert) {
                nonRepeatedArray[numberCounter] = array[i];
                numberCounter++;
            }
        }
        return CustomTools.intArrayCrop(nonRepeatedArray,numberCounter);   //To remove the empty spaces of the array, if any.
    }
    //13f
    public static int[] invertedArray(int[] array){
        return CustomTools.arrayInverter(array);
    }

    //13G
    public static int[] primeNumbers(int[] array){
        if (array.length == 0)
            return null;
        int[] newArr = new int[array.length];
        int numDiv = 0;
        int index = 0;

        for(int obj : array){
            numDiv = 0;
            for(int i = 1; i <= obj; i++){
                if(obj%i == 0 && obj > 1){
                    numDiv++;
                }
            }
            if(numDiv == 2){
                newArr[index] = obj;
                index++;
            }
        }
        int[] finalArr = new int[index];

        for(int i = 0; i < finalArr.length; i++){
            finalArr[i] = newArr[i];
        }
        return finalArr;
    }

}
