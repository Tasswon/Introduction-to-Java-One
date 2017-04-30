/** Name: Joseph Tassone
 *  Course: COSC1046
 *	Description: Returns a new array by eliminating the duplicate values in the array
 */

import java.util.Scanner;

public class EliminateDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Creates an array with 10 slots
        int[] array = new int[10];
        
        //Prompts user to enter ten numbers until slots are filled
        System.out.println("Enter ten numbers: ");
        for (int count = 0; count < 10; count++) {
        	array[count] = input.nextInt();
        }
        
        //Creates a new array and sets it to the method result
		int[] answer = eliminateDuplicates(array);
		
        //Prints the new array, less the duplicates
        System.out.print("The distinct numbers are: ");  
        for	(int i = 0; i < answer.length; i++) {
        	System.out.print(answer[i] + " ");
        }
    }
   
    public static int[] eliminateDuplicates(int[] list) {
    	
    	//New array which will be compared with original
    	int [] temp = new int [list.length];
    	int count = 0;
    	
    	//Tests for duplicate values 
    	for (int i = 0; i < list.length; i++) {
    		boolean test = true;
    		for (int j = 0; j < temp.length; j++) {
    			if(list[i] == temp[j]) {
    				test = false;
    			}
    		}
    		//Count used to determine slots for the final array
    		if (test) {
	    		temp[count] = list[i];
	    		count++;
    		}
    	}	
    	//Creates a new array that the new values will be saved to
    	int [] newArray = new int[count];
        for(int i = 0; i < count; i++) {
        	newArray[i] = temp[i];
         }
    	
    	return newArray;
    }
}