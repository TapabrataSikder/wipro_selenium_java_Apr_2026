package Collections_test;
import java.util.*;
// Follow insertion order
public class Linked_hash_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1=new LinkedHashSet<String>();
		set1.add("Orange");
		set1.add("Mango");
		set1.add("Orange");
		set1.add("Apple");
		set1.add("Banana");
		set1.add("Kiwi");
		set1.add("Kiwi");
		set1.add(null);

		System.out.println("Hash set1: "+set1);
	}

}
