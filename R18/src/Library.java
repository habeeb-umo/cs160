import java.util.*;
import java.io.*;
// P_ Assignment
// Author: Habeeb Mohammed
// Date:   x/xx/xxxx
// Class:  CS160
// Email:  habeeb@cs.colostate.edu
public class Library {

	public static Music[] arrayTitles;
	
	public static void readLibrary(String inputFile){
		try {
			Scanner sc = new Scanner(new File(inputFile));
			String title = sc.nextLine();
			//int numTitles = sc.nextInt();
			System.out.println(title);
//			for(int i=0;i<inputFile.length();i++){
//				sc.nextLine();
//			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		}
	
	}
	
	

public static void main(String[] args) {
	readLibrary(args[0]);

	}
}
