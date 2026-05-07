package Numbers;

import java.util.Scanner;

public class Voter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.print("You are eligible to vote");
		}
		else System.out.print("You are not eligible to vote");

	}

}
