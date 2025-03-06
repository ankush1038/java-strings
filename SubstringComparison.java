import java.util.Scanner;

public class SubstringComparison {
    
    // Method to create a substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    
    // Method to compare two strings character by character using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for string input
        System.out.println("Enter a string:");
        String inputString = scanner.next();
        
        // Prompt user for start and end index
        System.out.println("Enter start index:");
        int startIndex = scanner.nextInt();
        
        System.out.println("Enter end index:");
        int endIndex = scanner.nextInt();
        
        scanner.close();
        
        // Create substring using custom method
        String customSubstring = createSubstring(inputString, startIndex, endIndex);
        
        // Create substring using built-in method
        String builtInSubstring = inputString.substring(startIndex, endIndex);
        
        // Compare substrings
        boolean comparisonResult = compareStrings(customSubstring, builtInSubstring);
        
        // Display results
        System.out.println("Substring using charAt method: " + customSubstring);
        System.out.println("Substring using built-in method: " + builtInSubstring);
        System.out.println("Do both methods produce the same result? " + comparisonResult);
    }
}
