import java.util.Scanner;

public class R6 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		// Here we print a welcome message
		System.out.println("Welcome to a simple calculator program!");
		System.out.println("---------------------------------------");
		System.out.println("All we know how to do is add, subtract, multiply, divide, and compute modulo.");
		System.out.println();

		// Here we get input from the user
		System.out.print("Please enter a the first number of your calculation: ");
		double lhs = keyboard.nextDouble();

		System.out.print("Please enter the operator (+|-|*|/|%|^): ");
		char operator = keyboard.next().charAt(0);
		char power = '^';
		if(operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '%' && operator != '^' )
			System.out.println("ERROR! ERROR! THIS IS NOT MATH!");
			// ADD: get operator using Scanner object
			

		System.out.print("Please enter a the second number of your calculation: ");
		double rhs = keyboard.nextDouble();
		// ADD: get the second number use the Scanner object

		// Here we will calculate the result:
		double result = 0.0;
		switch (operator)
		{
			case '+':
				result = lhs + rhs;
				break;
			case '-':
				result = lhs - rhs;
				break;
			case '*':
				result = lhs * rhs;
				break;
			case '/':
				result = lhs / rhs;
				if (rhs <= 0.0)
					System.out.println("ERROR! ERROR! YOU IDIOT ITS UNDEFINED!");
				break;
			case '%':
				result = lhs % rhs;
				break;
			case '^':
				result = Math.pow(lhs,rhs);
		}
		
		// ADD: write a switch statement that will calculate
		// the correct result.


		// Here we will print the result
		System.out.println("---------------------------------------");
		System.out.println("Result:");
		// ADD: print the answer to the calculation using the
		System.out.println(lhs + " " + operator + " " + rhs + " " + "=" + " " + result);
		// so it looks like: "2.44 - 1.44 = 1.00"
		System.out.println("---------------------------------------");


		keyboard.close();
		System.out.println("End of program.");
	}

}
