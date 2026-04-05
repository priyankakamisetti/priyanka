package a9p9armstrong;

public class ArmstrongNumber {
public static void main(String[] args) {
	int n=153;
	int original = n;
    int sum = 0;
    int digits = 0;

    //Count digits
    int temp = n;
    while (temp != 0) {
        digits++;
        temp = temp / 10;
    }

    // Calculate sum of powers
    temp = n;
    while (temp != 0) {
        int digit = temp % 10;
        sum += Math.pow(digit, digits);
        temp = temp / 10;
    }

    System.out.println("Original Number: " + original);
    System.out.println("Calculated Sum: " + sum);

    // Step 3: Check
    if (sum == original) {
        System.out.println("Armstrong Number ");
    } else {
        System.out.println("Not an Armstrong Number ");
    }
    
    
    
    //num=370
    int m=370;
	int original1 = m;
    int sum1 = 0;
    int digits1 = 0;

    //Count digits
    int temp1 = m;
    while (temp1 != 0) {
        digits1++;
        temp1 = temp1 / 10;
    }

    // Calculate sum of powers
    temp1 = m;
    while (temp1 != 0) {
        int digit1 = temp1 % 10;
        sum += Math.pow(digit1, digits);
        temp1 = temp1 / 10;
    }

    System.out.println("Original Number: " + original1);
    System.out.println("Calculated Sum: " + sum);

    // Step 3: Check
    if (sum == original) {
        System.out.println("Armstrong Number ");
    } else {
        System.out.println("Not an Armstrong Number ");
    }
    
    
    
}

}

