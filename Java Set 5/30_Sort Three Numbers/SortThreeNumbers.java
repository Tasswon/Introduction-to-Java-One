/** Name: Joseph Tassone
 *  Description: User enters three numbers and they are displayed in increasing and decreasing order
 */


import java.util.Scanner;
 
	public class SortThreeNumbers {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			//Sets the three variables you wish to be used
			System.out.print("Enter three numbers:");
			double num1 = input.nextDouble();
			double num2 = input.nextDouble();
			double num3 = input.nextDouble();
			
			//Calls on methods to set selected variables in increasing and decreasing order
			displayIncreasingOrder(num1, num2, num3);
			displayDecreasingOrder(num1, num2, num3);
	
		}
		
		//Method used to print variables in increasing order
		public static void displayIncreasingOrder(double num1, double num2, double num3) {
			
			double temp = 0;
			
			//Bellow if statements switch variables using "temp" if they meet the set condition
			if (num3 < num2) {
				temp = num2;
				num2 = num3;
				num3 = temp;
			}
			
			temp = 0;
			if (num2 < num1) {
				temp = num1;
				num1 = num2;
				num2 = temp;
			}
			
			//The same as the first if, in case the second if changes order of first
			temp = 0;
			if (num3 < num2) {
				temp = num2;
				num2 = num3;
				num3 = temp;
			}
			
			System.out.println("The numbers in increasing order are " + num1 + " " + num2 + " " + num3);
		}
		
		//Method used to print variables in decreasing order
		public static void displayDecreasingOrder(double num1, double num2, double num3) {
					
			double temp = 0;
			
			//Bellow if statements switch variables using "temp" if they meet the set condition
			if (num3 > num2) {
				temp = num2;
				num2 = num3;
				num3 = temp;
			}
			
			temp = 0;
			if (num2 > num1) {
				temp = num1;
				num1 = num2;
				num2 = temp;
			}
			
			//The same as the first if, in case the second if changes order of first
			temp = 0;
			if (num3 > num2) {
				temp = num2;
				num2 = num3;
				num3 = temp;
			}
					
			System.out.println("The numbers in decreasing order are " + num1 + " " + num2 + " " + num3);
		}
}
			