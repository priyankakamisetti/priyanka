package polymorphism;

public class Calculator1 {

	 public static void main(String[] args) {
	        Calculator calc = new Calculator();

	        
	        System.out.println("Sum of 2 integers: " + calc.add(10, 20));
	        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 4.5));
	        System.out.println("Sum of 3 integers: " + calc.add(1, 2, 3));
	 }
	

}