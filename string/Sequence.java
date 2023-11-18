package string;
import java.util.Scanner;
public class Sequence {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the sequence to check for: ");
        String sequence = scanner.nextLine();

        // Checking if the string contains the specified sequence
        boolean containsSequence = checkSubstring(inputString, sequence);

        // Displaying the result
        if (containsSequence) {
            System.out.println("The string contains the specified sequence.");
        } else {
            System.out.println("The string does not contain the specified sequence.");
        }

        // Closing the scanner
        scanner.close();
    }

    // Method to check if a string contains a specified sequence
    private static boolean checkSubstring(String inputString, String sequence) {
        return inputString.contains(sequence);
    }
}
