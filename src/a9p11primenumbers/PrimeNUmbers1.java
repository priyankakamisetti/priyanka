package a9p11primenumbers;

public class PrimeNUmbers1 {
public static void main(String[] args) {
	int N = 20;  // change value

    System.out.println("Prime numbers between 1 and " + N + ":");

    for (int i = 2; i <= N; i++) {
        boolean isPrime = true;

        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.print(i + " ");
        }
    }
}
}
