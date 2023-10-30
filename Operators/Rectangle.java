package Operators;

public class Rectangle {
	public static void main(String[] args) {
        // Define the length and breadth of the rectangle
        int length = 5;
        int breadth = 7;

        // Calculate the area of the rectangle
        int area = length * breadth;

        // Calculate the perimeter of the rectangle
        int perimeter = 2 * (length + breadth);

        // Print the area and perimeter on the screen
        System.out.println("Area of the rectangle: " + area + " square units");
        System.out.println("Perimeter of the rectangle: " + perimeter + " units");
    }
}
