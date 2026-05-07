package Encapsulation_prac;

class BankAccount{
	private double balance;
	
	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
			System.out.println("Deposited: "+amount);
		}
		else System.out.println("Invalid amount");
	}
	
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance -= amount;
			System.out.println("Withdrawn: "+amount);
		}
		else System.out.println("Invalid balance");
	}
	
	public double getBalance() {
//		System.out.println("balance: "+balance);
		return balance;
	}
}

public class BankDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc=new BankAccount();
		
		acc.deposit(5000);
		acc.withdraw(2000);
		System.out.println("Balance: "+acc.getBalance());
		
		Student st = new Student();
		st.getname("tapa");
		st.fees(3000);
		int studentfees =  st.getamount();
		acc.deposit(studentfees);
		
		System.out.println("Public (Roll): " + st.roll);  
        System.out.println("Protected (Name): " + st.name);
//        System.out.println(st.amount); //amount is protected in Student class
        System.out.println("Final Bank Balance: " + acc.getBalance());
        

;	}

}
