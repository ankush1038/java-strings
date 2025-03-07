import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to count vowels and consonants in a given string
    public static void countVowelsAndConsonants(String input) {
        int vowels = 0, consonants = 0;
        
        // Convert the string to lowercase for easy comparison
        input = input.toLowerCase();
        
        // Iterate through each character of the string
        for (char ch : input.toCharArray()) {
            // Check if character is a letter
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        // Display the counts
        System.out.println("Number of Vowels: " + vowels);
        System.out.println("Number of Consonants: " + consonants);
    }

    // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    // Main method (placed at the end as per request)
    public static void main(String[] args) {
        
        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        // Call method to count vowels and consonants
        countVowelsAndConsonants(input);
        
        // Close scanner
        sc.close();
    }
}

/*
Input :
Enter a string: anush

Output : 
Number of Vowels: 2
Number of Consonants: 3

*/