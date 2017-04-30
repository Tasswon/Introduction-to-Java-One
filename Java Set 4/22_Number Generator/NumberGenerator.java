/** Name: Joseph Tassone
 *  Course: COSC1046
 */

public class NumberGenerator {
	public static void main (String [] args) {
		
		int counter = 0;
		int positive = 0;
		int negative = 0;
		int sumPositive = 0;
		int sumNegative = 0;
		int maxNumber = -68;
		int minNumber = 83;
		int sumNumber = 0;
		int totalNumber = 0;
		
		//Generates a random number between -67 and 83
		do {
		int number = (int)(Math.random() * 151) - 67;
		System.out.println(number);
		counter++;
		
		//Counts the number of positive numbers generated 
		if (number >= 0) {
			positive++;
			sumPositive += number;
		}
		//Counts the number of negative numbers generated
		if (number < 0) {
			negative++;
			sumNegative += number;
		}	
		/*Determines largest number by starting at -68 and replacing
		 *itself with each larger number generated
		 */
		if (number > maxNumber) {
			maxNumber = number;
		}
		/*Determines smallest number by starting at 83 and replacing
		 *itself with each smaller number generated
		 */
		if (number < minNumber) {
			minNumber = number;
		} 
		//Counts all numbers within the range to be used later for determining average
		if (number >= -67 && number <= 83) {
			totalNumber++;
			sumNumber += number;
		}
		}
		//Ensures that 66 numbers are generated
		while (counter < 66);
		
		//Displays all the generated information based on the above formulas
		System.out.println("The number of positives equals " + positive);
		System.out.println("The number of negatives equals " + negative);
		System.out.println("The average number of positives equals " + sumPositive / positive );
		System.out.println("The average number of negatives equals " + sumNegative / negative );
		System.out.println("The largest number is " + maxNumber + " and the smallest number is " + minNumber);
		System.out.println("The average number of all numbers equals " + sumNumber / totalNumber);
	}
}