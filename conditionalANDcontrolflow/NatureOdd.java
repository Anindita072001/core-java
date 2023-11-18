package conditionalANDcontrolflow;
import java.util.Scanner;
public class NatureOdd {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Taking input from the user
	        System.out.print("Enter the value of n: ");
	        int n = scanner.nextInt();

	        // Calculating the sum of n odd natural numbers
	        int sum = calculateSumOfOddNumbers(n);

	        // Displaying the result
	        System.out.println("The sum of the first " + n + " odd natural numbers is: " + sum);

	        // Closing the scanner
	        scanner.close();
	    }

	    
	    private static int calculateSumOfOddNumbers(int n) {
	        int sum = 0;
	        int count = 1; // Starting with the first odd natural number

	        for (int i = 0; i < n; i++) {
	            sum += count;
	            count += 2; // Moving to the next odd natural number
	        }

	        return sum;
	    }
}
