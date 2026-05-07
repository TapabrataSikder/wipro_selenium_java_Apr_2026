package Collections_test;
import java.util.*;
public class Symmetric_diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

		Set<Integer> all = new HashSet<>(set1);
		all.addAll(set2);
		System.out.println("all Elements: " + all);
		
		Set<Integer> common = new HashSet<>(set1);
		common.retainAll(set2);
		System.out.println("Common Elements: " + common);
		
		all.removeAll(common);
		System.out.println("Symmetric Elements: " + all);
	}

}
