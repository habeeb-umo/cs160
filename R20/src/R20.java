// P_ Assignment
// Author: Habeeb Mohammed
// Date:   x/xx/xxxx
// Class:  CS160
// Email:  habeeb@cs.colostate.edu
public class R20 {

	public static void main(String[] args) {
		
		//#1
		System.out.println(funcOne(-10));
		System.out.println(funcOne(7));
		//#2
		System.out.println(funcTwo(-5,13));
		System.out.println(funcTwo(-2,6));
		//#3
		System.out.println(funcThree(.5));
		//#4
		System.out.println(funcFour(4) + "True");
		//#5
		System.out.println(funcFive(7) + ": result = i! && result = x!; i = x");
		//#6
		System.out.println(funcSix(1,2) + ": ");
		
	}
	// #1
	// Precondition: -10 <= x <= 7  
	// Postcondition: ?
	// QUESTION: What is the postcondition?
	public static int funcOne(int x) {

	    // Enforce specified precondition in method
	    assert (x >= -10 && x <= 7);
	    return (3 * x * x * x) - (2 * x * x) + 5;
	}

	// #2
	// Preconditions: -5 <= x <= -2, 6 <= y <= 13   
	// Postcondition: ?
	// QUESTION: What is the postcondition?
	public static int funcTwo(int x, int y) {

	    // Enforce specified precondition in method
	    assert (x >= -5 && x <= -2);
	    assert (y >= 6  && y <= 13);
	    return (3 * x * x * x) - (y * x * x) + 11;
	}

	// #3
	// Precondition: ?
	// Postcondition: 0.25 <= return value <= 1.0
	// QUESTION: What is the precondition?
	public static double funcThree(double x) {

	    return 1.0 / x; 
	}


	// #4
	// Precondition: x is an integer  
	// Postcondition: returns an even integer
	// QUESTION: Is the postcondition true? Why or why not?
	public static int funcFour(int x) {

	    int retVal;
	    if (x % 2 == 0) {
	        retVal = x * x - x;
	    } else {
	        retVal = (x + x) * (x + x);
	    }
	    assert(retVal % 2 == 0);
	    return retVal;
	}

	// #5
	// Precondition: x >= 1
	// QUESTION: Find the loop invariants for all variables before, during, and after the loop.
	public static int funcFive(int x) {

	    int result = 1;
	    int i = 0;
	    do {
	        i++;
	        result = result * i;
	    } while (i < x);
	    return result;
	}

	// #6
	// QUESTION: Does this correct swap the locals a and b? Why or why not?
	public static String funcSix(int a, int b) {

	    System.out.println("Before: a = " + a + " and b = " + b);
	    if (a < b) {
	        int r = a % b;
	        a = b;
	        b = r;
	    }
	    else {
	        int r = b;
	        b = a;
	        a = r;
	    }
	    return "After: a = " + a + " and b = " + b;
	}
}
