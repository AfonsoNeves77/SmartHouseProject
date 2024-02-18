package pt.ipp.isep.dei.examples.basic.domain.Bloco4;

/**
 *Números base: 1 a 9;
 *Números colocados pelo jogador: -1 a -9;
 *Célula vazia: apenas 0.
 */
public class Exercicio22 {


    public static boolean isItAValidMatrix(int[][] matrix){
        return(CustomTools.isASquareMatrix(matrix) && matrix.length == 9);
    }

    //b) verificar se o jogo está completo
    public static boolean areThereSpacesToFill(int[][] matrix){
        if(!isItAValidMatrix(matrix))
            //Temos de retornar true, porque é a condição de saída.
            //Mesmo que não tenhamos espaços vazios, tem de falhar (usado no método isGameFinished).
            return true;
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0)
                    return true;
            }
        }
        return false;
    }

    //c) identificar onde existe certo número na matriz. Coloca 1.
    public static int[][] sudokuMaskMatrix(int[][] matrix, int number){
        if(!isItAValidMatrix(matrix))
            return null;
        if(number < 1 || number > 9)
            return null;
        int[][] maskMatrix = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == number)
                    maskMatrix[i][j] = 1;
            }
        }
        return maskMatrix;
    }

    //d) colocar um número indicado pelo jogador numa célula vazia.
    //Se o número já lá estiver ou tiver outro número, retornar a matriz atual. Deveria null??
    public static boolean spaceChosenIsEmpty(int[][] matrix, int line, int column) {
        line -= 1; column -= 1;
        return matrix[line][column] == 0;
    }

    public static int[][] fillGameSpace(int[][] matrix, int number, int line, int column){
        if(!isItAValidMatrix(matrix))
            return null;
        if(!areLineColumnAndNumberValid(line,column,number))
            return null;
        line -= 1; column -= 1;
        if(spaceChosenIsEmpty(matrix,line,column)) {
            matrix[line][column] = -number;
            return matrix;
        }
        return matrix;
    }

    //e) Verificar se um dado número pode ser colocado numa célula.
    //Não pode estar na mesma coluna nem linha, nem na matriz de 3x3.
    public static boolean isNumberInThe3By3Matrix(int[][] matrix, int number, int line, int column){
        //Dividir o jogo em pequenos módulos de 3x3, e iterar apenas no de interesse relativamente à posição
        //escolhida pelo jogador. Jogar com os múltiplos de 3.
        line -= 1; column -= 1;
        int minLine = 3 * (line/3);
        int maxLine = minLine + 3;
        int minColumn = 3 * (column/3);
        int maxColumn = minColumn + 3;
        for(int i = minLine; i < maxLine; i++) {
            for (int j = minColumn; j < maxColumn; j++) {
                if (Math.abs(matrix[i][j]) == number)
                    return true;
            }
        }
        return false;
    }

    public static boolean canInsertNumberInPosition(int[][] matrix, int number, int line, int column){
        if(!areLineColumnAndNumberValid(line,column,number))
            return false;
        /* Em parâmetro, entram as coordenadas do jogador, mas estas têm que ser transformadas
         para ir de 0-8, e não de 1 a 9 (grid do jogo) */
        if(!spaceChosenIsEmpty(matrix,line,column))
            return false;
        if(isNumberInColumn(matrix,column,number))
            return false;
        if(isNumberInLine(matrix,line,number))
            return false;
        //Para validar se o nr já está no quadrado:
        if(isNumberInThe3By3Matrix(matrix,number,line,column))
            return false;
        return true;
    }

    //f) Verificar se é possível retirar um número numa dada célula. Se sim, retornar a matriz resultante.
    //Conteúdo da célula não pode ser igual a zero e número tem de ser negativo.
    //Se se verificar passar conteúdo da célula a 0.
    public static int[][] removeANumberFromTheGame(int[][] matrix, int line, int column) {
        if(!isItAValidMatrix(matrix))
            return null;
        if(!areLineAndColumnValid(line,column))
            return null;
        line -= 1; column -= 1;
        if(matrix[line][column] >= 0)
            return null;
        matrix[line][column] = 0;
        return matrix;
    }

    //g) Verificar se jogo terminado com sucesso.
    //Confirmar se matriz tem zeros.
    //Percorrer a matriz toda para ver se todas as linhas têm números de 1 a 9, bem com as colunas e os quadrados.
    public static boolean isGameFinished(int[][] matrix){
        if(areThereSpacesToFill(matrix))
            return false;
        //Verificar se os números do jogador foram colocados corretamente.
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] < 0){
                        int aux = matrix[i][j];
                        matrix[i][j] = 0;
                        //Verificar se posso inserir o nr. onde estava.
                        // Se sim, é porque a linha, coluna e quadrado de 1 a 9 estão corretos. Coloco o aux lá de novo.
                        //Para ser válido no input da minha função "canInsertNumber", i e j têm de ser acrescidos de 1 porque
                        // line e column referem-se ao input do user (iniciam a 1) e não aos índices corretos da matriz (iniciam a 0).
                        if (!canInsertNumberInPosition(matrix, -aux, i+1, j+1))
                            return false;
                    matrix[i][j] = aux;
                }
            }
        }
        return true;
    }

    // Auxiliary functions:
    /**
     * Checks if a chosen number is already in the column.
     * @return true or false.
     */
    public static boolean isNumberInColumn(int [][] matrix, int column, int number) {
        column -= 1;
        for(int i = 0; i < matrix.length; i++) {
            if (Math.abs(matrix[i][column]) == number)
                return true;
        }
        return false;
    }

    /**
     * Checks if a chosen number is already in the line.
     * @return true or false.
     */
    public static boolean isNumberInLine(int [][] matrix, int line, int number) {
        line -= 1;
        for(int j = 0; j < matrix[0].length; j++) {
            if (Math.abs(matrix[line][j]) == number)
                return true;
        }
        return false;
    }

    public static boolean areLineAndColumnValid(int line, int column){
        if (line < 1 || line > 9)
            return false;
        if (column < 1 || column > 9)
            return false;
        return true;
    }

    public static boolean areLineColumnAndNumberValid(int line, int column, int number){
        if (!areLineAndColumnValid(line,column))
            return false;
        if (number < 1 || number > 9)
            return false;
        return true;
    }

}
