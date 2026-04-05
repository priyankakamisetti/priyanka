package a9p4countdigits;

public class CountDigits {
	public static void main(String[] args) {
		int n=4823;
		int count=0;
		while (n != 0) {
            n = n / 10;
            count++;
		}
		System.out.println("Number of didgits:" +count);
	
		}
	}


