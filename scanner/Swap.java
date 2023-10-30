package scanner;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the first number
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        // Prompt the user to enter the second number
	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();

	        // Close the scanner to avoid resource leaks
	        scanner.close();

	        // Display the numbers before swapping
	        System.out.println("Before swapping:");
	        System.out.println("First number: " + num1);
	        System.out.println("Second number: " + num2);

	        // Swap the numbers using a third variable
	        int temp = num1;
	        num1 = num2;
	        num2 = temp;

	        // Display the numbers after swapping
	        System.out.println("\nAfter swapping:");
	        System.out.println("First number: " + num1);
	        System.out.println("Second number: " + num2);
	}

}
