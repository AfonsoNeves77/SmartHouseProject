package pt.ipp.isep.dei.examples.basic.domain.Bloco4;

public class Exercicio19 {
    //Matrix cannot be empty, otherwise there is no determinant. Same applies to non-square matrices.
    //Exceptions cannot be made, so it was considered value 0.
    public static int determinantOfAMatrix(int[][] matrix){
        if(matrix.length == 0 || !CustomTools.isASquareMatrix(matrix))
            return 0;
        return CustomTools.determinantOfAMatrix(matrix);
    }
}
