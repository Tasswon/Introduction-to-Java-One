/*Name: Joseph Tassone
*Course Code: COSC1046
*Date: May 4, 2016
*Program Description: Calculates gratuity and total payment*/ 


import java.util.Scanner;

public class FinancialApplicationCalculateTips {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Establishes and prompts user for subtotal and gratuity rate
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityrate = (input.nextDouble())/100;
		
		// Calculation for gratuity and total
		double gratuity = subtotal * gratuityrate;
		double total = gratuity + subtotal;
		System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
	}
}