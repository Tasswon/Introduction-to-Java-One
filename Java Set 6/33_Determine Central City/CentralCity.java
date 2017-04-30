import java.util.Scanner;

public class CentralCity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of cities: ");
        int numberOfCities = input.nextInt();
        double[][] array = new double[numberOfCities][3];

        System.out.print("Enter the coordinates of the cities:\n");
        for (int row = 0; row < array.length; row++)
            for (int column = 0; column < array[row].length - 1; column++)
            	array[row][column] = input.nextDouble();

        double[] central = centralCityCoordinate(array);

        System.out.print("The central city is at (" + central[0] + ", " + central[1] + ")");
        System.out.printf("\nThe total distance to all other cities is %.2f",central[2]);
        
        for (int i = 0; i < 5; i++) {
        	System.out.println(array[i][2]);
        }
    }

    public static double[] centralCityCoordinate(double[][] coordinates) {
    	
        for (int x = 0; x < coordinates.length; x++) {
            for (int y = 0; y < coordinates.length; y++) {
                if (y != x) {
                	coordinates[x][2] += Math.sqrt((Math.pow((coordinates[y][0] - coordinates[x][0]),2)) 
                    		+ Math.pow((coordinates[y][1] - coordinates[x][1]),2));
                }
            }
        }
        double[] central = coordinates[0];
        for (int i = 1; i < coordinates.length; i++) {
            if (coordinates[i][2] < central[2]) {
                central = coordinates[i];
            }
        }
        return central;
    }
}