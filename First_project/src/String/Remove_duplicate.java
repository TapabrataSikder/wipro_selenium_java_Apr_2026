package String;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicate {

	public static void main(String[] args) {
		String st="AaBbCCDDeF";
		String s=st.toLowerCase();
		
		Set<Character> set = new LinkedHashSet<>();
		for (char c : s.toCharArray()) {
		    set.add(c);

		}
		StringBuilder res = new StringBuilder();
        for (char c : set) {
            res.append(c);
        }

        System.out.println("Original: " + st);
        System.out.println("Result: " + res.toString());
	}

}
