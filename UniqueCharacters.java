import java.util.Scanner;

public class UniqueCharacters {
    static Scanner sc = new Scanner(System.in);

    // Method to find the length of a string without using length()
    public static int getStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int length = getStringLength(text);
        char[] uniqueChars = new char[length]; // Array to store unique characters
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character is already in the uniqueChars array
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add to the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array of exact size
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] uniqueChars = findUniqueCharacters(input);

        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
    }
}

/*
Input : 
Enter a string: ankush

Output : 
Unique characters: a n k u s h
*/
