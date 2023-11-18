package conditionalANDcontrolflow;

public class Pascal {

	public static void main(String[] args) {
        int numRows = 5; // Change this value to adjust the number of rows

        for (int i = 0; i < numRows; i++) {
            // Print spaces for alignment
            for (int j = 0; j < numRows - i; j++) {
                System.out.print(" ");
            }

            // Calculate and print the values in the current row
            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
