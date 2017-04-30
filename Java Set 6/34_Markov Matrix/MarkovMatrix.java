import java.util.Scanner;

public class MarkovMatrix {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

        double[][] array = new double[3][3];

        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for (int row = 0; row < array.length; row++)
            for (int column = 0; column < array[row].length; column++)
                array[row][column] = input.nextDouble();

        if (isMarkovMatrix(array)) {
        	System.out.println("It is a Markov matrix"); 
        }
        else {
        	System.out.println("It is not a Markov matrix");
        }
    }

    public static boolean isMarkovMatrix(double[][] matrix) {

        for (int column = 0; column < matrix[0].length; column++) {
            double sum = 0;
            for (int row = 0; row < matrix.length; row++) {
                double test = matrix[row][column];
                if (test < 0) return false;
                sum += test;
            }
            if (sum != 1) return false;
        }
        return true;
    }
}