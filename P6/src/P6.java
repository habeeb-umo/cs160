// P_ Assignment
// Author: Habeeb Mohammed
// Date:   x/xx/xxxx
// Class:  CS160
// Email:  habeeb@cs.colostate.edu
public class P6 {

	

			// Class variables
			public static Maze maze;
			public static int mazeWidth;
			public static int mazeHeight;
			public static boolean onEdge;
			public static boolean offGrid;
			public static int loopLeft;
			public static void main(String[] args) {

				// Create maze
				String fileName = args[0];
				System.err.println("Maze name: " + fileName);

				// Get dimensions
				maze = new Maze(fileName);
				mazeWidth = maze.getWidth();
				mazeHeight = maze.getHeight();
				System.err.println("Maze width: " + mazeWidth);
				System.err.println("Maze height: " + mazeHeight);
				onEdge = onEdge();
				offGrid = offGrid();
				
				if(maze.getColumn() == 0){
					loopLeft();
				}
				if(maze.getColumn() == 5){
					loopRight();
				}
				if(maze.getRow() == 0){
					loopUp();
				}
				if(maze.getRow() == 5){
					loopDown();
					
					
				}
				if(onEdge == false){
					loopLeft();
				}
				
				if(onEdge == true){
					System.exit(0);
				}
				
				// Add code to move around maze
				
				
				
			}
			
			
			public static boolean onEdge() {
				if((maze.getRow() == 5 || maze.getRow() == 0) || 
				   (maze.getColumn() == 5 || maze.getColumn() == 0))
					return true;
					
				return onEdge;
			}
			public static boolean offGrid() {
				if((maze.getRow() > 5 || maze.getRow() < 0) || 
				   (maze.getColumn() > 5 || maze.getColumn() < 0))
					return true;
				return offGrid;
				
				
			}
			public static void loopUp(){
				while(maze.getRow() == 5) {
					maze.moveRight();
					if(maze.getColumn() < 0 || maze.getColumn() > 5){
						break;
					}
				}
			}
			public static void loopDown(){
				while(maze.getRow() == 0){
					maze.moveLeft();
					if(maze.getColumn() < 0 || maze.getColumn() > 5){
						break;
					}
				}
				
			}
			public static void loopRight(){
				while(maze.getColumn() == 5){
					maze.moveDown();
					if(maze.getRow() < 0 || maze.getRow() > 5){
						break;
					}
				}
				
			}
			public static void loopLeft(){
				while(maze.getColumn() == 0){
					maze.moveUp();
					if(maze.getRow() < 0 || maze.getRow() > 5){
						break;
					}
				}
			}
}
			
			
			
				
			
			






