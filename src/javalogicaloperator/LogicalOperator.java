package javalogicaloperator;

public class LogicalOperator {
	
	public static void main(String args[]) {
		int age = 10;
	    int height = 165;

	    boolean entryAllowed = (age > 5) && (height < 180);

	    System.out.println("Is entry allowed? " + entryAllowed);
	    
	    //program7
	    
	    boolean Isstudent=false;
	    boolean HasMembership=true;
	    boolean customerhasdiscount = (Isstudent || HasMembership);
	    System.out.println("customerhasdiscount:" +customerhasdiscount);
	    
	    //program8
	    
	    boolean IsLocked=true;
	    boolean IsUnLocked=!IsLocked;
	    System.out.println("Is door is unlocked:" +IsUnLocked);
	     

}
}