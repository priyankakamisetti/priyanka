package javamethodtypes;

public class MethodType1 {
	
	public static void main(String args[]) {
		 MethodTypes obj = new MethodTypes();
		 //no parameters no return
		 obj.printnumbers();
	
	
    // no parameter with return
	
	int fixedNumber = obj.fixedNumber();
    System.out.println("Fixed Number: " + fixedNumber);
    
    //with parameter no return
    
    obj.printTable(5);
    
    
    //with parameter with return
    
    int max = obj.Max(10, 20);
    System.out.println("Maximum number: " + max);
}
}