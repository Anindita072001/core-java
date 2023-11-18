package array;
import java.util.Arrays;
import java.util.Scanner;

public class Numeric {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Sorting a numeric array
	        System.out.print("Enter the size of the numeric array: ");
	        int n = scanner.nextInt();

	        int[] numericArray = new int[n];
	        System.out.println("Enter the elements of the numeric array:");

	        for (int i = 0; i < n; i++) {
	            numericArray[i] = scanner.nextInt();
	        }

	        // Sorting numeric array
	        Arrays.sort(numericArray);

	        // Displaying sorted numeric array
	        System.out.println("Sorted numeric array: " + Arrays.toString(numericArray));

	        // Sorting a string array
	        System.out.print("\nEnter the size of the string array: ");
	        int m = scanner.nextInt();

	        String[] stringArray = new String[m];
	        System.out.println("Enter the elements of the string array:");

	        for (int i = 0; i < m; i++) {
	            stringArray[i] = scanner.next();
	        }

	        // Sorting string array
	        Arrays.sort(stringArray);

	        // Displaying sorted string array
	        System.out.println("Sorted string array: " + Arrays.toString(stringArray));

	        // Closing the scanner
	        scanner.close();
	    }
}
