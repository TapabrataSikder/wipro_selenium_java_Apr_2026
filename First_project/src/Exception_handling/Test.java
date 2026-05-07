package Exception_handling;

import java.util.Scanner;

//      Types of exception
// io exception, null pointer exception, indexoutofbound exception (String, ARray),
// Arithmetic exception, sql exception, class not found exception, file not found exception, 
// number format exception

public class Test {
	
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
//		throw new ArithmeticException("Arithmetic Exception");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter divident: ");
		int a=sc.nextInt();
		System.out.print("Enter divisor: ");
		int b=sc.nextInt();
		Thread.sleep(100);

		
		try {
			int c=a/b;
//			System.out.println(st.charAt(7));
			System.out.println("Division: "+c);
		}
		
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Check your code "+e);
		}
		
		catch(ArithmeticException e) {
			System.out.println("Arithmatic except: "+e);
		}
		
		catch(Exception e) {
			System.out.println("Exception: "+e);
		}

		finally
		{
			System.out.println("Final block");
		}
		
		
		
		Test t=new Test(); // declaration and initialization of an object
		Test t1; //declaration
		t1=new Test(); // initialization of an object

	}

}
