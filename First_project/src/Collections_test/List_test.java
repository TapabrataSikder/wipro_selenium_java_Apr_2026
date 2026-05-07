package Collections_test;
import java.util.*;

// follow order
// index based
// null allowed
// duplicate allowed


public class List_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List list=new ArrayList();
		List<String> list = new ArrayList<String>(); // Generic
		list.add("Maggi");
		list.add(1, "pasta");
//		list.add(80);
		System.out.println(list);
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(null);
		list1.add(30);
		list1.add(40);
		System.out.println(list1);
		System.out.println("INdex of: "+list1.indexOf(20));
		System.out.println("Last Index of 10: "+list1.lastIndexOf(10));
		System.out.println("Last Index of null: "+list1.lastIndexOf(null));
		list1.remove(3);
		System.out.println(list1);
		
		System.out.println("get: "+list1.get(2));
		System.out.println("getFirst: "+list1.getFirst());
		System.out.println("getLast: "+list1.getLast());
		
		list1.set(2, 30);
		System.out.println("set list: "+list1);
		System.out.println("reversed: "+list1.reversed());
		
		System.out.println("-".repeat(40));
		
		ListIterator<Integer> it=list1.listIterator();
		System.out.println("Iterator");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
