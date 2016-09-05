import java.util.*;
import java.io.*;
// P_ Assignment
// Author: Habeeb Mohammed
// Date:   x/xx/xxxx
// Class:  CS160
// Email:  habeeb@cs.colostate.edu
public class R15 {

	public static void main(String[] args) {
		/*
		// Example of reading a file
		try {
			// make sure TA explains this line and the try/catch block
			Scanner fileReader = new Scanner(new File(args[0]));
			
			// Examples: (not meant to be run as a program)
			String example1a = fileReader.next();
			String example1b = fileReader.nextLine();
			double example2 = fileReader.nextDouble();
			int example3 = fileReader.nextInt();
			char example4 = fileReader.next().charAt(0);
			
			if (fileReader.hasNext()) {
				// I can grab a string token safely
				String example5 = fileReader.next();
			}
			
			if (fileReader.hasNextDouble()) {
				// I can grab a double safely
				double example6 = fileReader.nextDouble();
			}
			
			if (fileReader.hasNextInt()) {
				// I can grab a int safely
				int example7 = fileReader.nextInt();
			}
			
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("ERROR!");
			System.exit(0);
		}


		// Example of writing to a file
		try {
			// make sure TA explains this line and the try/catch block
			PrintWriter fileOutput = new PrintWriter(new File(args[1]));
			
			// Examples:
			fileOutput.println("Hey...");
			fileOutput.print("I've seen...");
			fileOutput.print("this stuff before.\n");
			fileOutput.printf("%.3f\n", 3.456789);
			
			// Important! Save the file
			fileOutput.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("ERROR!");
			System.exit(0);
		}
		*/
		readFile(args[0]);
		writeFile(args[1]);
	}
	public static void readFile( String inputFile ){ 
		try {
			Scanner fileReader = new Scanner(new File(inputFile));
			String s = fileReader.nextLine();
			String t = fileReader.next();
			
			double d = fileReader.nextDouble();
			int x = -1;
			if(fileReader.hasNextInt())
				x = fileReader.nextInt();
			fileReader.close();
			
	
			
		} catch (FileNotFoundException e) {
			System.out.println("nooo");
			e.printStackTrace();
		}
		
		
	}
	public static void writeFile( String outputFile ){ 
		
		try {
			Scanner userInput = new Scanner(System.in);
			PrintWriter fileOutput = new PrintWriter(new File(outputFile));
			
			
				}
			
				
			
		
			catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

