package Control_Statements;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter terms: ");
        int n = sc.nextInt();
        
        int first = 0;
        int second = 1;
        int i = 1; 
        
        System.out.println("Fibonacci Series up to " + n + " terms:");
        
        while (i <= n) {
            System.out.print(first + " ");

            int temp = first + second;
            first = second;
            second = temp;          
            i++; 

	}

}
	}
