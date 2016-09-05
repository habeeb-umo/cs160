import java.util.Arrays;

// P_ Assignment
// Author: Habeeb Mohammed
// Date:   x/xx/xxxx
// Class:  CS160
// Email:  habeeb@cs.colostate.edu
public class P11 {

	public static void main(String[] args) {
		double[] double1 = {0,2};
		double[] double2 = {-1};
		int[] int1 = {1,0,1};
		int[] int2 = {-1,0,-1};
		int[] int3 = {1,1,1,1,1,2,3,4,1};
		int[] int4 = {1,2,3,4,5,6,7,8,9};
		
		TestInterface inter = new TestClass();
		System.out.println(inter.reverseString("Please"));
		System.out.println(inter.reverseString("1234"));
		System.out.println(inter.duplicateString("  "));
		System.out.println(inter.duplicateString(""));
		System.out.println(Arrays.toString(inter.createStrings("x")));
		System.out.println(Arrays.toString(inter.createStrings("COOL BEANS! 52")));
		inter.cubeArray(double1);
		inter.cubeArray(double2);
		System.out.println(Arrays.toString(double1));
		System.out.println(Arrays.toString(double2));
		System.out.println(inter.sumArray(int1));
		System.out.println(inter.sumArray(int2));
		inter.sortArray(int3);
		inter.sortArray(int4);
		System.out.println(Arrays.toString(int3));
		System.out.println(Arrays.toString(int4));
		
		
	}

}
