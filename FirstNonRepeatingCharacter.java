import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    static Scanner sc = new Scanner(System.in);

    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[256]; // Array to store frequency of characters

        // Loop through the text to count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Loop through the text again to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0'; // Return null character if no unique character is found
    }

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = findFirstNonRepeatingChar(input);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}

/*
Input : 
Enter a string: aaaannnkkkuuushhhh

Output : 
First non-repeating character: s
*/
