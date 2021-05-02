package activities;

public class Car {
	
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	Car() {
		
		tyres = 4;
		doors = 4;
		
	}
	
	void displaycharacteristics() {
		
		System.out.println("Color of the Car is " +color);
		System.out.println("Transmission of the Car is " +transmission);
		System.out.println("Make of the Car is "+make);
		System.out.println("No. of Tyres in the Car is "+tyres);
		System.out.println("No. of Doors in the Car is "+doors);	
		
	}
	
	void accelerate() {
		
		System.out.println("Car is moving forward.");
		
	}
	
	void brake() {
		
		System.out.println("Car has stopped.");
		
	}

}
