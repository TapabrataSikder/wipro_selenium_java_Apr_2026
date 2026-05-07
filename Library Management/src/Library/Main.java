package Library;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Choose 1 for Authority | 2 for Student: ");
        int us=sc.nextInt();
        sc.nextLine();

        if(us==1) {

	        System.out.print("Username: ");
	        String user = sc.nextLine();
	        System.out.print("Password: ");
	        String pass = sc.nextLine();
	       
	        if (user.equals("admin") && pass.equals("admin123")) {
	        	adminMenu(sc);
	        }
	        else 
	        {
	        	System.out.println("Login failed.");
	        }
        }
        
        else if(us==2) {
        	studentMenu(sc);
        } 
        else {
        	System.out.println("Invalid Choice.");
        }
    }
    
    	public static void adminMenu(Scanner sc) {
            while (true) {
                System.out.println("\nAuthority Menu");
                System.out.println("1. Add New Book");
                System.out.println("2. View All Books");
                System.out.println("3. Register Member");
                System.out.println("4. View All Member");
                System.out.println("5. Issue Book");
                System.out.println("6. View All Transaction");
                System.out.println("7. Exit");
                System.out.print("Choose option: ");
                
                int choice = sc.nextInt();
                sc.nextLine(); 

                switch (choice) {
                    case 1 : BookService.addBook(sc); break;
                    case 2 : BookService.viewBooks(); break;
                    case 3 : MemberService.registerMember(sc); break;
                    case 4 : MemberService.viewMember(); break;
                    case 5 : TransactionService.issueBook(sc); break;
                    case 6 : TransactionService.viewTransaction(); break;
                    case 7 : {
                        System.out.println("Thank You!");
                        return;
                    }
                    default : System.out.println("Invalid option!");
                }
            }
        } 
    	
    	public static void studentMenu(Scanner sc) {
            while (true) {
                System.out.println("\nStudent Menu");
                System.out.println("1. View Available Books");
                System.out.println("2. Issue a Book");
                System.out.println("3. Return a Book");
                System.out.println("4. Exit");
                System.out.print("Choose option: ");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1 : BookService.viewBooks(); break;
                    case 2 : TransactionService.issueBook(sc); break;
                    case 3 : Return_service.returnBook(sc);
                    case 4 : { 
                    	System.out.println("Thank You!");
                    	return; 
                    	}
                    default : System.out.println("Invalid option!");
                }
            }
        }
}