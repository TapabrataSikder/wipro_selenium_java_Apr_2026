package String;

import java.util.HashMap;
import java.util.Map;

public class First_non_repeat_character {

	public static void main(String[] args) {
		String input = "swiss";
        char result = nonrepeat(input);

        if (result != '\0') {
            System.out.println("The first non-repeat character: " + result);
        } else {
            System.out.println("All characters repeat.");
        }

	}
	
	public static char nonrepeat(String s) {
        Map<Character, Integer> counts = new HashMap<>();

        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            if (counts.get(c) == 1) {
                return c;
            }
        }
        return '\0';
	}
}
