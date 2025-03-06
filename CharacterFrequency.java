import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        sc.close();

        String[][] result = findCharacterFrequency(input);

        System.out.println("\nCharacter Frequency:");
        System.out.println("---------------------");
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        System.out.println("---------------------");

        for (String[] row : result) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
    }

    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        int uniqueCount = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        String[][] charFrequencyArray = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (frequency[ch] > 0) {
                charFrequencyArray[index][0] = String.valueOf(ch);
                charFrequencyArray[index][1] = String.valueOf(frequency[ch]);
                frequency[ch] = 0;
                index++;
            }
        }

        return charFrequencyArray;
    }
}

/*
Input : 
Enter a string: ankush

Output : 
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