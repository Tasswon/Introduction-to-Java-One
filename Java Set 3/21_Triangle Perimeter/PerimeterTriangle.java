/** Name: Joseph Tassone
 *  Description: Determines the perimeter of a triangle
 */

import java.util.Scanner;

public class PerimeterTriangle {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompts user to enter three separate sides of a triangle
		System.out.print("Enter three sides of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		double xxxx = (side1 + side2 + side3);
		 
		//Determines if two sides are greater than third, and then outputs statement based on true or false
		if (side1 > side2 + side3 || side2 > side1 + side3 || side3 > side1 + side2) {
		System.out.print("The lengths do not define a triangle.");
		}
		else {
		System.out.print("The perimeter of the triangle is " + xxxx);
		}
	}
}
