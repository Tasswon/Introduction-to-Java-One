/** Name: Joseph Tassone
 *  Course Code: COSC1046
 *	Description: An entered character reports whether it's a number, letter, or symbol
 */

import java.util.Scanner;
	 
public class CharacterIndicator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter a character and converts it to an integer
		System.out.print("Enter a character: ");
		char x = input.next().charAt(0);
		int c = x;
		
		//Checks if an integer is a letter 
		if (x >= 65 && x <= 90 || x >= 97 && x <= 122) {
			if (x == 65 || x == 69 || x == 73 || x == 85 || x == 89 || x == 97 || x == 101 || x == 105 || x == 111 || x == 117) {
				System.out.println("The character " + x + " has the Unicode value of "
						+ c + " and is a letter. Also, it is a vowel");
			}
			else {
				System.out.println("The character is " + x + " has the Unicode value "
						+ c + " and is a letter. Also, it is not a vowel.");
			}	
		}
		
		//Checks if an integer is a number 
		else if (x >= 48 && x <= 57) {
			System.out.println("The character " + x + " has the Unicode value of "
					+ c + " and is a number.");
		}
		
		//Concludes that it must be a symbol if it is neither a letter or number
		else {
			System.out.println("The character " + x + " has the Unicode value of "
					+ c + " and is a symbol");
		}
	}
}

