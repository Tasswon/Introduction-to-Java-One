/** Name: Joseph Tassone
 *  Description: Finds the number of occurrences of a specified character in a string 
 */

import java.util.Scanner;

public class OccurrencesOfSpecifiedCharacter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompts user to enter a string
		System.out.print("Enter a string:");
		String testWord = input.nextLine();
		
		//Prompts user for the character that will be tested
		System.out.print("Enter a character:");
		char character = input.nextLine().charAt(0);
		
		//Prints the number of occurrences for character based on count method
		System.out.println("The number of " + character + " in the string is " + count(testWord, character));
	}
	
	//Method counts number of occurrences for a specific character
	public static int count(String str, char a) {
		int count = 0;
		
		//Continues loop for the length (size) of the string
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a)
				count++;
		}
		return count;
	}
}

