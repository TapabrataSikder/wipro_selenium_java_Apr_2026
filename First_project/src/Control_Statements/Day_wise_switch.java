package Control_Statements;

import java.util.Scanner;

public class Day_wise_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Size: ");
		int size=sc.nextInt();
		
		switch(size)
		{
		case 26: System.out.println("Extra Small(XS)");
		break;
		case 28: System.out.println("Small(S)");
		break;
		case 30: System.out.println("Medium(M)");
		break;
		case 32: System.out.println("Large(L)");
		break;
		case 34: System.out.println("Extra Large(XL)");
		break;
		
		default: System.out.print("Invalid Size");
		}

	}

}
