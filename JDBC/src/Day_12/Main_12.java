package Day_12;
import java.util.Scanner;

public class Main_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Username: ");
        String user = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();

        if (!Login.login(user, pass)) {
            System.out.println("Database Login failed. Access Denied.");
            return;
        }        
        
        while (true) {
            System.out.println("\nStudent Management Menu ");
            System.out.println("1. Register Student");
            System.out.println("2. View All Students");
            System.out.println("3. View Recent (Last 7 Days)");
            System.out.println("4. Show Age Stats (Grouping)");
            System.out.println("5. Update Salary");
            System.out.println("6. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> User_input.userInput(sc);
                case 2 -> User_input.showStudent();
                case 3 -> User_input.viewRecentStudents();
                case 4 -> User_input.showCountByAge();
                case 5 -> User_input.updateBonusSalary();
                case 6 -> { return; }
                default -> System.out.println("Invalid option");
            }
        }
    }
}