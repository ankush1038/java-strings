import java.util.Scanner;

public class CharArrayComparison {
    
    // Method to return characters of a string as an array without using toCharArray()
    public static char[] getChars(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }
    
    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for string input
        System.out.println("Enter a string:");
        String inputString = sc.next();
        
        sc.close();
        
        // Get character array using user-defined method
        char[] customCharArray = getChars(inputString);
        
        // Get character array using built-in method
        char[] builtInCharArray = inputString.toCharArray();
        
        // Compare both arrays
        boolean comparisonResult = compareCharArrays(customCharArray, builtInCharArray);
        
        // Display results
        System.out.println("Characters using custom method: " + new String(customCharArray));
        System.out.println("Characters using built-in method: " + new String(builtInCharArray));
        System.out.println("Do both methods produce the same result? " + comparisonResult);
    }
}
