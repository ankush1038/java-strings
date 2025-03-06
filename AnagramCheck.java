import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        sc.close();

        boolean result = areAnagrams(text1, text2);

        System.out.println("\nAnagram Check Result:");
        System.out.println("----------------------");
        System.out.println(result ? "The texts are anagrams." : "The texts are NOT anagrams.");
    }

    public static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] frequency1 = getCharacterFrequency(text1);
        int[] frequency2 = getCharacterFrequency(text2);

        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] getCharacterFrequency(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        return frequency;
    }
}

/*
Input :
Enter first text: sha
Enter second text: rma

Output : 
Anagram Check Result:
----------------------
The texts are NOT anagrams.

*/