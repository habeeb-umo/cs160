// P_ Assignment
// Author: Habeeb Mohammed
// Date:   x/xx/xxxx
// Class:  CS160
// Email:  habeeb@cs.colostate.edu
import java.util.*;
public class R8 {

	public static void main(String[] args) {
		
		// Declare variables
		String restaurantName;
		String serverName;
		double subtotal;
		double tax;
		double total;
		double taxRate = 0.05;
		double tipRate1 = 0.10;
		double tipRate2 = 0.15;
		double tipRate3 = 0.20;
		double tip1 = 0.0;
		double tip2 = 0.0;
		double tip3 = 0.0;
		Scanner sc = new Scanner(System.in);
		String ten = "10%";
		String fifteen = "15%";
		String twenty = "20%";
		// Ask and receive input from the user
		restaurantName = sc.nextLine();
		serverName = sc.next();
		sc.nextLine();
		subtotal = sc.nextDouble();
		tax = computeTax(subtotal,taxRate);
		total = subtotal + tax;
		tip1 = computeTip(total,tipRate1);
		tip2 = computeTip(total,tipRate2);
		tip3 = computeTip(total,tipRate3);
		
		
		System.out.println("=====================================");
		System.out.println(restaurantName);
		System.out.println("Your server was: " + serverName.toUpperCase());
		System.out.printf("Subtotal: $%.2f\n" , subtotal);
		System.out.printf("Tax: $%.2f\n" , tax);
		System.out.println("=====================================");
		System.out.printf("Total: $%.2f\n" , total);
		System.out.println();
		System.out.println("Suggested tips:");
		System.out.printf("%s" + ": $%.2f\n" , ten, tip1);
		System.out.printf("%s" + ": $%.2f\n" ,fifteen, tip2);
		System.out.printf("%s" + ": $%.2f\n" ,twenty, tip3);
		System.out.println();
		System.out.println("Thank you!");
		System.out.println("=====================================");
		
		
		
		
		
		
	}
		
				
		// Perform calculations
		public static double computeTax(double amount, double rate){
			return amount * rate;
		}
		public static double computeTip(double amount, double rate){
			return amount * rate;
		}
		
		// Print receipt	
		
		

}
