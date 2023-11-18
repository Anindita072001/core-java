package inheritanceandPolymorphism;
class Vehicle {
    private int speed;

    public void speedUp() {
        System.out.println("Speeding up the vehicle");
        speed += 5;
        System.out.println("Current speed: " + speed + " km/h");
    }
}

// Subclass Car
class Car extends Vehicle {
    @Override
    public void speedUp() {
        System.out.println("Accelerating the car");
        super.speedUp(); // Calling the base class method
        System.out.println("Car-specific speed increase");
    }
}

// Subclass Bicycle
class Bicycle extends Vehicle {
    @Override
    public void speedUp() {
        System.out.println("Pedaling the bicycle");
        super.speedUp(); // Calling the base class method
        System.out.println("Bicycle-specific speed increase");
    }
}

public class First {
	 public static void main(String[] args) {
	        // Creating instances of Car and Bicycle
	        Car myCar = new Car();
	        Bicycle myBicycle = new Bicycle();

	        // Speeding up the car and bicycle
	        myCar.speedUp();
	        System.out.println(); // Adding a line break for clarity
	        myBicycle.speedUp();
	    }
}
