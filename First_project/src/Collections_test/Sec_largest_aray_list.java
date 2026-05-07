package Collections_test;
import java.util.*;
public class Sec_largest_aray_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(10, 45, 2, 33, 45, 90, 8);
		Collections.sort(numbers);
		System.out.println("List: "+numbers);
		System.out.println("2nd Lasrgest number: "+numbers.get(numbers.size()-2));
	}

}
