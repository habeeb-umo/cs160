import java.util.Arrays;

// P_ Assignment
// Author: Habeeb Mohammed
// Date:   x/xx/xxxx
// Class:  CS160
// Email:  habeeb@cs.colostate.edu
public class R11 {

	public static void main(String[] args) {
		double [] grades = {81.2,92.5,48.9,78.8};
		int [] numbers = {12,42,33,67,92,58};
		String [] arguments = new String [9];
		System.out.println(grades.length);
		System.out.println(numbers.length);
		System.out.println(arguments.length);
		System.out.println(grades[3]);
		System.out.println(grades[1]);
		System.out.println(numbers[2]);
		numbers[0] = 99;
		grades[3] = 90.5;
		arguments[6] = "HelloThere";
		
		for(int i=0; i<grades.length;i++){
			System.out.print(grades[i] + ",");
		}
		System.out.println();
		for(int i=0; i<grades.length;i++){
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		for(int i=0; i<grades.length;i++){
			System.out.print(arguments[i] + "_");
		}
		
		System.out.println(Arrays.toString(grades));
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(arguments));
		System.out.printf("%.3f",arrayAverage(grades));
	}


public static double arrayAverage(double[] input){
	double mean = 0;
	for(int i=0;i<input.length;i++){
		mean = (mean + input[i]);
	}
	mean = mean / input.length;
	return mean;
	
}
}