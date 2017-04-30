/** Name: Joseph Tassone
 *  Course Code: COSC1046
 *	Description: Determines the area of a polygon
 */

import java.util.Scanner;
	 
public class AreaOfARegularPolygon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Allows user to input the number of sides of a polygon
		System.out.print("Enter the number of sides: ");
		int n = input.nextInt();
		
		//Allows user to input the length of a side
		System.out.print("Enter the side: ");
		double s = input.nextDouble();
		
		//Formula for determining the area based on the side length and number of sides
		double a = ((n * Math.pow(s,2)) / (4 * (Math.tan(Math.PI / n))));
				
		System.out.printf("The area of the polygon is %.2f", a);
	 	}
}