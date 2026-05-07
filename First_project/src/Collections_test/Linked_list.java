package Collections_test;
import java.util.*;
public class Linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l2 = new LinkedList<String>(); //parent class
		LinkedList<String> l1 = new LinkedList<String>(); //accessing inherited class methods
		
		l1.add("Mango");
		l1.add("Banana");
		l1.add("Orange");
		l1.add(null);
		l1.add(null);
		l1.add("Orange");
		l1.add("Orange");
		
		System.out.println("l1: "+l1);
		System.out.println("INdex of: "+l1.indexOf("Orange"));
		System.out.println("Last Index of 10: "+l1.lastIndexOf("Orange"));
		System.out.println("Last Index of null: "+l1.lastIndexOf(null));
		l1.remove(3);
		System.out.println(l1);
	}

}
