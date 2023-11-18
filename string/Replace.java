package string;
import java.util.Scanner;
public class Replace {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to replace: ");
        char charToReplace = scanner.next().charAt(0);

        System.out.print("Enter the replacement character: ");
        char replacementChar = scanner.next().charAt(0);

        // Replacing the specified character
        String resultString = replaceCharacter(inputString, charToReplace, replacementChar);

        // Displaying the result
        System.out.println("Result after replacement: " + resultString);

        // Closing the scanner
        scanner.close();
    }

    // Method to replace a specified character in a string
    private static String replaceCharacter(String inputString, char charToReplace, char replacementChar) {
        return inputString.replace(charToReplace, replacementChar);
    }
}
