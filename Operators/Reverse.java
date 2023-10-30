package Operators;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a 3-digit number
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        // Close the scanner to avoid resource leaks
        scanner.close();

        // Check if the entered number is a 3-digit number
        if (number >= 100 && number <= 999) {
            // Reverse the number
            int reversedNumber = 0;
            while (number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }

            // Print the reversed number
            System.out.println("Reversed number: " + reversedNumber);
        } else {
            System.out.println("Please enter a valid 3-digit number.");
        }
	}

}
