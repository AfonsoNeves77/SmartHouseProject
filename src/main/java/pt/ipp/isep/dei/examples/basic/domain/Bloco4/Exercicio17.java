package pt.ipp.isep.dei.examples.basic.domain.Bloco4;

import static pt.ipp.isep.dei.examples.basic.domain.Bloco4.CustomTools.isMatrixIrregular;

public class Exercicio17 {

    public static boolean isARectangularMatrix(int[][] mat) {
        if (!isMatrixIrregular(mat)) {
            return mat[0].length != mat.length;
        }
        return false;
    }
}
