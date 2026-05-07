package Wrapper_Class;

import java.util.Scanner;

public class Char_is_dig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        
        if (Character.isDigit(ch)) {
            System.out.println(ch + " is a Digit.");
        } else {
            System.out.println(ch + " is not a Digit.");
        }
	}

}
