// P4 Assignment
// Author: Habeeb Mohammed
// Date:   9/21/2015
// Class:  CS160
// Email:  habeeb@cs.colostate.edu
import java.util.*;

public class P4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double salary0 = 0.00, interest0 = 0.00, capital0 = 0.00, exemption0 = 0,

		federalTotalInc = 0.00, 
		federalAdjusted = 0.00, 
		federalTotalTax = 0.00, 
		federalTotalTax1 = 0.00, 
		federalTotalTax2 = 0.00, 
		federalTotalTax3 = 0.00, 
		federalTotalTax4 = 0.00, 
		stateIncTax = 0.00;

		System.out.print("Gross Salary: ");
		salary0 = keyboard.nextDouble();
		if (salary0 < 0.00)
			salary0 = 0.00;
		System.out.print("Number of Exemptions: ");
		exemption0 = keyboard.nextDouble();
		if (exemption0 > 5)
			exemption0 = 5; // exemptions can never be greater than 5.
		if (exemption0 < 0)
			exemption0 = 0; // exemptions can never be less than 0.
		System.out.print("Interest Income: ");
		interest0 = keyboard.nextDouble();
		if (interest0 < 0.00)
			interest0 = 0.00;
		System.out.print("Capital Gains: ");
		capital0 = keyboard.nextDouble();
		if (capital0 < 0.00)
			capital0 = 0.00;
		keyboard.close();

		federalTotalInc = salary0 + interest0 + capital0;
		System.out.printf("Total Income: $" + "%.2f\n", federalTotalInc);

		federalAdjusted = federalTotalInc - (exemption0 * 1800.00);
		if (federalAdjusted < 0)
			federalAdjusted = federalTotalInc; // federalAdjusted will never be < 0
												
		System.out.printf("Adjusted Income: $" + "%.2f\n", federalAdjusted);

		if (federalAdjusted >= 15000)
			federalTotalTax1 = 0 * (15000 - 0);
		if (federalAdjusted < 15000 && federalAdjusted > 0)
			federalTotalTax1 = 0 * (federalAdjusted - 0);

		if (federalAdjusted >= 25000.00)
			federalTotalTax2 = .15 * (25000.00 - 15000.00);
		if (federalAdjusted < 25000.00 && federalAdjusted >= 15000.00)
			federalTotalTax2 = .15 * (federalAdjusted - 15000.00);

		if (federalAdjusted >= 45000.00)
			federalTotalTax3 = .25 * (45000.00 - 25000.00);
		if (federalAdjusted < 45000.00 && federalAdjusted > 25000.00)
			federalTotalTax3 = .25 * (federalAdjusted - 25000.00);

		if (federalAdjusted >= 45000.00)
			federalTotalTax4 = .30 * (federalAdjusted - 45000.00);

		federalTotalTax = federalTotalTax1 + federalTotalTax2
				+ federalTotalTax3 + federalTotalTax4;
		System.out.printf("Total Tax: $" + "%.2f\n", federalTotalTax);

		stateIncTax = federalAdjusted * .055;
		System.out.printf("State Tax: $" + "%.2f\n", stateIncTax);

	}
}
