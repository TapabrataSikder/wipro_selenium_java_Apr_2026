package Numbers;

import java.util.Scanner;

public class Smallest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int num1=sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int num2=sc.nextInt();
		System.out.print("Enter 3rd number: ");
		int num3=sc.nextInt();
		
		if(num1<num2 && num1<num3)
			System.out.print("First number is the smallest");
		else if(num2<num3 && num2<num1)
			System.out.print("Second number is the smallest");
		else
			System.out.print("Third number is the smallest");


	}

}
