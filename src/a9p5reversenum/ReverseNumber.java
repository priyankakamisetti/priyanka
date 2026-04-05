package a9p5reversenum;

public class ReverseNumber {
	public static void main(String[] args) {
		int n = 1234;
        int reverse=0;

        while (n != 0) {
            int digit = n % 10;          // get last digit
           reverse=reverse * 10 + digit; // build reversed number
            n = n / 10;                 // remove last digit
        }

        System.out.println("Reverse number: " + reverse);
	}

}
