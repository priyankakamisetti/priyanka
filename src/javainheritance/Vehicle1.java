package javainheritance;

public class Vehicle1 {
	public static void main(String [] args) {
		  
		Car obj1=new Car();
		obj1.brand="Scoda";
		System.out.println(obj1.brand);
		
		obj1.speed=120;
		System.out.println(obj1.speed);
		
		obj1.startEngine();
		obj1.doors=4;
		obj1.honk();
		obj1.stop();
    
	}

}
