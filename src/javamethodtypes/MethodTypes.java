package javamethodtypes;

public class MethodTypes {
	
	//no parameters,no return(void methods)
	
	void printnumbers() {
		System.out.println("numbers from 1 to5:");
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		
	}
         
	//no parameters, with return
	
	int fixedNumber() {
		return 100;
	}

	     //with parameter no return
	
	 void printTable(int num) {
	        System.out.println("Multiplication table of " + num + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(num + " x " + i + " = " + (num * i));
	        }
	    }

	 
	 // with parameter with return
	 
	 int Max(int a, int b) {
	        if (a > b) {
	            return a;
	        } else {
	            return b;
	        }
	    }
	
	
}


