package pt.ipp.isep.dei.examples.basic.domain.Bloco4;

public class Exercicio15 {

    public static int numberMatrixColumns(int[][] matrix){

        if(CustomTools.isMatrixIrregular(matrix)){
            return -1;
        }
        return matrix[0].length;
    }


}
