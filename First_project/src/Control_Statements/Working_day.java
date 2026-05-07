package Control_Statements;

import java.util.Scanner;

public class Working_day {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String day = sc.nextLine();
		
		if(day.equals("Saturday") || day.equals("Sunday")) {
			System.out.print(day + " is Off/Free Day");
		}
		else
			System.out.print(day + " is Working Day");
		
//		else if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday"))
//			System.out.print(day + " is Working Day");
		
		
	}

}
