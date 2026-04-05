package As9p1evennum;

public class SumOfEvenNumber {
	public static void main(String[] args) {
		int N=10;
		int sum=0;
		for(int i=1;i<=N;i+=1) {
			if(i%2==0) {
			sum+=i;
			System.out.println("Even Number:" +i);
			}
		}
		
		System.out.println("Sum of even Numbers from 1 to" +N + "is:" +sum);
	}
}