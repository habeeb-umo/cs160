// P_ Assignment
// Author: Habeeb Mohammed
// Date:   x/xx/xxxx
// Class:  CS160
// Email:  habeeb@cs.colostate.edu
import  java.util.*;
public class R5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner keyboard = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter your age: ");
		int age = keyboard.nextInt();
//
//		if (age > 20) // no semicolon here!!!
//		{
//			System.out.println("You can legally buy and consume alcohol in the USA.");
//		}		
//
//		keyboard.close(); // not necessary, but good practice
//		System.out.println("End of program.");
//		if (age == 21) 
//		{
//			System.out.println("Wow!  You are 21 years old!");
//		}
//		else
//		{
//			System.out.println("Interesting!  You are NOT 21 years old!");
//		}		
//
//		System.out.println("End of program.");
//		if (age == 21) 
//		{
//			System.out.println("Boom!  You are 21!");
//		}
//		else if (age == 18)
//		{
//			System.out.println("Hey-o!  You're 18 years old!");
//		}		
//
//		System.out.println("End of program.");
//		if (age == 21) 
//		{
//			System.out.println("You are 21 and the same age as Miley Cyrus!  Not sure if that's good or bad.");
//		}
//		else if (age == 18)
//		{
//			System.out.println("You're 18 years old! and the same age as Zendaya.  No idea who she was -- I had to Google her.");
//		}	
//		else if (age == 20)
//		{
//			System.out.println("You're 20 years old and the same age as Justin Bieber!  Has he retired yet?");
//		}	
//		else if (age == 16)
//		{
//			System.out.println("You're 16 years old and the same age as Jaden 'Don't call me Will' Smith!");
//		}
//		else
//		{
//			System.out.println("Oops! You're not the age of any people I know.");
//		}		
//
//		System.out.println("End of program.");
		
		Scanner keyboard1 = new Scanner(System.in);
		System.out.print("Please enter a full name: ");
		String fullName = keyboard1.nextLine().toLowerCase();
		System.out.print("Is the person happy? (y/n): ");
		char happyAnswer = keyboard1.next().toLowerCase().charAt(0);
		boolean isHappy = (happyAnswer == 'y');

		if ( fullName.equals("chris wilcox") && isHappy)
		{
			System.out.println("Looks like Chris had his chai from the Alley Cat!");
		} 
		else if ((happyAnswer != 'y') && !isHappy)	
		{
			System.out.println("Chris needs to visit the Alley Cat to get his chai fix!!");
		} 


		keyboard1.close();
		System.out.println("End of program.");

	
	}

}
