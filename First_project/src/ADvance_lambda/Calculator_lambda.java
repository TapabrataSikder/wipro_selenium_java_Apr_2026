package ADvance_lambda;
import java.util.*;

interface Operation{
	double operator(double a, double b);
}

public class Calculator_lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Operation add = (a, b) -> a+b;
		Operation sub = (a, b) -> a-b;
		Operation mul = (a, b) -> a*b;		
		Operation div = (a, b) -> {
			if(b==0) {
				throw new ArithmeticException("Cannot divide by zero");			
			}
			return a/b;
		};
		
		
		
		System.out.println("Enter numbers");
		double n1=sc.nextDouble();
		double n2=sc.nextDouble();
		System.out.print("Enter operator: ");
		char op=sc.next().charAt(0);
		
		double res=0;
		boolean pass=false;
		
		try {
			switch(op) {
			case '+':
				res=add.operator(n1, n2);
				pass = true;
				break;
			case '-':
				res=sub.operator(n1, n2);
				pass = true;
				break;
			case '*':
				res=mul.operator(n1, n2);
				pass = true;
				break;
			case '/':
				res=div.operator(n1, n2);
				pass = true;
				break;
			case '^':
				res=mul.operator(n1,  n2);
				pass = true;
				break;
			default:
				System.out.println("Wrong operatro");
				return;
				
			}
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic: "+e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Parent exception: "+e);
		}
		
		if (pass) {
	        System.out.println("Result: " + res);
	    }
		System.out.println("Continue...");
		
	}

}
