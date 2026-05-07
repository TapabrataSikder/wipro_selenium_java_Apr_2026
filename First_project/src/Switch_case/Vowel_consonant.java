package Switch_case;

import java.util.Scanner;

public class Vowel_consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                if (ch >= 'a' && ch <= 'z') {
                    System.out.println("Consonant");
                } else {
                    System.out.println("Not an alphabet");
                }
        }

        sc.close();

	}

}
