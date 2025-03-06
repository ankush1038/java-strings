import java.util.Scanner;

public class StringTrimmer {
    
    // Method to trim leading and trailing spaces using charAt()
    public static int[] findTrimIndices(String text) {
        int start = 0, end = text.length() - 1;
        
        // Find first non-space character
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        
        // Find last non-space character
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        
        return new int[]{start, end};
    }
    
    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        StringBuilder trimmedString = new StringBuilder();
        for (int i = start; i <= end; i++) {
            trimmedString.append(text.charAt(i));
        }
        return trimmedString.toString();
    }
    
    // Method to compare two strings using charAt()
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
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for string input
        System.out.println("Enter a text with leading and trailing spaces:");
        String inputString = sc.nextLine();
        
        sc.close();
        
        // Get trim indices
        int[] indices = findTrimIndices(inputString);
        
        // Trim using custom method
        String customTrimmed = createSubstring(inputString, indices[0], indices[1]);
        
        // Trim using built-in method
        String builtInTrimmed = inputString.trim();
        
        // Compare results
        boolean isSame = compareStrings(customTrimmed, builtInTrimmed);
        
        // Display results
        System.out.println("Custom Trimmed String: " + customTrimmed);
        System.out.println("Built-in Trimmed String: " + builtInTrimmed);
        System.out.println("Are both results the same? " + isSame);
    }
}

/*
Input : 
Enter a text with leading and trailing spaces:
    Chitkara    University

Output : 
Custom Trimmed String: Chitkara    University
Built-in Trimmed String: Chitkara    University
Are both results the same? true
*/
