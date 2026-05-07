package Switch_case;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	        
	double balance = 5000.00; 
	int choice;
	boolean isRunning = true; 
	
	System.out.println("ATM ---");
	
	while (isRunning) {
	    System.out.println("Select Operation:");
	    System.out.println("1: Check Balance");
	    System.out.println("2: Deposit");
	    System.out.println("3: Withdraw");
	    System.out.println("4: Exit");
	    System.out.print("Enter choice: ");
	    
	    choice = sc.nextInt();
	
	    switch (choice) {
	        case 1:
	            System.out.println("Current Balance: Rs." + balance);
	            break;
	
	        case 2:
	            System.out.print("Enter deposit amount: ");
	            double deposit = sc.nextDouble();
	            if (deposit > 0) {
	                balance += deposit;
	                System.out.println("Deposited. New Balance: Rs." + balance);
	            } else {
	                System.out.println("Invalid amount.");
	            }
	            break;
	
	        case 3:
	            System.out.print("Enter withdrawal amount: ");
	            double withdraw = sc.nextDouble();
	            if (withdraw > 0 && withdraw <= balance) {
	                balance -= withdraw;
	                System.out.println("Withdrawn. Remaining Balance: Rs." + balance);
	            } else if (withdraw > balance) {
	                System.out.println("Error: Insufficient amount.");
	            } else {
	                System.out.println("Error: Invalid amount.");
	            }
	            break;
	
	        case 4:
	            System.out.println("Thank you.");
	            isRunning = false; 
	            break;
	
	        default:
	            System.out.println("Invalid choice. Try again.");
	    }
	}
	}
}
