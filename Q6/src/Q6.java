// Q6 Assignment
// Author: Habeeb Mohammed
// Date:   12/11/2015
// Class:  CS160
// Email:  habeeb@cs.colostate.edu
import java.util.*;
import java.io.*;

public class Q6 implements QuizInterface{
	public static int numberLines = 0;
	public static int numberChars = 0;
	public static int numberLower = 0;
	public static int numberUpper = 0;
	public static int numberDigits = 0;
	public static String[] fileContents;
	public static double[] testArray = new double[]{1.2,2.3,3.4,4.5,5.6,6.7,7.8,8.9};
	
	public static void main(String[] args) {
		Q6 q6 = new Q6();
	    q6.readFile(args[0]);
	    q6.computeStatistics(fileContents);
	    q6.printStatistics();
	    q6.writeFile(args[1], fileContents);
	        
	    System.out.println("Array = " + Arrays.toString(testArray));
	    System.out.println("Smallest value = " + q6.findSmallest(testArray));
	}

	public void readFile(String filename) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File(filename));
			numberLines = sc.nextInt();
			sc.nextLine();
			fileContents = new String[numberLines];
			for(int i=0;i<numberLines;i++){
				fileContents[i] = sc.nextLine();
			}
		} 
	
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

	public void computeStatistics(String[] strings) {
		// TODO Auto-generated method stub
		for(int i=0;i<strings.length;i++){
			numberChars += strings[i].length();
			for(int j=0;j<strings[i].length();j++){
				if(Character.isUpperCase(strings[i].charAt(j))){
					numberUpper++;
				}
				else if(Character.isLowerCase(strings[i].charAt(j))){
					numberLower ++;
				}
				if(Character.isDigit(strings[i].charAt(j))){
					numberDigits++;
				}
			}
		}
	}

	public void printStatistics() {
		System.out.println("Number of lines: " + numberLines);
		System.out.println("Number of characters: " + numberChars);
		System.out.println("Number of uppercase letters: " + numberUpper);
		System.out.println("Number of lowercase letters: " + numberLower);
		System.out.println("Number of digits: " + numberDigits);
		}

	public void writeFile(String filename, String[] strings) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File(filename));
			for(int i=0;i<strings.length;i++){
				pw.println(i+1 + ": " + strings[i]);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.close();
	}

	public double findSmallest(double[] values) {
		double smallest = values[0];
		double largest = values[0];
		
		for(int i=0;i<values.length;i++){
			if(values[i]>values[0])
				largest = values[i];
			else if(values[i]<values[0])
				smallest = values[i];
		}
		return smallest;
	}

}
