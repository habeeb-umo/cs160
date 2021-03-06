// Squirrel.java - squirrel behavior in "Terriers and Squirrels"
// Author: Ethan Lambert
// Date: 11/6/2015
// Course: cs160

import java.lang.Math;

public class Squirrel implements AnimalInterface {

    //
    // DO NOT MODIFY BELOW 
    //
    private int currentRow;
    private int currentCol;
    private int previousRow = -1;
    private int previousCol = -1;
    private int closestRow;
    private int closestCol;
    private char[][] field;

    // Initializes position and field
    public Squirrel(int row, int col, char[][] field){
        this.currentRow = row;
        this.currentCol = col;
        this.field = field;
    }

    // Getters
    public int getCurrentRow(){ return currentRow; }
    public int getCurrentCol(){ return currentCol; }
    public int getPreviousRow(){ return previousRow; }
    public int getPreviousCol(){ return previousCol; }
    public int getClosestRow(){ return closestRow; }
    public int getClosestCol(){ return closestCol; }
    //
    // DO NOT MODIFY ABOVE 
    //
    GameEngine game = new GameEngine();
    // Find closest terrier
    public boolean isTerrier;
    public void findClosest(){
         // TO DO: Replace with code to find closest
    	for(int i=0;i<game.field.length;i++){
    		
    	}
         closestRow = -1;
         closestCol = -1;
         

    }
    
    // Move squirrel according to the rules
    public void moveAnimal() {

        eMove move;

        // Store previous position
        previousRow = currentRow;
        previousCol = currentCol;

        // TO DO: replace with code to select move (Step 1)
        move = eMove.RIGHT;

        // TO DO: replace with code to adjust move (Step 2)
        move = move;

        // TO DO: replace with code to make move (Step 3)
        currentCol++;
    }
    
    //
    // Private Methods, if you need them
    //
 
}
