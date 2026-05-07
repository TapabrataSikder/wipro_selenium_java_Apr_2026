package Switch_case;

import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Currency -----");
        System.out.println("1: INR to USD");
        System.out.println("2: INR to EUR");
        System.out.println("3: INR to GBP");

        System.out.print("Enter your choices from 1 to 3: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount in INR: ");
        double amount = sc.nextDouble();

        double result;

        switch (choice) {
            case 1:
                result = amount * 0.012; 
                System.out.println("USD: " + result);
                break;

            case 2:
                result = amount * 0.011; 
                System.out.println("EUR: " + result);
                break;

            case 3:
                result = amount * 0.0095; 
                System.out.println("GBP: " + result);
                break;

            default:
                System.out.println("Invalid choice");
        }
	}

}
