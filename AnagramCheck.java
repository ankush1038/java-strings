import java.util.Scanner;
import java.util.Arrays;

public class AnagramCheck {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        
        // Check and display whether the strings are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
        
        sc.close();
    }

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        
        if (str1.length() != str2.length()) {
            return false;
        }
        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        // Sort both character arrays
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    char temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
                if (arr2[i] > arr2[j]) {
                    char temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        
        // Compare sorted arrays
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        
        return true;
    }
}

/*
Input : 
Enter first string: ankush
Enter second string: ankush

Output:
The strings are anagrams.
*/