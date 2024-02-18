package pt.ipp.isep.dei.examples.basic.domain.Bloco5.Sudoku;

public class SudokuEngine {
    private SudokuGen game;

    // the user interacts by imputting a difficulty to start the game, and each subsequent input will have an "action" type
    // and coordinates and possibly a number
    public SudokuEngine(int difficulty){
        this.game = new SudokuGen(difficulty);
    }

    public String sudokuEngine (int num, int y, int x, String action){
        while (!this.game.isGameComplete()){
            // read user input
            if (action.equals("remove")){
                game.remove(y,x);
                System.out.println("Removed successfuly");
            } else if (action.equals("add")){
                game.insert(num,y,x);
                System.out.println("Added successfuly");
            } else {
                System.out.println("input incorrect");
            }
        }
        return "The game is over";
        // we need a interface (front-end?) that communicates the inputs into variables that the program understands,
        // which in turn will call methods from the class SudokuEngine.
    }
}