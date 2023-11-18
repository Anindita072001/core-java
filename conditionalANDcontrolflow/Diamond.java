package conditionalANDcontrolflow;

public class Diamond {

	 public static void main(String[] args) {
	        int n = 5; // Change this value to adjust the size of the diamond

	        // Upper part of the diamond
	        for (int i = 1; i <= n; i++) {
	            // Print spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                System.out.print("*");
	            }

	            // Move to the next line
	            System.out.println();
	        }

	        // Lower part of the diamond (excluding the center row)
	        for (int i = n - 1; i >= 1; i--) {
	            // Print spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                System.out.print("*");
	            }

	            // Move to the next line
	            System.out.println();
	        }
	    }
}
