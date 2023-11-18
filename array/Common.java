package array;
import java.util.HashSet;
import java.util.Set;
public class Common {
	public static void main(String[] args) {
        // Predefined integer arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        // Finding common elements
        int[] commonElements = findCommonElements(array1, array2);

        // Displaying the common elements
        System.out.println("Common elements between the two arrays: ");
        for (int element : commonElements) {
            System.out.print(element + " ");
        }
    }

    // Method to find common elements between two arrays
    private static int[] findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commonSet = new HashSet<>();

        for (int num : array1) {
            set1.add(num);
        }

        for (int num : array2) {
            if (set1.contains(num)) {
                commonSet.add(num);
            }
        }

        // Convert the set to an array
        int[] commonElements = new int[commonSet.size()];
        int index = 0;
        for (int num : commonSet) {
            commonElements[index++] = num;
        }

        return commonElements;
    }
}
