import java.util.Scanner;

public class StopWatchTest {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter how many numbers you wish to sort through: ");
    	int number = input.nextInt();
    	
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
        	array[i] = (int) (Math.random() * number);
        }
        
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        selectionSort(array);
        stopWatch.stop();
        
        if (stopWatch.getElapsedTime() > 1000) {
        	int seconds = (int) (stopWatch.getElapsedTime() / 1000);
        	System.out.println("Time elapsed: " + seconds + " seconds");
        }
        else {
        System.out.println("Time elapsed: " + stopWatch.getElapsedTime() + " milliseconds");
        }
        
        System.out.print("\nDo you wish to see the sorted array variables (yes(1) or no(2)): ");
        
        int answer = input.nextInt();
        
        if (answer == 1) {
        	 for (int i = 0; i < array.length; i++) {
                 System.out.printf("%6d ", array[i]);
                 if ((i + 1) % 10 == 0) {
                	 System.out.printf("\n");
                 }
        	 }
        	 System.out.print("\nThank you for using the application!");
        }
        else {
        	System.out.print("\nThank you for using the application!");
        }
    }

    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int currentMin = array[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (currentMin > array[j]) {
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
            	array[currentMinIndex] = array[i];
            	array[i] = currentMin;
            }
        }
    }
}