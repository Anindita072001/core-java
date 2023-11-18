package conditionalANDcontrolflow;
import java.util.Scanner;

public class Greatest {
	 public static void main(String[] args) {
	        // Create a Scanner object to take input from the user
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter three numbers
	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        System.out.print("Enter the third number: ");
	        double num3 = scanner.nextDouble();

	        // Close the scanner to avoid resource leaks
	        scanner.close();

	        // Find the greatest number among the three
	        double greatestNumber = findGreatestNumber(num1, num2, num3);

	        // Print the result
	        System.out.println("The greatest number is: " + greatestNumber);
	    }

	    // Method to find the greatest number among three numbers
	    private static double findGreatestNumber(double num1, double num2, double num3) {
	        double greatest = num1;

	        if (num2 > greatest) {
	            greatest = num2;
	        }

	        if (num3 > greatest) {
	            greatest = num3;
	        }

	        return greatest;
	    }
}
