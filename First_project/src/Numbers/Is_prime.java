package Numbers;

import java.util.Scanner;

public class Is_prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		boolean isPrime = true;
		
		if(num <= 1) {
			isPrime = false;
		}
		else {
			for(int i=2; i<Math.sqrt(num); i++) {
				if(num%i == 0)
				{
					isPrime = false;
					break;
				}
			}
		}
		if(isPrime) {
			System.out.print(num+" is Prime number");
		}
		else {
			System.out.print(num+" is not prime number");
		}
	}

}
