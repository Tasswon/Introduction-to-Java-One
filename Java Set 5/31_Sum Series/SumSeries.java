/** Name: Joseph Tassone
 *  Course: COSC1046
 *	Description: Computes a series and places it into a table
 */

public class SumSeries {
	public static void main(String[] args) {
		
		//Displays a chart heading for the outputs
		System.out.println("i                 m(i)");
		System.out.println("-------------------------");
		
		/*Generates variables for the table in steps of 5, and 
		* uses the sum method to gain the calculated numbers*/
		for (int i = 5; i <= 100; i += 5) {
			System.out.printf("%d \t | \t %.4f \n", i, sum(i));
		}
	}

	public static double sum(double number) {
		double m = 0;
		
		//Loops i values through formula and returns m values
		for (int count = 1; count <= number; count++) {
			m +=  count / (count + 1.0);
		}
		return m;   
	}
}
