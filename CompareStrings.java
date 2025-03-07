import java.util.Scanner;

public class CompareStrings {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        
        // Compare strings and display the result
        System.out.println(compareStrings(str1, str2));
        
        sc.close();
    }

    // Method to compare two strings lexicographically without built-in methods
    public static String compareStrings(String str1, String str2) {
        
        int minLength = Math.min(str1.length(), str2.length());
        
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                return "\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order";
            } else if (str1.charAt(i) > str2.charAt(i)) {
                return "\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order";
            }
        }
        
        if (str1.length() < str2.length()) {
            return "\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order";
        } else if (str1.length() > str2.length()) {
            return "\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order";
        }
        
        return "Both strings are equal";
    }
}

/*
Input :
Enter first string: party

Output :
Enter second string: chitkara
"chitkara" comes before "party" in lexicographical order

*/