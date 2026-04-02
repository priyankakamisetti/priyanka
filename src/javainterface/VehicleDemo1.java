package javainterface;

public class VehicleDemo1 {
public static void main(String[] args) {
	
  Car a=new Car();
     a.start();
     a.showFuelType();
     a.getSpeed();
     System.out.println("MAX_SPEED: " + Vehicle.MAX_SPEED);  
     Bike b=new Bike();
     b.start();
     b.showFuelType();
     b.getSpeed();

     
     System.out.println("MAX_SPEED: " + Vehicle.MAX_SPEED);
     
}
}