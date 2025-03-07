import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        // Check if the string is a palindrome and display result
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
        sc.close();
    }

    // Method to check if a given string is a palindrome without using built-in functions
    public static boolean isPalindrome(String input) {
        
        int left = 0;
        int right = input.length() - 1;
        
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
	
/*

Input : 
java PalindromeCheck.java

Output :
ankush
Not Palindrome

*/
	
	