package session6;

public class BankAccount {
	private int balance;

	public BankAccount(int initialBalance) {
		this.balance = initialBalance;
	}

	// TODO: Implement deposit and withdraw methods
	public synchronized void withdraw(int money) {
		//if(this.balance - money < 0) {throw new IllegalArgumentException("Nicht genügend Geld auf dem Konto!");}
		this.balance = this.balance - money;
	}
	public synchronized void deposit(int money) {
		this.balance += money;
	}
	
	public int getBalance() {
		return balance;
	}
}

class TransactionThread extends Thread{
	private BankAccount account;
	
	
	
	public void run(){
		
	}
	
}

 class BankAccountSimulator {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000);
		// TODO: Create and start two threads that each perform:
		// - 1000 deposits of 1
		// - 1000 withdrawals of 1
		TransactionThread instance1 = new TransactionThread();
		TransactionThread instance2 = new TransactionThread();
		
		instance1.run();
		instance2.run();

		
		// TODO: Wait for threads to finish using join ()
		System.out.println(" Final balance: " + account.getBalance());
	}

}
