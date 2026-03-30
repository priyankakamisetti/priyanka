package javainheritance;

public class Vehicle {

	String brand;
	int speed;
	
	void startEngine() {
		System.out.println("Engine started");
	}
	
	void stop() {
		System.out.println("stop");
	}
}
//car
class Car extends Vehicle{
	int doors;

void honk() {
	System.out.println("car is honking");
}
}

//bike

class Bike extends Vehicle{
	Boolean hasSlideCar;
		
	void wheelie() {
		System.out.println("Bike is doing wheelie" );
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	