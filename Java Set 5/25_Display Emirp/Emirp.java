/** Name: Joseph Tassone
 *  Course: COSC1046
 *	Description: Displays the first 100 emirps
 */

import java.util.Scanner;

public class Emirp {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter how many empirs you want printed: ");
		
		//Set how many emirps you want to be printed
		int range = input.nextInt();
		int counter = 0; 
		int emirpTest = 1;
		 
		while (counter < range) {
			
			//Sends the emirpTest variable through three methods to ensure it qualifies; and print if it does
			if (isPrime(emirpTest) && isPrime(reversal(emirpTest)) && nonPalindromic(emirpTest)) {
				counter++;
				System.out.print(emirpTest + " ");
				
				//Ensures that there are only 10 numbers per line
				if (counter % 10 == 0) {
					System.out.println();
				}
			}
			emirpTest++;
		} 
	}
	
	//Method tests whether the emirpTest variable is in fact a prime number
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) { 
				return false; 
			}
		}	 
		return true;
	}
	
	//Method reverses the emirpTest variable
	public static int reversal(int number) {
		int reverseValue = 0;
		int testValue;
		 
		while (number != 0) {
			
			testValue = number % 10;
			reverseValue = reverseValue * 10 + testValue;
			number /= 10;
		}
		return reverseValue;
	}
	
	//Method ensures the emirpTest variable isn't a palindrome (ie. the same reversed)
	public static boolean nonPalindromic(int number) {
		 return (number != reversal(number));
		 
	}
}