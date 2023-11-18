package conditionalANDcontrolflow;

public class Triangle {
	
	    public static void main(String[] args) {
	        int n = 10; // Change this value to adjust the number of rows

	        // Loop to iterate through each row
	        for (int i = 1; i <= n; i++) {
	            // Loop to print numbers in each row
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }
	            // Move to the next line after each row
	            System.out.println();
	        }
	    }
	
}
