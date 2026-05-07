package String;
import java.util.*;
public class Max_freq {

	public static void main(String[] args) {
		String s="aaabjbfjfodcfjjjjjjfnert";
		
		Map<Character, Integer> counts=new HashMap<>();
		for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
		char maxChar = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        System.out.println("Character of max frequency: " + maxChar);
        System.out.println("Frequency: " + maxCount);
	}

}
