package javainterface;

interface Vehicle{
	int MAX_SPEED=120;
	void start();
	void showFuelType();
	void getSpeed();
}
class Car implements Vehicle{
	String brand;
	int Speed=80;
	
	Car(String brand){
		this.brand=brand;
	}
	 void display() {
		System.out.println("Brand:" +brand);
	}
	public void start() {
		System.out.println("Start the Car");
	}
	public void showFuelType() {
		System.out.println("petrol");
	}
	public void getSpeed() {
		System.out.println("speed:" +80);
		
    }
}

class Bike implements Vehicle{
	String model;
	int speed=60;
	public void start() {
		System.out.println("Start the Bike");
	}
	public void showFuelType() {
		System.out.println("petrol/Electrical");
	}
	public void getSpeed() {
		System.out.println("speed:" +60);
}
}

public class VehicleDemo {
	

}
