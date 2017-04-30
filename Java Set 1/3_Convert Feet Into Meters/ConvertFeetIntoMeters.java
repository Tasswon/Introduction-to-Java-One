/*Name: Joseph Tassone
*Course Code: COSC1046
*Date: May 4, 2016*
*Program Description: Converts feet into meters */ 


import java.util.Scanner;

public class ConvertFeetIntoMeters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();

		// Convert Feet into Meters
		double meters = (feet * 0.305);
		System.out.println(feet + " feet " + "is " +
			meters + " meters");
	}
}