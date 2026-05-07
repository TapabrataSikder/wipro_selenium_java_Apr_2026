package Switch_case;

import java.util.Scanner;

public class Food_item {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Food Menu -----");
        System.out.println("1:  Burger");
        System.out.println("2:  Pizza");
        System.out.println("3:  Pasta");
        System.out.println("4:  Sandwich");
        System.out.println("5:  Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Food: Burger");
                System.out.println("Price: ₹150");
                break;

            case 2:
                System.out.println("Food: Pizza");
                System.out.println("Price: ₹300");
                break;

            case 3:
                System.out.println("Food: Pasta");
                System.out.println("Price: ₹200");
                break;

            case 4:
                System.out.println("Food: Sandwich");
                System.out.println("Price: ₹100");
                break;

            case 5:
                System.out.println("Exiting... Thank you!");
                break;

            default:
                System.out.println("Invalid choice!");
        }


	}

}
