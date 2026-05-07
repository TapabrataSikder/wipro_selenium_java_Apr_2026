package Switch_case;

import java.util.Scanner;

public class User_role {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter role (Admin/User/Guest): ");
        String role = sc.nextLine();

        if (role.equalsIgnoreCase("Admin")) {
            System.out.println("Access: Full access to system");
        } else if (role.equalsIgnoreCase("User")) {
            System.out.println("Access: Limited access");
        } else if (role.equalsIgnoreCase("Guest")) {
            System.out.println("Access: View only");
        } else {
            System.out.println("Invalid role");
        }

	}

}
