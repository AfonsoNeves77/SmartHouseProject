package pt.ipp.isep.dei.examples.basic.domain.Bloco5Test.SudokuTest;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco5.Sudoku.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SudokuTest {

    @Test
    void sudokuGame_instantiationSudokuBoardDifficultyEasy(){
        //arrange
        int difficulty = 0;
        SudokuGen game = new SudokuGen(difficulty);
        int[][] expected = {
                {0, 7, 0, 5, 8, 3, 9, 2, 0},
                {8, 0, 9, 2, 1, 0, 3, 4, 0},
                {2, 1, 3, 0, 6, 7, 5, 8, 9},
                {3, 4, 0, 6, 9, 0, 0, 0, 8},
                {6, 0, 1, 3, 5, 0, 7, 9, 4},
                {9, 0, 5, 1, 4, 8, 2, 3, 6},
                {1, 3, 0, 7, 2, 9, 4, 6, 5},
                {5, 6, 7, 0, 3, 4, 0, 1, 0}
        };
        // act
        int[][] result = game.getSudokuGrid();
        // assert
        assertArrayEquals(expected,result);
    }

    @Test
    void sudokuGame_instantiationSudokuBoardDifficultyMedium(){
        //arrange
        int difficulty = 101;
        SudokuGen game = new SudokuGen(difficulty);
        int[][] expected = {
                {0, 7, 0, 5, 8, 3, 0, 2, 0},
                {0, 5, 9, 2, 0, 0, 3, 0, 0},
                {7, 9, 5, 0, 0, 0, 6, 3, 2},
                {0, 0, 3, 6, 9, 7, 1, 0, 0},
                {6, 8, 0, 0, 0, 2, 7, 0, 0},
                {9, 1, 4, 8, 3, 5, 0, 7, 6},
                {0, 3, 0, 7, 0, 1, 4, 9, 5},
                {5, 6, 7, 4, 2, 9, 0, 1, 3}};
        // act
        int[][] result = game.getSudokuGrid();
        // assert
        assertArrayEquals(expected,result);
    }
    @Test
    void sudokuGame_instantiationFullSudokuBoard(){
        //arrange
        int difficulty = 100;
        SudokuGen game = new SudokuGen(difficulty);
        int[][] expected = {
                {4, 7, 6, 5, 8, 3, 9, 2, 1},
                {8, 5, 9, 2, 1, 6, 3, 4, 7},
                {2, 1, 3, 4, 6, 7, 5, 8, 9},
                {3, 4, 2, 6, 9, 7, 1, 5, 8},
                {6, 8, 1, 3, 5, 2, 7, 9, 4},
                {9, 7, 5, 1, 4, 8, 2, 3, 6},
                {1, 3, 8, 7, 2, 9, 4, 6, 5},
                {5, 6, 7, 8, 3, 4, 8, 1, 3}};
        // act
        int[][] result = game.getSudokuGrid();
        // assert
        assertArrayEquals(expected,result);
    }
    @Test
    void sudokuGame_InvalidRemoveElementFromBaseGrid(){
        //arrange
        int difficulty = 0;
        SudokuGen game = new SudokuGen(difficulty);
        int[][] expected = {
                {0, 7, 0, 5, 8, 3, 9, 2, 0},
                {8, 0, 9, 2, 1, 0, 3, 4, 0},
                {2, 1, 3, 0, 6, 7, 5, 8, 9},
                {3, 4, 0, 6, 9, 0, 0, 0, 8},
                {6, 0, 1, 3, 5, 0, 7, 9, 4},
                {9, 0, 5, 1, 4, 8, 2, 3, 6},
                {1, 3, 0, 7, 2, 9, 4, 6, 5},
                {5, 6, 7, 0, 3, 4, 0, 1, 0}
        };
        // act
        int[][] result = game.remove(3,3);
        // assert
        assertArrayEquals(expected,result);
    }

    @Test
    void sudokuGame_RemoveElement(){
        //arrange
        int difficulty = 0;
        SudokuGen game = new SudokuGen(difficulty);
        int[][] expected = {
                {0, 7, 0, 5, 8, 3, 9, 2, 0},
                {8, 0, 9, 2, 1, 0, 3, 4, 0},
                {2, 1, 3, 0, 6, 7, 5, 8, 9},
                {3, 4, 0, 6, 9, 0, 0, 0, 8},
                {6, 0, 1, 3, 5, 0, 7, 9, 4},
                {9, 0, 5, 1, 4, 8, 2, 3, 6},
                {1, 3, 0, 7, 2, 9, 4, 6, 5},
                {5, 6, 7, 0, 3, 4, 0, 1, 0}
        };
        game.insert(4,0,0);
        // act
        int[][] result = game.remove(0,0);
        // assert
        assertArrayEquals(expected,result);
    }

    @Test
    void sudokuGame_addElementInvalidVertically(){
        //arrange
        int difficulty = 0;
        SudokuGen game = new SudokuGen(difficulty);
        int[][] expected = {
                {0, 7, 0, 5, 8, 3, 9, 2, 0},
                {8, 0, 9, 2, 1, 0, 3, 4, 0},
                {2, 1, 3, 0, 6, 7, 5, 8, 9},
                {3, 4, 0, 6, 9, 0, 0, 0, 8},
                {6, 0, 1, 3, 5, 0, 7, 9, 4},
                {9, 0, 5, 1, 4, 8, 2, 3, 6},
                {1, 3, 0, 7, 2, 9, 4, 6, 5},
                {5, 6, 7, 0, 3, 4, 0, 1, 0}
        };
        // act
        int[][] result = game.insert(6,0,0);
        // assert
        assertArrayEquals(expected,result);
    }

    @Test
    void sudokuGame_addElement(){
        //arrange
        int num = 4;
        int x = 0;
        int y = 0;
        int difficulty = 99;
        SudokuEngine game = new SudokuEngine(difficulty);
        String action = "add";
        String expected = "The game is over";
        // act
        String result = game.sudokuEngine(num,y,x,action);
        // assert
        assertEquals(expected,result);
    }
    @Test
    void sudokuGame_removeInvalidInput(){
        //arrange
        int numIncorret = 99;
        int num = 4;
        int x = 0;
        int y = 0;
        int difficulty = 99;
        SudokuEngine game = new SudokuEngine(difficulty);
        String action1 = "add";
        String action2 = "remove";
        String expected = "The game is over";

        // act

        game.sudokuEngine(numIncorret,y,x,action1);
        String result = game.sudokuEngine(num,y,x,action2);;
        // assert
        assertEquals(expected,result);
    }
}
