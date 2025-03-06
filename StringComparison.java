import java.util.Scanner;

public class StringComparison {
    
    // Method to compare two strings character by character using charAt()
    public static boolean compareStrings(String str1, String str2) {
        // If lengths are different, strings are not equal
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for string input
        System.out.println("Enter first string:");
        String firstString = scanner.next();
        
        System.out.println("Enter second string:");
        String secondString = scanner.next();
        
        scanner.close();
        
        // Compare using custom method
        boolean customComparisonResult = compareStrings(firstString, secondString);
        
        // Compare using built-in equals() method
        boolean builtInComparisonResult = firstString.equals(secondString);
        
        // Check if both methods give the same result
        if (customComparisonResult == builtInComparisonResult) {
            System.out.println("Both methods give the same result: " + customComparisonResult);
        } else {
            System.out.println("Methods give different results.");
        }
    }
}
