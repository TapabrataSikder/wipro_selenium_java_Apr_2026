package Numbers;

import java.util.Scanner;

public class Positive_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=sc.nextInt();
		
		if(num<0)
			System.out.println("Number is negative");
		else
			System.out.println("Number is positive");
		

	}

}
