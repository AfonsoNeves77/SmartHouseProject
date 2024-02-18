package pt.ipp.isep.dei.examples.basic.domain.Bloco4;

public class Exercicio18 {

    //Alínea A

    public static int lowestValueMatrix(int[][] matrix) {
        int currentLowest = matrix[0][0];
        for (int i =0; i < matrix.length; i++) {
            int lowestInLine = CustomTools.minimumElementInAnArray(matrix[i]);
                if (currentLowest > lowestInLine) {
                    currentLowest = lowestInLine;
                }
            }
        return currentLowest;
    }

    //Alínea B

    public static int highestValueMatrix(int[][] matrix) {
        int currentHighest = matrix[0][0];
        for (int i =0; i < matrix.length; i++) {
            int highestInLine = CustomTools.maximumElementInAnArray(matrix[i]);
            if (currentHighest < highestInLine) {
                currentHighest = highestInLine;
            }
        }
        return currentHighest;
    }

    //Alínea C
    //o valor médio dos elementos;

    public static double averageValuesMatrix(int[][] matrix) {
        if (matrix.length == 0)
            return Double.NaN;
        double sum = 0;
        double counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += CustomTools.sumOfTheElementsOfAnArray(matrix[i]);
            counter += matrix[i].length; // As all elements in an array are considered, the counter increases by their number
        }
        return (sum / counter);
    }


    //Alínea D
    //o produto dos seus elementos;

    public static int productMatrixElements(int[][] matrix){
        int product = 1;
        if (matrix.length == 0){
            return 0;
        }
        for (int i = 0; i < matrix.length; i++){
            product *= CustomTools.productNumbersArray(matrix[i]);
        }
        return product;
    }

    //Alínea E
    // o conjunto de elementos não repetidos;
    public static int[] nonRepeatedNumbersInMatrix(int[][] matrix){
        int[] nonRepeatedElements = new int[50]; // arbitrary number
        int counter = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int k = 0; k < matrix[i].length; k++){
                boolean toInsert = true;
                //Only iterates until the actual numbers added to the array, since the rest has zeros and should not count.
                for (int h = 0; h < counter; h++) {
                    if (matrix[i][k] == nonRepeatedElements[h]){
                        toInsert = false;
                        break;
                    }
                }
                if (toInsert) {
                    nonRepeatedElements[counter] = matrix[i][k];
                    counter++;
                }
            }
        }
        return CustomTools.intArrayCrop(nonRepeatedElements,counter);
    }
    //Alínea F
    public static int[] primeElementsInAMatrix(int[][] matriz) {
        int index = 0;
        int[] primeElements = new int[matriz.length*matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (CustomTools.checkIfNumberIsPrime(matriz[i][j])) {
                    primeElements[index] = matriz[i][j];
                    index++;
                }
            }
        }
        return CustomTools.intArrayCrop(primeElements,index);
    }
//Alinea G--------------------------------------------------------------------------------------------------------
    public static int[] mainDiagonalOfAMatrix(int[][] matrix) {
        if (CustomTools.isASquareMatrix(matrix) || CustomTools.isARectangularMatrix(matrix)) {
            int index = matrix[0].length;
            if (matrix.length < matrix[0].length) {
                index = matrix.length;
            }
            int[] mainDiagonal = new int[index];
            for (int i = 0; i < index; i++) {
                mainDiagonal[i] = matrix[i][i];
            }
            return mainDiagonal;
        } else {
            return null;
        }
    }
//Alínea H----------------------------------------------------------------------------------------------------------
    public static int[] secondaryDiagonalOfAMatrix(int[][] matrix) {
        if (CustomTools.isASquareMatrix(matrix) || CustomTools.isARectangularMatrix(matrix)) {
            int index = matrix[0].length;
            if (matrix.length < matrix[0].length) {
                index = matrix.length;
            }
            int[] secondaryDiagonal = new int[index];
            for (int i = 0; i < index; i++) {
                secondaryDiagonal[i] = matrix[i][matrix[0].length - 1 - i];
            }
            return secondaryDiagonal;
        } else {
            return null;
        }
    }

    //Alínea I
    public static boolean isItAnIdentityMatrix(int[][] matrix){
        if(matrix.length == 0 || !CustomTools.isASquareMatrix(matrix))
            return false;
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i == j && matrix[i][j] != 1) || (i != j && matrix[i][j] != 0))
                    return false;
            }
        }
        return true;
    }

    //Alínea J
    //Para calcular a inversa, temos de calcular o determinante da matriz dada.
    //Se a matriz for de ordem > 2, então temos de a dividir em submatrizes e calcular os seus respetivos determinantes.
    //Ambos os métodos estão nas CustomTools.

    //Calcular a inversa de uma matriz A. inversaDeA = [1 / determinante(A)] * matrizA
    //Nota 1: Se determinante = 0, a matriz não tem inversa.
    //Nota 2: A matriz tem de ser quadrada.
    public static int[][] inverseMatrix(int[][] matrix){
        if(matrix.length == 0 || !CustomTools.isASquareMatrix(matrix) || CustomTools.determinantOfAMatrix(matrix) == 0)
            return null;
        int[][] inverse = new int[matrix.length][matrix[0].length];
        int determinant = CustomTools.determinantOfAMatrix(matrix);
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                inverse[i][j] = (1 / determinant) * matrix[i][j];
            }
        }
        return inverse;
    }

    //Alínea K
    public static int[][] transposeOfAMatrix(int[][] matrix){
        if(matrix.length == 0)
            return null;
        if(!CustomTools.isASquareMatrix(matrix) && !CustomTools.isARectangularMatrix(matrix))
            return null;

        int nrTransposeLines = matrix[0].length;
        int nrTransposeColumns = matrix.length;
        int[][] transposeMatrix = new int[nrTransposeLines][nrTransposeColumns];
        for(int i = 0; i < nrTransposeLines; i++) {
            for (int j = 0; j < nrTransposeColumns; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
        return transposeMatrix;
    }



/**
 * Alternativa não terminada
    public static int sortsMatIncreasing(int[][] mat) {
        int[][] newMat = new int[mat.length][mat[0].length];
        int min = mat[0][0];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (min > mat[i][j]) {
                    min = mat[i][j];
                }
            }
        }
        return min;
    }

    public static int[] determinsNonRepeteadElements(int[][] mat) {

        int counter = 0;
        int position = 1;
        int[] naoRepetidos = new int[mat.length * mat[0].length + 1];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (naoRepetidos[position] != mat[i][j])
                    naoRepetidos[position] = mat[i][j];
                position++;
                counter++;
            }
            naoRepetidos[0] = counter;
        }
        return naoRepetidos;
    }
 */
}
