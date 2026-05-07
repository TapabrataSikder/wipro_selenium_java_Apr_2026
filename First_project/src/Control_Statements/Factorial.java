package Control_Statements;

import java.util.Scanner;

// Factorial 

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int a = sc.nextInt();
		
		int fact = 1;

		while(a>0) {
			fact *= a;
			a--;
		}
		
		System.out.print("Factorial is: "+fact);
		
		sc.close();
	}

}
