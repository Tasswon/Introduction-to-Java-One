import java.util.Scanner;

public class Airplane  {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Forms 2D array which will hold the seating arrangement
        char[][] seats = new char[6][4];
 
        for (int i = 0; i < seats.length; i++) {
            seats[i][0] = 'A';
            seats[i][1] = 'B';
            seats[i][2] = 'C';
            seats[i][3] = 'D';
        }
        for (int row = 0; row < seats.length; row++) {
        	for(int column = 0; column < seats[row].length;column++) {
        		System.out.print(seats[row][column] + " ");
        	}
		System.out.println();
        }
        
        System.out.print("Select a seat: ");
        
        int userInput = 0;
        int userInput2 = 0;
        int userInput3 = 0;
        
        while (userInput3 != 3) {
        	
        	userInput = input.nextInt();
            userInput2 = input.nextInt();
        	
        	int i = userInput;
        	int j = userInput2;
        	
        	if(seats[i][j] != 'X') {
        		seats[i][j] = 'X';
        		System.out.println("\nSeat now reserved!");
        	}
        	else {
        		System.out.println("\nSeat taken");
        	}
        	
        	System.out.println("Would you like to terminatet: yes (1) no (2)");
        	
        	userInput3= input.nextInt();
        	if (userInput3 == 1) {
        		break;
        	}
        	
        	System.out.println("Would you like to see the current seating chart: yes (1) no (2)");
        	
        	userInput3= input.nextInt();
        	
        	if (userInput3 == 1) {
        		for(int x = 0; x < seats.length; x++) {
        			System.out.print((1 + x) + "  " );
        	        	for(int y = 0; y <seats[x].length; y++) {
        	        		System.out.print(seats[x][y] + " ");
        	        	}
        	        	System.out.println();
        		}
        	}
        	System.out.println("\nPlease select a seat");
        }
        
        System.out.println("\nThe following is the final seating chart:");
        
        for(int i = 0; i < seats.length; i++) {
        	System.out.print((1 + i) + "  " );
        	for(int j = 0; j <seats[i].length; j++) {
        		System.out.print(seats[i][j] + " ");
        	}
        	System.out.println();
        }
        System.out.print("\nThank you for your service!");
	}
}