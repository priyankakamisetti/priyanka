package s9p8productofdigits;

public class ProductOfDigits {
public static void main(String[] args) {
	int n=234;
    int product=1;
    while(n!=0) {
		int digit=n%10;
		product=product*digit;
		n=n/10;
    }
    System.out.println("product of digits=" +product);
}
}
