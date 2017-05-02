//Name: Joseph Tassone

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
        
		
		System.out.print("Please enter a positive number: ");
				
		//Prompts user to enter a number
        int number = input.nextInt();
        int counter = 0;
        int i = 1;
        
        /*Generates numbers up to half of the inputed number (inputed number / 2) and
         *then adds them together
         */
        while (i <= (number / 2)) {
        	if(number % i == 0){
                counter += i;
            }
        	i++;
        }
        
        //If the counter is equal to the inputed number, then it has to be perfect
        if(counter == number){
            System.out.println("It is a perfect number!");
        } 
      //If the counter isn't equal to the inputed number, then it is not perfect
        else 
            System.out.println("It is not a perfect number!");
    }
}
