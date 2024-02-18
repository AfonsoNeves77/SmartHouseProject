package pt.ipp.isep.dei.examples.basic.domain.Bloco5;

import static pt.ipp.isep.dei.examples.basic.domain.Bloco4.CustomTools.isMatrixIrregular;

public class MatrixOfVector {
        private Array[] matrixArray;

    // a ------------------------------
    public MatrixOfVector(){
        this.matrixArray = new Array[0];
    }

    // b -------------------------------
    public MatrixOfVector(int[][]matrix){
        this.matrixArray = new Array[matrix.length];
        for(int i = 0; i < this.matrixArray.length; i++){
                this.matrixArray[i] = new Array(matrix[i]);
        }
    }

    // c --------------------------------
    public void addElementToMatrix(int numberAdded, int matrixLine){
        if (isMatrixEmpty()) {
            this.matrixArray = new Array[1];
            this.matrixArray[0] = new Array();
        }
        if (matrixLine < 0 || matrixLine >= this.matrixArray.length){
            throw new IllegalArgumentException("Error: Invalid Argument");
        }
        this.matrixArray[matrixLine].addElement(numberAdded);
    }

    // d --------------------------------------------------------
    public void removeFirstOccurrenceNum(int num) {
        int foundX = -1;
        int foundY = -1;
        int k;
        for (int i = 0; i < this.matrixArray.length; i++) {

            // checks if num is present on the row, saving the coordinates (Y/X)
            if (isNumInArray(this.matrixArray[i], num)) {
                foundX = checkIndexNum(num, this.matrixArray[i]);
                foundY = i;
                break;
            }
        }
        // If foundX is -1, it means the num was never found, in that case this.matrix stays the same
        if (foundX != -1) {
            Array tmpArray = new Array();

            // This will copy this.matrix into the tmpArray until the iterating variable reaches the value at FoundX
            for (k = 0; k != foundX; k++) {
                tmpArray.addElement(this.matrixArray[foundY].getValue(k));
            }

            // After the iterating variable meets foundX, it skips one index and keeps copying.
            while (k < tmpArray.arrayLength()) {
                tmpArray.addElement(this.matrixArray[foundY].getValue(k + 1));
                k++;
            }
            this.matrixArray[foundY] = tmpArray;
        }
    }

    // e ---------------------------------
    public boolean isMatrixEmpty() {
        return this.matrixArray.length == 0;
    }

    // f ---------------------------------
    public int getBiggestElementInMatrix() {
        if (isMatrixEmpty())
            throw new IllegalArgumentException("The matrix is empty.");
        int maxValue = matrixArray[0].getHighestElementInVector();
        for (int i = 1; i < this.matrixArray.length; i++) {
            if (matrixArray[i].getHighestElementInVector() > maxValue)
                maxValue = matrixArray[i].getHighestElementInVector();
        }
        return maxValue;
    }

    // g ----------------------------------
    public int searchMatSmallestElement() {
        if (isMatrixEmpty()) {
            throw new IllegalArgumentException("This matrix is empty.");
        }
        int minVector = this.searchVectorMinimumElement(this.matrixArray[0]);
        for (int j = 1; j < this.matrixArray.length; j++) {
            if (searchVectorMinimumElement(this.matrixArray[j]) < minVector) {
                minVector = searchVectorMinimumElement(this.matrixArray[j]);
            }
        }
        return minVector;
    }

    // h ----------------------------------
    public double averageOfAMatrix() {
        if (isMatrixEmpty()){
            return 0;
        }
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].arrayLength(); j++) {
                sum += matrixArray[i].getValue(j);
                counter++;
            }
        }

        return (double) sum/counter;
    }

    // i ----------------------------------------
    public int[] homologousLine() {
        int[] tmpArray = new int[this.matrixArray.length];
        for (int i = 0; i < this.matrixArray.length; i++) {
            tmpArray[i] = sumElements(this.matrixArray[i]);
        }
        return tmpArray;
    }

    // j ------------------------------------------------------
    public int[] sumOfElementsInEachMatrixColumn() {
        int maximumColumns = getHighestRange();
        int[] sumMatrixColumnElements = new int[maximumColumns];

        if (isMatrixEmpty())
            return new int[0];
        for (int i = 0; i < this.matrixArray.length; i++) {
            for (int j = 0; j < this.matrixArray[i].arrayLength(); j++) {
                sumMatrixColumnElements[j] += this.matrixArray[i].getValue(j);
            }
        }
        return sumMatrixColumnElements;
    }

    // k ------------------------------------------------------
    public int getMatrixLineIndexWithHighestSum() {
        if(this.matrixArray.length == 0)
            throw new IllegalArgumentException("The matrix is empty.");
        int[] tmpVector = homologousLine();
        int maxValue = tmpVector[0];
        int index = 0;
        for (int i = 1; i < tmpVector.length; i++) {
            if (tmpVector[i] > maxValue) {
                maxValue = tmpVector[i];
                index = i;
            }
        }
        return index;
    }

    // l ------------------------------------------------------
    public boolean isMatrixSquare() {
        if (isMatrixIrregular() || isMatrixEmpty()) {
            return false;
        }
        return this.matrixArray.length == this.matrixArray[0].arrayLength();
    }

    // m -----------------------------------------------------
    public boolean symmetricMatrix(){
        if (isMatrixEmpty() || !isMatrixSquare()){
            return false;
        }
        for (int i = 0; i < this.matrixArray.length; i++){
            for (int j = 0; j < this.matrixArray[i].arrayLength(); j++){
                if (this.matrixArray[i].getValue(j) != this.matrixArray[j].getValue(i)){
                    return false;
                }
            }
        }
        return true;
    }

    // n ----------------------------------------------------
    public int quantityNonNullElementsInMainDiagonal() {
        if (isMatrixEmpty()) {
            return -1;
        }
        if (!isMatrixSquare()) {
            return -1;
        }
        int quantity = 0;
        for (int i = 0; i < this.matrixArray.length; i++) {
            if (matrixArray[i].getValue(i) != 0) {
                quantity++;
            }
        }
        return quantity;
    }


    // o ------------------------------------------------
    public boolean areMainAndSecondaryDiagonalsEqual() {
        if (isMatrixEmpty())
            throw new IllegalArgumentException("The matrix is empty.");
        if (isMatrixIrregular())
            throw new IllegalArgumentException("The matrix is not rectangular.");
        Array mainDiagonal = mainMatrixDiagonal(this.matrixArray);
        Array secondaryDiagonal = secondaryMatrixDiagonal(this.matrixArray);

        for (int i = 0; i < mainDiagonal.arrayLength(); i++) {
            if (mainDiagonal.getValue(i) != secondaryDiagonal.getValue(i))
                return false;
        }
        return true;
    }
    // s --------------------------------------------------------------

    public void invertColumnMatrix() {
        Array[] tmpMatrix = new Array[this.matrixArray.length];

        for (int i = 0; i < this.matrixArray.length; i++) {
            int[] reversedLine = new int[this.matrixArray[this.matrixArray.length - 1 - i].arrayLength()];

            for (int j = 0; j < reversedLine.length; j++) {
                reversedLine[j] = this.matrixArray[this.matrixArray.length - 1 - i].getValue(j);
            }

            tmpMatrix[i] = new Array(reversedLine);
        }

        this.matrixArray = tmpMatrix;
    }

    // p ------------------------------------------------
    private double averageOfDigitsInMatrix (){
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < this.matrixArray.length; i++) {
            for (int j = 0; j < this.matrixArray[i].arrayLength(); j++){
                sum += numberOfDigitsInANumber(this.matrixArray[i].getValue(j));
                counter++;
            }
        }
        return (double) sum / counter;
    }

    public int[] getElementsInMatrixWithMoreDigitsThanMatrixAverageDigits() {
        if(matrixArray.length == 0)
            throw new IllegalArgumentException("Empty matrix.");

        int numberOfMatrixElements = getNumberOfMatrixElements();
        int[] vector = new int[numberOfMatrixElements];
        double averageOfDigits = averageOfDigitsInMatrix();
        int index = 0;

        for (int i = 0; i < this.matrixArray.length; i++) {
            for (int j = 0; j < this.matrixArray[i].arrayLength(); j++) {
                if (numberOfDigitsInANumber(this.matrixArray[i].getValue(j)) > averageOfDigits) {
                    vector[index] = this.matrixArray[i].getValue(j);
                    index++;
                }
            }
        }
        int[] newVector = new int[index];
        System.arraycopy(vector, 0, newVector, 0, newVector.length);
        return newVector;
    }

    // q ----------------------------------------------
    public int howManyElementsDoesMatrixHave() {
        if (isMatrixEmpty()) {
            return 0;
        }

        int numberOfElements = 0;

        for (int i = 0; i < this.matrixArray.length; i++) {
            for (int j = 0; j < this.matrixArray[i].arrayLength(); j++) {
                numberOfElements++;
            }
        }
        return numberOfElements;
    }

    private double percentageOfEvenElementsInADigit(int number) {
        if (number == 0) {
            return 100;
        }

        int evenNumbers = 0;
        int totalOfDigits = 0;

        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenNumbers++;
            }
            totalOfDigits++;
            number /= 10;
        }

        return (double) (evenNumbers * 100) / totalOfDigits;
    }

    private double sumOfPercentageOfEvenNumbersInAMatrixLine(Array array) {
        if (array.arrayLength() == 0) {
            return 0;
        }

        double sumOfAllPercentages = 0;

        for (int i = 0; i < array.arrayLength(); i++) {
            sumOfAllPercentages += this.percentageOfEvenElementsInADigit(array.getValue(i));
        }

        return sumOfAllPercentages;
    }

    private double averageOfPercentageOfEvenNumbersInAllMatrixLines() {


        double sumOfAllPercentages = 0;

        for (int i = 0; i < this.matrixArray.length; i++) {
            sumOfAllPercentages += this.sumOfPercentageOfEvenNumbersInAMatrixLine(this.matrixArray[i]);
        }

        int numberOfTotalElements = this.howManyElementsDoesMatrixHave();

        return sumOfAllPercentages / numberOfTotalElements;
    }

    public int[] elementsBiggerThanAverageOfEvenPercentageMatrix() {
        if (isMatrixEmpty()) {
            return new int[0];
        }
        int numberOfTotalElements = this.howManyElementsDoesMatrixHave();
        double mediaOfPercentageOfEvenElementsInAllMatrixLines = this.averageOfPercentageOfEvenNumbersInAllMatrixLines();

        int[] tempArray = new int[numberOfTotalElements];
        int counter = 0;

        for (int i = 0; i < this.matrixArray.length; i++) {
            for (int j = 0; j < this.matrixArray[i].arrayLength(); j++) {
                if (this.percentageOfEvenElementsInADigit(this.matrixArray[i].getValue(j)) > mediaOfPercentageOfEvenElementsInAllMatrixLines) {
                    tempArray[counter] = this.matrixArray[i].getValue(j);
                    counter++;
                }
            }

        }

        int[] finalArray = new int[counter];
        System.arraycopy(tempArray, 0, finalArray, 0, finalArray.length);
        return finalArray;
    }

    // r -------------------------------------------------
    public void invertedLinesOfMatrix() {
        if (isMatrixEmpty()) {
            throw new IllegalArgumentException("Empty matrix.");
        }
        for (int i = 0; i < this.matrixArray.length; i++) {
            this.matrixArray[i] = this.invertArrayLine(matrixArray[i]);
        }

    }

    private Array invertArrayLine(Array array){
        Array newArray = new Array();
        for (int i = array.arrayLength()-1; i >= 0; i--){
            newArray.addElement(array.getValue(i));
        }
        return newArray;
    }

    // V -----------------------------------------------------------------
    // It was assumed a clockwise rotation.
    public void matrixRotationByMinusNinetyDegrees(){
        if(matrixArray.length == 0)
            throw new IllegalArgumentException("Empty matrix.");
        if(isMatrixIrregular())
            throw new IllegalArgumentException("Invalid matrix.");
        int nrLinesOldMatrix = matrixArray.length;
        int nrColumnsOldMatrix = matrixArray[0].arrayLength();
        Array[] finalMatrix = new Array[nrColumnsOldMatrix];

        for(int i = 0; i < this.matrixArray.length; i++){
            finalMatrix[i] = new Array();
            for(int j = 0; j < this.matrixArray[0].arrayLength(); j++){
                finalMatrix[i].addElement(this.matrixArray[nrLinesOldMatrix - j - 1].getValue(i));
            }
        }
        this.matrixArray = finalMatrix;
    }

    // u ------------------------------------------------------------------
    public void matrixRotationBy180Degrees() {
        if (this.matrixArray.length == 0)
            throw new IllegalArgumentException("Empty matrix.");
        if (isMatrixIrregular())
            throw new IllegalArgumentException("Invalid matrix.");

        int nrLinesOldMatrix = matrixArray.length;
        int nrColumnsOldMatrix = matrixArray[0].arrayLength();
        Array[] finalMatrix = new Array[nrLinesOldMatrix];

        for (int i = 0; i < this.matrixArray.length; i++) {
            finalMatrix[i] = new Array();
            for (int j = 0; j < this.matrixArray[i].arrayLength(); j++) {
                finalMatrix[i].addElement(this.matrixArray[nrLinesOldMatrix - j - 1].getValue(nrColumnsOldMatrix - j - 1));
            }
        }

        this.matrixArray = finalMatrix;
    }

    //T___________________________________________________________________

    public void matrixRotationByNinetyDegrees (){
        matrixRotationBy180Degrees();
    }

    //Utils ---------------------------------------------------------------
    private int getHighestRange() {
        int max = 0;
        for (int i = 0; i < this.matrixArray.length; i++) {
            if (this.matrixArray[i].arrayLength() > max)
                max = this.matrixArray[i].arrayLength();
        }
        return max;
    }

    private boolean isMatrixIrregular() {
        for (int i = 1; i < this.matrixArray.length; i++) {
            if (this.matrixArray[i].arrayLength() != this.matrixArray[0].arrayLength()) {
                return true;
            }
        }
        return false;
    }

    private Array mainMatrixDiagonal(Array[] matrix){
        int diagonalSize = diagonalSizeOfAMatrix(matrix);
        Array primaryDiagonal = new Array();

        for(int i = 0; i < diagonalSize; i++){
            primaryDiagonal.addElement(matrix[i].getValue(i));
        }
        return primaryDiagonal;
    }

    private int diagonalSizeOfAMatrix(Array[] matrix){
        int nLines = matrix.length;
        int nColumns = matrix[0].arrayLength();
        int diagonalSize;
        if (nLines > nColumns)
            diagonalSize = nColumns;
        else
            diagonalSize = nLines;
        return diagonalSize;
    }


    public Array secondaryMatrixDiagonal(Array[] matrix){
        int diagonalSize = diagonalSizeOfAMatrix(matrix);
        Array secondaryDiagonal = new Array();

        for(int i = 0; i < diagonalSize; i++){
            secondaryDiagonal.addElement(matrix[i].getValue(matrix[i].arrayLength()-1-i));
        }
        return secondaryDiagonal;
    }
    private boolean isNumInArray(Array array, int element){
        for (int i = 0; i < array.arrayLength(); i++){
            if (array.getValue(i) == element){
                return true;
            }
        }
        return false;
    }
    private int checkIndexNum (int num, Array array){
        int index = -1;
        for (int i = 0; i < array.arrayLength(); i++){
            if (array.getValue(i) == num){
                index = i;
            }
        }
        return index;
    }
    private int sumElements (Array array){
        int sum = 0;
        for (int i = 0; i < array.arrayLength(); i++){
            sum += array.getValue(i);
        }
        return sum;
    }

    private int getNumberOfMatrixElements(){
        if(!isMatrixIrregular())
            return matrixArray.length * matrixArray[0].arrayLength();
        int counter = 0;
        for(int i = 0; i < this.matrixArray.length; i++) {
            for (int j = 0; j < this.matrixArray[i].arrayLength(); j++) {
                counter++;
            }
        }
        return counter;
    }

    private int searchVectorMinimumElement(Array array) {
        int lowestElement = array.getValue(0);
        for(int i = 1; i < array.arrayLength(); i++){
            if(array.getValue(i) < lowestElement)
                lowestElement = array.getValue(i);
        }
        return lowestElement;
    }

    private static int numberOfDigitsInANumber(int number){
        if(number > -10 && number <10){
            return 1;
        }

        int totalOfDigits = 0;
        while(number != 0){
            totalOfDigits++;
            number/=10;
        }
        return totalOfDigits;
    }
}