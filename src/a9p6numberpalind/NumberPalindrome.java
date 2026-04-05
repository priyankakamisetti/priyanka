package a9p6numberpalind;

public class NumberPalindrome {
	public static void main(String[] args){
      int n=1221;
      int original=n;
      int reversed=0;
      
      while(n!=0) {
    	  int digit=n%10;
    	  reversed=reversed * 10 +digit;
    	  n=n/10;
      }
      System.out.println("Original Number:" +original);
      System.out.println("Reversed Number:" +reversed);
      
      if(original==reversed) {
    	  System.out.println("Palindrome");
      }
      else {
    	  System.out.println("Not Palindrome");
      }
      
	



//not palindrome
      
int m=1234;
int original1=m;
int reversed1=0;

while(m!=0) {
	  int digit=m%10;
	  reversed1=reversed1 * 10 +digit;
	  m=m/10;
}
System.out.println("Original Number:" +original1);
System.out.println("Reversed Number:" +reversed1);

if(original1==reversed1) {
	  System.out.println("Palindrome");
}
else {
	  System.out.println("Not Palindrome");
}
}
}




