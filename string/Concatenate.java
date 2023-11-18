package string;
import java.util.Scanner;
public class Concatenate {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Taking input from the user
	        System.out.print("Enter the first string: ");
	        String firstString = scanner.nextLine();

	        System.out.print("Enter the string to concatenate: ");
	        String secondString = scanner.nextLine();

	        // Concatenating the strings
	        String resultString = concatenateStrings(firstString, secondString);

	        // Displaying the result
	        System.out.println("Result after concatenation: " + resultString);

	        // Closing the scanner
	        scanner.close();
	    }

	    // Method to concatenate two strings
	    private static String concatenateStrings(String firstString, String secondString) {
	        return firstString + secondString;
	    }
}
