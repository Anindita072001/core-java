package constractor;

public class Student {
	
	    private String name;

	    // Constructor with default name as "Unknown"
	    public Student() {
	        this.name = "Unknown";
	    }

	    // Constructor with a parameterized name
	    public Student(String name) {
	        this.name = name;
	    }

	    // Method to get the name of the student
	    public String getName() {
	        return name;
	    }

	    public static void main(String[] args) {
	        // Creating a student object with default name
	        Student student1 = new Student();
	        System.out.println("Student 1 name: " + student1.getName());

	        // Creating a student object with a specified name
	        Student student2 = new Student("John");
	        System.out.println("Student 2 name: " + student2.getName());
	    }
	}
	


