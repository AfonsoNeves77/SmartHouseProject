package pt.ipp.isep.dei.examples.basic.domain.Bloco4;

public class Exercicio21 {
    //A)
    public static int[][] maskMat(char characterToFind, char[][] mat) {
        if (!CustomTools.isASquareChar(mat) || mat.length == 0) { //If mat has 0 lines it can't have >0 columns
            return new int[][]{
                    {-1},//Error message for invalid Input
                    {-1},
            };
        }

        int[][] maskMat = new int[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == characterToFind) {
                    maskMat[i][j] = 1;
                }
            }
        }

        return maskMat;
    }

    //B)

    /*A função wordExists itera pela mat[][] e, quando encontra o primeiro caracter da palavra a procurar
    executa uma série de 8 movimentos passíveis de serem realizados, tendo em conta a localização desse mesmo caracter.
     */


    public static boolean wordExists(char[] word, char[][] mat) {
        if (mat.length != 0 && CustomTools.isASquareChar(mat) && word.length != 0) { //If mat has 0 lines it can't have >0 columns

            for (int y = 0; y < mat.length; y++) {
                for (int x = 0; x < mat[y].length; x++) {
                    if (mat[y][x] == word[0]) {

                        if (verticalUp(mat, word, y, x)) {
                            return true;
                        }
                        if (horizontalRight(mat, word, y, x)) {
                            return true;
                        }

                        if (horizontalLeft(mat, word, y, x)) {
                            return true;
                        }

                        if (verticalDown(mat, word, y, x)) {
                            return true;
                        }

                        if (diagonalUpperRight(mat, word, y, x)) {
                            return true;
                        }

                        if (diagonalUpperLeft(mat, word, y, x)) {
                            return true;
                        }

                        if (diagonalDownRight(mat, word, y, x)) {
                            return true;
                        }

                        if (diagonalDownLeft(mat, word, y, x)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /*b)
    As funções que se seguem, devem ser integradas na função anterior wordExists, pois fazem a comparação,
    entre a linha, coluna, diagonal a procurar e os caracteres presentes no vetor word, retornando false, ao primeiro
    caracter que não for igual ao vetor word.
    Cada uma das funções tem uma condição inicial que assegura que a compração nunca será efetuada fora dos limites
    da matriz.

    */

    public static boolean horizontalRight(char[][] mat, char[] word, int y, int x) {
        if (x + word.length <= mat[y].length) {
            boolean found = true;
            for (int k = 1; k < word.length; k++) {
                if (mat[y][x + k] != word[k]) {
                    found = false;
                    break;
                }
            }
            return found;
        }
        return false;
    }

    public static boolean horizontalLeft(char[][] mat, char[] word, int y, int x) {
        if (x >= word.length - 1) {
            boolean found = true;
            for (int k = 1; k < word.length; k++) {
                if (mat[y][x - k] != word[k]) {
                    found = false;
                    break;
                }
            }
            return found;
        }
        return false;
    }

    public static boolean verticalDown(char[][] mat, char[] word, int y, int x) {
        if (y + word.length <= mat.length) {
            boolean found = true;
            for (int k = 1; k < word.length; k++) {
                if (mat[y + k][x] != word[k]) {
                    found = false;
                    break;
                }
            }
            return found;
        }
        return false;
    }

    public static boolean verticalUp(char[][] mat, char[] word, int y, int x) {
        if (y >= word.length - 1) {
            boolean found = true;
            for (int k = 1; k < word.length; k++) {
                if (mat[y - k][x] != word[k]) {
                    found = false;
                    break;
                }
            }
            return found;
        }
        return false;
    }

    public static boolean diagonalUpperRight(char[][] mat, char[] word, int y, int x) {
        if (x + word.length <= mat[y].length && y - (word.length - 1) >= 0) {
            boolean found = true;
            for (int k = 1; k < word.length; k++) {
                if (mat[y - k][x + k] != word[k]) {
                    found = false;
                    break;
                }
            }
            return found;
        }
        return false;
    }

    public static boolean diagonalUpperLeft(char[][] mat, char[] word, int y, int x) {
        if (y - (word.length - 1) >= 0 && x >= word.length - 1) {
            boolean found = true;
            for (int k = 1; k < word.length; k++) {
                if (mat[y - k][x - k] != word[k]) {
                    found = false;
                    break;
                }
            }
            return found;
        }
        return false;
    }

    public static boolean diagonalDownRight(char[][] mat, char[] word, int y, int x) {
        if (x + word.length <= mat[y].length && y + word.length <= mat.length) {
            boolean found = true;
            for (int k = 1; k < word.length; k++) {
                if (mat[y + k][x + k] != word[k]) {
                    found = false;
                    break;
                }
            }
            return found;
        }
        return false;
    }

    public static boolean diagonalDownLeft(char[][] mat, char[] word, int y, int x) {
        if (y + word.length <= mat.length && x >= word.length - 1) {
            boolean found = true;
            for (int k = 1; k < word.length; k++) {
                if (mat[y + k][x - k] != word[k]) {
                    found = false;
                    break;
                }
            }
            return found;
        }
        return false;
    }

    /*c)
    A função isWordComplete recebe o input do utilizador que define as células em que se inicia e termina a palavra.
    Mediante as células introduzidas, apenas um pequeno conjunto de movimentos é possível, sendo que a palavra é procurada
    recorrendo a funções anteriores que realizam a busca numa direção em particular.
     */


    public static boolean isWordComplete(char[][] mat, char[] word, int startLine, int startColumn, int endLine, int endColumn) {
        if (startLine < 0 || startColumn < 0 || endLine < 0 || endColumn < 0) {
            return false;
        }

        if (mat.length > 0 && CustomTools.isASquareChar(mat) && word.length > 0) {
            if (startLine == endLine) {
                if (startColumn > endColumn) {
                    return horizontalLeft(mat, word, startLine, startColumn);
                }

                if (startColumn < endColumn) {
                    return horizontalRight(mat, word, startLine, startColumn);
                }
            }

            if (startColumn == endColumn) {
                if (startLine > endLine) {
                    return verticalUp(mat, word, startLine, startColumn);
                }

                if (startLine < endLine) {
                    return verticalDown(mat, word, startLine, startColumn);
                }
            }

            if (startLine == endLine - (word.length - 1)) {
                if (startColumn > endColumn) {
                    return diagonalDownLeft(mat, word, startLine, startColumn);
                }

                if (startColumn < endColumn) {
                    return diagonalDownRight(mat, word, startLine, startColumn);
                }
            }

            if (startLine - (word.length - 1) == endLine) {
                if (startColumn > endColumn) {
                    return diagonalUpperLeft(mat, word, startLine, startColumn);
                }

                if (startColumn < endColumn) {
                    return diagonalUpperRight(mat, word, startLine, startColumn);
                }
            }
        }
        return false;
    }

    /*
    A função FullmatrixMask cria uma array com 0s e 1s em que os 1s são as posições dos caracteres de
    uma palavra completa. Para responder à D a intersectionCheck cria 2 arrays mascara com o fullmatrixmask,
    soma e compara se em alguma celula
     */
    public static boolean intersectionCheck (char[] word1, char[] word2, char[][] mat) {
        int[][] fullMatrixMask1 = fullMatrixMask(word1, mat);
        int[][] fullMatrixMask2 = fullMatrixMask(word2, mat);
        int[][] sumMatrix = new int[mat.length][mat[0].length];
        for (int y = 0; y < mat.length; y++) {
            for (int x = 0; x < mat[y].length; x++) {
                sumMatrix[y][x] = fullMatrixMask2[y][x] + fullMatrixMask1[y][x];
            }
        }
        for (int y = 0; y < mat.length; y++) {
            for (int x = 0; x < mat[y].length; x++) {
                if (sumMatrix[y][x] >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[][] fullMatrixMask(char[] word, char[][] mat) {
        if (mat.length > 0 && CustomTools.isASquareChar(mat) && word.length > 0) {//If mat has 0 lines it can't have >0 columns
            int[][] fullMatrixMask = new int[mat.length][mat[0].length];
            for (int y = 0; y < mat.length; y++) {
                for (int x = 0; x < mat[y].length; x++) {
                    if (mat[y][x] == word[0]) {

                        if (verticalUp(mat, word, y, x)) {
                            for (int i = 0; i != word.length; i++) {
                                fullMatrixMask[y - i][x] += 1;
                            }
                        }
                        if (horizontalRight(mat, word, y, x)) {
                            for (int i = 0; i != word.length; i++) {
                                fullMatrixMask[y][x + i] += 1;
                            }
                        }
                        if (horizontalLeft(mat, word, y, x)) {
                            for (int i = 0; i != word.length; i++) {
                                fullMatrixMask[y][x - i] += 1;
                            }
                        }
                        if (verticalDown(mat, word, y, x)) {
                            for (int i = 0; i != word.length; i++) {
                                fullMatrixMask[y + i][x] += 1;
                            }
                        }
                        if (diagonalUpperRight(mat, word, y, x)) {
                            for (int i = 0; i != word.length; i++) {
                                fullMatrixMask[y - i][x + 1] += 1;
                            }
                        }
                        if (diagonalUpperLeft(mat, word, y, x)) {
                            for (int i = 0; i != word.length; i++) {
                                fullMatrixMask[y - i][x - i] += 1;
                            }
                        }
                        if (diagonalDownRight(mat, word, y, x)) {
                            for (int i = 0; i != word.length; i++) {
                                fullMatrixMask[y + i][x + i] += 1;
                            }
                        }
                        if (diagonalDownLeft(mat, word, y, x)) {
                            for (int i = 0; i != word.length; i++) {
                                fullMatrixMask[y + i][x - i] += 1;
                            }
                        }
                    }
                }
            }
            return fullMatrixMask;
        } else {
            return null;
        }
    }
}
