/** Name: Joseph Tassone
 *  Course Code: COSC1046
 *	Description: Determines the area of a triangle
 */

import java.util.Scanner;

public class AreaTriangle {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompts user to enter three separate sides of a triangle
		System.out.print("Enter three sides of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		double xxxx = (side1 + side2 + side3);
		
		//Calculation for the area of a triangle based on inputed sides
		double p = xxxx / 2;
		double area = Math.pow(p * (p - side1) * (p - side2) * (p - side3), 0.5);
		 
		//Determines if two sides are greater than third, and then outputs area of a triangle if false
		if (side1 > side2 + side3 || side2 > side1 + side3 || side3 > side1 + side2) {
		System.out.print("The lengths do not define a triangle.");
		}
		else {
		System.out.printf("The area of the triangle is %.2f", area);
		}
	}
}
