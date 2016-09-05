// P3 Assignment
// Author: Habeeb Mohammed
// 9/14/2015
// Class: CS160
// Email: habeeb@cs.colostate.edu
import java.util.Scanner;
public class P3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double  assign0,
				assign1,
				assign2,
				assign3,
				lab0,
				lab1,
				lab2,
				exam0,
				exam1,
				assignAverage,
				labAverage,
				examAverage,
				classGrade;
			
		System.out.print("First assignment: ");
		assign0 = keyboard.nextDouble();
		System.out.print("Second assignment: ");
		assign1 = keyboard.nextDouble();
		System.out.print("Third assignment: ");
		assign2 = keyboard.nextDouble();
		System.out.print("First lab: ");
		lab0 = keyboard.nextDouble();
		System.out.print("Second lab: ");
		lab1 = keyboard.nextDouble();
		System.out.print("Third lab: ");
		lab2 = keyboard.nextDouble();
		System.out.print("First exam: ");
		exam0 = keyboard.nextDouble();
		System.out.print("Second exam: ");
		exam1 = keyboard.nextDouble();
		
		assignAverage = (assign0+assign1+assign2+assign3)/4;
		labAverage = (lab0+lab1+lab2)/3;
		examAverage = (exam0+exam1)/2;
		grade = ((assignAverage*.25)+(labAverage*.15)+(examAverage*.6);
		
		System.out.println("Assignment average: " + assignAverage);
		System.out.println("Lab average: " + labAverage);
		System.out.println("Exam average: " + examAverage);
		//System.out
		
	
		
				
				

	}

}
