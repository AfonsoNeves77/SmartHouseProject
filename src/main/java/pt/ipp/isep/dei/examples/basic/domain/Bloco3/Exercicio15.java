package pt.ipp.isep.dei.examples.basic.domain.Bloco3;

public class Exercicio15 {
    public static long resolucao15 (long num){
        if (num < 1){
            return -1;
        }
        long[] sortedArray = HugoTools.longNumDigitExtractionIntoArray(num); // nums in array are inverted
        sortedArray = HugoTools.longArraySorterBackToFront(sortedArray); // nums in array are the same way as num
        long listEven = 0;
        int counterForDigitsEven = 0;
        long listOdd = 0;
        for (int i = 0; i <= sortedArray.length-1; i++){
            if (sortedArray[i]%2 == 0){
                listEven = listEven*10 + sortedArray[i];
                counterForDigitsEven++;
            } else {
                listOdd = listOdd*10 + sortedArray[i];
            }
        }
        long finalNumber = (long) (listOdd*(Math.pow(10, counterForDigitsEven)) + listEven);
        return finalNumber;
    }

    public static long[][] alternativaResolucao15 (long[] arrayFromNum){
        long[] arrayEven = new long[0];
        long[] arrayOdd = new long[0];
        int indexEven = 0;
        int indexOdd = 0;
        for (int i = 0; i != arrayFromNum.length; i++){
            if (arrayFromNum[i] % 2 == 0){
                arrayEven = HugoTools.increaseArraySizeByOneLong(arrayEven);
                arrayEven[indexEven] = arrayFromNum[i];
                indexEven++;
            } else {
                arrayOdd = HugoTools.increaseArraySizeByOneLong(arrayOdd);
                arrayOdd[indexOdd] = arrayFromNum[i];
                indexOdd++;
            }
        }
        long[][] finalArray = new long[2][0];
        finalArray[0] = new long[1];
        finalArray[1] = new long[1];
        finalArray[1] = arrayEven;
        finalArray[0] = arrayOdd;
        return finalArray;
    }
}
