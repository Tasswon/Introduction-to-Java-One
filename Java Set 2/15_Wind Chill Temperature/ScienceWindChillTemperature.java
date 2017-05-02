/** Name: Joseph Tassone
 *  Description: Prompts the user to enter a temperature and wind speed, and displays the wind-chill temperature
 */ 

import java.util.Scanner;

public class ScienceWindChillTemperature {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the temperature in Fahrenheit -58°F and 41°F: ");
		double temp = input.nextDouble();
		
		if (temp >= -58 && temp <= 41) {
			System.out.print("Enter the wind speed (>=2) in miles per hour: ");
			double windSpeed = input.nextDouble();
			
			if (windSpeed >= 2) {
			double windChill = (35.74 + (0.6215 * temp) - (35.75 * (Math.pow(windSpeed, 0.16))) + (0.4275 * temp * (Math.pow(windSpeed, 0.16))));
			System.out.printf("The wind chill index is %.2f", windChill);
			}
			else {
				System.out.println("Restart and enter the wind speed (>=2) in miles per hour");
			}
		}
		else {
			System.out.println("Restart and enter the temperature in Fahrenheit -58°F and 41°F");
		}
	}
}
