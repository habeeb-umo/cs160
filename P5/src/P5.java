// P5 Assignment
// Author: Habeeb Mohammed
// Date:   10/05/2015
// Class:  CS160
// Email:  habeeb@cs.colostate.edu
import java.util.*;
import java.lang.*;
public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //Preliminary testing
	    printPrimes(1, 50);
	    System.out.println(removeVowels("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
	    double result = evaluateExponent(2.0,16);
	    System.out.println("2.0 to the 16 = " + result);
	    computeStatistics(-1);
	
	}
	// Method to check whether an integer is prime.
	public static boolean isPrime(int number) {

	    for(int i=2;i<=number/2;i++)
	        if(number%i==0)
	            return false;
	    return true;
	}

	// Method to print primes in a specified range
	public static void printPrimes(int start, int end) {
		for(int i = start; i <= end; i++) {
			if(isPrime(i) == true) {
				System.out.print(i + ", ");
			}
			
		}
	    System.out.println();	
	}

	// Method to remove vowels from a string
	public static String removeVowels(String input) {
		String s = "";
		//String vowels = "AEIOUaeiou";

		
		
		for(int idx = 0; idx < input.length(); idx++) {
			if(input.charAt(idx) != 'a' && input.charAt(idx) != 'e' && input.charAt(idx) != 'i' && input.charAt(idx) != 'o' 
				&& input.charAt(idx) != 'u' && input.charAt(idx) != 'A' && input.charAt(idx) != 'E' && input.charAt(idx) != 'I'
				&& input.charAt(idx) != 'O' && input.charAt(idx) != 'U') {
				s += input.charAt(idx);
			}
			else {
				
			}
		}
			return s;
		
	}

	// Method to generate and print the value of a number raised to an exponent
	public static double evaluateExponent(double number, int exponent) {
	    double result = 1.0;
	    int loop = 0;
	    if(exponent == 0)
		return result;
	    do{
	    	result *= number;
	    	 loop++;
	    } while(loop != exponent);
	    return result;
	    
	    	
	    		
	}

	// Method to find and print the minimum/maximum/mean of a set of positive numbers
	public static void computeStatistics(int sentinel) {
	    Scanner sc = new Scanner(System.in);
	    int value = 0,
	    	count = 0,
	    	sum = 0;
	    double mean = 0.0;
	    int minimum = Integer.MAX_VALUE,
	    	maximum = Integer.MIN_VALUE;
	    while(2 != 1){
	    	value = sc.nextInt();
	    	if(value == sentinel){
	    		break;
	    	}
	    	else if(value < minimum){
	    		minimum = value;
	    		
	    	}
	    	else if(value > maximum){
	    		maximum = value;
	    		
	    	}
	    	sum += value;
	    	count++;
	    	
	    }
	    mean = sum / count;
	    System.out.println("Count: " + count);
	    System.out.println("Average: " + mean);
	    System.out.println("Maximum: " + maximum);
	    System.out.println("Minimum: " + minimum);
}
}
