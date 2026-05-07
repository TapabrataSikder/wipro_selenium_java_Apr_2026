package Control_Statements;

import java.util.Scanner;

public class Loan_approve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter salary: ");
        int salary = sc.nextInt();

        if (age >= 21 && salary >= 25000) {
            System.out.println("Eligible for loan");
        } else {
            System.out.println("Not eligible for loan");
        }

	}

}
