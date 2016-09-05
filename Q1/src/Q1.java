import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// Q1 Programming Quiz
// Author: Habeeb Mohammed
// Date:   9/24/2015
// Class:  CS160
// Email:  habeeb@cs.colostate.edu
public class Q1 {

	public static void main(String[] args) {

		// Declare variables
		int int0 = 0, int1 = 0, int2 = 0;
		double real0 = 0.0, real1 = 0.0, real2 = 0.0;
		String string0 = "", string1 = "", string2 = "";
		boolean p = true, q = true, r = false;

		try {

			// Open input stream
			Scanner scan = new Scanner(new File("data.txt"));

			// Read contents
			string0 = scan.nextLine();
			string1 = scan.nextLine();
			string2 = scan.nextLine();
			int0 = scan.nextInt();
			int1 = scan.nextInt();
			int2 = scan.nextInt();
			real0 = scan.nextDouble();
			real1 = scan.nextDouble();
			real2 = scan.nextDouble();
			p = scan.nextBoolean();
			q = scan.nextBoolean();
			r = scan.nextBoolean();

			// Close input stream
			scan.close();

		} catch (IOException e) {
			System.out.println("Cannot read file: data.txt");
			System.exit(0);
		}
		System.out.println((int0 + int1 + int2) * 321);
		System.out.println((real2 + real1) / 17.5);
		System.out.println(Math.pow(int2*real1,3));
		System.out.println("Java programming is " + string0.charAt(13)
				+ string0.charAt(11) + string0.charAt(14) + string0.charAt(12));
		System.out.println(string0.charAt(3) + "," + string1.charAt(3) + ","
				+ string2.charAt(3));
		System.out.println(string0.equals(string1));
		System.out.println((p && q) || (!q || r));
		
		if (string1.length() <= 10)
			System.out.println("10 characters or fewer.");
		else if (string1.length() >= 11)
			System.out.println("11 characters or more.");
		
		if (real1 < 15.15)
			System.out.println(real1 * 33.44);
		else if ((real1 > 29.3) && (real1 <= 99.99))
			System.out.println(real1 / 2.123);
		else
			System.out.println(real1 * real1 / 9.876);
		
		switch (string1) {
		case "Veracruz":
			System.out.println("North America");
			break;
		case "Fort Collins":
			System.out.println("North America");
			break;
		case "Temuco":
			System.out.println("South America");
			break;
		case "La Paz":
			System.out.println("South America");
		default:
			System.out.println("Unknown City!");
		}

	}

}
