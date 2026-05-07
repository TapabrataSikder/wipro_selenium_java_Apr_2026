package Control_Statements;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int temp = num; 
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        if (temp == reverse) {
            System.out.println(temp + " is a Palindrome.");
        } else {
            System.out.println(temp + " is not a Palindrome.");
        }

	}

}
