package polymorphism;

public class Animal {
	void sound() {
		System.out.println("Animals makes a Sound");
}
}
	class Dog extends Animal{
		void sound() {
			System.out.println("Dog sounds bark");
		}
	}
	
	class Cat extends Animal{
		void sound() {
			System.out.println("cat sounds meow");
		}
	}
	
	class Cow extends Animal{
		void sound() {
			System.out.println("Cow sounds moo");
		}
	}
	
	

	

