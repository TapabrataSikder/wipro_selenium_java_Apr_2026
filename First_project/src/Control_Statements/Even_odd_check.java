package Control_Statements;

import java.util.Scanner;

public class Even_odd_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=sc.nextInt();
		if(num%2 == 0) {
			System.out.print(num+" is even");
		}
		else
			System.out.print(num+ " is odd");

	}

}
