import java.util.Scanner;

public class CharacterFrequencyNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        sc.close();

        String[] result = findCharacterFrequency(input);

        System.out.println("\nCharacter Frequency:");
        System.out.println("---------------------");
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        System.out.println("---------------------");

        for (int i = 0; i < result.length; i += 2) {
            System.out.printf("%-10s %-10s%n", result[i], result[i + 1]);
        }
    }

    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length];

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '0') {
                continue;
            }

            frequency[i] = 1;

            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0'; 
                }
            }
        }

        int count = 0;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                count++;
            }
        }

        String[] charFrequencyArray = new String[count * 2];
        int index = 0;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                charFrequencyArray[index] = String.valueOf(characters[i]);
                charFrequencyArray[index + 1] = String.valueOf(frequency[i]);
                index += 2;
            }
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

