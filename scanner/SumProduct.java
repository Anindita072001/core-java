package scanner;
import java.util.Scanner;
public class SumProduct {
	 public static void main(String[] args) {
	        // Create a Scanner object to take user input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the first integer
	        System.out.print("Enter the first integer: ");
	        int num1 = scanner.nextInt();

	        // Prompt the user to enter the second integer
	        System.out.print("Enter the second integer: ");
	        int num2 = scanner.nextInt();

	        // Close the scanner to avoid resource leaks
	        scanner.close();

	        // Calculate the sum and product
	        int sum = num1 + num2;
	        int product = num1 * num2;

	        // Print the sum and product on the screen
	        System.out.println("Sum: " + sum);
	        System.out.println("Product: " + product);
	    }
}
