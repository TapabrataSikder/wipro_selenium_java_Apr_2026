package Control_Statements;

import java.util.Scanner;

public class Reverse_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;      
            reverse = reverse * 10 + digit; 
            num /= 10;                 
        }

        System.out.println("Reversed Number: " + reverse);

	}

}
