package com.math.operations;

abstract class Bank{
	abstract double getInterest();
	
	void display() {
		System.out.println("Bank Details");
	}
}

class SBI extends Bank{
	double getInterest() {
		return 5.5;		
	}
}

class CBI extends Bank{
	double getInterest() {
		return 4.5;
	}
	
}

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b1 = new SBI();
        Bank b2 = new CBI();
        
        b1.display();
        System.out.println("SBI Interest Rate: " + b1.getInterest() + "%");
        System.out.println("CBI Interest Rate: " + b2.getInterest() + "%");
	}

}
