package string;
import java.util.Scanner;
public class Character {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the index to get the character: ");
        int index = scanner.nextInt();

       
        if (index >= 0 && index < inputString.length()) {
           
            char character = inputString.charAt(index);

           
            System.out.println("The character at index " + index + " is: " + character);
        } else {
            System.out.println("Invalid index. Please enter a valid index within the string length.");
        }

        // Closing the scanner
        scanner.close();
    }
}
