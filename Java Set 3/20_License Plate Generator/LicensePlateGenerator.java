/** Name: Joseph Tassone
 *  Description: Randomly generates a license plate number
 */

public class LicensePlateGenerator {
	public static void main(String[] args) {
		
		System.out.print("A randomly generated license plate is: ");
		
		//Generates a random capital letter twice 
		for (int i = 0; i < 2; i++) {
			String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			int randomCharacter = (int)(Math.random() * 26);
			String x = letters.substring(randomCharacter, randomCharacter + 1);
		    System.out.print(x);
		}
		
		System.out.print(" ");
		
		//Generates a random number between 0 and 9, twice
		for (int i = 0; i < 4; i++) {
		    int randomNumber = (int)(Math.random() * 10);
		    System.out.print(randomNumber);
		}
	}
}