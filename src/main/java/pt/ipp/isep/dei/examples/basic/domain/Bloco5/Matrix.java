package pt.ipp.isep.dei.examples.basic.domain.Bloco5;

public class Matrix {

    private int[][] matrix;

    public Matrix() {
        this.matrix = new int[0][0];
    }

    public Matrix(int[][] matrix) throws InstantiationException {
        if(!validConstructorParameters(matrix))
            throw new InstantiationException("The matrix has empty lines.");
        this.matrix = new int[matrix.length][];
        for(int i = 0; i < matrix.length; i++){

            this.matrix[i] = matrix[i].clone();
        }

    }

    private boolean validConstructorParameters(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i].length == 0)
                return false;
        }
        return true;
    }

    //C------------------------------------------------------------

    public void addElementToMatrix(int line, int element) {
        if (line < this.matrix.length){
        int currentColumn = this.matrix[line].length;
        int[] newLine = new int[currentColumn + 1];
        for (int i = 0; i < currentColumn; i++) {
            newLine[i] = this.matrix[line][i];
        }

        newLine[currentColumn] = element;
        this.matrix[line] = newLine;
        }
    }

    // d -------------------------------------------------------
    public void removeFirstOccurrenceNum(int num) {
        int foundX = -1;
        int foundY = -1;
        int k;
        for (int i = 0; i < this.matrix.length; i++) {

            // checks if num is present on the row, saving the coordinates (Y/X)
            if (CustomTools.isNumInArray(this.matrix[i], num)) {
                foundX = CustomTools.checkIndexNum(num, this.matrix[i]);
                foundY = i;
                break;
            }
        }
        // If foundX is -1, it means the num was never found, in that case this.matrix stays the same
        if (foundX != -1) {
            int[] tmpArray = new int[this.matrix[foundY].length - 1];

            // This will copy this.matrix into the tmpArray until the iterating variable reaches the value at FoundX
            for (k = 0; k != foundX; k++) {
                tmpArray[k] = this.matrix[foundY][k];
            }

            // After the iterating variable meets foundX, it skips one index and keeps copying.
            while (k < tmpArray.length) {
                tmpArray[k] = this.matrix[foundY][k + 1];
                k++;
            }
            this.matrix[foundY] = tmpArray;
        }
    }

    //e)_____________________________________________
    public boolean isMatrixEmpty() {
        return matrix.length == 0;
    }

    //f)_____________________________________________

    private int searchVectorMaxValue (int[] vector) {
        /*
        Following Afonso's solution in his next method and partially quoting:
        The condition below ensures that if the matrix has an empty line, the method returns
        the minimum value possible and facilitates the comparison with the
        next line maximum value, ensuring that any valid maximum element
        will be higher than Integer.MIN_VALUE.
         */
        int maxValue = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > maxValue)
                maxValue = vector[i];
        }
        return maxValue;
    }

    public int searchMatrixMaxValue () {
        if (isMatrixEmpty())
            throw new IllegalArgumentException("The matrix is empty.");
        int maxValue = this.searchVectorMaxValue(this.matrix[0]);
        for (int i = 0; i < this.matrix.length; i++) {
            if (searchVectorMaxValue(this.matrix[i]) > maxValue)
                maxValue = searchVectorMaxValue(this.matrix[i]);
        }
        return maxValue;
    }

    //g_____________________________________________

    /*
    The following method is private because it´s meant to be used only inside the method
    immediately below.
    Being private it´s being tested indirectly in the public method that calls it and depends
    on it to do the correct operations.
     */

    private int searchVectorMinimumElement(int[] array) {
        /*
        The condition below ensures that if the matrix has an empty line, the method returns
        the highest value possible and facilitates the comparison with the
        next line minimum value, ensuring that any valid minimum element
        will be smaller than Integer.MAX_VALUE.
         */
        int minVector = array[0];

        for (int i : array) {
            if (i < minVector) {
                minVector = i;
            }
        }
        return minVector;

    }

    public int searchMatSmallestElement() {
        if (isMatrixEmpty()) {
            throw new IllegalArgumentException("This matrix is empty.");
        }
        int minVector = this.searchVectorMinimumElement(this.matrix[0]);
        for (int j = 1; j < this.matrix.length; j++) {
            if (searchVectorMinimumElement(this.matrix[j]) < minVector) {
                minVector = searchVectorMinimumElement(this.matrix[j]);
            }
        }
        return minVector;
    }

    //H-----------------------------------------------------------------------------------------------------------------

    public double averageOfAMatrix() {
        if (isMatrixEmpty()){
            return -1;
        }
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                sum += this.matrix[i][j];
                counter++;
            }
        }
        return (double) sum/counter;
    }


    // i ------------------------------------------------------
    public int[] homologousLine() {
        int[] tmpArray = new int[this.matrix.length];
        for (int i = 0; i < this.matrix.length; i++) {
            tmpArray[i] = CustomTools.sumElements(this.matrix[i]);
        }
        return tmpArray;
    }

    //j) ------------------------------------------------------
    public int[] sumOfElementsInEachMatrixColumn() {
        int maximumColumns = getMaximumColumnsInMatrix();
        int[] sumMatrixColumnElements = new int[maximumColumns];

        if (this.matrix.length == 0)
            return new int[0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sumMatrixColumnElements[j] += matrix[i][j];
            }
        }
        return sumMatrixColumnElements;
    }

    private int getMaximumColumnsInMatrix() {
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length > max)
                max = matrix[i].length;
        }
        return max;
    }

    //K_________________________________________________________________

    public int getIndexOfMaximumLineSumValueInMatrix() {
        int[] tmpVector = homologousLine();
        int maxValue = tmpVector[0];
        int index = 0;
        for (int i = 0; i < tmpVector.length; i++) {
            if (tmpVector[i] > maxValue) {
                maxValue = tmpVector[i];
                index = i;
            }
        }
        return index;
    }

    //l)________________________________________________________________

    public boolean isMatrixIrregular() {
        if (isMatrixEmpty()) {
            if (isMatrixEmpty()) {
                throw new IllegalArgumentException("This matrix is empty.");
            }
        }
        for (int i = 1; i < this.matrix.length; i++) {
            if (this.matrix[i].length != this.matrix[0].length) {
                return true;
            }
        }
        return false;


    }

    public boolean isMatrixSquare() {
        if (isMatrixIrregular() || isMatrixEmpty()) {
            return false;
        }
        return this.matrix.length == this.matrix[0].length;
    }

    //M-----------------------------------------------------------------------------------------------------------------
    public boolean symmetricMatrix(){
        if (isMatrixEmpty() || !isMatrixSquare()){
            return false;
        }
        for (int i = 0; i < this.matrix.length; i++){
            for (int j = 0; j < this.matrix[0].length; j++){
                if (this.matrix[i][j] != this.matrix [j][i]){
                    return false;
                }
            }
        }
        return true;
    }
    // n --------------------------------------------------
    public int quantityNonNullElementsInMainDiagonal() {
        if (isMatrixEmpty()) {
            return -1;
        }
        if (!isMatrixSquare()) {
            return -1;
        }
        int quantity = 0;
        for (int i = 0; i < this.matrix.length; i++) {
            if (this.matrix[i][i] != 0) {
                quantity++;
            }
        }
        return quantity;
    }

    //o)_____________________________________________________________
    public boolean areMainAndSecondaryDiagonalsEqual() {
        if (isMatrixEmpty())
            throw new IllegalArgumentException("The matrix is empty.");
        if (isMatrixIrregular())
            throw new IllegalArgumentException("The matrix is not rectangular.");
        int[] mainDiagonal = CustomTools.mainMatrixDiagonal(this.matrix);
        int[] secondaryDiagonal = CustomTools.secondaryMatrixDiagonal(matrix);

        for (int i = 0; i < mainDiagonal.length; i++) {
            if (mainDiagonal[i] != secondaryDiagonal[i])
                return false;
        }
        return true;
    }

    //P______________________________________________________________

   private double averageOfDigitsInMatrix (){
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++){
                sum += CustomTools.numberOfDigitsInANumber(this.matrix[i][j]);
                counter++;
            }
        }
            return (double) sum / counter;
   }

    public int[] elementsWithHigherNumberOfDigitsThanAverageInMatrix () {
        if (isMatrixEmpty())
            return new int[0];
        int numberOfMatrixElements = howManyElementsDoesMatrixHave();
        int[] tmpVector = new int[numberOfMatrixElements];
        double average = averageOfDigitsInMatrix();
        int index = 0;

        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                if (CustomTools.numberOfDigitsInANumber(this.matrix[i][j]) > average) {
                    tmpVector[index] = this.matrix[i][j];
                    index++;
                }
            }
        }
        int[] vector = new int[index];
        System.arraycopy(tmpVector, 0, vector, 0, vector.length);
        return vector;
    }

    //q)_____________________________________________________________

    public int howManyElementsDoesMatrixHave() {
        if (isMatrixEmpty()) {
            return 0;
        }

        int numberOfElements = 0;

        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
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

        return  (double) (evenNumbers * 100) / totalOfDigits;
    }

    private double sumOfPercentageOfEvenNumbersInAMatrixLine(int[] array) {
        double sumOfAllPercentages = 0;

        for (int i = 0; i < array.length; i++) {
            sumOfAllPercentages += this.percentageOfEvenElementsInADigit(array[i]);
        }

        return sumOfAllPercentages;
    }

    private double averageOfPercentageOfEvenNumbersInAllMatrixLines() {


        double sumOfAllPercentages = 0;

        for (int i = 0; i < this.matrix.length; i++) {
            sumOfAllPercentages += this.sumOfPercentageOfEvenNumbersInAMatrixLine(this.matrix[i]);
        }

        int numberOfTotalElements = this.howManyElementsDoesMatrixHave();

        return sumOfAllPercentages / numberOfTotalElements;
    }

    public int[] elementsBiggerThanMediaOfEvenPercentageMatrix() {
        if (isMatrixEmpty()) {
            return new int[0];
        }
        int numberOfTotalElements = this.howManyElementsDoesMatrixHave();
        double mediaOfPercentageOfEvenElementsInAllMatrixLines = this.averageOfPercentageOfEvenNumbersInAllMatrixLines();

        int[] tempArray = new int[numberOfTotalElements];
        int counter = 0;

        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                if (this.percentageOfEvenElementsInADigit(this.matrix[i][j]) > mediaOfPercentageOfEvenElementsInAllMatrixLines) {
                    tempArray[counter] = this.matrix[i][j];
                    counter++;
                }
            }

        }

        int[] finalArray = new int[counter];
        System.arraycopy(tempArray, 0, finalArray, 0, finalArray.length);
        return finalArray;
    }

    //R-----------------------------------------------------------------------------------------------------------------

    public void invertedLinesOfMatrix() {
        if (!isMatrixEmpty()) {
            for (int i = 0; i < this.matrix.length; i++) {
                this.matrix[i] = CustomTools.invertArray(this.matrix[i]);
            }
        }
    }

    // s -------------------------------------------------------------------------------------------
    public void invertColumnMatrix() {
        int[][] tmpMatrix = new int[this.matrix.length][];
        for (int i = 0; i < this.matrix.length; i++) {
            tmpMatrix[i] = this.matrix[this.matrix.length - 1 - i];
            for (int j = 0; j < tmpMatrix[i].length; j++) {
                tmpMatrix[i][j] = this.matrix[this.matrix.length - 1 - i][j];
            }
        }
        this.matrix = tmpMatrix;
    }
    //v)____________________________________________________________________________________________
    /*
    This is a no return method. It has to be tested indirectly (it was tested using exercise 2.j).
     */
    public void matrixRotationByMinusNinetyDegrees(){
        if(matrix.length == 0)
            throw new IllegalArgumentException("Empty matrix.");
        if(isMatrixIrregular())
            throw new IllegalArgumentException("Invalid matrix.");
        int nrColumnsMatrix = matrix[0].length;
        int nrLinesMatrix = matrix.length;
        int[][] finalMatrix = new int[nrColumnsMatrix][nrLinesMatrix];
        for(int i = 0; i < finalMatrix.length; i++){
            for(int j = 0; j < finalMatrix[0].length; j++){
                finalMatrix[i][j] = matrix[nrLinesMatrix - j - 1][i];
            }
        }
        matrix = finalMatrix;
    }

    //U
    public void rotateMatrix180Degrees() {
        if (this.matrix.length == 0)
            throw new IllegalArgumentException("Empty matrix.");
        if (isMatrixIrregular())
            throw new IllegalArgumentException("Invalid matrix.");
        int[][] tmpMatrix = new int[this.matrix.length][this.matrix[0].length];

        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                tmpMatrix[this.matrix.length - i - 1][this.matrix[i].length - j -1] = this.matrix[i][j];
            }
        }

        this.matrix = tmpMatrix;
    }

    //t)____________________________________________________________________________________________
     /*
     To invert the matrix ninety degrees we have to: 1) invert elements of each line and 2) switch columns
     with the lines.
     In this first method we invert each element of one array, in this case it´s a private method,
     so it will be used to invert the values inside each matrix line.
      */

    private int[] invertingElementsOfAnArray(int[] array){
//        if (array.length == 0){
//            return new int[0];
//        }
        //this block of code is not needed. Private method, used only once public method
        //is invoked. The lines above are never tested.

        int[] tempArray = new int[array.length];
        int counter = array.length-1;

        for(int i = 0; i < array.length; i++){
            tempArray[i] = array[counter];
            counter--;
        }
        return tempArray;
    }

    /*
        In this private method we invert the values of all lines of the matrix
     */

    private void invertingElementsOfEachMatrixLine(){
        if (this.isMatrixEmpty() || !isMatrixSquare()){
            return;
        }
        int[][] tempArray = new int[this.matrix.length][];
        for(int i = 0; i < this.matrix.length; i++){
         tempArray[i] = this.invertingElementsOfAnArray(this.matrix[i]);
        }
        this.matrix = tempArray.clone();
    }


    public int[] returningLine(int i){
        if (this.isMatrixEmpty()){
            return new int[0];
        }
        return this.matrix[i].clone();
    }

    /*
        This method first inverts all the values of every line of the matrix. Then it
        iterates through all elements of each line, swapping the values of the first column with values
        of the first line.
     */

    public void rotatingNinetyDegrees(){
        if (this.isMatrixEmpty() || !isMatrixSquare()){
            return;
        }

        this.invertingElementsOfEachMatrixLine();
        int[][] tempArray = new int[this.matrix.length][this.matrix.length];
        int j = 0;
        for(int i = 0; i < this.matrix.length; i++){
            while(j < this.matrix.length){
                /*
                returning line method returns every (i) line we want [j] allows us to iterate
                 through all elements of that line.
                 In tempArray we want to (in the inside while) iterate through the columns
                 and in the outside loop through the lines
                 */
                tempArray[j][i] = returningLine(i)[j];
                j++;
            }
            j=0;
        }
        this.matrix=tempArray.clone();
    }

}

