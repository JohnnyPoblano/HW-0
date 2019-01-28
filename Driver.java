/*
**	John Gumm
**	CIS 279
**	HW 0
*/

import java.util.Scanner;
public class Driver {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Instantiate scanner for input from user
		Scanner scan = new Scanner(System.in);
		
		// Input number of months
		System.out.println("Enter the number of months:");
		int numMonth = scan.nextInt();
		while (numMonth < 0) {
			numMonth = scan.nextInt();
		}
		
		// Input periodic deposit
		System.out.println("Enter the periodic deposit:");
		int perDeposit = scan.nextInt();
		while (perDeposit < 0) {
			perDeposit = scan.nextInt();
		}
		
		// Input annual interest
		System.out.println("Enter the annual interest:");
		double annInterest = scan.nextDouble();
		while (annInterest < 0) {
			annInterest = scan.nextDouble();
		}
		double mir = (annInterest/100)/12;
		
		// Declare variables
		double depositSum = 0;
		double mirp1 = mir + 1;

		// Perform a loop to compound the interest
		System.out.println("                Deposit     12    1.0025  1.030416  515.2080");
		for (int month = 1, monthIntAccrued = numMonth; month <= numMonth; month++, monthIntAccrued--) {
			System.out.printf("Month %-3d%10d%10d%10.4f%10.6f%10.4f", month, perDeposit, monthIntAccrued, mirp1, Math.pow(mirp1, monthIntAccrued), Math.pow(mirp1, monthIntAccrued) * perDeposit);
			System.out.println();
			depositSum += Math.pow(mirp1, monthIntAccrued) * perDeposit;
		}
		
		// Show compounded value
		System.out.println("\nSum of deposits       " + numMonth *perDeposit);
		depositSum = Math.round(depositSum * 100.0) / 100.0;
		System.out.println("End of year total     " + depositSum);
		
		scan.close();

	}

}
