package pt.ipp.isep.dei.examples.basic.domain.Bloco5;
import java.util.Arrays;

public class Array {
    private int[] vector;

    // a---------------------------------------------------
    public Array() {
        this.vector = new int[0];
    }

    // b---------------------------------------------------
    public Array(int[] array) {
        this.vector = array.clone();
    }


    // c---------------------------------------------------
    public void addElement(int element) {
        int[] tmpArray = Arrays.copyOf(this.vector, this.vector.length + 1);
        tmpArray[this.vector.length] = element;
        this.vector = tmpArray;
    }

    // d----------------------------------------------------
    public void removeOccurrenceElement(int element) {
        if (CustomTools.isNumInArray(this.vector, element)) {
            int[] tmpArray = new int[this.vector.length - 1];
            int index;
            for (index = 0; this.vector[index] != element; index++) {
                tmpArray[index] = this.vector[index];
            }
            while (index < this.vector.length - 1) {
                tmpArray[index] = this.vector[index + 1];
                index++;
            }
            this.vector = tmpArray;
        }
    }

    // e-----------------------------------------------------
    // need throw exception para out of bounds
    public int getValue(int index) {
        if (this.vector.length == 0) {
            return -1;
        }
        if (this.vector.length <= index) {
            return -1;
        }
        if (index < 0) {
            return -1;
        }
        return this.vector[index];
    }

    // f ----------------------------------------------------
    public int arrayLength() {
        return this.vector.length;
    }

    // g ----------------------------------------------------
    public int getHighestElementInVector() {
        if (this.vector.length == 0)
            throw new IllegalArgumentException("The vector is empty.");
        int highestElement = this.vector[0];
        for (int i = 1; i < this.vector.length; i++) {
            if (this.vector[i] > highestElement)
                highestElement = this.vector[i];
        }
        return highestElement;
    }

    // h ----------------------------------------------------
    public int getLowestElementInVector() {
        if (this.vector.length == 0)
            throw new IllegalArgumentException("The vector is empty.");
        int lowestElement = this.vector[0];
        for (int i = 1; i < this.vector.length; i++) {
            if (this.vector[i] < lowestElement)
                lowestElement = this.vector[i];
        }
        return lowestElement;
    }

    // i ----------------------------------------------------
    public double getAverageOfVectorElements() {
        if (this.vector.length == 0)
            return 0;
        int sum = 0;
        for (int i = 0; i < this.vector.length; i++) {
            sum += this.vector[i];
        }
        return (double) sum / this.vector.length;
    }

    // j ----------------------------------------------------
    public double getAverageOfEvenVectorElements() {
        if (this.vector.length == 0)
            return 0;
        int evenCounter = 0;
        int sum = 0;
        for (int i : this.vector) {
            if (i % 2 == 0) {
                sum += i;
                evenCounter += 1;
            }
        }
        if (evenCounter == 0)
            return 0;
        return (double) sum / evenCounter;
    }

    // k ----------------------------------------------------
    public double getAverageOfOddVectorElements() {
        if (this.vector.length == 0)
            return 0;
        int oddCounter = 0;
        int sum = 0;
        for (int i : this.vector) {
            if (i % 2 != 0) {
                sum += i;
                oddCounter += 1;
            }
        }
        if (oddCounter == 0)
            return 0;
        return (double) sum / oddCounter;
    }

    // l ----------------------------------------------------
    public double getAverageOfMultiplesOfANumberInVector(int number) {
        if (this.vector.length == 0)
            return 0;
        if (number == 0)
            return 0;
        int multipleCounter = 0;
        int sum = 0;
        for (int i : this.vector) {
            if (i % number == 0 && i / number >= 0) {
                sum += i;
                multipleCounter ++;
            }
        }
        if (multipleCounter == 0)
            return 0;
        return (double) sum / multipleCounter;
    }

    // m -----------------------------------------------------------------------------
    public void sortByOption(int option){
        if (option == 1) {
            sortAscending();
        }
        if (option == 2) {
            sortDescending();
        }
    }

    //ALINEA M-Ascending
    private void sortAscending(){

        for (int i = 1; i < this.vector.length; i++){
            for(int j=0; j<this.vector.length; j++){
                if (this.vector[j]>this.vector[i]){
                    int tmp=this.vector[j];
                    this.vector[j]=this.vector[i];
                    this.vector[i]=tmp;
                }
            }
        }
    }


    //ALINEA M-Descending
    private void sortDescending (){

        for (int i = 1; i < this.vector.length; i++){
            for(int j = 0; j < this.vector.length; j++){
                if (this.vector[j]<this.vector[i]){
                    int tmp=this.vector[j];
                    this.vector[j]=this.vector[i];
                    this.vector[i]=tmp;
                }
            }
        }
    }


    //n)_____________________________________________________________________________________________________________________
    public boolean isArrayEmpty() {
        return this.vector.length == 0;
    }

    //O--------------------------------------------------------------------------------------------
    public boolean doesArrayContainOnlyOneElement(){
        if (this.vector.length == 1){
            return true;
        }
        return false;
    }

    //P--------------------------------------------------------------------------------------------
    public boolean doesArrayContainOnlyEvenNumbers() {
        for (int i = 0; i < this.vector.length; i++) {
            if (this.vector[i] % 2 != 0)
                return false;
        }
        return true;
    }


    //Q--------------------------------------------------------------------------------------------
    public boolean doesArrayContainOnlyOddNumbers(){
        for (int i = 0; i < this.vector.length; i++) {
            if (this.vector[i] % 2 == 0)
                return false;
        }
        return true;
    }

    //r)_____________________________________________________________________________________________________________________

    public boolean doesArrayHaveRepeatedNumbers() {
        if (this.isArrayEmpty()) {
            return false;
        }

        for (int i = 0; i < this.vector.length - 1; i++) {
            for (int j = i + 1; j < this.vector.length; j++) {
                if (this.vector[i] == this.vector[j]) {
                    return true;
                }
            }
        }
        return false;
    }


    //s)____________________________________________________________________________________________________________

    private double averageOfDigitsOfAllElementsInArray(){
        //this block of code is not needed. Private method, used only once public method
        //is invoked. The lines above are never tested.
//        if(isArrayEmpty()){
//            return 0;
//        }

        int sum = 0;
        for(int i = 0; i < this.vector.length; i++){
            sum+=CustomTools.numberOfDigitsInANumber(this.vector[i]);
        }
        return (double) sum /this.vector.length;
    }

    public int[] elementsWithHigherNumberOfDigitsThanAverage(){
        if(isArrayEmpty()){
            return new int[0];
        }

        int[] tempArray = new int[this.vector.length];
        int counter = 0;
        double average = this.averageOfDigitsOfAllElementsInArray();

        for(int i = 0; i < this.vector.length; i++){
            if(CustomTools.numberOfDigitsInANumber(this.vector[i]) > average){
                tempArray[counter] = this.vector[i];
                counter++;

            }
        }

        int[] finalArray = new int[counter];

        System.arraycopy(tempArray, 0, finalArray, 0, finalArray.length);
        return finalArray;

    }

    //t)________________________________________________________________________________________

    /*
    The following method calculates de % of even digits in a number. It´s a private method that is going to be
    used in elementsBiggerThanMediaOfEvenPercentage and mediaOfPertentageOfEvenNumbersInAllArrayElemets;
    Being private it´s being tested indirectly in the public method that calls it and depends 
    on it to do the correct operations
     */

    private double percentageOfEvenElementsInADigit(int number){
        if (number == 0) {
            return 100;
        }

        int evenNumbers = 0;
        int totalOfDigits = 0;

        while(number != 0){
            int digit = number%10;
            if(digit % 2 == 0){
                evenNumbers++;
            }
            totalOfDigits++;
            number/=10;
        }

        return (double) (evenNumbers * 100) /totalOfDigits;
    }
    
     /*
    The following method is a private method that sums all digits percentage of even elements and divides it for this.vector.lenght, 
    returning the average of the percentages. Being private it´s being tested indirectly in the public method that calls it and depends 
    on it to do the correct operations.
     */

    private double averageOfPercentageOfEvenNumbersInAllArrayElemets(){
        //this block of code is not needed. Private method, used only once public method
        //is invoked. The lines above are never tested.
//        if(this.isArrayEmpty()){
//            return 0;
//        }

        double sumOfAllPercentages = 0;

        for(int i = 0; i < this.vector.length; i++){
            sumOfAllPercentages += this.percentageOfEvenElementsInADigit(this.vector[i]);
        }

        return sumOfAllPercentages/this.vector.length;
    }
    
    
     /*
    The following method will compare each individual percentage (each array element percentage) and compare it
    with the average percentages. Putting in an array only the elements that are bigger than average. In the end, 
    returns that same array.
    It is public ,so it can  be directly tested and depends on the prior two private methods.
     */

    public int[] elementsBiggerThanAverageOfEvenPercentage(){
        if(this.isArrayEmpty()){
            return new int[0];
        }

        double mediaOfPercentageOfEvenElements = this.averageOfPercentageOfEvenNumbersInAllArrayElemets();

        int[] tempArray = new int[this.vector.length];
        int counter = 0;

        for(int i = 0; i < this.vector.length; i++){
            if(this.percentageOfEvenElementsInADigit(this.vector[i]) > mediaOfPercentageOfEvenElements){
                tempArray[counter] = this.vector[i];
                counter++;
            }
        }

        int[] finalArray = new int[counter];
        System.arraycopy(tempArray, 0, finalArray, 0, finalArray.length);
        return finalArray;


    }

    //u)____________________________________________________________________________________________

    public int[] elementsWithOnlyEvenDigits(){
        if(this.isArrayEmpty()){
            throw new IllegalArgumentException("The array is empty");
        }
        int[] tempArray = new int[this.vector.length];
        int index = 0;

        for (int j : this.vector) {
            if (CustomTools.checkIfNumberIsComposedByTheSameDigits(j) && j % 2 == 0) {
                tempArray[index] = j;
                index++;
            }
        }
        tempArray = Arrays.copyOf(tempArray, index);
        return tempArray;
    }
    //v)______________________________________________________________
    public int[] ascendingNumbersInAVector(){
        if(this.isArrayEmpty()){
            return new int[0];
        }

        int counter = 0;
        int[] temp = new int[this.vector.length];
        for (int j : this.vector) {
            if (CustomTools.isNumberAnAscendingSequence(j)) {
                temp[counter] = j;
                counter++;
            }
        }

        int[] finalArray = new int[counter];

        System.arraycopy(temp, 0, finalArray, 0, counter);

        return finalArray;
    }
    //W---------------------------------------------------------------------------------------------------------------------
    public int[] elementsOfTheArrayThatArePalindrome() {
        if (this.vector.length == 0) {
            return new int[]{};
        }

        int index = 0;
        int[] newArray = new int[this.vector.length];
        for (int i = 0; i < this.vector.length; i++) {
            if (CustomTools.checkIfNumberIsPalindrome(this.vector[i])) {
                newArray[index] = this.vector[i];
                index++;
            }
        }
        return CustomTools.intArrayCrop(newArray, index);
    }

    //X---------------------------------------------------------------------------------------------------------------------
    public int[] elementsWithTheSameDigits() {
        if (this.vector.length == 0){
            return new int[]{};

        }
        int index = 0;
        int[] newArray = new int[this.vector.length];
        for (int i = 0; i < this.vector.length; i++) {
            if (CustomTools.checkIfNumberIsComposedByTheSameDigits(this.vector[i])) {
                newArray[index] = this.vector[i];
                index++;
            }
        }
        return CustomTools.intArrayCrop(newArray, index);
    }

    //Y---------------------------------------------------------------------------------------------------------------------
    public int[] elementsThatAreNotArmstrongNumbers() {
        if (this.vector.length == 0) {
            return new int[]{};
        }
        int index = 0;
        int[] newArray = new int[this.vector.length];
        for (int i = 0; i < this.vector.length; i++){
            if (!CustomTools.checkIfIsArmstrongNumber(this.vector[i])){
                newArray[index] = this.vector[i];
                index++;
            }
        }
        return CustomTools.intArrayCrop(newArray, index);
    }
    //Z---------------------------------------------------------------------------------------------------------------------
    public int[] elementsThatAreAscendingMoreThanNTimes(int sequence) {
        if (this.vector.length == 0) {
            return new int[]{};
        }
        int index = 0;
        int[] newArray = new int[this.vector.length];
        for (int i = 0; i < this.vector.length; i++){
            if (countAscendingDigits(this.vector[i]) >= sequence && sequence <= CustomTools.digitCount(vector[i])){
                newArray[index] = this.vector[i];
                index++;
            }
        }
        return CustomTools.intArrayCrop(newArray, index);
    }

    private int countAscendingDigits(int num){
        int maxAscendingCount = 1;
        int ascendingCount = 1;
        int tmp = num % 10;
        num /= 10;
        while (num != 0){
            if (num % 10 < tmp) {
                ascendingCount++;
            } else if (num % 10 >= tmp) {
                if (ascendingCount > maxAscendingCount){
                    maxAscendingCount = ascendingCount;
                }
                ascendingCount = 1;
            }
            tmp = num % 10;
            num /= 10;
        }
        if (ascendingCount > maxAscendingCount){
            maxAscendingCount = ascendingCount;
        }
        return maxAscendingCount;
    }

    //AA--------------------------------------------------------------------------------------------------------------------
    public boolean checkIfArraysAreTheSame(int [] newArray){
        if (this.vector.length != newArray.length){
            return false;
        }
        for (int i = 0; i < this.vector.length; i++){
            if (this.vector[i] != newArray[i]){
                return false;
            }
        }
        return true;
    }
}