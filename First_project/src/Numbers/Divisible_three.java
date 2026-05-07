package Numbers;

import java.util.Scanner;

public class Divisible_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=sc.nextInt();
		
		if (num % 3 != 0 && num % 7 != 0) {
            System.out.println(num + " is not divisible by 3 nor 7");
        } else if(num % 3 == 0 || num % 7 == 0){
        	
            System.out.println(num + " is divisible by 3 or 7");
        }

	}

}
