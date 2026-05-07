package Collections_test;
import java.util.*;
public class Search_array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(80);
		l1.add(90);
		l1.add(100);
		l1.add(60);

		System.out.println("Array list l1: "+l1);
		
		System.out.print("Enter element to search: ");
		int ele=sc.nextInt();
		
		if(l1.contains(ele)) {
			System.out.println("Element Found");
		}
		else System.out.println("Element Not Found");
//		
		Collections.sort(l1);
		System.out.println("Sorted: "+l1);
		
	}

}
