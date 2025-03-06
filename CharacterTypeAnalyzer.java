import java.util.Scanner;

public class CharacterTypeAnalyzer {
    
    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Convert to lowercase if uppercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        
        // Check if vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } 
        // Check if consonant
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        } 
        // Not a letter
        else {
            return "Not a Letter";
        }
    }

    // Method to analyze each character in the string and return a 2D array
    public static String[][] analyzeCharacters(String text) {
        String[][] result = new String[text.length()][2];
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
        
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayCharacterAnalysis(String[][] data) {
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        System.out.println("--------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for string input
        System.out.println("Enter a text:");
        String inputString = sc.nextLine();
        
        sc.close();
        
        // Analyze characters
        String[][] characterAnalysis = analyzeCharacters(inputString);
        
        // Display results
        displayCharacterAnalysis(characterAnalysis);
    }
}

/*
Input : 
Enter a text:
Ankush Sharma

Output : 
Character  Type
--------------------------
A          Vowel
n          Consonant
k          Consonant
u          Vowel
s          Consonant
h          Consonant
           Not a Letter
S          Consonant
h          Consonant
a          Vowel
r          Consonant
m          Consonant
a          Vowel

*/