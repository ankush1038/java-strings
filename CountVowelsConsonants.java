import java.util.Scanner;

public class CountVowelsConsonants {
    
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

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;
        
        for (int i = 0; i < text.length(); i++) {
            String type = checkCharacterType(text.charAt(i));
            
            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }
        
        return new int[]{vowels, consonants};
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for string input
        System.out.println("Enter a text:");
        String inputString = sc.nextLine();
        
        sc.close();
        
        // Count vowels and consonants
        int[] counts = countVowelsAndConsonants(inputString);
        
        // Display results
        System.out.println("Vowels count: " + counts[0]);
        System.out.println("Consonants count: " + counts[1]);
    }
}

/*

Input : nter a text:
ankush

Output : Vowels count: 2
Consonants count: 4

*/
