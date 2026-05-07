package Wrapper_Class;

import java.util.Scanner;

public class Compare_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a String1: ");
        String st1 = sc.nextLine();
        
        System.out.print("Enter a String2: ");
        String st2 = sc.nextLine();
        
        if (st1.equals(st2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal"); 
        }

        if (st1.equalsIgnoreCase(st2)) {
            System.out.println("Equal ignoring case"); 
        }
        
        System.out.println("Compare: "+st1.compareTo(st2));
        

	}

}
