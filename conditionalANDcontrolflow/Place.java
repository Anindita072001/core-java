package conditionalANDcontrolflow;
import java.util.Scanner;
public class Place {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Taking input from the user
	        System.out.print("Enter the first floating-point number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second floating-point number: ");
	        double num2 = scanner.nextDouble();

	        // Checking if the numbers are the same up to three decimal places
	        if (areEqualUpToThreeDecimalPlaces(num1, num2)) {
	            System.out.println("The numbers are the same up to three decimal places.");
	        } else {
	            System.out.println("The numbers are different.");
	        }

	        // Closing the scanner
	        scanner.close();
	    }

	    
	    private static boolean areEqualUpToThreeDecimalPlaces(double num1, double num2) {
	        
	        int intNum1 = (int) (num1 * 1000);
	        int intNum2 = (int) (num2 * 1000);

	        // Checking if the truncated numbers are the same
	        return intNum1 == intNum2;
	    }
}
