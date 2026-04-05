package javainterface;

public class VehicleDemo1 {
public static void main(String[] args) {
	
  Car a=new Car("Scoda");
     a.start();
     a.showFuelType();
     a.getSpeed();
     a.display();
     System.out.println("MAX_SPEED: " + Vehicle.MAX_SPEED);  
     Bike b=new Bike();
     b.start();
     b.showFuelType();
     b.getSpeed();

     
     System.out.println("MAX_SPEED: " + Vehicle.MAX_SPEED);
     
}
}