/** Name: Joseph Tassone
 *  Course Code: COSC1046
 *	Description: Determines the minimum runway length for an airplane
 */ 

import java.util.Scanner;

public class FindingRunwayLength {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter speed and acceleration: ");
		double v = input.nextDouble();
		double a = input.nextDouble();
		double length = (Math.pow(v, 2) / (2 * a));
		
		System.out.printf("The minimum runway length for this airplane is %.2f", length);
	}
}