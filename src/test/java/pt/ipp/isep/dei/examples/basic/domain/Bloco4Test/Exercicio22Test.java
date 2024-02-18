package pt.ipp.isep.dei.examples.basic.domain.Bloco4Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio11;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio22;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio22Test {
    @Test
    void isItAValidMatrix_Irregular() {
        new Exercicio22();
        //Arrange
        int[][] sudoku = {
                {0, 0, 2, 5, 7, 4, 6, 0, 0},
                {0, 0, 0, 0, 9, 0, 0, 0, 0},
                {3, 4, 0, 0, 0, 0, 0, 2, 9},
                {6, 9, 0, 0, 0, 0, 0, 5, 1},
                {0, 0, 5, 8, 0, 9, 3, 0, 0},
                {0, 0, 6, 4, 8, 1, 3, 0, 0},
                {2, 3, 0, 0, 0, 0, 0, 8, 7},
                {8, 2, 0, 0, 0, 0, 0, 3, 5},
                {0, 0, 0, 0, 8, 0, 0, 0}};
        //Act
        boolean result = Exercicio22.isItAValidMatrix(sudoku);
        //Assert
        assertFalse(result);
    }
    @Test
    void isItAValidMatrix_Rectangular() {
        //Arrange
        int[][] sudoku = {
                {0, 0, 2, 5, 7, 4, 6, 0, 0},
                {0, 0, 0, 0, 9, 0, 0, 0, 0},
                {0, 0, 0, 0, 8, 0, 0, 0, 0}};
        //Act
        boolean result = Exercicio22.isItAValidMatrix(sudoku);
        //Assert
        assertFalse(result);
    }
    @Test
    void isItAValidMatrix_InvalidLength() {
        //Arrange
        int[][] sudoku = {
                {0, 0, 2, 5, 7, 4, 6, 0, 0, 0},
                {0, 0, 0, 0, 9, 0, 0, 0, 0, 0},
                {3, 4, 0, 0, 0, 0, 0, 2, 9, 0},
                {6, 9, 0, 0, 0, 0, 0, 5, 1, 0},
                {0, 0, 5, 8, 0, 9, 3, 0, 0, 0},
                {0, 0, 6, 4, 8, 1, 3, 0, 0, 0},
                {2, 3, 0, 0, 0, 0, 0, 8, 7, 0},
                {8, 2, 0, 0, 0, 0, 0, 3, 5, 0},
                {0, 0, 0, 0, 8, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 8, 0, 0, 0, 0, 0}};
        //Act
        boolean result = Exercicio22.isItAValidMatrix(sudoku);
        //Assert
        assertFalse(result);
    }

    //Alínea b)
    @Test
    void areThereSpacesToFill_True() {
        //Arrange
        int[][] sudoku = {
                {0, 0, 2, 5, 7, 4, 6, 0, 0},
                {0, 0, 0, 0, 9, 0, 0, 0, 0},
                {3, 4, 0, 0, 0, 0, 0, 2, 9},
                {6, 9, 0, 0, 0, 0, 0, 5, 1},
                {0, 0, 5, 8, 0, 9, 3, 0, 0},
                {0, 0, 6, 4, 8, 1, 3, 0, 0},
                {2, 3, 0, 0, 0, 0, 0, 8, 7},
                {8, 2, 0, 0, 0, 0, 0, 3, 5},
                {0, 0, 0, 0, 8, 0, 0, 0, 0}};
        //Act
        boolean result = Exercicio22.areThereSpacesToFill(sudoku);
        //Assert
        assertTrue(result);
    }

    @Test
    void areThereSpacesToFill_False() {
        //Arrange
        int[][] sudoku = {
                {9, 8, 2, 5, 7, 4, 6, 1, 3},
                {5, 6, 1, 2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 9},
                {6, 9, 8, 4, 3, 7, 2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, 4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 1, 3, 5},
                {4, 1, 3, 9, 8, 5, 7, 6, 2},
                {7, 5, 6, 3, 1, 2, 8, 9, 4}};
        //Act
        boolean result = Exercicio22.areThereSpacesToFill(sudoku);
        //Assert
        assertFalse(result);
    }

    //Alínea c)
    @Test
    void sudokuMaskMatrix_NumberFound() {
        //Arrange
        int[][] sudoku = {
                {0, 0, 2, 5, 7, 4, 6, 0, 0},
                {0, 0, 0, 0, 9, 0, 0, 0, 0},
                {3, 4, 0, 0, 0, 0, 0, 2, 9},
                {6, 9, 0, 0, 0, 0, 0, 5, 1},
                {0, 0, 5, 8, 0, 9, 3, 0, 0},
                {2, 3, 0, 0, 0, 0, 0, 8, 7},
                {8, 2, 0, 0, 0, 0, 0, 3, 5},
                {0, 0, 0, 0, 8, 0, 0, 0, 0},
                {0, 0, 6, 3, 1, 2, 8, 0, 0}};
        int number = 8;
        int[][] expected = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0}};
        //Act
        int[][] result = Exercicio22.sudokuMaskMatrix(sudoku,number);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void sudokuMaskMatrix_NumberNotFound() {
        //Arrange
        int[][] sudoku = {
                {0, 0, 2, 5, 7, 4, 6, 0, 0},
                {0, 0, 0, 0, 9, 0, 0, 0, 0},
                {3, 4, 0, 0, 0, 0, 0, 2, 9},
                {6, 9, 0, 0, 0, 0, 0, 5, 1},
                {0, 0, 5, 0, 0, 9, 3, 0, 0},
                {2, 3, 0, 0, 0, 0, 0, 0, 7},
                {0, 2, 0, 0, 0, 0, 0, 3, 5},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 6, 3, 1, 2, 0, 0, 0}};
        int number = 8;
        int[][] expected = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0}};
        //Act
        int[][] result = Exercicio22.sudokuMaskMatrix(sudoku,number);
        //Assert
        assertArrayEquals(expected,result);
    }
    @Test
    void sudokuMaskMatrix_ImpossibleNumber12() {
        //Arrange
        int[][] sudoku = {
                {0, 0, 2, 5, 7, 4, 6, 0, 0},
                {0, 0, 0, 0, 9, 0, 0, 0, 0},
                {3, 4, 0, 0, 0, 0, 0, 2, 9},
                {6, 9, 0, 0, 0, 0, 0, 5, 1},
                {0, 0, 5, 0, 0, 9, 3, 0, 0},
                {2, 3, 0, 0, 0, 0, 0, 0, 7},
                {0, 2, 0, 0, 0, 0, 0, 3, 5},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 6, 3, 1, 2, 0, 0, 0}};
        int number = 12;
        //Act
        int[][] result = Exercicio22.sudokuMaskMatrix(sudoku,number);
        //Assert
        assertNull(result);
    }

    @Test
    void sudokuMaskMatrix_ImpossibleNumberZero() {
        //Arrange
        int[][] sudoku = {
                {0, 0, 2, 5, 7, 4, 6, 0, 0},
                {0, 0, 0, 0, 9, 0, 0, 0, 0},
                {3, 4, 0, 0, 0, 0, 0, 2, 9},
                {6, 9, 0, 0, 0, 0, 0, 5, 1},
                {0, 0, 5, 0, 0, 9, 3, 0, 0},
                {2, 3, 0, 0, 0, 0, 0, 0, 7},
                {0, 2, 0, 0, 0, 0, 0, 3, 5},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 6, 3, 1, 2, 0, 0, 0}};
        int number = 0;
        //Act
        int[][] result = Exercicio22.sudokuMaskMatrix(sudoku,number);
        //Assert
        assertNull(result);
    }

    @Test
    void sudokuMaskMatrix_NumberOne() {
        //Arrange
        int[][] sudoku = {
                {0, 0, 2, 5, 7, 4, 6, 0, 0},
                {0, 0, 0, 0, 9, 0, 0, 0, 0},
                {3, 4, 0, 0, 0, 0, 0, 2, 9},
                {6, 9, 0, 0, 0, 0, 0, 5, 1},
                {0, 0, 5, 0, 0, 9, 3, 0, 0},
                {2, 3, 0, 0, 0, 0, 0, 0, 7},
                {0, 2, 0, 0, 0, 0, 0, 3, 5},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 6, 3, 1, 2, 0, 0, 0}};
        int number = 1;
        int [][] expected = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0}};
        //Act
        int[][] result = Exercicio22.sudokuMaskMatrix(sudoku,number);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void sudokuMaskMatrix_NumberNine() {
        //Arrange
        int[][] sudoku = {
                {0, 0, 2, 5, 7, 4, 6, 0, 0},
                {0, 0, 0, 0, 9, 0, 0, 0, 0},
                {3, 4, 0, 0, 0, 0, 0, 2, 9},
                {6, 9, 0, 0, 0, 0, 0, 5, 1},
                {0, 0, 5, 0, 0, 9, 3, 0, 0},
                {2, 3, 0, 0, 0, 0, 0, 0, 7},
                {0, 2, 0, 0, 0, 0, 0, 3, 5},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 6, 3, 1, 2, 0, 0, 0}};
        int number = 9;
        int [][] expected = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0}};
        //Act
        int[][] result = Exercicio22.sudokuMaskMatrix(sudoku,number);
        //Assert
        assertArrayEquals(expected,result);
    }


    @Test
    void sudokuMaskMatrix_NotASudokuMatrix() {
        //Arrange
        int[][] sudoku = {
                {0, 0, 2, 5, 7, 4, 6, 0},
                {0, 0, 0, 0, 9, 0, 0, 0},
                {3, 4, 0, 0, 0, 0, 0, 2},
                {6, 9, 0, 0, 0, 0, 0, 5},
                {0, 0, 5, 0, 0, 9, 3, 0},
                {0, 0, 6, 4, 0, 1, 3, 0},
                {2, 3, 0, 0, 0, 0, 0, 0},
                {0, 2, 0, 0, 0, 0, 0, 3},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 6, 3, 1, 2, 0, 0}};
        int number = 8;
        //Act
        int[][] result = Exercicio22.sudokuMaskMatrix(sudoku,number);
        //Assert
        assertNull(result);
    }

    //Alínea d)
    @Test
    void fillAGameSpace_ReturnUpdatedMatrix() {
        //Arrange
        int[][] sudoku = {
                {9, 8, 2, 5, 7, 4, 6, 1, 3},
                {5, 6, 1, 2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 9},
                {6, 9, 8, 4, 3, 7, 2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, 4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, 5, 0, 0, 0},
                {7, 5, 6, 3, 1, 2, 0, 0, 0}};
        int number = 4;
        int line = 9;
        int column = 9;
        int[][] expected = {
                {9, 8, 2, 5, 7, 4, 6, 1, 3},
                {5, 6, 1, 2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 9},
                {6, 9, 8, 4, 3, 7, 2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, 4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, 5, 0, 0, 0},
                {7, 5, 6, 3, 1, 2, 0, 0, -4}};
        //Act
        int[][] result = Exercicio22.fillGameSpace(sudoku,number,line,column);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void fillAGameSpace_NotEmptySpaceReturnSameMatrix() {
        //Arrange
        int[][] sudoku = {
                {9, 8, 2, 5, 7, 4, 6, 1, 3},
                {5, 6, 1, 2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 9},
                {6, 9, 8, 4, 3, 7, 2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, 4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, 5, 0, 0, 0},
                {7, 5, 6, 3, 1, 2, 0, 0, 4}};
        int number = 3;
        int line = 6;
        int column = 9;
        int[][] expected = {
                {9, 8, 2, 5, 7, 4, 6, 1, 3},
                {5, 6, 1, 2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 9},
                {6, 9, 8, 4, 3, 7, 2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, 4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, 5, 0, 0, 0},
                {7, 5, 6, 3, 1, 2, 0, 0, 4}};
        //Act
        int[][] result = Exercicio22.fillGameSpace(sudoku,number,line,column);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void fillAGameSpace_UnacceptableLine() {
        //Arrange
        int[][] sudoku = {
                {9, 8, 2, 5, 7, 4, 6, 1, 3},
                {5, 6, 1, 2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 9},
                {6, 9, 8, 4, 3, 7, 2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, 4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, 5, 0, 0, 0},
                {7, 5, 6, 3, 1, 2, 0, 0, 4}};
        int number = 3;
        int line = 10;
        int column = 9;
        //Act
        int[][] result = Exercicio22.fillGameSpace(sudoku,number,line,column);
        //Assert
        assertNull(result);
    }

    @Test
    void fillAGameSpace_UnacceptableMatrix() {
        //Arrange
        int[][] sudoku = {
                {9, 8, 2, 5, 7, 4, 6, 1, 3},
                {5, 6, 1, 2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 9},
                {6, 9, 8, 4, 3, 7, 2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, 4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3},
                {7, 5, 6, 3, 1, 2, 0, 0, 4}};
        int number = 3;
        int line = 10;
        int column = 9;
        //Act
        int[][] result = Exercicio22.fillGameSpace(sudoku,number,line,column);
        //Assert
        assertNull(result);
    }

    @Test
    void fillAGameSpace_UnacceptableNumber0() {
        //Arrange
        int[][] sudoku = {
                {9, 8, 2, 5, 7, 4, 6, 1, 3},
                {5, 6, 1, 2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 9},
                {6, 9, 8, 4, 3, 7, 2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 0},
                {2, 3, 4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, 5, 0, 0, 0},
                {7, 5, 6, 3, 1, 2, 0, 0, 4}};
        int number = 0;
        int line = 5;
        int column = 9;
        //Act
        int[][] result = Exercicio22.fillGameSpace(sudoku,number,line,column);
        //Assert
        assertNull(result);
    }

    @Test
    void fillAGameSpace_UnacceptableNumber10() {
        //Arrange
        int[][] sudoku = {
                {9, 8, 2, 5, 7, 4, 6, 1, 3},
                {5, 6, 1, 2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 9},
                {6, 9, 8, 4, 3, 7, 2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 0},
                {2, 3, 4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, 5, 0, 0, 0},
                {7, 5, 6, 3, 1, 2, 0, 0, 4}};
        int number = 10;
        int line = 5;
        int column = 9;
        //Act
        int[][] result = Exercicio22.fillGameSpace(sudoku,number,line,column);
        //Assert
        assertNull(result);
    }


    //Alínea e)
    @Test
    void canInsertNumberInPosition() {
        //Arrange
        int[][] sudoku = {
                {9, 8, 2, 5, 7, 4, 6, 1, 3},
                {5, 6, 1, 2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 9},
                {6, 9, 8, 4, 3, 7, 2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, 4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, 5, 0, 0, 0},
                {7, 5, 6, 3, 1, 2, 0, 0, 4}};
        int number = 9;
        int line = 9;
        int column = 8;
        //Act
        boolean result = Exercicio22.canInsertNumberInPosition(sudoku,number,line,column);
        //Assert
        assertTrue(result);
    }

    @Test
    void canInsertNumberInPosition_FalseLineGivenIs0() {
        //Arrange
        int[][] sudoku = {
                {9, 8, 2, 5, 7, 4, 6, 1, 3},
                {5, 6, 1, 2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 9},
                {6, 9, 8, 4, 3, 7, 2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, 4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, 5, 0, 0, 0},
                {7, 5, 6, 3, 1, 2, 0, 0, 4}};
        int number = 9;
        int line = 0;
        int column = 8;
        //Act
        boolean result = Exercicio22.canInsertNumberInPosition(sudoku,number,line,column);
        //Assert
        assertFalse(result);
    }

    @Test
    void canInsertNumberInPosition_TrueLineGivenIs1() {
        //Arrange
        int[][] sudoku = {
                {0, 8, 2, 5, 7, 4, 6, 0, 3},
                {5, 6, 1, 2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 0},
                {6, 9, 8, 4, 3, 7, 2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, 4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, 5, 0, 0, 0},
                {7, 5, 6, 3, 1, 2, 0, 0, 4}};
        int number = 9;
        int line = 1;
        int column = 8;
        //Act
        boolean result = Exercicio22.canInsertNumberInPosition(sudoku,number,line,column);
        //Assert
        assertTrue(result);
    }

    @Test
    void canInsertNumberInPosition_FalseLineGivenIs9() {
        //Arrange
        int[][] sudoku = {
                {0, 8, 2, 5, 7, 4, 6, 9, 3},
                {5, 6, 1, 2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 0},
                {6, 9, 8, 4, 3, 7, 2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, 4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, 5, 0, 0, 0},
                {7, 5, 6, 3, 1, 2, 0, 0, 4}};
        int number = 9;
        int line = 9;
        int column = 8;
        //Act
        boolean result = Exercicio22.canInsertNumberInPosition(sudoku,number,line,column);
        //Assert
        assertFalse(result);
    }

    @Test
    void canInsertNumberInPosition_TrueColumnGivenIs1() {
        //Arrange
        int[][] sudoku = {
                {0, 8, 2, 5, 7, 4, 6, 9, 3},
                {5, 6, 1, 2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 0},
                {6, 9, 8, 4, 3, 7, 2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, 4, 6, 5, 1, 9, 8, 7},
                {8, 2, 0, 7, 4, 6, 0, 0, 0},
                {4, 0, 3, 9, 8, 5, 0, 0, 0},
                {0, 5, 6, 3, 1, 2, 0, 0, 4}};
        int number = 9;
        int line = 9;
        int column = 1;
        //Act
        boolean result = Exercicio22.canInsertNumberInPosition(sudoku,number,line,column);
        //Assert
        assertTrue(result);
    }

    @Test
    void canInsertNumberInPosition_FalseColumnGivenIs0() {
        //Arrange
        int[][] sudoku = {
                {0, 8, 2, 5, 7, 4, 6, 9, 3},
                {5, 6, 1, 2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 0},
                {6, 9, 8, 4, 3, 7, 2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, 4, 6, 5, 1, 9, 8, 7},
                {8, 2, 0, 7, 4, 6, 0, 0, 0},
                {4, 0, 3, 9, 8, 5, 0, 0, 0},
                {0, 5, 6, 3, 1, 2, 0, 0, 4}};
        int number = 9;
        int line = 9;
        int column = 0;
        //Act
        boolean result = Exercicio22.canInsertNumberInPosition(sudoku,number,line,column);
        //Assert
        assertFalse(result);
    }

    @Test
    void canInsertNumberInPosition_FalseSpaceNotEmpty() {
        //Arrange
        int[][] sudoku = {
                {9, 8, 2, 5, 7, 4, 6, 1, 3},
                {5, 6, 1, 2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 9},
                {6, 9, 8, 4, 3, 7, 2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, 4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, 5, 0, 0, 0},
                {7, 5, 6, 3, 1, 2, 0, 0, 4}};
        int number = 9;
        int line = 6;
        int column = 7;
        //Act
        boolean result = Exercicio22.canInsertNumberInPosition(sudoku,number,line,column);
        //Assert
        assertFalse(result);
    }

    @Test
    void canInsertNumberInPosition_FalseLineWithNumberChosen() {
        //Arrange
        int[][] sudoku = {
                {9, 0, 0, 5, 0, 0, 0, 1, 3},
                {0, 0, 0, 0, 0, 0, 4, 0, 8},
                {0, 0, 0, 1, 0, 8, 5, 0, 9},
                {6, 9, 8, 4, 3, 7, 2, 5, 1},
                {1, 7, 0, 8, 2, 9, 3, 4, 6},
                {2, 3, 4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, 5, 0, 0, 0},
                {7, 0, 6, 3, 1, 2, 0, 0, 4}};
        int number = 5;
        int line = 1;
        int column = 2;
        //Act
        boolean result = Exercicio22.canInsertNumberInPosition(sudoku,number,line,column);
        //Assert
        assertFalse(result);
    }

    @Test
    void canInsertNumberInPosition_False3By3MatrixWithNumberChosen() {
        //Arrange
        int[][] sudoku = {
                {9, 0, 0, 0, 0, 0, 0, 1, 3},
                {0, 0, 0, 0, 0, 0, 4, 0, 8},
                {0, 0, 5, 1, 0, 8, 0, 0, 9},
                {6, 9, 8, 4, 3, 7, 2, 5, 1},
                {1, 7, 0, 8, 2, 9, 3, 4, 6},
                {2, 3, 4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, 5, 0, 0, 0},
                {7, 0, 6, 3, 1, 2, 0, 0, 4}};
        int number = 5;
        int line = 1;
        int column = 2;
        //Act
        boolean result = Exercicio22.canInsertNumberInPosition(sudoku,number,line,column);
        //Assert
        assertFalse(result);
    }

    @Test
    void removeANumberFromTheGame_RemoveAnInitialNumber() {
        //Arrange
        int[][] sudoku = {
                {9, 8, 2, 5, 7, 4, 6, 1, 3},
                {5, 6, 1, -2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 9},
                {6, 9, 8, 4, 3, 7, -2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, -4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, -5, 0, 0, 0},
                {7, 5, 6, 3, 1, 2, 0, 0, -4}};
        int line = 6;
        int column = 1;
        //Act
        int[][] result = Exercicio22.removeANumberFromTheGame(sudoku,line,column);
        //Assert
        assertNull(result);
    }

    @Test
    void removeANumberFromTheGame_RemoveANumberPutByTheUser() {
        //Arrange
        int[][] sudoku = {
                {9, 8, 2, 5, 7, 4, 6, 1, 3},
                {5, 6, 1, -2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 9},
                {6, 9, 8, 4, 3, 7, -2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, -4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, -5, 0, 0, 0},
                {7, 5, 6, 3, 1, 2, 0, 0, -4}};
        int line = 8;
        int column = 6;
        int[][] expected = {
                {9, 8, 2, 5, 7, 4, 6, 1, 3},
                {5, 6, 1, -2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 9},
                {6, 9, 8, 4, 3, 7, -2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, -4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, 0, 0, 0, 0},
                {7, 5, 6, 3, 1, 2, 0, 0, -4}};
        //Act
        int[][] result = Exercicio22.removeANumberFromTheGame(sudoku,line,column);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void removeANumberFromTheGame_RemoveNumberZero() {
        //Arrange
        int[][] sudoku = {
                {9, 8, 2, 5, 7, 4, 6, 1, 3},
                {5, 6, 1, -2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 9},
                {6, 9, 8, 4, 3, 7, -2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, -4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, -5, 0, 0, 0},
                {7, 5, 6, 3, 1, 2, 0, 0, -4}};
        int line = 9;
        int column = 8;
        //Act
        int[][] result = Exercicio22.removeANumberFromTheGame(sudoku,line,column);
        //Assert
        assertNull(result);
    }

    @Test
    void removeANumberFromTheGame_LineGivenIs10() {
        //Arrange
        int[][] sudoku = {
                {9, 8, 2, 5, 7, 4, 6, 1, 3},
                {5, 6, 1, -2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 9},
                {6, 9, 8, 4, 3, 7, -2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, -4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, -5, 0, 0, 0},
                {7, 5, 6, 3, 1, 2, 0, 0, -4}};
        int line = 10;
        int column = 6;
        //Act
        int[][] result = Exercicio22.removeANumberFromTheGame(sudoku,line,column);
        //Assert
        assertNull(result);
    }

    @Test
    void removeANumberFromTheGame_LineGivenIs9() {
        //Arrange
        int[][] sudoku = {
                {9, 8, 2, 5, 7, 4, 6, 1, 3},
                {5, 6, 1, -2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 9},
                {6, 9, 8, 4, 3, 7, -2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, -4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, -5, 0, 0, 0},
                {7, 5, 6, 3, 1, -2, 0, 0, -4}};
        int line = 9;
        int column = 6;
        int[][] expected = {
                {9, 8, 2, 5, 7, 4, 6, 1, 3},
                {5, 6, 1, -2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 9},
                {6, 9, 8, 4, 3, 7, -2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, -4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, -5, 0, 0, 0},
                {7, 5, 6, 3, 1, 0, 0, 0, -4}};
        //Act
        int[][] result = Exercicio22.removeANumberFromTheGame(sudoku,line,column);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void removeANumberFromTheGame_LineGivenIs0() {
        //Arrange
        int[][] sudoku = {
                {9, 8, 2, 5, 7, 4, 6, 1, 3},
                {5, 6, 1, -2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 9},
                {6, 9, 8, 4, 3, 7, -2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, -4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, -5, 0, 0, 0},
                {7, 5, 6, 3, 1, -2, 0, 0, -4}};
        int line = 0;
        int column = 6;
        //Act
        int[][] result = Exercicio22.removeANumberFromTheGame(sudoku,line,column);
        //Assert
        assertNull(result);
    }

    @Test
    void removeANumberFromTheGame_ColumnGivenIs10() {
        //Arrange
        int[][] sudoku = {
                {9, 8, 2, 5, 7, 4, 6, 1, 3},
                {5, 6, 1, -2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 9},
                {6, 9, 8, 4, 3, 7, -2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, -4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, -5, 0, 0, 0},
                {7, 5, 6, 3, 1, 2, 0, 0, -4}};
        int line = 7;
        int column = 10;
        //Act
        int[][] result = Exercicio22.removeANumberFromTheGame(sudoku,line,column);
        //Assert
        assertNull(result);
    }

    @Test
    void removeANumberFromTheGame_ColumnGivenIs0() {
        //Arrange
        int[][] sudoku = {
                {9, 8, 2, 5, 7, 4, 6, 1, 3},
                {5, 6, 1, -2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 9},
                {6, 9, 8, 4, 3, 7, -2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, -4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, -5, 0, 0, 0},
                {7, 5, 6, 3, 1, 2, 0, 0, -4}};
        int line = 7;
        int column = 0;
        //Act
        int[][] result = Exercicio22.removeANumberFromTheGame(sudoku,line,column);
        //Assert
        assertNull(result);
    }

    @Test
    void removeANumberFromTheGame_ColumnGivenIs9() {
        //Arrange
        int[][] sudoku = {
                {9, 8, 2, 5, 7, 4, 6, 1, 3},
                {5, 6, 1, -2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 9},
                {6, 9, 8, 4, 3, 7, -2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, -4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, -5, 0, 0, 0},
                {7, 5, 6, 3, 1, 2, 0, 0, -4}};
        int line = 9;
        int column = 9;
        int[][] expected = {
                {9, 8, 2, 5, 7, 4, 6, 1, 3},
                {5, 6, 1, -2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 9},
                {6, 9, 8, 4, 3, 7, -2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, -4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, -5, 0, 0, 0},
                {7, 5, 6, 3, 1, 2, 0, 0, 0}};
        //Act
        int[][] result = Exercicio22.removeANumberFromTheGame(sudoku,line,column);
        //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void removeANumberFromTheGame_MatrixNotValid() {
        //Arrange
        int[][] sudoku = {
                {9, 8, 2, 5, 7, 4, 6, 1, 3},
                {5, 6, 1, -2, 9, 3, 4, 7, 8},
                {3, 4, 7, 1, 6, 8, 5, 2, 9},
                {6, 9, 8, 4, 3, 7, -2, 5, 1},
                {1, 7, 5, 8, 2, 9, 3, 4, 6},
                {2, 3, -4, 6, 5, 1, 9, 8, 7},
                {8, 2, 9, 7, 4, 6, 0, 0, 0},
                {4, 1, 3, 9, 8, -5, 0, 0, 0},
                {7, 5, 6, 3, 1, 2}};
        int line = 7;
        int column = 10;
        //Act
        int[][] result = Exercicio22.removeANumberFromTheGame(sudoku,line,column);
        //Assert
        assertNull(result);
    }

    @Test
    void isGameFinished() {
        //Arrange
        int[][] sudoku = {
                {-9, 8, -2, 5, 7, 4, 6, 1, -3},
                {-5, 6, 1, 2, 9, -3, -4, 7, 8},
                {3, 4, -7, 1, -6, 8, 5, -2, 9},
                {-6, 9, -8, 4, 3, 7, -2, 5, 1},
                {1, -7, 5, -8, 2, 9, 3, -4, 6},
                {-2, 3, 4, -6, 5, 1, 9, 8, -7},
                {8, 2, -9, 7, -4, -6, 1, 3, 5},
                {4, -1, 3, 9, 8, -5, 7, 6, -2},
                {-7, 5, 6, -3, 1, -2, 8, 9, 4}};
        //Act
        boolean result = Exercicio22.isGameFinished(sudoku);
        //Assert
        assertTrue(result);
    }

    @Test
    void isGameFinished_ZeroInLine5Column4() {
        //Arrange
        int[][] sudoku = {
                {-9, 8, -2, 5, 7, 4, 6, 1, -3},
                {-5, 6, 1, 2, 9, -3, -4, 7, 8},
                {3, 4, -7, 1, -6, 8, 5, -2, 9},
                {-6, 9, -8, 4, 3, 7, -2, 5, 1},
                {1, -7, 5, 0, 2, 9, 3, -4, 6},
                {-2, 3, 4, -6, 5, 1, 9, 8, -7},
                {8, 2, -9, 7, -4, -6, 1, 3, 5},
                {4, -1, 3, 9, 8, -5, 7, 6, -2},
                {-7, 5, 6, -3, 1, -2, 8, 9, 4}};
        //Act
        boolean result = Exercicio22.isGameFinished(sudoku);
        //Assert
        assertFalse(result);
    }

    @Test
    void isGameFinished_Number8AppearsTwiceInColumn4() {
        //Arrange
        int[][] sudoku = {
                {-9, 8, -2, 5, 7, 4, 6, 1, -3},
                {-5, 6, 1, 2, 9, -3, -4, 7, 8},
                {3, 4, -7, 1, -6, 8, 5, -2, 9},
                {-6, 9, -8, 4, 3, 7, -2, 5, 1},
                {1, -7, 5, -8, 2, 9, 3, -4, 6},
                {-2, 3, 4, -6, 5, 1, 9, 8, -7},
                {8, 2, -9, 7, -4, -6, 1, 3, 5},
                {4, -1, 3, 9, 8, -5, 7, 6, -2},
                {-7, 5, 6, -8, 1, -2, 8, 9, 4}};
        //Act
        boolean result = Exercicio22.isGameFinished(sudoku);
        //Assert
        assertFalse(result);
    }

    @Test
    void isGameFinished_Number8AppearsTwiceInLine4() {
        //Arrange
        int[][] sudoku = {
                {-9, 8, -2, 5, 7, 4, 6, 1, -3},
                {-5, 6, 1, 2, 9, -3, -4, 7, 8},
                {3, 4, -7, 1, -6, 8, 5, -2, 9},
                {-6, 9, -8, 4, 3, 7, -8, 5, 1},
                {1, -7, 5, -8, 2, 9, 3, -4, 6},
                {-2, 3, 4, -6, 5, 1, 9, 8, -7},
                {8, 2, -9, 7, -4, -6, 1, 3, 5},
                {4, -1, 3, 9, 8, -5, 7, 6, -2},
                {-7, 5, 6, 3, 1, -2, 8, 9, 4}};
        //Act
        boolean result = Exercicio22.isGameFinished(sudoku);
        //Assert
        assertFalse(result);
    }

    @Test
    void isGameFinished_FalseIrregularMatrix() {
        //Arrange
        int[][] sudoku = {
                {-9, 8, -2, 5, 7, 4, 6, 1},
                {-5, 6, 1, 2, 9, -3, -4, 7, 8},
                {3, 4, -7, 1, -6, 8, 5, -2, 9},
                {-6, 9, -8, 4, 3, 7, -2, 5, 1},
                {1, -7, 5, -8, 2, 9, 3, -4, 6},
                {-2, 3, 4, -6, 5, 1, 9, 8, -7},
                {8, 2, -9, 7, -4, -6, 1, 3, 5},
                {4, -1, 3, 9, 8, -5, 7, 6, -2},
                {-7, 5, 6, -3, 1, -2, 8, 9, 4}};
        //Act
        boolean result = Exercicio22.isGameFinished(sudoku);
        //Assert
        assertFalse(result);
    }
}