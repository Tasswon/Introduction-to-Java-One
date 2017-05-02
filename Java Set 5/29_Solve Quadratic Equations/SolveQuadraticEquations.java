/** Name: Joseph Tassone
 *  Description: Displays the number of real roots and all real roots
 */

import java.util.Scanner;
	 
public class SolveQuadraticEquations {
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 /*Creates two arrays: "eqn" determines how many roots and "roots" stores the 
		  *values calculated from the equation */
		 double[] eqn = new double[3];
		 double[] roots = new double[2];
		 
		 //Prompts user to enter values and stores them into array eqn
		 System.out.println("Enter values of a, b, c: ");
		 eqn[0] = input.nextDouble();
		 eqn[1] = input.nextDouble();
		 eqn[2] = input.nextDouble();
		 
		 //Method solves for number of roots and real root values
		 int numberOfRealRoots = solveQuadratic(eqn, roots);
		 
		 //if statements determine which to print based on method calculations
		 if (numberOfRealRoots == 0) {
			 System.out.println("The equation has no real roots.");
		 } 
		 
		 else if (numberOfRealRoots == 2) {
			 System.out.printf("The equation has two roots %.6f and %.6f", roots[0], roots[1]);
		 } 
		 
		 else if (numberOfRealRoots == 1) {
			 System.out.printf("The equation has one root %.6f", roots[0]);
		 }
	}
	
	public static int solveQuadratic(double[] eqn, double[] roots) {
		
		//Sets a, b, and c values as equal to the values in the array
		double a = eqn[0];
		double b = eqn[1];
		double c = eqn[2];
		
		//Tests whether there are actually any roots, and if so how many
		double discriminant = Math.pow(b, 2) - 4 * a * c;
		
		//If the discriminant results in less than 0, there are no roots
		if (discriminant < 0) {
			return 0;
		}
		
		/*If the discriminant is greater or equal to 0 then calculate
		 *roots and store them in the array values */
		roots[0] = (-b + (Math.sqrt((Math.pow(b, 2)) - 4 * a * c))) / 2 * a;
		roots[1] = (-b - (Math.sqrt((Math.pow(b, 2)) - 4 * a * c))) / 2 * a;
		
		//If the discriminant results in more than 0, there are two roots
		if (discriminant > 0) {
			return 2;
		} 
		
		//If the discriminant results in exactly 0, there is one root
		else {
			return 1;
		}
	}
}
