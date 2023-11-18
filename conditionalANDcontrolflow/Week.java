package conditionalANDcontrolflow;
import java.util.Scanner;
public class Week {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number between 1 and 7: ");
        int number = scanner.nextInt();

        // Checking if the input is within the valid range
        if (number >= 1 && number <= 7) {
            // Generating weekday name based on the input
            String weekday = getWeekdayName(number);

            // Displaying the result
            System.out.println("The weekday is: " + weekday);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }

       
        scanner.close();
    }

    
    private static String getWeekdayName(int number) {
        switch (number) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "Invalid day";
        }
    }
}
