import java.util.Scanner;

public class UniqueCharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        sc.close();
        
        char[] uniqueChars = findUniqueCharacters(input);
        String[][] result = findCharacterFrequency(input, uniqueChars);
        
        System.out.println("\nCharacter Frequency:");
        System.out.println("---------------------");
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        System.out.println("---------------------");
        
        for (String[] row : result) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
    }

    public static char[] findUniqueCharacters(String text) {
        char[] unique = new char[text.length()];
        int count = 0;
        
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            
            for (int j = 0; j < count; j++) {
                if (unique[j] == current) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                unique[count] = current;
                count++;
            }
        }
        
        char[] result = new char[count];
        
        for (int i = 0; i < count; i++) {
            result[i] = unique[i];
        }
        
        return result;
    }

    public static String[][] findCharacterFrequency(String text, char[] uniqueChars) {
        int[] frequency = new int[256];
        
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        
        String[][] charFrequencyArray = new String[uniqueChars.length][2];
        
        for (int i = 0; i < uniqueChars.length; i++) {
            charFrequencyArray[i][0] = String.valueOf(uniqueChars[i]);
            charFrequencyArray[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }
        
        return charFrequencyArray;
    }
}

/*
Input :
Enter a string: ankush

Character Frequency:
---------------------
Character  Frequency
---------------------
a          1
n          1
k          1
u          1
s          1
h          1
*/
