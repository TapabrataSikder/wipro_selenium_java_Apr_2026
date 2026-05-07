package Collections_test;
import java.util.*;

// elements store on the basis of hash code value
// does not follow insertion order
// single null allowed
// duplicate not allowed

public class Hash_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1=new HashSet<String>();
		set1.add("Orange");
		set1.add("Mango");
		set1.add("Orange");
		set1.add("Apple");
		set1.add("Banana");
		set1.add("Kiwi");
		set1.add("Kiwi");
		set1.add(null);
		
		Set<String> set2=new HashSet<String>();
		set2.add("Mango");
		set2.add("Banana");
		set2.add("Orange");
		set2.add("Apple");
		set2.add("Banana");
		set2.add("Kiwi");
		
		System.out.println("Hash set1: "+set1);
		System.out.println("Hash set2: "+set2);
		
		set1.remove(null);
		System.out.println("Hash set1: "+set1);
		
		System.out.println("Equals: "+set1.equals("Orange")); // false
		System.out.println("Equals: "+set1.equals(set2));
		
		Iterator<String> itr=set1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
