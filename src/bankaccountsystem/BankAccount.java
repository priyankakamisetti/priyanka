package bankaccountsystem;

public class BankAccount{
	private int balance;

	void deposit(int amount) {
		balance+=amount;
		System.out.println("Amount deposited:" +amount);
	}
	
	void withdraw(int amount) {
		if(amount<=balance) {
		balance-=amount;
		System.out.println("withdraw:" +amount);
		}else {
			System.out.println("Insufficient Balance");
		}
		
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
class savingAccount extends BankAccount{
	int balance=1000;
	void withdraw(int amount) {
		if(amount>=balance) {
		balance-=amount;
		System.out.println("withdraw:" +amount);
		}else {
			System.out.println("Insufficient Balance");
		}
}
}
class CurrentAccount extends BankAccount{
	int balance=1000;
	void withdraw(int amount) {
		if(amount<=balance) {
		balance-=amount;
		System.out.println("withdraw:" +amount);
		}else {
			System.out.println("Insufficient Balance");
		}
}
}



public class BankAccountDetails{
	public static void main(String[] args) {
		savingAccount s=new savingAccount();
        CurrentAccount c=new CurrentAccount();

        s.withdraw(1700);
        s.withdraw(1000); 

        c.withdraw(1500); 
        c.withdraw(1000);

        System.out.println("Savings Balance: " + s.getBalance());
        System.out.println("Current Balance: " + c.getBalance());
    }
}




