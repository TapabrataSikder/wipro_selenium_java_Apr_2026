package Control_Statements;

import java.util.Scanner;

public class NUm_of_dig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int c=0;

        while (num>0) {
            num /=10;
            c++;
        }
        System.out.println("Number of digits: "+c);

	}

}
