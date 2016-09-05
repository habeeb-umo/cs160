// R3 Assignment
// Author: Habeeb Mohammed
// Date:   9/03/2015
// Class:  CS160
// Email:  habeeb@cs.colostate.edu
import java.util.*;

public class R3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String  myString0 = "Java",
			    myString1 = "Programming",
			    myString2 = "Language";
		int myInteger = 0;
		double myDouble = 0.0;
		
				
		System.out.println(myString0 + " is a " + myString1 + " " + myString2 + ".");
		System.out.println(myString1.length() + myString2.length());
		System.out.println(myString1.charAt(1)+","+myString1.charAt(3)+","+myString1.charAt(6));
		System.out.println(myString0.indexOf("a"));
		System.out.println(myString2.toUpperCase());
		System.out.println(myString1.substring(2,8));
		System.out.print("Enter an integer: ");
		myInteger = keyboard.nextInt();
		System.out.println("myInteger = " + myInteger);
		System.out.print("Enter a double: ");
		myDouble = keyboard.nextDouble();
		System.out.printf("myDouble = "+ "%.5f\n" , myDouble);
		
			    
	}

}
