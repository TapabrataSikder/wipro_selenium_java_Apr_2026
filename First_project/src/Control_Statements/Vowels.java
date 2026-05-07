package Control_Statements;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter character: ");
		char ch = sc.next().charAt(0); 
		char temp=ch;
		ch = Character.toLowerCase(ch);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			System.out.println("Character " + temp + " is vowel");
		else System.out.println("Character " + temp + " is consonant");
	}

}
