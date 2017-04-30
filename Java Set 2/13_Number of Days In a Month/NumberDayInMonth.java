/** Name: Joseph Tassone
 *  Course Code: COSC1046
 *	Description: Determines the number of days in a month, based on month and year
 */ 

import java.util.Scanner;

public class NumberDayInMonth {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		
		//Prompts user to enter a month number
		System.out.print("Enter month number: ");
		int month = input.nextInt();
		
		//Prompts user to enter a year
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		
		int numDays = 0;
		
		//Uses switch statement to determine how many days based on entered month number
		switch (month) {
			case 1: System.out.print("January ");
				numDays = 31; 
				System.out.println(year + " had " + numDays + " days"); break;
			case 3: System.out.print("March ");
				numDays = 31; 
				System.out.println(year + " had " + numDays + " days"); break;
			case 5: System.out.print("May ");
				numDays = 31; 
				System.out.println(year + " had " + numDays + " days"); break;
			case 7: System.out.print("July ");
				numDays = 31; 
				System.out.println(year + " had " + numDays + " days"); break;
			case 8: System.out.print("August ");
				numDays = 31; 
				System.out.println(year + " had " + numDays + " days"); break;
			case 10: System.out.print("October ");
				numDays = 31; 
				System.out.println(year + " had " + numDays + " days"); break;
			case 12: System.out.print("December ");
				numDays = 31; 
				System.out.println(year + " had " + numDays + " days"); break;
				
			case 4: System.out.print("April ");
				numDays = 30; 
				System.out.println(year + " had " + numDays + " days"); break;
			case 6: System.out.print("June ");
				numDays = 30; 
				System.out.println(year + " had " + numDays + " days"); break;
			case 9: System.out.print("September ");
				numDays = 30; 
				System.out.println(year + " had " + numDays + " days"); break;
			case 11: System.out.print("November ");
				numDays = 30; 
				System.out.println(year + " had " + numDays + " days"); break;
				
			//February's days change, so formula detects leap years
		    case 2: System.out.print("February ");
		    	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		    		System.out.println(year + " had " + (numDays = 29) + " days");
		    	else 	
		    		System.out.println(year + " had " + (numDays = 28) + " days"); break; 
		}
	}
}