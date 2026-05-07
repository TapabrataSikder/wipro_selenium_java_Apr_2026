package Multi_thread;

class Account {
    private double balance = 0;

    public synchronized void deposit(double amount) {
        System.out.println(Thread.currentThread().getName() + " is depositing: " + amount);
        balance += amount;
        System.out.println("New Balance after deposit: " + balance);
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing: " + amount);
            balance -= amount;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " failed! Insufficient funds for: " + amount);
        }
    }
}

public class Bank_accnt {
		public static void main(String[] args) {
			Account myAccount = new Account();
			Thread t1 = new Thread(() -> {
	            for (int i = 0; i < 3; i++) {
	                myAccount.deposit(100);
	            }
	        },"Depositor-1");
			
			Thread t2 = new Thread(() -> {
	            for (int i = 0; i < 3; i++) {
	                myAccount.withdraw(50);
	            }
	        }, "Withdrawer-1");
			
			t1.start();
			t2.start();
	}

}
