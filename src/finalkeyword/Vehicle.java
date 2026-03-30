package finalkeyword;

public class Vehicle{
	    final int MAX_SPEED = 120;
	    final void startEngine() {
	        System.out.println("Engine started in Vehicle");
	    }
	}

class Car extends Vehicle{ 
     void changeSpeed() {
        System.out.println("Engine started in Car");
    }
    
}

 class VehilceTest {
    public static void main(String[] args) {
        Car c = new Car();
        c.startEngine();
        System.out.println("Max Speed: " + c.MAX_SPEED);
    }
}