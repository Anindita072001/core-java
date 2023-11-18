package array;
import java.util.Scanner;

public class Remove {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Taking input from the user for array size and elements
	        System.out.print("Enter the size of the array: ");
	        int n = scanner.nextInt();

	        int[] array = new int[n];
	        System.out.println("Enter the elements of the array:");

	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }

	        // Taking input for the element to be removed
	        System.out.print("Enter the element to be removed: ");
	        int elementToRemove = scanner.nextInt();

	        // Removing the specified element
	        array = removeElementFromArray(array, elementToRemove);

	        // Displaying the updated array
	        System.out.println("Array after removing " + elementToRemove + ": ");
	        for (int value : array) {
	            System.out.print(value + " ");
	        }

	        // Closing the scanner
	        scanner.close();
	    }

	    // Method to remove a specific element from an array
	    private static int[] removeElementFromArray(int[] array, int elementToRemove) {
	        int newSize = array.length - 1;
	        int[] newArray = new int[newSize];

	        int index = 0;
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] != elementToRemove) {
	                newArray[index++] = array[i];
	            }
	        }

	        return newArray;
	    }
}
