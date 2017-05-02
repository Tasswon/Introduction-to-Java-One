/** Name: Joseph Tassone
 *  Description: User enters numbers into an array and prints the distinct values
 */

import java.util.Scanner;
 
public class PrintDistinctNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Creates an array
		int[] array = new int[10];
		int distinct = 0; 
		
		System.out.print("Enter ten numbers:");
		
		//Loops until user has entered all array values
		for (int count = 0; count < 10; count ++) {
			int number = input.nextInt();
			int count2;
			
			//Initial test to determine if the number is repeated
			for (count2 = 0; count2 <= distinct; count2++) {
				if (number == array[count2]) {
					break;
				}
			}
			
			/*If the number isn't repeated, stores it to the array value and
			* adds a distinct number */
			if (count2 - distinct == 1) {
				array[distinct] = number;
				distinct++;
			}
		}
		
		//Prints the total distinct numbers that have been added above
		System.out.println("The number of distinct number is " + distinct);
		System.out.print("The distinct numbers are: ");
		
		//Prints out each array value that wasn't ignored above
		for (int arrayValue = 0; arrayValue < distinct; arrayValue++) {
			System.out.print(array[arrayValue] + " ");
		}
	}
}