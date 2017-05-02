/** Name: Joseph Tassone
 *  Description: Prompts user to enter a monthly saving amount and displays value after sixth month
 */ 

import java.util.Scanner;

public class FinancialApplicationCompoundValue {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the monthly saving amount: ");
		double saving = input.nextDouble();
		
		double monthOne = (saving * (1 + (0.05/12)));
		double monthTwo = ((saving + monthOne) * (1 + (0.05/12)));
		double monthThree = ((saving + monthTwo) * (1 + (0.05/12)));
		double monthFour = ((saving + monthThree) * (1 + (0.05/12)));
		double monthFive = ((saving + monthFour) * (1 + (0.05/12)));
		double monthSix = ((saving + monthFive) * (1 + (0.05/12)));
		System.out.printf("After the sixth month, the account value is $%.2f", monthSix);
	}
}
