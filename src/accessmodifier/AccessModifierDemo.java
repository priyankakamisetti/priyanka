package accessmodifier;

public class AccessModifierDemo {
	
	private int privateVar=10; 
	protected int protectedVar=20;
	public int publicVar=30;
	
	public void display() {
		System.out.println("Inside parent class");
		System.out.println("private:" +privateVar);
		System.out.println("protected:" +protectedVar);
		System.out.println("public:" +publicVar);
	}

}

