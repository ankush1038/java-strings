import java.util.Scanner;

public class ConvertToUppercase {
    
    // Method to convert lowercase letters to uppercase using ASCII values
    public static String toUpperCaseCustom(String text) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // Convert to uppercase
            }
            result.append(ch);
        }
        
        return result.toString();
    }
    
    // Method to compare two strings character by character
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
        System.out.println("Enter a text:");
        String inputString = sc.nextLine();
        
        sc.close();
        
        // Convert to uppercase using custom method
        String customUpper = toUpperCaseCustom(inputString);
        
        // Convert to uppercase using built-in method
        String builtInUpper = inputString.toUpperCase();
        
        // Compare both results
        boolean areEqual = compareStrings(customUpper, builtInUpper);
        
        // Display results
        System.out.println("Custom Uppercase Conversion: " + customUpper);
        System.out.println("Built-in Uppercase Conversion: " + builtInUpper);
        System.out.println("Both methods give the same result: " + areEqual);
    }
}

/*
Input : Enter a text:
ankush

Output : Custom Uppercase Conversion: ANKUSH
Built-in Uppercase Conversion: ANKUSH
Both methods give the same result: true
*/
