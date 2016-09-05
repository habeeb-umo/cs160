// P_ Assignment
// Author: Habeeb Mohammed
// Date:   x/xx/xxxx
// Class:  CS160
// Email:  habeeb@cs.colostate.edu
import java.util.*;
import java.io.*;
public class Q7 implements QuizInterface {
	public static String[] myTokens;
	public static double[] myDoubles = new double[8];
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Q7 q7 = new Q7();
        q7.readFile(args[0]);
        System.out.println("Number of Tokens: " + myTokens.length);
        int frequency = q7.charFrequency(myTokens, 'e');
        System.out.println("Character Frequency " + frequency); 
        q7.initializeArray(myDoubles);
        System.out.println("Array: " + Arrays.toString(myDoubles));
        double sum = q7.sumRange(myDoubles, 3, 6);
        System.out.println("Sum: " + sum); 
	}

	@Override
	public void readFile(String filename) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File(filename));
			int numberTokens = sc.nextInt();
			myTokens = new String[numberTokens];
			sc.nextLine();
			for(int i=0;i<numberTokens;i++){
				myTokens[i] = sc.next();
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public int charFrequency(String[] strings, char match) {
		int count = 0;
		for(int i=0;i<strings.length;i++){
			for(int j=0;j<strings[i].length();j++){
				if(strings[i].charAt(j) == match){
					count++;
				}
			}
		}
		return count;
	}

	@Override
	public void initializeArray(double[] values) {
		for(int i=0;i<values.length;i++){
			values[i] = Math.pow(i, 3);
		}
		
	}

	@Override
	public double sumRange(double[] values, int low, int high) {
		double sum = 0.0;
		for(int i=low;i<values.length;i++){
			if((values[i]<=values[high]) && (values[i]>=values[low])){
				sum += values[i];
			}
		}
		return sum;
	}

}
