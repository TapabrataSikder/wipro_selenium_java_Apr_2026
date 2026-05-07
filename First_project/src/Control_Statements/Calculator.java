package Control_Statements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		System.out.print("Enter operator: ");
		char op = sc.next().charAt(0);
		
		switch(op) {
		case '+': System.out.println("Result: " + (a + b));
		break;
		case '-': System.out.println("Result: " + (a - b));
		break;
		case '*': System.out.println("Result: " + (a * b));
		break;
		case '/': System.out.println("Result: " + (double)a / b);
		break;
		
		
		default: System.out.print("Invalid");
			
		}

	}

}


