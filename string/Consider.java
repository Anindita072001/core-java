package string;
import java.util.Scanner;
public class Consider {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Comparing strings ignoring case
        boolean isEqualIgnoreCase = compareStringsIgnoreCase(firstString, secondString);

        // Displaying the result
        if (isEqualIgnoreCase) {
            System.out.println("The strings are equal (ignoring case).");
        } else {
            System.out.println("The strings are not equal (ignoring case).");
        }

        // Closing the scanner
        scanner.close();
    }

    // Method to compare two strings ignoring case
    private static boolean compareStringsIgnoreCase(String firstString, String secondString) {
        return firstString.equalsIgnoreCase(secondString);
    }
}
