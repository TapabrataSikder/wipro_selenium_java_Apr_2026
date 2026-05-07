package Array;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isPalindrome = true;

        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                isPalindrome = false;
                break; 
            }
            left++;  
            right--; 
        }

        if (isPalindrome) {
            System.out.println("The array is Palindrome.");
        } else {
            System.out.println("The array is not Palindrome.");
        }

	}

}
