package Control_Statements;
import java.util.Scanner;

// Sum of first N natural numbers 

public class While_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int a = sc.nextInt();
		
		int i=1, sum=0;
		while(i<=a) {
			sum += i;
			i++;
		}
		
		System.out.println("Sum of first "+a+ " numbers is: "+sum);
		
		sc.close();

	}

}
