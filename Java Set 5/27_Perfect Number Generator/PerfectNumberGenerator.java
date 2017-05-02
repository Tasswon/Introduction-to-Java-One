/** Name: Joseph Tassone
 *  Description: Finds all perfect numbers below a certain value
 */

import java.util.Scanner;

public class PerfectNumberGenerator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*Allows user to set the point the perfect numbers print to
		* (all perfect numbers below this number) */
		System.out.print("Enter a number: ");
		int range = input.nextInt();
		
		/*Calls on the method that will test and print all 
		* perfect numbers below the range */
		System.out.println("\nThe perfect numbers less than " + range + " are:");
		printPerfectNumbers(range);
	}
	 
	public static void printPerfectNumbers(int range) {
		int perfect = 0;
		
		/*Keeps testing all numbers below the range (perfect variable resets after
		* each test) */
		for (int count = 1; count <= range; count++) {
			perfect = 0;
			
			//Tests whether the number is perfect or not
			for (int divisor = 1; divisor < count; divisor++) {
				if (count % divisor == 0) {
					perfect += divisor;
				}
			}
			//Prints the number if it meets the criteria for a perfect number
			if (perfect == count) {
				System.out.print(perfect + " ");
			}
		}
	}
}
				
				
				
				
				
		