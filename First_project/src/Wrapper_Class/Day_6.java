package Wrapper_Class;
import java.util.*;
public class Day_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter a String1: ");
//        String st1 = sc.nextLine();
		
//		Integer a = Integer.valueOf(st1);
//		System.out.println("Integer value: " + a);
//
//
//		Double b = Double.valueOf(st1);
//		System.out.println("Double value: " + b);
        
        
		Integer age = null;
		Double salary = null;
		Boolean status = null;

		System.out.println("The value of age is: " + age);

		try {
		    int total = age + 5; 
		} catch (NullPointerException e) {
		    System.out.println("Error: Cannot perform math on a null object");
		}

	}

}
