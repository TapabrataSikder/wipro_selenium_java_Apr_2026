package Collections_test;
import java.util.*;
public class Intersection_hash_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> num1=new HashSet<Integer>(Arrays.asList(1, 2, 3, 4));
		Set<Integer> num2=new HashSet<Integer>(Arrays.asList(4, 5, 6, 3));
		
		num1.retainAll(num2);
		System.out.println("Common Elements: " + num1);
		
	}

}
