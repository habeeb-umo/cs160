import java.util.Arrays;
import java.util.*;

// Q4 Assignment
// Author: Habeeb Mohammed
// Date:   10/29/2015
// Class:  CS160
// Email:  habeeb@cs.colostate.edu
public class Q4 {

	public static double [] decimals = {1.01,2.02,3.03,4.04,5.05};
	public static void main(String[] args) {
	System.out.println(frequency(decimals,5.05));
	

	}
	public static int [] numbers = {11,321,4716,6,32768,981};
	
	public static String [] names = {"Computer","Science","is","challenging!"};
	
	public static void arrayStuff(int [] numbers){
		System.out.println(numbers.length);
		System.out.println(numbers[1]);
		System.out.println(Arrays.toString(numbers));
		numbers[2] = 444;
		System.out.println(Arrays.toString(numbers));
		numbers[numbers.length-1] = 11111;
		System.out.println(Arrays.toString(numbers));
		numbers[numbers.length-2] = 24;
		System.out.println(Arrays.toString(numbers));
	}
	public static int frequency(double[] dArray, double dValue){
		int counter = 0;
		for(int i=0; i<dArray.length;i++){
			/*for(int j=0; j < dArray[i]; j++){
				if(dValue == dArray[i]){
					counter++;
				}
			}*/
			if(dValue == dArray[i]) {
				counter++;
			}
		}
		return counter;
	}
	public static double[] squareRoot(int[] iArray){
		double[] dArray = new double[iArray.length];
		for(int i=0;i<iArray.length;i++){
			dArray[i] = iArray[(int) Math.sqrt(i)];
		}
		
		return dArray;
		
	}
	public static int countChars(String[] sArray){
		int counter = 0;
		for(int i=0;i<sArray.length;i++){
			for(int j=0;j < sArray[i].length();j++){
				counter++;
				
			}
			
		}
		return counter;
	}
}
