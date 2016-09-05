// P_ Assignment
// Author: Habeeb Mohammed
// Date:   x/xx/xxxx
// Class:  CS160
// Email:  habeeb@cs.colostate.edu

	import java.util.Scanner;

	public class Q4 {
	   public static void main (String [] args) {
	      final int NUM_VALS = 4;
	      int[] courseGrades = new int[NUM_VALS];
	      int i = 0;
	      int length = courseGrades.length;

	      courseGrades[0] = 7;
	      courseGrades[1] = 9;
	      courseGrades[2] = 11;
	      courseGrades[3] = 10;

	      for(i=0;i<4;i++){
	         System.out.print(courseGrades[i] + " ");
	}
	      System.out.println();
	      for(i=0;i<4;i++){
		         System.out.print(courseGrades[(length-1) - i] + " ");
		}
	      return;
	   }
	}

