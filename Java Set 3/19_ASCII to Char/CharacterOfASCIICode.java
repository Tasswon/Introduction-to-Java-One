/** Name: Joseph Tassone
 *  Description: Program receives an ASCII code and displays a character
 */

import java.util.Scanner;
	 
public class CharacterOfASCIICode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompts user to enter an ASCII code
		System.out.print("Enter an ASCII code: ");
		int x = input.nextInt();
		
		//If number is between 0 and 127, then returns character for ASCII code
		if(x > 0 || x < 127) {
			System.out.print("The character for ASCII code " + x + " is " + (char)x);
		} 
		else {
			System.out.print("Number has to be between 0 and 127");
		}
	}
}


