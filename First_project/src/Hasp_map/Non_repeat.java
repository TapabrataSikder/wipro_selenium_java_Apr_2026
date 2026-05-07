package Hasp_map;
import java.util.HashMap;
import java.util.Scanner;
public class Non_repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);            
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        
        boolean found = false;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (charCountMap.get(ch) == 1) {
                System.out.println("First non-repeating character is: " + ch);
                found = true;
                break;
        }
        if (!found) {
            System.out.println("All characters are repeating.");
        }
        
	}

	}}
