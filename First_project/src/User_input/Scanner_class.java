package User_input;

import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		System.out.println("Name is: "+name);
		System.out.print("Age is: "+age);
	}

}
