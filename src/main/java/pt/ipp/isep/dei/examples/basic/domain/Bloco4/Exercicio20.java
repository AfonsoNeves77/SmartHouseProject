package pt.ipp.isep.dei.examples.basic.domain.Bloco4;

public class Exercicio20 {

    // 20a
    public static int[][] matrixMultipliedByNum (int num, int[][] matrix){
        if (matrix.length == 0 || matrix[0].length == 0){
            return new int [0][0];
        }
        int[][] matrixOfProducts = new int [matrix.length][matrix[0].length];
        for (int i = 0; i <= matrix.length-1; i++){
            for (int j = 0; j <= matrix[0].length-1; j++){
                matrixOfProducts[i][j] = matrix[i][j] * num;
            }
        }
    return matrixOfProducts;
    }

    //20b
    public static int[][] sumOfTwoMatrixes(int[][] matrix1, int[][] matrix2){
        if (areTheseArraysEmpty(matrix1,matrix2) || !CustomTools.areTwoMatricesEqualSize(matrix1,matrix2)){
            return new int [0][0];
        }
        int[][] matrixOfSums = new int [matrix1.length][matrix1[0].length];
        for (int i = 0; i <= matrix1.length-1; i++) {
            for (int j = 0; j <= matrix1[0].length - 1; j++) {
                matrixOfSums[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrixOfSums;
    }

    // Utils especificos
    public static boolean areTheseArraysEmpty(int[][] matrix1, int[][] matrix2){
        return (matrix1.length == 0 && matrix2.length == 0);
    }

    //20c
    public static int[][] productOfTwoMatrices(int[][] matrix1, int[][] matrix2){
        if (!areTheyValidMatrices(matrix1, matrix2))
            return new int [0][0];
        int[][] matricesProduct = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {              //Para percorrer as linhas todas da matriz A
            for (int j = 0; j < matrix2[0].length; j++) {       //Para percorrer as colunas todas da matriz B
                for (int k = 0; k < matrix1[i].length; k++) {   //Para percorrer tanto as colunas de A como as linhas de B, porque têm de ser iguais!
                    matricesProduct[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matricesProduct;
    }

    public static boolean areTheyValidMatrices(int[][] matrixA, int[][] matrixB){
        if (matrixA.length == 0 || matrixB.length == 0)
            return false;
        if ((CustomTools.isMatrixIrregular(matrixA) || CustomTools.isMatrixIrregular(matrixB)))
            return false;
        return matrixA[0].length == matrixB.length;
    }
}
