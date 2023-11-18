package array;

public class Missing {
	public static void main(String[] args) {
        // Predefined array with a missing number
        int[] array = {1, 2, 3, 5, 6, 7, 8, 9, 10};

        // Finding the missing number
        int missingNumber = findMissingNumber(array);

        // Displaying the missing number
        System.out.println("The missing number in the array is: " + missingNumber);
    }

    // Method to find the missing number in an array
    private static int findMissingNumber(int[] array) {
        int n = array.length + 1; // Size of the array if the number was not missing
        int totalSum = (n * (n + 1)) / 2; // Sum of natural numbers up to n
        int arraySum = 0;

        for (int num : array) {
            arraySum += num;
        }

        return totalSum - arraySum;
    }
}
