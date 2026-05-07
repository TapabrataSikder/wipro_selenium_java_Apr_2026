package Wrapper_Class;

import java.util.Scanner;

public class Change_value {
	
	public static void modify(int n) {
		System.out.println("Inside method (before change): " + n);
        n = 100; 
        System.out.println("Inside method (after change): " + n);
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		System.out.println("Before: " + n);
        
        modify(n);
        
        System.out.println("After: " + n);

	}

}
