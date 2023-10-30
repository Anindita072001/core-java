package scanner;
import java.util.Scanner;
public class SameLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the first string
	        System.out.print("Enter the first string: ");
	        String str1 = scanner.nextLine();

	        // Prompt the user to enter the second string
	        System.out.print("Enter the second string: ");
	        String str2 = scanner.nextLine();

	        // Close the scanner to avoid resource leaks
	        scanner.close();

	        // Concatenate and print the strings on the same line
	        System.out.println("OUTPUT : " + str1 + str2);
	}

}
