package pt.ipp.isep.dei.examples.basic.domain.Bloco4Test;
import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio11;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio21;

import static org.junit.jupiter.api.Assertions.*;


class Exercicio21Test {
    //A)

    @Test
    void showMaskMat(){
        new Exercicio21();
        //Arrange 
        char[][] mat = {
                {'a','b','c'},
                {'b','a','c'},
                {'a','b','a'},

        };
        int[][] expected = {
                {1, 0, 0},
                {0, 1, 0},
                {1, 0, 1}
        };
        //Act
        int[][] result = Exercicio21.maskMat('a',mat);
        //Assert
        assertArrayEquals(expected,result);
    }
    @Test
    void showMaskMatNoCorrespondentChar(){
        //Arrange
        char[][] mat = {
                {'a','b','c'},
                {'b','a','c'},
                {'a','b','a'},

        };
        int[][] expected = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        //Act
        int[][] result = Exercicio21.maskMat('k',mat);
        //Assert
        assertArrayEquals(expected,result);
    }
    @Test
    void showMaskNotSquareMat(){
        //Arrange
        char[][] mat = {
                {'a','b','c'},
                {'b','a','c'},
        };
        int[][] expected = {
                {-1},
                {-1}
        };
        //Act
        int[][] result = Exercicio21.maskMat('a',mat);

       //Assert
        assertArrayEquals(expected,result);
    }

    @Test
    void showMaskEmptyMat(){
        //Arrange
        char[][] mat = new char[0][0];

        int[][] expected = {
                {-1},
                {-1}
        };

        //Act
        int[][] result = Exercicio21.maskMat('a',mat);

        //Assert
        assertArrayEquals(expected,result);
    }

    //-----------------------------------------------------------------------------------------------------

    //b)

    @Test
    void resultHorizontalRight(){
        //Arrange
        char[][] mat = {
                {'c','p','l','l','c'},
                {'9','r','i','l','m'},
                {'O','r','a','9','o'},
                {'c','r','a','v','o'},
                {'i','9','c','r','o'},
        };
        char[] word = {'c','r','a','v','o'};

        //Act
       boolean result = Exercicio21.wordExists(word,mat);

       //Assert
        assertTrue(result);
    }


    @Test
    void resultHorizontalRightIndividualFunction(){
        //Arrange
        char[][] mat = {
                {'c','p','l','l','c'},
                {'9','r','i','l','m'},
                {'O','r','a','9','o'},
                {'c','r','a','v','o'},
                {'i','9','c','r','o'},
        };
        char[] word = {'c','r','a','v','o'};
        int i = 3;
        int j = 0;

        //Act
        boolean result = Exercicio21.horizontalRight(mat,word,i,j);
        //Assert
        assertTrue(result);
    }

    @Test
    void resultHorizontalLeft(){
        //Arrange
        char[][] mat = {
                {'o','v','a','r','c'},
                {'m','r','i','l','m'},
                {'k','l','a','u','o'},
                {'c','o','l','t','y'},
                {'i','9','c','u','o'},
        };
        char[] word = {'c','r','a','v','o'};

        //Act
        boolean result = Exercicio21.wordExists(word,mat);

        //Assert
        assertTrue(result);
    }

    @Test
    void resultHorizontalLeftIndividualFunction(){
        //Arrange
        char[][] mat = {
                {'o','v','a','r','c'},
                {'m','r','i','l','m'},
                {'k','l','a','u','o'},
                {'c','o','l','t','y'},
                {'i','9','c','u','o'},
        };
        char[] word = {'c','r','a','v','o'};
        int i = 0;
        int j = 4;

        //Act
        boolean result = Exercicio21.horizontalLeft(mat,word,i,j);

        //Assert
        assertTrue(result);
    }



    @Test
    void resultVerticalUp(){
        //Arrange
        char[][] mat = {
                {'o','v','a','r','o'},
                {'m','r','i','l','v'},
                {'k','r','a','u','a'},
                {'c','o','l','t','r'},
                {'i','9','c','r','c'},
        };
        char[] word = {'c','r','a','v','o'};

        //Act
        boolean result = Exercicio21.wordExists(word,mat);

        //Assert
        assertTrue(result);
    }

    @Test
    void resultVerticalUpIndividualFunction(){
        //Arrange
        char[][] mat = {
                {'o','v','a','r','o'},
                {'m','r','i','l','v'},
                {'k','r','a','u','a'},
                {'c','o','l','t','r'},
                {'i','9','c','r','c'},
        };
        char[] word = {'c','r','a','v','o'};
        int i = 4;
        int j = 4;


        //Act
        boolean result = Exercicio21.verticalUp(mat,word,i,j);

        //Assert
        assertTrue(result);
    }

    @Test
    void resultVerticalDown(){
        //Arrange
        char[][] mat = {
                {'o','t','u','k','c'},
                {'m','r','i','l','r'},
                {'k','k','a','u','a'},
                {'c','o','l','t','v'},
                {'i','9','k','o','o'},
        };
        char[] word = {'c','r','a','v','o'};

        //Act
        boolean result = Exercicio21.wordExists(word,mat);

        //Assert
        assertTrue(result);
    }

    @Test
    void resultVerticalDownIndividualFunction(){
        //Arrange
        char[][] mat = {
                {'o','t','u','k','c'},
                {'m','r','i','l','r'},
                {'k','k','a','u','a'},
                {'c','o','l','t','v'},
                {'i','9','k','o','o'},
        };
        char[] word = {'c','r','a','v','o'};
        int i = 0;
        int j = 4;

        //Act
        boolean result = Exercicio21.verticalDown(mat,word,i,j);

        //Assert
        assertTrue(result);
    }

    @Test
    void resultDiagonalUpRight(){
        //Arrange
        char[][] mat = {
                {'o','t','u','k','o'},
                {'m','l','i','v','l'},
                {'k','k','a','u','a'},
                {'c','r','l','t','h'},
                {'c','9','k','u','p'},
        };
        char[] word = {'c','r','a','v','o'};

        //Act
        boolean result = Exercicio21.wordExists(word,mat);

        //Assert
        assertTrue(result);
    }

    @Test
    void resultDiagonalUpRightIndividualFunction(){
        //Arrange
        char[][] mat = {
                {'o','t','u','k','o'},
                {'m','l','i','v','l'},
                {'k','k','a','u','a'},
                {'c','r','l','t','h'},
                {'c','9','k','u','p'},
        };
        char[] word = {'c','r','a','v','o'};
        int i = 4;
        int j = 0;

        //Act
        boolean result = Exercicio21.diagonalUpperRight(mat,word,i,j);

        //Assert
        assertTrue(result);
    }
    @Test
    void resultDiagonalUpLeftIndividualFunction_False(){
        //Arrange
        char[][] mat = {
                {'u','t','u','k','o'},
                {'m','v','i','u','l'},
                {'k','k','a','u','a'},
                {'c','o','l','r','h'},
                {'l','9','k','u','c'},

        };
        char[] word = {'c','r','a','v','o'};
        int i = 4;
        int j = 4;

        //Act
        boolean result = Exercicio21.diagonalUpperLeft(mat,word,i,j);

        //Assert
        assertFalse(result);
    }

    @Test
    void resultDiagonalUpRightIndividualFunction_Falso(){
        //Arrange
        char[][] mat = {
                {'o','t','u','k','u'},
                {'m','l','i','v','l'},
                {'k','k','a','u','a'},
                {'c','r','l','t','h'},
                {'c','9','k','u','p'},
        };
        char[] word = {'c','r','a','v','o'};
        int i = 4;
        int j = 0;

        //Act
        boolean result = Exercicio21.diagonalUpperRight(mat,word,i,j);

        //Assert
        assertFalse(result);
    }



    @Test
    void resultDiagonalUpLeft(){
        //Arrange
        char[][] mat = {
                {'o','t','u','k','o'},
                {'m','v','i','u','l'},
                {'k','k','a','u','a'},
                {'c','o','l','r','h'},
                {'l','9','k','u','c'},
        };
        char[] word = {'c','r','a','v','o'};

        //Act
        boolean result = Exercicio21.wordExists(word,mat);

        //Assert
        assertTrue(result);
    }

    @Test
    void resultDiagonalUpLeftIndividualFunction(){
        //Arrange
        char[][] mat = {
                {'o','t','u','k','o'},
                {'m','v','i','u','l'},
                {'k','k','a','u','a'},
                {'c','o','l','r','h'},
                {'l','9','k','u','c'},

        };
        char[] word = {'c','r','a','v','o'};
        int i = 4;
        int j = 4;

        //Act
        boolean result = Exercicio21.diagonalUpperLeft(mat,word,i,j);

        //Assert
        assertTrue(result);
    }

    @Test
    void resultDiagonalDownRight(){
        //Arrange
        char[][] mat = {
                {'c','k','k','r','c'},
                {'m','r','i','l','m'},
                {'k','l','a','u','o'},
                {'c','o','l','v','y'},
                {'i','9','c','r','o'},
        };
        char[] word = {'c','r','a','v','o'};

        //Act
        boolean result = Exercicio21.wordExists(word,mat);

        //Assert
        assertTrue(result);
    }

    @Test
    void resultDiagonalDownRightIndividualFunction(){
        //Arrange
        char[][] mat = {
                {'c','k','k','r','c'},
                {'m','r','i','l','m'},
                {'k','l','a','u','o'},
                {'c','o','l','v','y'},
                {'i','9','c','r','o'},

        };
        char[] word = {'c','r','a','v','o'};
        int i = 0;
        int j = 0;

        //Act
        boolean result = Exercicio21.diagonalDownRight(mat,word,i,j);

        //Assert
        assertTrue(result);
    }

    @Test
    void resultDiagonalDownLeft(){
        //Arrange
        char[][] mat = {
                {'l','y','a','r','c'},
                {'m','r','i','r','m'},
                {'k','r','a','u','o'},
                {'c','v','l','t','y'},
                {'o','9','c','r','b'},
        };
        char[] word = {'c','r','a','v','o'};

        //Act
        boolean result = Exercicio21.wordExists(word,mat);

        //Assert
        assertTrue(result);
    }

    @Test
    void resultDiagonalDownLeftIndividualFunction(){
        //Arrange
        char[][] mat = {
                {'l','y','a','r','c'},
                {'m','r','i','r','m'},
                {'k','r','a','u','o'},
                {'c','v','l','t','y'},
                {'o','9','c','r','b'},

        };
        char[] word = {'c','r','a','v','o'};
        int i = 0;
        int j = 4;

        //Act
        boolean result = Exercicio21.diagonalDownLeft(mat,word,i,j);

        //Assert
        assertTrue(result);
    }

    @Test
    void resultNotSquareMatrix(){
        //Arrange
        char[][] mat = {
                {'l','y','a','r','c'},
                {'m','r','i','ç','m'},
                {'k','l','a','u','o'},
                {'c','v','l','t','y'},
                {'o','9','c','r','b'},
                {'o','9','c','r','b'},
        };
        char[] word = {'c','r','a','v','o'};

        //Act
        boolean result = Exercicio21.wordExists(word,mat);

        //Assert
        assertFalse(result);
    }

    @Test
    void resultNotWordFound(){
        //Arrange
        char[][] mat = {
                {'l','y','a','l','c'},
                {'m','f','i','ç','m'},
                {'k','l','o','u','o'},
                {'c','v','l','t','y'},
                {'o','9','c','w','b'},
        };
        char[] word = {'c','r','a','v','o'};

        //Act
        boolean result = Exercicio21.wordExists(word,mat);

        //Assert
        assertFalse(result);
    }

    @Test
    void resultNotWordFoundEmptyWordArray(){
        //Arrange
        char[][] mat = {
                {'l','y','a','l','c'},
                {'m','f','i','ç','m'},
                {'k','l','o','u','o'},
                {'c','v','l','t','y'},
                {'o','9','c','w','b'},
        };
        char[] word = {};

        //Act
        boolean result = Exercicio21.wordExists(word,mat);

        //Assert
        assertFalse(result);
    }

    @Test
    void emptySudokuMat(){
        //Arrange
        char[][] mat = {};
        char[] word = {'c','r','a','v','o'};

        //Act
        boolean result = Exercicio21.wordExists(word,mat);

        //Assert
        assertFalse(result);
    }

    @Test
    void emptySudokuMatAndEmptyWord(){
        //Arrange
        char[][] mat = {};
        char[] word = {};

        //Act
        boolean result = Exercicio21.wordExists(word,mat);

        //Assert
        assertFalse(result);
    }
    
    //C)

    @Test
    void isWordCompleteHorizontalRight(){
        //Arrange
        char[][] mat = {
                {'c','r','a','v','o'},
                {'0','v','p','v','m'},
                {'l','l','a','u','o'},
                {'v','r','ç','r','y'},
                {'c','9','c','u','c'},
        };
        char[] word = {'c','r','a','v','o'};
        int i = 0; int j = 0; int k = 0; int z = 4;
        //Act
        boolean result = Exercicio21.isWordComplete(mat,word,i,j,k,z);

        //Assert
        assertTrue(result);
    }

    @Test
    void isWordCompleteHorizontalLeft(){
        //Arrange
        char[][] mat = {
                {'c','r','a','v','c'},
                {'o','v','a','r','c'},
                {'l','l','a','u','o'},
                {'v','r','ç','r','y'},
                {'c','9','c','u','c'},
        };
        char[] word = {'c','r','a','v','o'};
        int i = 1; int j = 4; int k = 1; int z = 0;
        //Act
        boolean result = Exercicio21.isWordComplete(mat,word,i,j,k,z);

        //Assert
        assertTrue(result);
    }

    @Test
    void isWordCompleteVerticalDown(){
        //Arrange
        char[][] mat = {
                {'c','r','a','v','c'},
                {'r','v','a','r','c'},
                {'a','l','a','u','o'},
                {'v','r','ç','r','y'},
                {'o','9','c','u','c'},
        };
        char[] word = {'c','r','a','v','o'};
        int i = 0; int j = 0; int k = 4; int z = 0;
        //Act
        boolean result = Exercicio21.isWordComplete(mat,word,i,j,k,z);

        //Assert
        assertTrue(result);
    }

    @Test
    void isWordCompleteVerticalUpper(){
        //Arrange
        char[][] mat = {
                {'o','r','a','v','c'},
                {'v','v','a','r','c'},
                {'a','l','a','u','o'},
                {'r','r','ç','r','y'},
                {'c','9','c','u','c'},
        };
        char[] word = {'c','r','a','v','o'};
        int i = 4; int j = 0; int k = 0; int z = 0;
        //Act
        boolean result = Exercicio21.isWordComplete(mat,word,i,j,k,z);

        //Assert
        assertTrue(result);
    }

    @Test
    void isWordCompleteDiagonalDownRight(){
        //Arrange
        char[][] mat = {
                {'c','r','a','v','c'},
                {'v','r','a','r','c'},
                {'a','l','a','u','o'},
                {'r','v','ç','v','y'},
                {'o','9','c','u','o'},
        };
        char[] word = {'c','r','a','v','o'};
        int i = 0; int j = 0; int k = 4; int z = 4;
        //Act
        boolean result = Exercicio21.isWordComplete(mat,word,i,j,k,z);

        //Assert
        assertTrue(result);
    }

    @Test
    void isWordCompleteDiagonalDownLeft(){
        //Arrange
        char[][] mat = {
                {'c','r','a','v','c'},
                {'v','r','a','r','c'},
                {'a','l','a','u','o'},
                {'r','v','ç','v','y'},
                {'o','9','c','u','o'},
        };
        char[] word = {'c','r','a','v','o'};
        int i = 0; int j = 4; int k = 4; int z = 0;
        //Act
        boolean result = Exercicio21.isWordComplete(mat,word,i,j,k,z);

        //Assert
        assertTrue(result);
    }

    @Test
    void isWordCompleteDiagonalUpperRight(){
        //Arrange
        char[][] mat = {
                {'c','r','a','v','o'},
                {'v','r','a','v','c'},
                {'a','l','a','u','o'},
                {'r','r','ç','ç','y'},
                {'c','9','c','u','o'},
        };
        char[] word = {'c','r','a','v','o'};
        int i = 4; int j = 0; int k = 0; int z = 4;
        //Act
        boolean result = Exercicio21.isWordComplete(mat,word,i,j,k,z);

        //Assert
        assertTrue(result);
    }

    @Test
    void isWordCompleteDiagonalUpperLeft(){
        //Arrange
        char[][] mat = {
                {'o','r','a','v','c'},
                {'v','v','a','r','c'},
                {'a','l','a','u','o'},
                {'r','v','ç','r','y'},
                {'o','9','c','u','c'},
        };
        char[] word = {'c','r','a','v','o'};
        int i = 4; int j = 4; int k = 0; int z = 0;
        //Act
        boolean result = Exercicio21.isWordComplete(mat,word,i,j,k,z);

        //Assert
        assertTrue(result);
    }

    @Test
    void isWordCompleteInvalidValues() {
        //Arrange
        char[][] mat = {
                {'o', 'r', 'a', 'v', 'c'},
                {'v', 'v', 'a', 'r', 'c'},
                {'a', 'l', 'a', 'u', 'o'},
                {'r', 'v', 'ç', 'r', 'y'},
                {'o', '9', 'c', 'u', 'c'},
        };
        char[] word = {'c', 'r', 'a', 'v', 'o'};
        int i = -1;
        int j = 4;
        int k = 0;
        int z = 0; //i has negative value
        //Act
        boolean result = Exercicio21.isWordComplete(mat, word, i, j, k, z);

        //Assert
        assertFalse(result);
    }

    @Test
    void matIsNotSquare() {
        //Arrange
        char[][] mat = {
                {'i', 'r', 'h', 'v', 'c'},
                {'v', 'v', 'a', 'r', 'c'},
                {'a', 'l', 'u', 'u', 'o'},
                {'y', 't', 'ç', 'k', 'y'},
                {'o', 'j', 'c', 'u', 'l'},
        };
        char[] word = {'c', 'r', 'a', 'v', 'o'};
        int i = 0;
        int j = 0;
        int k = 0;
        int z = 4;
        //Act
        boolean result = Exercicio21.isWordComplete(mat, word, i, j, k, z);

        //Assert
        assertFalse(result);
    }

    //-------------------------------------------------------------------------------------

    @Test
    void fullMatrixMask() {
        //arrange
        char[] word = {'c', 'a', 'r'};
        char[][] matrix = {
                {'c', 'a', 'r', 'c', 'c', 'a'},
                {'a', 'a', 'c', 'c', 'c', 'a'},
                {'r', 'a', 'c', 'c', 'c', 'a'},
                {'c', 'c', 'a', 'r', 'c', 'a'},
                {'c', 'a', 'c', 'c', 'c', 'a'},
                {'c', 'a', 'c', 'c', 'c', 'a'}
        };
        int[][] expected = {
                {2, 1, 1, 0, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {2, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        //act
        int[][] result = Exercicio21.fullMatrixMask(word, matrix);
        //assert
        assertArrayEquals(expected, result);
    }

    @Test
    void intersectionCheck() {
        //arrange
        char[] word1 = {'c', 'a', 'r'};
        char[] word2 = {'c', 'a', 't'};
        char[][] matrix =  {
                {'c', 'a', 'r', 'c', 'c', 'a'},
                {'a', 'a', 'c', 'c', 'c', 'a'},
                {'t', 'a', 'c', 'c', 'c', 'a'},
                {'c', 'c', 'a', 'r', 'c', 'a'},
                {'c', 'a', 'c', 'c', 'c', 'a'},
                {'c', 'a', 'c', 'c', 'c', 'a'}
        };
        //act
        boolean result = Exercicio21.intersectionCheck(word1, word2, matrix);
        //assert
        assertTrue(result);
    }
    @Test
    void intersectionCheck_resultFalse() {
        //arrange
        char[] word1 = {'c', 'a', 'r'};
        char[] word2 = {'c', 'a', 't'};
        char[][] matrix =  {
                {'c', 'a', 'r', 'c', 'c', 'a'},
                {'o', 'a', 'c', 'c', 'c', 'a'},
                {'t', 'a', 'c', 'c', 'c', 'a'},
                {'c', 'c', 'a', 'r', 'c', 'a'},
                {'c', 'a', 'c', 'c', 'c', 'a'},
                {'c', 'a', 'c', 'c', 'c', 'a'}
        };
        //act
        boolean result = Exercicio21.intersectionCheck(word1, word2, matrix);
        //assert
        assertFalse(result);
    }

}
