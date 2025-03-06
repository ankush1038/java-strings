import java.util.Scanner;

public class ConvertToLowercase {
    
    // Method to convert uppercase letters to lowercase using ASCII values
    public static String toLowerCaseCustom(String text) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // Convert to lowercase
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
        
        // Convert to lowercase using custom method
        String customLower = toLowerCaseCustom(inputString);
        
        // Convert to lowercase using built-in method
        String builtInLower = inputString.toLowerCase();
        
        // Compare both results
        boolean areEqual = compareStrings(customLower, builtInLower);
        
        // Display results
        System.out.println("Custom Lowercase Conversion: " + customLower);
        System.out.println("Built-in Lowercase Conversion: " + builtInLower);
        System.out.println("Both methods give the same result: " + areEqual);
    }
}

/*
Input : Enter a text : 
ANKUSH

Output : Custom Lowercase Conversion: ankush
Built-in Lowercase Conversion: ankush
Both methods give the same result: true
*/