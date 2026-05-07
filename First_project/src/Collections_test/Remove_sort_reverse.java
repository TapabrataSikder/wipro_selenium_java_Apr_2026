package Collections_test;

import java.util.*;
public class Remove_sort_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		List<String> l1=new ArrayList<String>();
		
		l1.add("Mango");
		l1.add("Banana");
		l1.add("Orange");
		l1.add("Kiwi");
		l1.add("Apple");
		
		System.out.println("Array list l1: "+l1);
		
		System.out.println("After reversal: "+l1.reversed());
		
		System.out.print("Enter element to remove: ");
		String ele=sc.nextLine();
		
		if(l1.contains(ele)){
			l1.remove(ele);
			System.out.print("After removal: "+l1);
		}
		
		
	}

}
