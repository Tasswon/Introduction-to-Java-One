/** Name: Joseph Tassone
 *  Course Code: COSC1046
 *	Description: Determines whether a point is divisible by 7 or 17
 */

import java.util.Scanner;

public class DivisibleBy7and17 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Allows user to input a number
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		//Calculates whether number is divisible by 7 and 17
		System.out.println(number + " is divisible by 7 and 17? " 
		+ (number % 7 == 0 && number % 17 == 0));
		
		//Calculates whether number is divisible by 7 or 17
		System.out.println(number + " is divisible by 7 or 17? " 
		+ (number % 7 == 0 || number % 17 == 0));
		
		//Calculates whether number is divisible by 7 or 17, but not both?
		System.out.println(number + " is divisible by 7 or 17, but not both? " 
		+ (number % 7 == 0 ^ number % 17 == 0));
	}
}