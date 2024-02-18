package pt.ipp.isep.dei.examples.basic.domain.Bloco5.Sudoku;

// This class generates the sudoku grid and respective maskGrid, having an input that adjusts the difficulty
// there is another class below that is meant to control the flow of the game
public class SudokuGen {
    private int[][] difficultyMedium = {
            {0, 7, 0, 5, 8, 3, 0, 2, 0},
            {0, 5, 9, 2, 0, 0, 3, 0, 0},
            {7, 9, 5, 0, 0, 0, 6, 3, 2},
            {0, 0, 3, 6, 9, 7, 1, 0, 0},
            {6, 8, 0, 0, 0, 2, 7, 0, 0},
            {9, 1, 4, 8, 3, 5, 0, 7, 6},
            {0, 3, 0, 7, 0, 1, 4, 9, 5},
            {5, 6, 7, 4, 2, 9, 0, 1, 3}};

    private int[][] difficultyEasy = {
            {0, 7, 0, 5, 8, 3, 9, 2, 0},
            {8, 0, 9, 2, 1, 0, 3, 4, 0},
            {2, 1, 3, 0, 6, 7, 5, 8, 9},
            {3, 4, 0, 6, 9, 0, 0, 0, 8},
            {6, 0, 1, 3, 5, 0, 7, 9, 4},
            {9, 0, 5, 1, 4, 8, 2, 3, 6},
            {1, 3, 0, 7, 2, 9, 4, 6, 5},
            {5, 6, 7, 0, 3, 4, 0, 1, 0}};

    private int[][] difficultyAlmostDone = {
            {0, 7, 6, 5, 8, 3, 9, 2, 1},
            {8, 5, 9, 2, 1, 6, 3, 4, 7},
            {2, 1, 3, 4, 6, 7, 5, 8, 9},
            {3, 4, 2, 6, 9, 7, 1, 5, 8},
            {6, 8, 1, 3, 5, 2, 7, 9, 4},
            {9, 7, 5, 1, 4, 8, 2, 3, 6},
            {1, 3, 8, 7, 2, 9, 4, 6, 5},
            {5, 6, 7, 8, 3, 4, 8, 1, 3}
    };

    private int[][] test1 = {
            {4, 7, 6, 5, 8, 3, 9, 2, 1},
            {8, 5, 9, 2, 1, 6, 3, 4, 7},
            {2, 1, 3, 4, 6, 7, 5, 8, 9},
            {3, 4, 2, 6, 9, 7, 1, 5, 8},
            {6, 8, 1, 3, 5, 2, 7, 9, 4},
            {9, 7, 5, 1, 4, 8, 2, 3, 6},
            {1, 3, 8, 7, 2, 9, 4, 6, 5},
            {5, 6, 7, 8, 3, 4, 8, 1, 3}};
    private int[][] gameGrid;

    private int[][] maskGrid;


    // the user can input a number, if it is 0, the gamegrid will be easy, else it will be medium. Ideally this could evolve into some sort of grid with number generation.
    public SudokuGen (int difficulty){
        if (difficulty == 0){
            this.gameGrid = difficultyEasy;
        } else if (difficulty == 99){
            this.gameGrid = difficultyAlmostDone;
        } else if (difficulty == 100){
            this.gameGrid = test1;
        } else {
            this.gameGrid = difficultyMedium;
        }
        this.maskGrid = copyGrid(this.gameGrid);
        for (int i = 0; i < gameGrid.length; i++){
            for (int j = 0; j < gameGrid[i].length; j++){
                if (gameGrid[i][j] != 0){
                    maskGrid[i][j] = 1;
                }
            }
        }
    }

    public int[][] getSudokuGrid(){
        int[][] returnGrid = new int[this.gameGrid.length][this.gameGrid[0].length];
        for(int i = 0; i < returnGrid.length; i++){
            returnGrid[i] = this.gameGrid[i].clone();
        }
        return returnGrid;
    }

    private int[][] copyGrid(int[][] array){
        int[][] copyGrid = new int[array.length][array[0].length];
        for(int i = 0; i < copyGrid.length; i++){
            copyGrid[i] = array[i].clone();
        }
        return copyGrid;

    }

    // insert num ---- Numbers inserted by player have 2 on the maskGrid
    public int[][] insert (int num, int y, int x){
        if (isValid (num,y,x)){
            this.gameGrid[y][x] = num;
            this.maskGrid[y][x] = 2;
        }
        else {
            System.out.println("You can´t add this element in this cell");
        }
        return getSudokuGrid();

    }

    // remove num
    public int[][] remove (int y, int x){
        if (isBase(y,x)){
            System.out.println("You can´t remove this element");
        } else {
            gameGrid[y][x] = 0;
            maskGrid[y][x] = 0;
        }
        return getSudokuGrid();
    }

    public boolean isGameComplete() {
        for (int i = 0; i < gameGrid.length; i++) {
            for (int j = 0; j < gameGrid[i].length; j++) {
                if (gameGrid[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // isBase
    private boolean isBase (int y, int x){
        return (this.maskGrid[y][x] == 1);
    }

    // isValid
    private boolean isValid (int num, int y, int x){
        return (isEmpty(y,x) && isValidHorizontally(num,y,x) && isValidVertically(num,y,x) && !isNumberInThe3By3Matrix(num,y,x));
    }

    // utils for isValid
    private boolean isEmpty(int y, int x){
        return this.maskGrid[y][x] == 0;
    }

    private boolean isValidVertically(int num, int y, int x){
        for (int i = 0; i < this.gameGrid.length; i++){
            if (gameGrid[i][x] == num){
                return false;
            }
        }
        return true;
    }

    private boolean isValidHorizontally(int num, int y, int x){
        for (int i = 0; i < this.gameGrid.length; i++){
            if (gameGrid[y][i] == num){
                return false;
            }
        }
        return true;
    }
    private boolean isNumberInThe3By3Matrix(int num, int y, int x){
        int minLine = 3 * (y/3);
        int maxLine = minLine + 3;
        int minColumn = 3 * (x/3);
        int maxColumn = minColumn + 3;
        for(int i = minLine; i < maxLine; i++) {
            for (int j = minColumn; j < maxColumn; j++) {
                if (Math.abs(this.gameGrid[i][j]) == num)
                    return true;
            }
        }
        return false;
    }
}
